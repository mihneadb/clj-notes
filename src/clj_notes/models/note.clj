(ns clj-notes.models.note)

; container for all the notes
(def notes [])

(defn total []
  (count notes))

(defn id->note [id]
  (notes id))

(defn ids->notes [ids]
  (map id->note ids))


(defn makeNote [title text]
  {:title title, :text text})

(defn saveNote [note]
  (def notes (conj notes note)))


; populate db with initial test note
(saveNote (makeNote "Hello, world!" "Good first note."))
