plugins {
    id("base") // This plugin provides basic tasks like clean, build, etc.
}

// task openInChrome(type: Exec) {
    // Make sure to specify the full path of the Google Chrome executable if it"s not in the system path
   //  def browserPath = "/usr/bin/google-chrome" // For Linux
    // For macOS: def browserPath = "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome"
    // For Windows: def browserPath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"

    // Specify the path to your index.html file
   //  def indexFilePath = "src/main/webapp/index.html"

    // Check if Chrome exists and open the file
   //  commandLine browserPath, indexFilePath
//}

// task buildWebApp {
//     // Create a task to copy the web app files (index.html, css, js) to a build directory
//     doLast {
//         def webappDir = file("build/webapp")
//         webappDir.mkdirs()

//         copy {
//             from "src/main/webapp"
//             into "build/webapp"
//         }
//     }
// }

// build.dependsOn buildWebApp // Make sure the buildWebApp task runs before openInChrome

// Run the openInChrome task after building the app
// build.finalizedBy openInChrome
