(ns projecteuler.problem-7-test
  (:require [clojure.test :refer :all]
            [projecteuler.problem-7 :refer :all]))

(deftest test-nth-prime
  (testing "1"
    (is (= 2 (nth-prime 1))))
  (testing "5"
    (is (= 11 (nth-prime 5))))
  (testing "6"
    (is (= 13 (nth-prime 6)))))
