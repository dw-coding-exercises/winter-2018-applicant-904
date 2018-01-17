(ns my_exercise.views.elections
  (:require [hiccup.page :refer [html5]]
            [ring.util.anti-forgery :refer [anti-forgery-field]]
            [my_exercise.models.elections :as elections]))

(defn header []
  [:head
   [:meta {:charset "UTF-8"}]
   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1.0, maximum-scale=1.0"}]
   [:title "Election results"]
   [:link {:rel "stylesheet" :href "default.css"}]])

(defn display-elections []
  [:div {:class "elections"}
    [:ul "Elections"
      [:li "Election 1"]
      [:li "Election 2"]]])

(defn page []
  (html5
    (header)
    (display-elections)))
