package br.com.alura.loja;

import br.com.alura.loja.deconto.CalculadoradeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 4);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoradeDescontos calculadoradeDescontos = new CalculadoradeDescontos();
        System.out.println(calculadoradeDescontos.calcular(primeiro));
        System.out.println(calculadoradeDescontos.calcular(segundo));
    }
}
