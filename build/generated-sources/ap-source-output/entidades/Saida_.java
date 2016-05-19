package entidades;

import entidades.Funcionario;
import entidades.Motivodespesa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Saida.class)
public class Saida_ { 

    public static volatile SingularAttribute<Saida, Integer> id;
    public static volatile SingularAttribute<Saida, Motivodespesa> idmotivosaida;
    public static volatile SingularAttribute<Saida, Funcionario> idfuncionario;
    public static volatile SingularAttribute<Saida, BigDecimal> valor;
    public static volatile SingularAttribute<Saida, Date> data;
    public static volatile SingularAttribute<Saida, String> favorecido;
    public static volatile SingularAttribute<Saida, String> observacao;

}