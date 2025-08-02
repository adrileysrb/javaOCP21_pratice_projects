🧠 Projeto: Análise de Vendas com Java Streams
📝 Enunciado
Você foi contratado para desenvolver um pequeno módulo de análise de vendas de uma loja online. A loja possui um sistema que gera uma lista de objetos Venda, e agora precisa de funcionalidades para extrair informações de forma funcional usando a API de Streams do Java.

🧾 Classe Venda
```java
public class Venda {
    private String vendedor;
    private String produto;
    private int quantidade;
    private double precoUnitario;
    private LocalDate data;

    // Construtor, getters e toString
}
```

🎯 Desafios obrigatórios
Implemente funcionalidades usando Streams para responder às seguintes perguntas:

Total de vendas realizadas no ano atual.

Lista de produtos vendidos em ordem alfabética (sem duplicados).

Nome do vendedor com maior valor total em vendas.

Lista de vendas com valor total maior que R$ 1.000,00.

Mapa com a soma total de vendas por vendedor (Map<String, Double>).

Valor médio de uma venda (considerando quantidade × preço unitário).

Vendas agrupadas por mês do ano (Map<Month, List<Venda>).

Top 3 produtos mais vendidos em quantidade total.

💡 Extras desafiadores (opcional)
Liste os dias da semana com maior volume de vendas.

Gere uma lista de strings no formato: "Pedro vendeu 5 unidades de Monitor por R$1500.00 em 2024-07-31".

📂 Dicas
Use Collectors.toMap(), groupingBy(), summarizingDouble(), sorted(), limit(), map(), flatMap() e distinct().

Evite loops imperativos — a ideia é resolver tudo com Streams.