package br.mrcl.laboratorio.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "local")
public class Local {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String cidade;
    private String pais;
    @Lob
    private byte[] imagem;
    private Date dataCadastro;
    
    public Local() {
    }
    
    public int getId() {
         return id;
    }
    public void setId(int id) {
         this.id = id;
    }
    public String getNome() {
         return nome;
    }
    public void setNome(String nome) {
         this.nome = nome;
    }
    public String getCidade() {
         return cidade;
    }
    public void setCidade(String cidade) {
         this.cidade = cidade;
    }
    public String getPais() {
         return pais;
    }
    public void setPais(String pais) {
         this.pais = pais;
    }
    public byte[] getImagem() {
         return imagem;
    }
    public void setImagem(byte[] imagem) {
         this.imagem = imagem;
    }
    public Date getDataCadastro() {
         return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
         this.dataCadastro = dataCadastro;
    }




}
