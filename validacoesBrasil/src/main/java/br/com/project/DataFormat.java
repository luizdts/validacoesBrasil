package br.com.project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DataFormat {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(agora.format(formatadorHora));

        DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(agora.format(formatadorCurto));

        DateTimeFormatter formatadorMedioBrasil = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br")); // BR
        System.out.println(agora.format(formatadorMedioBrasil));

        DateTimeFormatter formatadorMedioCanada = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.CANADA);
        System.out.println(agora.format(formatadorMedioCanada));

        DateTimeFormatter formatadorMedioUS = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.US);
        System.out.println(agora.format(formatadorMedioUS));

        DateTimeFormatter formatadorCurtoUS = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.US);
        System.out.println(agora.format(formatadorCurtoUS));

        System.out.println(agora.minusHours(3).format(formatadorCurto));
        System.out.println(agora.plusHours(3).format(formatadorMedioBrasil));

    }
}
