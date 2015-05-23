(ns projecteuler.problem-1)

(defn sum-multiples [values max]
  (reduce + (apply concat (map #(range 0 max %) values))))
