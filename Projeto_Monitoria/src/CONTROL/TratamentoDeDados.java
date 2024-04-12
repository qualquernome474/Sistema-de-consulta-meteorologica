/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;

import MODEL.ListagemDeDados;
import java.util.Arrays;

/**
 *
 * @author SYSTEM N.P
 */
public class TratamentoDeDados {

    public static ListagemDeDados tratamentodedados(String Dados) {

        /*Criamos a variavél do tipo ListagemDeDados, que armazenará os dados já tratados*/
        ListagemDeDados LDD = new ListagemDeDados();

        /*Verificamos se os dados retornados pela API não são nulos, ou seja, verificamos se a pesquisa retornou um resultado válido e que não houve erros*/
        if (Dados != null) {

            /*Retiramos todas as chaves*/
            Dados = Dados.replace("{", "");
            Dados = Dados.replace("}", "");

            /*Declaramos um vetor de strings, que receberá os dados retornado pela API, mas esses dados serão "divididos" a cada  ," que houver*/
            String lista[] = Dados.split(",\"");

            /*Usamos um for para analizarmos os dados de todas as posições do vetor lista[]*/
            for (int i = 0; i < lista.length; i++) {

                /*Retiramos os conteúdos que estão antes dos :*/
                if (lista[i].contains(":")) {
                    lista[i] = lista[i].substring(lista[i].indexOf(":") + 1);
                }
                /*Retiramos todos os ,"*/
                lista[i] = lista[i].replace("\"", "");

                /*Retiramos separadamente os tipos de dados dos endereços do vetor que possuem mais de um : em seus "tópicos", logo, não são inteiramente tratados pelo primeiro if de dentro do for*/
                if (lista[i].contains("name:")) {
                    lista[i] = lista[i].substring(lista[i].indexOf("name:") + 5);
                }

                if (lista[i].contains("text:")) {
                    lista[i] = lista[i].substring(lista[i].indexOf("text:") + 5);
                }

                if (lista[i].contains("last_updated_epoch:")) {
                    lista[i] = lista[i].substring(lista[i].indexOf("last_updated_epoch:") + 19);
                }
            }

            /*Convertemos o valor 0 ou 1 do dado sobre se é dia para sua versão em palavras*/
            if (lista[12].equalsIgnoreCase("0")) {
                lista[12] = "não";
            } else {
                lista[12] = "sim";
            }

            /*Adicionamos os dados tratados na variável LDD, salvando os dados dos endereços da lista, onde os endereços são baseados no modelo da divisão dos dados da API(o split), nas suas correspondentes variáveis da classe ListagemDeDados, que é o tipo de LDD*/
            LDD.setNome(lista[0]);
            LDD.setRegiao(lista[1]);
            LDD.setPais(lista[2]);
            LDD.setLatitude(lista[3]);
            LDD.setLongitude(lista[4]);
            LDD.setFusohorario(lista[5]);
            LDD.setHoralocal(lista[7]);
            LDD.setTemperaturaC(lista[10]);
            LDD.setTemperaturaF(lista[11]);
            LDD.setSensacaotermicaC(lista[26]);
            LDD.setSensacaotermicaF(lista[27]);
            LDD.setClima(lista[13]);
            LDD.setDirecaovento(lista[19]);
            LDD.setVentoKMH(lista[17]);
            LDD.setVentoMPH(lista[16]);
            LDD.setIconeclima("https:" + lista[14]);
            LDD.setGrauvento(lista[18]);
            LDD.setE_dia(lista[12]);

            LDD.setUV(lista[30]);
            LDD.setUmidade(lista[24]);

            LDD.setVisibilidadeKMH(lista[28]);
            LDD.setVisibilidadeMPH(lista[29]);

            LDD.setUltimaatualizacao(lista[9]);

            LDD.setPreciptacaomm(lista[22]);
            LDD.setPreciptacaoinches(lista[23]);
        }

        /*Retornamos a variável com os dados tratados*/
        return LDD;
    }
}
