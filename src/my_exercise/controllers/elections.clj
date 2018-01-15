(ns my_exercise.controllers.elections
  (:use [compojure.core :only (defroutes GET)])
  (:require [clojure.string :as str]
            [ring.util.response :as response]
            [clj-http.client :as client]
            [my_exercise.views.home :as home]))
            [my_exercise.views.elections :as view]
            [my_exercise.models.elections :as model]))

(defroutes app-routes
  (GET "/" [] home/page))
  ; (GET "/Search" [] (client/get "https://api.turbovote.org/elections/upcoming?district-divisions=ocd-division/country:us/state:ok,ocd-division/country:us/state:ok/place:pryor_creek" {:accept :json})))
