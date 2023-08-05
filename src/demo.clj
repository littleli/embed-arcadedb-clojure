(ns demo
  (:import [com.arcadedb ContextConfiguration]
           [com.arcadedb.server ArcadeDBServer])
  (:gen-class))

(comment

  (def config (ContextConfiguration.))
  (def server (ArcadeDBServer. config))
  (.start server)

  (def db (.getOrCreateDatabase server "demo.db"))
  db

,)
