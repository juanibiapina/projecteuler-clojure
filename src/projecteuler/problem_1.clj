(ns projecteuler.problem-1)

(defn divisible
  [n d]
  (> 1 (mod n d)))

(defn sum-multiples [max]
  (apply + (filter #(or (divisible % 3) (divisible % 5)) (range 1 max))))
