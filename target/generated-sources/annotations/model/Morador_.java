package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Aluguel;
import model.ContaDeAgua;
import model.Saida;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-08T17:29:33")
@StaticMetamodel(Morador.class)
public class Morador_ { 

    public static volatile SingularAttribute<Morador, Boolean> ativo;
    public static volatile SingularAttribute<Morador, Long> idCasa;
    public static volatile SingularAttribute<Morador, String> nome;
    public static volatile SingularAttribute<Morador, Double> calcaoPaga;
    public static volatile ListAttribute<Morador, ContaDeAgua> contaDeAgua;
    public static volatile SingularAttribute<Morador, Long> idSaida;
    public static volatile ListAttribute<Morador, Aluguel> aluguel;
    public static volatile SingularAttribute<Morador, String> dataVencimento;
    public static volatile SingularAttribute<Morador, String> cpf;
    public static volatile SingularAttribute<Morador, String> descricaoCalcao;
    public static volatile SingularAttribute<Morador, Saida> saida;
    public static volatile SingularAttribute<Morador, Long> id;
    public static volatile SingularAttribute<Morador, String> dataDeEntrada;

}