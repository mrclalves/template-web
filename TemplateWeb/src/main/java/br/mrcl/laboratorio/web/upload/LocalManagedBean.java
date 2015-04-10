package br.mrcl.laboratorio.web.upload;

import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.mrcl.laboratorio.web.model.Local;
import br.mrcl.laboratorio.web.persistence.RepositorioDeLocais;

@ManagedBean(name = "LocalMB")
@ViewScoped
@Controller(value="LocalMB")
public class LocalManagedBean implements Serializable {
    
    @Autowired
    private RepositorioDeLocais repositorioDeLocais;

    private Local        local = new Local();

    private List<String> imagens;
    
    public LocalManagedBean() {
    }

    public void handleFileUpload(FileUploadEvent event) {

        local.setImagem(event.getFile().getContents());
        local.setNome(event.getFile().getFileName());

        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public String cadastraLocal() throws SQLException {

        if (repositorioDeLocais.incluiLocal(local)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Local cadastrado com sucesso!"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Erro no cadastro de local!"));
        }

        return "";
    }

    public List<String> getImages() throws SQLException, IOException {

        List<String> images = new ArrayList<String>();
        List<Local> listaLocais = repositorioDeLocais.recuperaTodosLocais();

//        String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/temp");
        String path = "/aplicacao/imagens";

        for (Local local : listaLocais) {
            FileOutputStream fos = new FileOutputStream(path + "/" + local.getNome() + ".jpg");
            fos.write(local.getImagem());
            fos.close();
            images.add(local.getNome() + ".jpg");
        }

        return images;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
