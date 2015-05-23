(ns projecteuler.problem-6-test
  (:require [clojure.test :refer :all]
            [projecteuler.problem-6 :refer :all]))

(deftest test-sum-square-difference
  (testing "first 10"
    (is (= 2640 (sum-square-difference 10)))))
