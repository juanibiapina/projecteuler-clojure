(ns projecteuler.problem-6)

(defn square [n] (* n n))

(defn sum-squares [end]
  (reduce + (map square (range 1 (inc end)))))

(defn square-sum [end]
  (square (reduce + (range 1 (inc end)))))

(defn sum-square-difference [end]
  (- (square-sum end) (sum-squares end)))
