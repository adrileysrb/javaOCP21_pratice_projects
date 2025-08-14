package com.small.services;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import com.small.model.Venda;
import com.small.repository.VendaRepository;

@ApplicationScoped
public class VendaService {

        @Inject
        private VendaRepository repository;

        public long question01() {
                List<Venda> allSellings = repository.listAll();

                IntSummaryStatistics summaryData = allSellings.stream()
                                .filter(sell -> sell.getData().getYear() == LocalDate.now().getYear())
                                .mapToInt(sell -> sell.getQuantidade())
                                .summaryStatistics();

                System.out.println("Quantidade de itens somados na questão 01: " + summaryData.getCount() + "\n");

                return summaryData.getSum();
        }

        public List<Venda> question02() {
                List<Venda> allSellings = repository.listAll();

                List<Venda> result = allSellings.stream()
                                .distinct()
                                .sorted(Comparator.comparing(Venda::getProduto))
                                .toList();

                return result;
        }

        public String question03() {
                List<Venda> allSellings = repository.listAll();

                Map<String, Integer> groupingByResult = allSellings.stream()
                                .collect(
                                                Collectors.groupingBy(
                                                                Venda::getVendedor,
                                                                Collectors.summingInt(Venda::getQuantidade)));

                Map<String, Integer> groupingResultOrdered = groupingByResult.entrySet().stream()
                                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                                .collect(
                                                Collectors.toMap(
                                                                Map.Entry::getKey,
                                                                Map.Entry::getValue,
                                                                (e1, e2) -> e1,
                                                                LinkedHashMap::new));

                System.out.println();
                System.out.println(groupingResultOrdered);
                System.out.println();
                return groupingResultOrdered.entrySet().iterator().next().getKey();
        }

        public List<Venda> question04() {
                List<Venda> allSellings = repository.listAll();

                return allSellings.stream()
                                .filter(sell -> sell.getPrecoUnitario() > 1000)
                                .toList();
        }

        public Map<String, Double> question05() {
                List<Venda> allSellings = repository.listAll();

                Map<String, Double> result = allSellings.stream()
                                .collect(Collectors.groupingBy(Venda::getVendedor,
                                                Collectors.summingDouble(Venda::getQuantidade)));
                return result;
        }

        public Map<String, Double> question06() {
                List<Venda> allSellings = repository.listAll();

                Map<String, Double> result = allSellings.stream()
                                .collect(Collectors.groupingBy(Venda::getVendedor,
                                                Collectors.summingDouble(Venda::getQuantidade)));
                return result;
        }

        public Map<String, List<Venda>> question07() {
                List<Venda> allSellings = repository.listAll();

                Map<String, List<Venda>> result = allSellings.stream().collect(
                                Collectors.groupingBy(value -> value.getData().getMonth().toString(),
                                                Collectors.toList()));
                return result;
        }

}
