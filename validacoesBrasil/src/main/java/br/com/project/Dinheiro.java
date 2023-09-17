package br.com.project;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;

public class Dinheiro {
    public static void main(String[] args) {
        CurrencyUnit moeda = Monetary.getCurrency("BRL");
        MonetaryAmount valorParcela = Money.of(75, moeda);
        System.out.println(valorParcela);
        MonetaryAmount valorTotal = valorParcela.multiply(12);
        System.out.println(valorTotal);
        MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
        System.out.println(desconto);

        NumberValue descontoSemMoeda = desconto.getNumber();
        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
        String valorPorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());

        System.out.println("Olá! Você ganhou " + valorPorExtenso + " de desconto para a primeira compra!");
        System.out.println("Olá! Você ganhou " + desconto + " de desconto para a primeira compra!");
    }
}
