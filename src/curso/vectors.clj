(ns curso.vectors)

(def prices [30 700 1000])
(prices 0)
(get prices 2 0)
(get prices 3 0)

(def new-prices (conj prices 5))

(update prices 0 inc)
(update prices 0 dec)

(defn sum-1 [value] (+ value 1))
(update prices 0 sum-1)

(defn apply-discount? [brute-value]
  (when (> brute-value 100)
    true))

(defn discounted-value
  "Returns the brute value with a 10% discount if it is higher than 100"
  [brute-value]
  (if (apply-discount? brute-value)
    (let [discount-tax (/ 10 100)
          discount (* brute-value discount-tax)]
      (- brute-value discount))
    brute-value))

(map discounted-value prices)
(filter even? (range 10))
(filter apply-discount? prices)
(map discounted-value (filter apply-discount? prices))

(reduce + prices)
(reduce + 1 [15])
(map ["i"] (range 7))
(clojure.string/join "" (for [x (range 7)] "i"))