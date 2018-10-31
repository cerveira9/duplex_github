package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.MesReferente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-30T20:51:15")
@StaticMetamodel(Aluguel.class)
public class Aluguel_ { 

    public static volatile SingularAttribute<Aluguel, String> dataPagamento;
    public static volatile SingularAttribute<Aluguel, MesReferente> mesReferente;
    public static volatile SingularAttribute<Aluguel, Double> valor;
    public static volatile SingularAttribute<Aluguel, Long> id;
    public static volatile SingularAttribute<Aluguel, Boolean> pago;

}