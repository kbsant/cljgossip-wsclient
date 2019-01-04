(defproject cljgossip/wsclient "0.1.0-SNAPSHOT"
  :description "A default websocket client for cljgossip"
  :url "https://github.com/kbsant/cljgossip-wsclient"
  :dependencies
  [[org.clojure/clojure "1.10.0"]
   [org.clojure/data.json "0.2.6"]
   [medley "1.0.0"]
   [stylefruits/gniazdo "1.1.1"]]
  :repl-options {:init-ns cljgossip.wsclient})
