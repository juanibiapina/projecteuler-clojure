(ns projecteuler.problem-4)

(defn palimdrome? [n]
  (let [s (str n)]
    (= s (clojure.string/reverse s))))

(defn largest-palimdrome [start end]
  (apply max (filter palimdrome? (for [n1 (range start (inc end))
                                       n2 (range start (inc end))]
                                   (* n1 n2)))))
