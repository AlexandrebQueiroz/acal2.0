package entidades;

import entidades.Funcionario;
import entidades.Motivodespesa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(Cheque.class)
public class Cheque_ { 

    public static volatile SingularAttribute<Cheque, String> observacoes;
    public static volatile SingularAttribute<Cheque, Date> dataPagamento;
    public static volatile SingularAttribute<Cheque, Motivodespesa> idMotivoDespesa;
    public static volatile SingularAttribute<Cheque, Integer> numero;
    public static volatile SingularAttribute<Cheque, Date> dataVencimento;
    public static volatile SingularAttribute<Cheque, BigDecimal> valor;
    public static volatile SingularAttribute<Cheque, Integer> id;
    public static volatile SingularAttribute<Cheque, Funcionario> idFuncionario;

}