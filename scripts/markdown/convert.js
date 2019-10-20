const showdown = require('showdown');
const markdown = require("./markdown");
let fileName = process.argv[2];
let output = process.argv[3] || process.cwd() + "/" + input + ".html";
let pageTitle = process.argv[4] || input.replace(".md", "");
let style = process.argv[4] || process.cwd() + "/style.css";

markdown.convertToMarkdown(process.cwd() + '/' + fileName, output, style, pageTitle);