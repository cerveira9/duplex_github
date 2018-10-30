package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Aluguel;
import model.ContaDeAgua;
import model.Saida;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-29T12:06:43")
@StaticMetamodel(Morador.class)
public class Morador_ { 

    public static volatile ListAttribute<Morador, Aluguel> aluguel;
    public static volatile SingularAttribute<Morador, String> dataVencimento;
    public static volatile SingularAttribute<Morador, String> cpf;
    public static volatile SingularAttribute<Morador, Long> idCasa;
    public static volatile SingularAttribute<Morador, String> nome;
    public static volatile SingularAttribute<Morador, Double> calcaoPaga;
    public static volatile SingularAttribute<Morador, String> descricaoCalcao;
    public static volatile SingularAttribute<Morador, Saida> saida;
    public static volatile SingularAttribute<Morador, Long> id;
    public static volatile SingularAttribute<Morador, String> dataDeEntrada;
    public static volatile ListAttribute<Morador, ContaDeAgua> contaDeAgua;

}