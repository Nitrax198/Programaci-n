@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(type=LocalDate.class, 
        value=LocalDateAdapter.class),
})


package modelo;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
