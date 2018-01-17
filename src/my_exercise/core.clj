(ns my-exercise.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.reload :refer [wrap-reload]]
            [clj-http.client :as client]
            [my_exercise.controllers.elections :as controller]))

(defroutes app
  controller/app-routes
  (route/resources "/")
  (route/not-found "Not found"))

(def handler
  (-> app
      (wrap-defaults site-defaults)
      wrap-reload))
