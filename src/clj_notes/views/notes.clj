(ns clj-notes.views.notes
  (:require [clj-notes.views.common :as common]
            [clj-notes.models.note :as Note]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))


(defpage "/" []
         (common/layout
           [:h1 "Welcome to clj-notes"]
           (map common/render-note Note/notes)))
