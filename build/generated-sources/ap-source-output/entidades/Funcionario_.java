package entidades;

import entidades.Cheque;
import entidades.Entrada;
import entidades.Pessoa;
import entidades.Saida;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, Integer> id;
    public static volatile SingularAttribute<Funcionario, Pessoa> idPessoa;
    public static volatile ListAttribute<Funcionario, Entrada> entradaList;
    public static volatile SingularAttribute<Funcionario, BigDecimal> salario;
    public static volatile ListAttribute<Funcionario, Saida> saidaList;
    public static volatile SingularAttribute<Funcionario, Date> dataContratacao;
    public static volatile SingularAttribute<Funcionario, String> cargo;
    public static volatile SingularAttribute<Funcionario, String> observacao;
    public static volatile SingularAttribute<Funcionario, Integer> matricula;
    public static volatile ListAttribute<Funcionario, Cheque> chequeList;

}