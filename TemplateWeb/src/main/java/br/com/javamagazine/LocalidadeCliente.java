package br.com.javamagazine;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.NoneScoped;

@ManagedBean(name="localidadeClienteBean")
@NoneScoped

public class LocalidadeCliente implements Serializable {
    private String cidade;
    private String estado;
    private String regiao;
    private List listaRegioes;
    private Map mapRegioes;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List getListaRegioes() {
        return listaRegioes;
    }

    public void setListaRegioes(List listaRegioes) {
        this.listaRegioes = listaRegioes;
    }

    public Map getMapRegioes() {
        return mapRegioes;
    }

    public void setMapRegioes(Map mapRegioes) {
        this.mapRegioes = mapRegioes;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}