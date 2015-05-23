(ns projecteuler.problem-2)

(defn fibonacci-seq []
  (defn fib [a b]
    (cons a (lazy-seq (fib b (+ a b)))))
  (fib 1 2))

(defn problem-2 [max]
  (reduce + (filter even? (take-while #(< % max) (fibonacci-seq)))))
