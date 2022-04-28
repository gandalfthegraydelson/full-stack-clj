(ns app.core
  (:require [app.lib :refer [defnc]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            ["react-dom" :as rdom]))

(defnc App []
  (let [[counter set-counter] (hooks/use-state 0)]
    (d/div
      (d/p "The count is " counter)
      (d/button {:on-click #(set-counter dec)} "-1")
      (d/button {:on-click #(set-counter inc)} "+1"))))

(defn ^:dev/after-load render []
  (rdom/render (App) (js/document.getElementById "root")))

(defn init []
  (render))