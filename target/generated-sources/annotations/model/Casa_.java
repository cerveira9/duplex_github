package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Morador;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-30T20:51:15")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-31T12:47:53")
>>>>>>> f56e61d6d93547305aa73f34b0065b10e1bc4701
@StaticMetamodel(Casa.class)
public class Casa_ { 

    public static volatile SingularAttribute<Casa, String> nomeCasa;
    public static volatile ListAttribute<Casa, Morador> morador;
    public static volatile SingularAttribute<Casa, String> numeroCliente;
    public static volatile SingularAttribute<Casa, Long> id;

}