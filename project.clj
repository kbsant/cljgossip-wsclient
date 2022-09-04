(defproject cljgossip/wsclient "0.1.0-SNAPSHOT"
  :description "A default websocket client for cljgossip"
  :url "https://github.com/kbsant/cljgossip-wsclient"
  :dependencies
  [[org.clojure/clojure "1.11.1"]
   [org.clojure/data.json "2.4.0"]
   [medley "1.4.0"]
   [stylefruits/gniazdo "1.2.1"]]
  :repl-options {:init-ns cljgossip.wsclient})
