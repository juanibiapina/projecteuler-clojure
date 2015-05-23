(ns projecteuler.problem-5-test
  (:require [clojure.test :refer :all]
            [projecteuler.problem-5 :refer :all]))

(deftest test-smallest-divisible
  (testing "until 10"
    (is (= 2520 (smallest-divisible 10 )))))
