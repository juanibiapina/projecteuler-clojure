(ns projecteuler.problem-2-test
  (:require [clojure.test :refer :all]
            [projecteuler.problem-2 :refer :all]))

;; 1 2 3 5 8
(deftest test-problem-2
  (testing "below 10"
    (is (= 10 (problem-2 10))))

;; 1 2 3 5 8 13
  (testing "below 20"
    (is (= 10 (problem-2 20)))))
