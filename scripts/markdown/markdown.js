let showdown = require("showdown");

exports.fs = require("fs");

exports.convertToMarkdown = function convertToMarkdown(input, output, style, title) {
    exports.fs.readFile(style, function(err, styleData) {
        exports.fs.readFile(input, function(err, data) {
            if(err) {
                throw err;
            }
            let text = data.toString();

            let converter = new showdown.Converter({
                ghCompatibleHeaderId: true,
                simpleLineBreaks: true,
                ghMentions: true,
            });

            let preContent = `
    <html>
      <head>
        <title>` + title + `</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href=` + style + `>
      </head>
      <body>
        <div id='content'>
    `

            let html = preContent + converter.makeHtml(text) + "</div>";

            converter.setFlavor('github');

            exports.fs.writeFile(output, html, {flag: "wx"}, function(err) {
                if(err) {
                    throw err
                } else {
                    console.log("Done, saved to " + output);
                }
            });
        });
    });
};