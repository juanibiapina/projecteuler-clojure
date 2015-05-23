(ns projecteuler.problem-1)

(defn divisible [n d]
  (> 1 (mod n d)))

(defn sum-multiples
  [max]
  (loop [n 1
         sum 0]
    (if (= n max)
      sum
      (if (or (divisible n 3) (divisible n 5))
        (recur (inc n) (+ sum n))
        (recur (inc n) sum)))))
