package br.com.project;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
    public static void main(String[] args) {
        String cpf = "509.058.120-77";
        String cnpj = "27.422.296/0001-95";
        String tituloEleitor = "068646531643";

        System.out.println(cpf);
        formatarDocumento(new CPFFormatter(), cpf);

        System.out.println(cnpj);
        formatarDocumento(new CNPJFormatter(), cnpj);

        System.out.println(tituloEleitor);
        formatarDocumento(new TituloEleitoralFormatter(), tituloEleitor);

    }
    private static void formatarDocumento(Formatter formatador, String documento){
        if (formatador.isFormatted(documento)){
            System.out.println(formatador.unformat(documento));
        } else {
            System.out.println(formatador.format(documento));
        }
    }
}
