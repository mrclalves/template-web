package br.com.javamagazine;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
    private String nome;
    private Date dataNascimento;
    private String sexo;
    private LocalidadeCliente localidadeCliente;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalidadeCliente getLocalidadeCliente() {
        return localidadeCliente;
    }

    public void setLocalidadeCliente(LocalidadeCliente localidadeCliente) {
        this.localidadeCliente = localidadeCliente;
    }
}