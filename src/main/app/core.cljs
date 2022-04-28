(ns app.core
  (:require [helix.core :refer [defnc]]
            [helix.dom :as d]
            ["react-dom" :as rdom]))

(defnc app []
  {:helix/features {:define-factory true}}
  (d/div
    (d/p "Hello world")))

(defn init []
  (rdom/render (app) (js/document.getElementById "root")))