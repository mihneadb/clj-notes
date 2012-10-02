(ns clj-notes.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]])
  (:require [clj-notes.models.note :as Note]))


(defpartial layout [& content]
            (html5
              [:head
               [:title "clj-notes"]
               (include-css "/css/notes.css")]
              [:body
               [:div#wrapper
                content]]))

(defpartial render-note [{:keys [title text]}]
  [:div#note
    [:h3#title title]
    [:p#text text]])
