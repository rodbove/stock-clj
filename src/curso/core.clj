(ns curso.core)

(println "Stock management system")

(defn apply-discount? [brute-value]
  (when (> brute-value 100)
    true))

(println (apply-discount? 1000))
(println (apply-discount? 90))

(defn discounted-value
  "Returns the brute value with a 10% discount if it is higher than 100"
  [brute-value]
  (if (apply-discount? brute-value)
    (let [discount-tax (/ 10 100)
          discount (* brute-value discount-tax)]
      (- brute-value discount))
    brute-value))

(println (discounted-value 1000))
(println (discounted-value 100))

(defn convert-and-sum
  [value]
  (let [parsed-value (parse-double value)]
    (+ parsed-value 1)))

(map convert-and-sum ["1" "1.1"])