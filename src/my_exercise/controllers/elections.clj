(ns my_exercise.controllers.elections
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [clojure.string :as str]
            [ring.util.response :as response]
            [my_exercise.views.home :as home]
            [my_exercise.views.elections :as view]
            [my_exercise.models.elections :as elections]))

(defn search [city state]
  (when-not
    (and
      (str/blank? city)
      (str/blank? state))
    (elections/search city state)))

(defroutes app-routes
  (GET "/" [] home/page)
  (GET "/search" [city state]
    (search city state)
    (view/page)))
