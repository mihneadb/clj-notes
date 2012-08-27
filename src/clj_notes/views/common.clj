(ns clj-notes.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "clj-notes"]
               (include-css "/css/notes.css")] ; FIXME!
              [:body
               [:div#wrapper
                content]]))

(defpartial render-note [{:keys [title text]}]
  [:div#note
    [:h3#title title]
    [:p#text text]])

(defn randint [limit]
  (inc (int (* (Math/random) limit))))

(defn zip [a b]
  (let [a (vec a) b (vec b)]
  (for [x (range (count a))] [(a x) (b x)])))

(defn gen-note [data]
  {:title (data 0), :text (data 1)})

(def garbage-text "fdsfkfdskjfdsa")
(def titles (map #(str "Note " %) (range 1 11)))
(def texts (repeatedly 10 (fn [] (reduce str (repeat (randint 10) garbage-text)))))
(def notes (map gen-note (zip titles texts)))
