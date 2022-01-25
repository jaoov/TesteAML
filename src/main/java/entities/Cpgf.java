package entities;

import java.io.Serializable;

public class Cpgf implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codigoOrgaoS;
    private String nomeOrgaoS;
    private String codigoOrgao;
    private String nomeOrgao;
    private String codigoUnidadeG;
    private String nomeUnidadeG;
    private String anoExtrato;
    private String mesExtrato;
    private String cpfPortador;
    private String nomePortador;
    private String cnpjCpfFavorecido;
    private String nomeFavorecido;
    private String trasacao;
    private String dataTransacao;
    private String valorTransacao;

    public Cpgf() {
    }

    public Cpgf(String codigoOrgaoS, String nomeOrgaoS, String codigoOrgao, String nomeOrgao, String codigoUnidadeG, String nomeUnidadeG, String anoExtrato, String mesExtrato, String cpfPortador, String nomePortador, String cnpjCpfFavorecido, String nomeFavorecido, String trasacao, String dataTransacao, String valorTransacao) {
        super();
        this.codigoOrgaoS = codigoOrgaoS;
        this.nomeOrgaoS = nomeOrgaoS;
        this.codigoOrgao = codigoOrgao;
        this.nomeOrgao = nomeOrgao;
        this.codigoUnidadeG = codigoUnidadeG;
        this.nomeUnidadeG = nomeUnidadeG;
        this.anoExtrato = anoExtrato;
        this.mesExtrato = mesExtrato;
        this.cpfPortador = cpfPortador;
        this.nomePortador = nomePortador;
        this.cnpjCpfFavorecido = cnpjCpfFavorecido;
        this.nomeFavorecido = nomeFavorecido;
        this.trasacao = trasacao;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
    }

    public String getCodigoOrgaoS() {
        return codigoOrgaoS;
    }

    public void setCodigoOrgaoS(String codigoOrgaoS) {
        this.codigoOrgaoS = codigoOrgaoS;
    }

    public String getNomeOrgaoS() {
        return nomeOrgaoS;
    }

    public void setNomeOrgaoS(String nomeOrgaoS) {
        this.nomeOrgaoS = nomeOrgaoS;
    }

    public String getCodigoOrgao() {
        return codigoOrgao;
    }

    public void setCodigoOrgao(String codigoOrgao) {
        this.codigoOrgao = codigoOrgao;
    }

    public String getNomeOrgao() {
        return nomeOrgao;
    }

    public void setNomeOrgao(String nomeOrgao) {
        this.nomeOrgao = nomeOrgao;
    }

    public String getCodigoUnidadeG() {
        return codigoUnidadeG;
    }

    public void setCodigoUnidadeG(String codigoUnidadeG) {
        this.codigoUnidadeG = codigoUnidadeG;
    }

    public String getNomeUnidadeG() {
        return nomeUnidadeG;
    }

    public void setNomeUnidadeG(String nomeUnidadeG) {
        this.nomeUnidadeG = nomeUnidadeG;
    }

    public String getAnoExtrato() {
        return anoExtrato;
    }

    public void setAnoExtrato(String anoExtrato) {
        this.anoExtrato = anoExtrato;
    }

    public String getMesExtrato() {
        return mesExtrato;
    }

    public void setMesExtrato(String mesExtrato) {
        this.mesExtrato = mesExtrato;
    }

    public String getCpfPortador() {
        return cpfPortador;
    }

    public void setCpfPortador(String cpfPortador) {
        this.cpfPortador = cpfPortador;
    }

    public String getNomePortador() {
        return nomePortador;
    }

    public void setNomePortador(String nomePortador) {
        this.nomePortador = nomePortador;
    }

    public String getCnpjCpfFavorecido() {
        return cnpjCpfFavorecido;
    }

    public void setCnpjCpfFavorecido(String cnpjCpfFavorecido) {
        this.cnpjCpfFavorecido = cnpjCpfFavorecido;
    }

    public String getNomeFavorecido() {
        return nomeFavorecido;
    }

    public void setNomeFavorecido(String nomeFavorecido) {
        this.nomeFavorecido = nomeFavorecido;
    }

    public String getTrasacao() {
        return trasacao;
    }

    public void setTrasacao(String trasacao) {
        this.trasacao = trasacao;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(String valorTransacao) {
        //this.valorTransacao = valorTransacao;
    }

    @Override
    public String toString() {
        return "Cpgf{" +
                "codigoOrgaoS='" + codigoOrgaoS + '\'' +
                ", nomeOrgaoS='" + nomeOrgaoS + '\'' +
                ", codigoOrgao='" + codigoOrgao + '\'' +
                ", nomeOrgao='" + nomeOrgao + '\'' +
                ", codigoUnidadeG='" + codigoUnidadeG + '\'' +
                ", nomeUnidadeG='" + nomeUnidadeG + '\'' +
                ", anoExtrato='" + anoExtrato + '\'' +
                ", mesExtrato='" + mesExtrato + '\'' +
                ", cpfPortador='" + cpfPortador + '\'' +
                ", nomePortador='" + nomePortador + '\'' +
                ", cnpjCpfFavorecido='" + cnpjCpfFavorecido + '\'' +
                ", nomeFavorecido='" + nomeFavorecido + '\'' +
                ", trasacao='" + trasacao + '\'' +
                ", dataTransacao='" + dataTransacao + '\'' +
                ", valorTransacao=" + valorTransacao +
                '}';
    }
}
