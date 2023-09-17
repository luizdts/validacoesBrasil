package br.com.project;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class NumeroExtenso {

    public static void main(String[] args) {

        NumericToWordsConverter conversor = new NumericToWordsConverter(new InteiroSemFormato());
        NumericToWordsConverter conversorReais = new NumericToWordsConverter(new FormatoDeReal());
        BigDecimal valor = new BigDecimal("75.00");
        String valorPorExtenso = conversor.toWords(valor.doubleValue());
        BigDecimal reais = new BigDecimal("125.93");
        String dinheiroPorExtenso = conversorReais.toWords(reais.doubleValue());

        System.out.println(valorPorExtenso);
        System.out.println(dinheiroPorExtenso);
    }
}
