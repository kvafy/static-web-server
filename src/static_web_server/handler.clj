(ns static-web-server.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.server.standalone :as server])
  (:gen-class))

(defroutes app-routes
  (route/resources "/")
  (route/not-found "Not Found"))

(defn print-usage []
  (println)
  (println "Put your static website into 'resources/public' directory.")
  (println)
  (println "Run as follows: java -jar <path-to-jar-file> <port>")
  (println))

(defn -main [& args]
  (cond
    (not= 1 (count args))
      (print-usage)
    (not (re-matches #"[0-9]+" (first args)))
      (println (format "Error: Port must be a number, you entered '%s'" (first args)))
    :else
      (let [port (Integer/valueOf (first args))]
        (server/serve app-routes {:port port}))))
