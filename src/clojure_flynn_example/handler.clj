(ns clojure-flynn-example.handler
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.handler :as handler]
            [clojure.string :refer [join]]
            [ring.adapter.jetty :as jetty]
            [environ.core :refer [env]]))

(defroutes app-routes
  (GET "/" []
    (let [hostname (.. java.net.InetAddress getLocalHost getHostName)]
      (join " " ["Hello from Flynn on port" (env :port) "from container" hostname "\n"]))))

(defn -main [& args]
  (jetty/run-jetty (handler/site app-routes) {:port (Integer. (env :port))}))
