(ns projecteuler.problem-7)

(defn nth-prime [n]
  (nth (projecteuler.problem-3/primes) (dec n)))
