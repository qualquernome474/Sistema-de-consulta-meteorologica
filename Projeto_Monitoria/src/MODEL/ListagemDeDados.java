/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author SYSTEM N.P
 */
public class ListagemDeDados {

    /*Declaramos as variáveis referentes aos dados retornados pela API que serão obtidos e salvos nelas*/
    private String nome;
    private String regiao;
    private String pais;
    private String latitude;
    private String longitude;
    private String horalocal;
    private String fusohorario;
    private String temperaturaC;
    private String temperaturaF;
    private String sensacaotermicaC;
    private String sensacaotermicaF;
    private String e_dia;
    private String clima;
    private String iconeclima;
    private String ventoMPH;
    private String ventoKMH;
    private String grauvento;
    private String direcaovento;

    private String umidade;
    private String UV;

    private String visibilidadeKM;
    private String visibilidadeMilhas;

    private String ultimaatualizacao;
    private String preciptacaomm;
    private String preciptacaocainches;

    /*Declaramos os get's e set's das variáveis declaradas anteriormente*/
    public String getPreciptacaomm() {
        return preciptacaomm;
    }

    public String getPreciptacaoinches() {
        return preciptacaocainches;
    }

    public void setPreciptacaomm(String preciptacaomm) {
        this.preciptacaomm = preciptacaomm;
    }

    public void setPreciptacaoinches(String preciptacainches) {
        this.preciptacaocainches = preciptacainches;
    }

    public String getUmidade() {
        return umidade;
    }

    public String getUV() {
        return UV;
    }

    public void setUmidade(String umidade) {
        this.umidade = umidade;
    }

    public void setUV(String UV) {
        this.UV = UV;
    }

    public String getVisibilidadeKM() {
        return visibilidadeKM;
    }

    public String getVisibilidadeMilhas() {
        return visibilidadeMilhas;
    }

    public void setVisibilidadeKMH(String visibilidadeKMH) {
        this.visibilidadeKM = visibilidadeKMH;
    }

    public void setVisibilidadeMPH(String visibilidadeMPH) {
        this.visibilidadeMilhas = visibilidadeMPH;
    }

    public String getE_dia() {
        return e_dia;
    }

    public String getClima() {
        return clima;
    }

    public String getIconeclima() {
        return iconeclima;
    }

    public String getVentoMPH() {
        return ventoMPH;
    }

    public String getVentoKMH() {
        return ventoKMH;
    }

    public String getGrauvento() {
        return grauvento;
    }

    public String getDirecaovento() {
        return direcaovento;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getPais() {
        return pais;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getHoralocal() {
        return horalocal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setHoralocal(String horalocal) {
        this.horalocal = horalocal;
    }

    public String getFusohorario() {
        return fusohorario;
    }

    public void setFusohorario(String fusohorario) {
        this.fusohorario = fusohorario;
    }

    public String getTemperaturaC() {
        return temperaturaC;
    }

    public String getTemperaturaF() {
        return temperaturaF;
    }

    public String getSensacaotermicaC() {
        return sensacaotermicaC;
    }

    public String getSensacaotermicaF() {
        return sensacaotermicaF;
    }

    public void setTemperaturaC(String temperaturaC) {
        this.temperaturaC = temperaturaC;
    }

    public void setTemperaturaF(String temperaturaF) {
        this.temperaturaF = temperaturaF;
    }

    public void setSensacaotermicaC(String sensacaotermicaC) {
        this.sensacaotermicaC = sensacaotermicaC;
    }

    public void setSensacaotermicaF(String sensacaotermicaF) {
        this.sensacaotermicaF = sensacaotermicaF;
    }

    public void setE_dia(String e_dia) {
        this.e_dia = e_dia;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void setIconeclima(String iconeclima) {
        this.iconeclima = iconeclima;
    }

    public void setVentoMPH(String ventoMPH) {
        this.ventoMPH = ventoMPH;
    }

    public void setVentoKMH(String ventoKMH) {
        this.ventoKMH = ventoKMH;
    }

    public void setGrauvento(String grauvento) {
        this.grauvento = grauvento;
    }

    public void setDirecaovento(String direcaovento) {
        this.direcaovento = direcaovento;
    }

    public String getUltimaatualizacao() {
        return ultimaatualizacao;
    }

    public void setVisibilidadeKM(String visibilidadeKM) {
        this.visibilidadeKM = visibilidadeKM;
    }

    public void setVisibilidadeMilhas(String visibilidadeMilhas) {
        this.visibilidadeMilhas = visibilidadeMilhas;
    }

    public void setUltimaatualizacao(String ultimaatualizacao) {
        this.ultimaatualizacao = ultimaatualizacao;
    }

}
