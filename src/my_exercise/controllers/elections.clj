(ns my_exercise.controllers.elections
  (:use [compojure.core :only (defroutes GET)])
  (:require [clojure.string :as str]
            [ring.util.response :as response]
            [my_exercise.views.home :as home]))
            ; [my_exercise.views.elections :as view]
            ; [my_exercise.models.elections :as model]))

(defroutes app-routes
  (GET "/" [] home/page))
  ; (GET "/Search" [] )
