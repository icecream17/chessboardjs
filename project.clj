(defproject chessboardjs "1.0.0"

  :description "JavaScript Chessboard"
  :url "https://github.com/oakmac/chessboardjs"
  :license {
    :name "MIT License"
    :url "https://github.com/oakmac/chessboardjs/blob/master/LICENSE"
    :distribution :repo }

  :dependencies [
    [org.clojure/clojure "1.6.0"]
    [org.clojure/clojurescript "0.0-2913"]]

  :plugins [[lein-cljsbuild "1.0.5"]]

  :source-paths ["src"]

  :clean-targets [
    "out"
    "public/js/cheatsheet.js"
    "public/js/cheatsheet.min.js"]

  :cljsbuild {
    :builds {
      :dev {
        :source-paths ["src-cljs"]
        :compiler {
          :output-to "public/js/chessboard-dev.js"
          :optimizations :whitespace }}

      :release {
        :source-paths ["src-cljs"]
        :compiler {
          :output-to "public/js/cheatsheet-release.js"
          :optimizations :advanced
          :pretty-print false }}

}})