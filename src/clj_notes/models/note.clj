(ns clj-notes.models.note
  (require
    [simpledb.core :as db]
    [clojure.string :as string]))


(defn total []
  (count (db/get :note-ids)))

(defn id->note [id]
  (db/get-in :notes [id]))

(defn ids->notes [ids]
  (map id->note ids))
