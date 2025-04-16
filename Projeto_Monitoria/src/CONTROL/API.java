/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;

import MODEL.ListagemDeDados;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author SYSTEM N.P
 */
public class API {

    public static ListagemDeDados aplicacaodaAPI(String cidade) {

        /*Declaramos a variável que receberá a resposta da API*/
        String a = null;

        /*Caso o nome da cidade tenha espaço, tranformamos os espaços em % para que possa ser aplicado na url*/
        cidade = cidade.replace(" ", "%");

        try {

            /*Fazemos a requisicao da API, formando a url usando o nome da cidade e requisitando uma resposta à API*/
            URL url = new URL("http://api.weatherapi.com/v1/current.json?key=Sua_Chave_API&q=" + cidade + "&aqi=no&lang=pt");
            /*Para utilizar o código, substitua "Sua_Chave_API" por sua chave API WeatherAPI, por questões de segurança, não a deixo pública*/

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");

            /*Fazemos a leitura do resultado enviado pelo servidor da APi o qual fizemos a requisição*/
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder resposta = new StringBuilder();
                String linha = null;
                while ((linha = br.readLine()) != null) {
                    resposta.append(linha.trim());
                }

                /*Salvamos o retorno do servidor da API na variável String que criamos anteriormente*/
                a = resposta.toString();

            }

        } catch (MalformedURLException ex) {
            
            /*Caso ocorra algum erro no url, é mostrado uma mensagem para o usuário*/
            JOptionPane.showMessageDialog(null, "Erro no endereço da API", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {

            /*Caso o dado seja corrompido durante o envio ou não seja encontrado a cidade pelo nome que o usuário informou, é mostrado uma mensagem para o usuário*/
            JOptionPane.showMessageDialog(null, "Dado corrompido durante o envio via rede ou cidade não encontrada", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        }

        /*Retornamos os dados que serão tratados na classe TratamentoDeDados, na qual os dados recebidos pela API são enviados como parâmetro*/
        return TratamentoDeDados.tratamentodedados(a);
    }
}
