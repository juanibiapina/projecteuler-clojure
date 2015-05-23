(ns projecteuler.problem-3-test
  (:require [clojure.test :refer :all]
            [projecteuler.problem-3 :refer :all]))

(deftest test-max-prime-factor
  (testing "of 13195"
    (is (= 29 (max-prime-factor 13195)))))
