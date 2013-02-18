
(defproject
  todomvc-hlisp "0.1.0-SNAPSHOT"
  :description  "TodoMVC using hlisp."
  :license      {:name "Closed source. All rights reserved."
                 :url "http://en.wikipedia.org/wiki/All_rights_reserved"}
  :source-paths ["src/clj"]
  :plugins      [[lein-cljsbuild "0.2.7"]
                 [lein-ring "0.7.1"]
                 [lein-hlisp "0.1.0-SNAPSHOT"]]
  :dependencies [[hlisp-macros "0.1.0-SNAPSHOT"]
                 [hlisp-util "0.1.0-SNAPSHOT"]
                 [hlisp-reactive "1.0.0-SNAPSHOT"]
                 [alandipert/storage-atom "1.1.1"]
                 [org.clojure/clojure "1.4.0"]
                 [compojure "1.0.4"]]
  :eval-in      :leiningen
  :ring         {:handler example.routes/app}
  :cljsbuild    {:builds []}
  :hlisp        {:html-src    "src/html"
                 :cljs-src    "src/cljs"
                 :html-out    "resources/public"
                 :base-dir    ""
                 :pre-script  "./script/pre-compile"
                 :post-script "./script/post-compile"
                 :cljsc-opts  {:pretty-print   true
                               :optimizations  :whitespace}})
