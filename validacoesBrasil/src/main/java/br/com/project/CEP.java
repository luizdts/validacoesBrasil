package br.com.project;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CEP {
    public static void main(String[] args) {
        ViaCEPClient cliente = new ViaCEPClient();
        try {
            ViaCEPEndereco endereco = cliente.getEndereco("59129-460");
            System.out.println(endereco.getBairro());
            System.out.println(endereco.getLogradouro());
            System.out.println(endereco.getLocalidade());
            System.out.println(endereco.getUf());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
