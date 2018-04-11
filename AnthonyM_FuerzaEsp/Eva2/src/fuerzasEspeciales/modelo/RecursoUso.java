
package fuerzasEspeciales.modelo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class RecursoUso {
    @XmlElement( name = "Recurso" )
    protected RecursoMilitar recurso;
    @XmlElement( name = "Uso" )
    protected String uso;
    
    public RecursoUso() {
    }
    
    public RecursoUso(RecursoMilitar recurso, String uso) {
        this.recurso = recurso;
        this.uso = uso;
    }

    
}
