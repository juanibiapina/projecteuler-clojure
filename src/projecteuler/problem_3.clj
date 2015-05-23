(ns projecteuler.problem-3)

(defn prime? [n]
  (if (< n 2)
    false
    (not (some #(zero? (mod n %)) (range 2 (inc (/ n 2)))))))

(defn primes
  ([] (primes 2))
  ([n]
   (loop [n n]
     (if (prime? n)
       (cons n (lazy-seq (primes (inc n))))
       (recur (inc n))))))


(defn max-prime-factor [n]
  (loop [primes (primes)
         n n]
    (if (= n 1)
      (first primes)
      (if (zero? (mod n (first primes)))
        (recur primes (/ n (first primes)))
        (recur (rest primes) n)))))
