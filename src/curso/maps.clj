(ns curso.maps)

;; using string as keys
(def stock {"Bag" 10, "Shirt" 5})
(println stock)
(println (count stock))
(println (keys stock))
(println (vals stock))

;; using keywors
(def stock {:bag 10, :shirt 5})
(println stock)

(assoc stock :chair 3)
(assoc stock :bag 3)
(update stock :bag inc)

(defn remove-one
  [value]
  (println "removing one from" value)
  (- value 1))

(println (update stock :bag remove-one))
(println (update stock :bag #(- % 3)))
(println (dissoc stock :bag))


(def order {:bag {:quantity 2, :price 90},
            :shirt {:quantity 3, :price 40}})
(println order)

(def order (assoc order :keychain {:quantity 1, :price 10}))
(println order)
(println (order :bag))
(println (get order :chair {}))
(println (:bag order))
(println (:quantity (:bag order)))

(println (update-in order [:bag :quantity] inc))

;; threading
(-> order
    :bag
    :quantity)