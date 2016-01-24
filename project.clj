(defproject static-web-server "0.1.0-SNAPSHOT"
  :description "Simple web server that exposes static resources (static web pages)."
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.4.0"]
                 [ring-server "0.4.0"]]
  ; Don't want to bundle the 'resources' directory into the uberjar, I want
  ; the 'resources' to be loaded from current working directory after the
  ; uberjar has been compiled. Following line will ensure just that
  ; (http://stackoverflow.com/questions/8009829/resources-in-clojure-applications)
  :profiles {:dev {:resource-paths ["resources"]}}
  ; for uberjar
  :aot  [static-web-server.handler]
  :main static-web-server.handler)
