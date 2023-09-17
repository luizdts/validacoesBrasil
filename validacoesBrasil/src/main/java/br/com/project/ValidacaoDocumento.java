package br.com.project;

import br.com.caelum.stella.validation.*;

import java.sql.SQLOutput;

// 86288366757
// 98745366797
public class ValidacaoDocumento {
    public static void main(String[] args) {
        String cpf = "86288366757";
        try {
            validarDocumento(new CPFValidator(), cpf);
            System.out.println("CPF VÁLIDO");
        } catch (InvalidStateException e){
            System.out.println("CPF INVÁLIDO: " + e);
        }

        String cnpj = "00214932000137";
        try{
            validarDocumento(new CNPJValidator(), cnpj);
            System.out.println("CNPJ VÁLIDO");
        }catch (InvalidStateException e){
            System.out.println("CNPJ INVÁLIDO: "+ e);
        }

        String tituloEleitor = "068646531643";
        try{
            validarDocumento(new TituloEleitoralValidator(), tituloEleitor);
            System.out.println("TÍTULO VÁLIDO");
        } catch (InvalidStateException e){
            System.out.println("TÍTULO INVÁLIDO: " + e);
        }
    }

    private static void validarDocumento(Validator<String> validador, String documento){
        validador.assertValid(documento);
    }
}
