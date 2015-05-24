(ns projecteuler.problem-9)

;; developed on the repl

(defn problem-9 []
  (reduce * (first (filter (fn [[a b c]] (= (+ (* a a) (* b b)) (* c c)))
                           (for [a (range 1000)
                                 b (range 1000)
                                 c (range 1000)
                                 :when (< a b)
                                 :when (< b c)
                                 :when (= 1000 (+ a b c))]
                             [a b c])))))
