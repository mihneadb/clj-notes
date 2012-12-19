(defproject clj-notes "0.1.0-SNAPSHOT"
            :description "simple notes app - learning project"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [noir "1.2.1"]]
            :jvm-opts ["-Xmx256M"]
            :main clj-notes.server)

