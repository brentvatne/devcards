(defproject devcards "0.1.3-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2496"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [sablono "0.2.22"]
                 [crate "0.2.5"]
                 [jayq "2.5.2"]
                 [om "0.7.3"]
                 [frontier "0.1.0-SNAPSHOT"]
                 [figwheel "0.2.0-SNAPSHOT"]]

  :source-paths ["src"]
  
  :profiles {
    :dev {
      :aliases {"clean" ["do" "cljsbuild" "clean," "clean"]}
                   
      :plugins [[lein-cljsbuild "1.0.3"]
                [lein-figwheel "0.2.0-SNAPSHOT"]]
      :cljsbuild {
        :builds [{:id "devcards-demos"
                  :source-paths ["src" "example_src"]
                  :compiler {
                    :output-to "resources/public/devcards/js/compiled/devdemos.js"
                    :output-dir "resources/public/devcards/js/compiled/out"
                    :optimizations :none
                    :source-map true}}]}
                   
      :figwheel { :css-dirs ["resources/public/devcards/css"] }
     }})
