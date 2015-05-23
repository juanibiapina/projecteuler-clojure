(ns projecteuler.problem-3)

(defn primes
  ([]
   (primes (iterate inc 2)))
  ([s]
   (lazy-seq (cons (first s) (filter #(not= 0 (mod % (first s))) (rest s))))))

(defn max-prime-factor [n]
  (loop [primes (primes)
         n n]
    (if (= n 1)
      (first primes)
      (if (zero? (mod n (first primes)))
        (recur primes (/ n (first primes)))
        (recur (rest primes) n)))))
