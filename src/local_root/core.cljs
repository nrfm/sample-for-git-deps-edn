(ns local-root.core
  (:require [reagent.core :as r]
            [antizer.reagent :as antd]))

(defn local-root-resolves []
  [:div
   [:h1 "component from git-dependency from deps.edn"]
   [antd/button {:on-click #(js/alert "clicked!")} "click"]])
