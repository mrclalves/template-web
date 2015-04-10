package br.com.javamagazine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

@ManagedBean(name="clienteBean")
@SessionScoped
@Controller(value="clienteBean")
public class ClienteBean implements Serializable {
    private List<Cliente> listaCliente;
    private List<String> listaSexo;
    private Cliente cliente;
    private boolean novoCadastro;
    @ManagedProperty(value="#{localidadeClienteBean}")
    private LocalidadeCliente localidade;

    public ClienteBean() {
        listaCliente = new ArrayList<Cliente>();
        listaSexo = new ArrayList<String>();
        listaSexo.add("Masculino");
        listaSexo.add("Feminino");
        cliente = new Cliente();
        cliente.setLocalidadeCliente(new LocalidadeCliente());
    }

    public String criarCliente() {
        LocalidadeCliente localidadeCliente = new LocalidadeCliente();
        localidadeCliente.setCidade(localidade.getCidade());
        localidadeCliente.setEstado(localidade.getEstado());
        cliente.setLocalidadeCliente(localidadeCliente);
        listaCliente.add(cliente);
        cliente = new Cliente();
        cliente.setLocalidadeCliente(new LocalidadeCliente());
        return "/index";
    }

    public String cancelar() {
        cliente = new Cliente();
        cliente.setLocalidadeCliente(new LocalidadeCliente());
        return "index";
    }

    public boolean isNovoCadastro() {
        return novoCadastro;
    }

    public void setNovoCadastro(boolean novoCadastro) {
        this.novoCadastro = novoCadastro;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<String> getListaSexo() {
        return listaSexo;
    }

    public void setListaSexo(List<String> listaSexo) {
        this.listaSexo = listaSexo;
    }

    public LocalidadeCliente getLocalidade() {
        return localidade;
    }

    public void setLocalidade(LocalidadeCliente localidade) {
        this.localidade = localidade;
    }
    
    public String confirmacao() {
        return "confirmacao";
    }
}