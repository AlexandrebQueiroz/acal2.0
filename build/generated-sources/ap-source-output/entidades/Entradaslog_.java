package entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(Entradaslog.class)
public class Entradaslog_ { 

    public static volatile SingularAttribute<Entradaslog, String> tipo;
    public static volatile SingularAttribute<Entradaslog, String> observacao;
    public static volatile SingularAttribute<Entradaslog, Integer> idCedente;
    public static volatile SingularAttribute<Entradaslog, Date> dataOriginal;
    public static volatile SingularAttribute<Entradaslog, Integer> idMotivoEntrada;
    public static volatile SingularAttribute<Entradaslog, String> usuarioAlteracao;
    public static volatile SingularAttribute<Entradaslog, BigDecimal> valor;
    public static volatile SingularAttribute<Entradaslog, Integer> id;
    public static volatile SingularAttribute<Entradaslog, Integer> idOriginal;
    public static volatile SingularAttribute<Entradaslog, Integer> idFuncionario;
    public static volatile SingularAttribute<Entradaslog, Date> dataAlteracao;

}