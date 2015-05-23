(ns projecteuler.problem-4-test
  (:require [clojure.test :refer :all]
            [projecteuler.problem-4 :refer :all]))

(deftest test-largest-palimdrome
  (testing "product of two digit numbers"
    (is (= 9009 (largest-palimdrome 10 99)))))
