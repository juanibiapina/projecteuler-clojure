(ns projecteuler.problem-1)

(defn sum-multiples [max]
  (reduce + (concat (range 0 max 3) (range 0 max 5))))
