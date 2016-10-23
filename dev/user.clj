(ns user
  "Namespace to support hacking at the REPL."
  (:require [com.nomistech.slurp-or-evaluate :refer :all]))

;;;; ___________________________________________________________________________
;;;; App-specific additional utilities for the REPL

;; (alter-var-root #'slurp-or-evaluate-store-dir (constantly "my-store-dir"))

(do
  (def-expensive foo-1 (do (println "computing foo-1") :a))
  (def-expensive foo-2 (do (println "computing foo-2") :b))
  (def-expensive foo-1 (do (println "replacing foo-1") :not-this))
  (def-expensive-replacing foo-2 (do (println "computing foo-2") :b-new)))
