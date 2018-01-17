(ns my_exercise.views.elections
  (:require [hiccup.page :refer [html5]]
            [ring.util.anti-forgery :refer [anti-forgery-field]]
            ; below included to render view with elections data when ready
            [my_exercise.models.elections :as elections]))

(defn header []
  [:head
   [:meta {:charset "UTF-8"}]
   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1.0, maximum-scale=1.0"}]
   [:title "Election results"]
   [:link {:rel "stylesheet" :href "default.css"}]])

(defn display-elections []
  ; below included as sample text to validate page is rendering correctly -
  ; would be replaced with a function mapping through election results to build
  ; html elements for page
  [:div {:class "elections"}
    [:ul "Elections"
      [:li "Election 1"]
      [:li "Election 2"]]])

(defn page []
  (html5
    (header)
    (display-elections)))
