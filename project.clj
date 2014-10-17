(defproject clojure-flynn-example "0.1.0-SNAPSHOT"
  :description "Example Clojure web app"
  :url "https://github.com/flynn/clojure-flynn-example"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.9"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [environ "0.5.0"]]
  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler clojure-flynn-example.handler/app}
  :uberjar-name "clojure-flynn-example-standalone.jar")
