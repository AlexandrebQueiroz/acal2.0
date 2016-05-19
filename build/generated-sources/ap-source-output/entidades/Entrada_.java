package entidades;

import entidades.Funcionario;
import entidades.Motivoentrada;
import entidades.Socio;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Entrada.class)
public class Entrada_ { 

    public static volatile SingularAttribute<Entrada, Integer> id;
    public static volatile SingularAttribute<Entrada, BigDecimal> valor;
    public static volatile SingularAttribute<Entrada, Motivoentrada> idMotivoEntrada;
    public static volatile SingularAttribute<Entrada, Date> data;
    public static volatile SingularAttribute<Entrada, String> observacao;
    public static volatile SingularAttribute<Entrada, Socio> idCedente;
    public static volatile SingularAttribute<Entrada, Funcionario> idFuncionario;

}