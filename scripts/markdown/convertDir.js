let markdown = require("./markdown");

let inputDir = process.argv[2];
let outputDir = process.argv[3] || process.cwd() + "/" + input + ".html";
let style = process.argv[4] || process.cwd() + "/style.css";

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
    console.log("Processing " + file);
    markdown.convertToMarkdown(inputDir + "/" + file, outputDir + "/" + file.replace(".md", ".html"), "style.css", "Salut mon paute");
});