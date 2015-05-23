(ns projecteuler.problem-2)

(defn fibonacci-seq
  ([] (fibonacci-seq 1 2))
  ([a b] (lazy-seq (cons a (fibonacci-seq b (+ a b))))))

(defn problem-2 [max]
  (reduce + (filter even? (take-while #(< % max) (fibonacci-seq)))))
