(ns curso.aula3)
(defn aplica-desconto? [valor-bruto]
  (when (> valor-bruto 100)
    true))

(println (aplica-desconto? 1000))
(println (aplica-desconto? 90))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for maior que 100"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))