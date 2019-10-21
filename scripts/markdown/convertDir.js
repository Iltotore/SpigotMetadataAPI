const path = require("path");
const markdown = require("./markdown");
const lineReader = require('line-reader');

let inputDir = process.argv[2];
let outputDir = process.argv[3] || process.cwd() + "/" + input + ".html";
let style = process.argv[4] || process.cwd() + "/style.css";
let titlePattern = process.argv[5] || null;

console.log("Copying theme...");
markdown.fs.copyFileSync(style, outputDir + "/style.css", (err) => {
    if(err) {
        throw err;
    } else {
        console.log("Successfully copied theme !")
    }
});

markdown.fs.readdirSync(inputDir).forEach(file => {
    if(!file.endsWith(".md")) return;
    let title = path.basename(file);
    if(titlePattern != null) {
        title = getTitle(inputDir + "/" + file, titlePattern, title);
    }
    console.log("Processing " + file);
    markdown.convertToMarkdown(inputDir + "/" + file, outputDir + "/" + file.replace(".md", ".html"), "style.css", title);
});

function getTitle(file, pattern, defaultTitle) {
    let fragments = pattern.split("${title}", 1);
    let result = defaultTitle;
    let lines = markdown.fs.readFileSync(file, 'utf-8')
        .split('\n')
        .filter(Boolean);
    lines.forEach(line => {
        let startWith = line.startsWith(fragments[0]) || fragments.length < 1;
        let endWith = line.endsWith(fragments[1]) || fragments.length < 2;
        if(result !== defaultTitle || !startWith || !endWith) return;
        let subStart = fragments.length >= 1 ? fragments[0].length : 0;
        let subEnd = fragments.length >= 2 ? line.length - fragments[1].length : line.length;
        result = line.substring(subStart, subEnd).replace(/(\r\n|\n|\r)/gm, "");
    });
    return result;
}