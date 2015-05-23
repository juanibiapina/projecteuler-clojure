(ns projecteuler.problem-5)

(defn divisible-by-all [n end]
  (every? #(zero? (mod n %)) (range 1 (inc end))))

(defn smallest-divisible [end]
  (first (filter #(divisible-by-all % end) (rest (iterate #(+ end %) 0)))))
