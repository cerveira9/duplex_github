package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Morador;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-26T15:31:07")
@StaticMetamodel(Casa.class)
public class Casa_ { 

    public static volatile SingularAttribute<Casa, String> nomeCasa;
    public static volatile ListAttribute<Casa, Morador> morador;
    public static volatile SingularAttribute<Casa, String> numeroCliente;
    public static volatile SingularAttribute<Casa, Long> id;

}