package br.mrcl.laboratorio.web.persistence;

import java.io.Serializable;
import java.util.List;

import br.mrcl.laboratorio.web.model.Local;

public interface RepositorioDeLocais extends Serializable {

    public abstract List<Local> recuperaTodosLocais();

    public abstract boolean incluiLocal(Local local);

}