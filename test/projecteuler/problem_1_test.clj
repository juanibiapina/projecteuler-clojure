(ns projecteuler.problem-1-test
  (:require [clojure.test :refer :all]
            [projecteuler.problem-1 :refer :all]))

(deftest sum-multiples-of-3-and-5
  (testing "below 10"
    (is (= 23 (sum-multiples 10)))))
