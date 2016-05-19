package entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Saidaslog.class)
public class Saidaslog_ { 

    public static volatile SingularAttribute<Saidaslog, Integer> id;
    public static volatile SingularAttribute<Saidaslog, Integer> idmotivosaida;
    public static volatile SingularAttribute<Saidaslog, Integer> idfuncionario;
    public static volatile SingularAttribute<Saidaslog, Date> dataoriginal;
    public static volatile SingularAttribute<Saidaslog, Date> dataalteracao;
    public static volatile SingularAttribute<Saidaslog, BigDecimal> valor;
    public static volatile SingularAttribute<Saidaslog, Integer> idFuncionarioAltercao;
    public static volatile SingularAttribute<Saidaslog, String> tipo;
    public static volatile SingularAttribute<Saidaslog, String> favorecido;
    public static volatile SingularAttribute<Saidaslog, String> usuarioAlteracao;
    public static volatile SingularAttribute<Saidaslog, String> observacao;
    public static volatile SingularAttribute<Saidaslog, Integer> idoriginal;

}