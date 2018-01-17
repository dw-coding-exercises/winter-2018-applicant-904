(ns my_exercise.models.elections
  (:require [clj-http.client :as client]
            [clojure.string :as str]))

(def results [])

(defn update-results [data]
  (println "FROM UPDATE " data))

(defn elections-https [city state]
  (str "https://api.turbovote.org/elections/upcoming?district-divisions=ocd-division/country:us,ocd-division/country:us/state:" (str/lower-case state) ",ocd-division/country:us/state:" (str/lower-case state) "/place:" (str/lower-case (str/replace city " " "_"))))

(defn search [city state]
  (client/get (elections-https city state)
    {:accept :json :async? true}
    (fn [response] (update-results response))
    (fn [exception] (println "Exception message: " exception))))
