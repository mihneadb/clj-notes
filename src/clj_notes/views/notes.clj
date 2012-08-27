(ns clj-notes.views.notes
  (:require [clj-notes.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(def note1 {:title "First note", :text "Hello, world!"})

(defpage "/" []
         (common/layout
           [:h1 "Welcome to clj-notes"]
           (map common/render-note common/notes)))
