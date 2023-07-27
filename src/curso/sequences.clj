(ns curso.sequences)

(def order {:bag {:quantity 2, :price 90},
            :shirt {:quantity 3, :price 40}})

;; key value destructuring as function parameter
(defn print-and-15
  [[key value]]
  (println "value:" key value)
  15)

(println (map print-and-15 order))

(defn product-price
  [[product value]]
  (let [final-price (* (:quantity value) (:price value))]
    {product (assoc value :total final-price)}))

def (new-order (map product-price order))