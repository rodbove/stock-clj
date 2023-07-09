(ns curso.aula2)

(defn imprime-mensagem []
  (println "Bem vindo(a) ao estoque"))

(defn aplica-desconto [valor-bruto]
  (* valor-bruto 0.9))

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100) 
        desconto (* valor-bruto taxa-de-desconto)]
    (println "Calculando desconto de " desconto)
    (if (> valor-bruto 100)
    (- valor-bruto desconto)
    valor-bruto)))

(valor-descontado 1000)

(defn filter-accounts
  "Return filtered accounts based on parent-account"
  [accounts]
  (map println accounts ))

(let [accounts ["1", "1.1", "1.2", "2", "2.1"]]
  (filter-accounts accounts))


