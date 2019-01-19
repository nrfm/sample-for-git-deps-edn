(ns sample-git-dep.core
  (:require [reagent.core :as r]))

(defn local-root-resolves []
  [:div
   [:h1 "component from git-dependency from deps.edn"]])
