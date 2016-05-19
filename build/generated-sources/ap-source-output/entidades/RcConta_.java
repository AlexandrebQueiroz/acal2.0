package entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(RcConta.class)
public class RcConta_ { 

    public static volatile SingularAttribute<RcConta, Double> totalconta;
    public static volatile SingularAttribute<RcConta, Double> consumo;
    public static volatile SingularAttribute<RcConta, Date> data;
    public static volatile SingularAttribute<RcConta, Date> vencimento;
    public static volatile SingularAttribute<RcConta, Double> excessoLTd;
    public static volatile SingularAttribute<RcConta, Integer> numeroconta;
    public static volatile SingularAttribute<RcConta, String> numero;
    public static volatile SingularAttribute<RcConta, BigDecimal> taxaSocio;
    public static volatile SingularAttribute<RcConta, Integer> taxas;
    public static volatile SingularAttribute<RcConta, String> socio;
    public static volatile SingularAttribute<RcConta, Double> excessoValor;
    public static volatile SingularAttribute<RcConta, Date> pagamento;
    public static volatile SingularAttribute<RcConta, Integer> numeroSocio;
    public static volatile SingularAttribute<RcConta, String> endereco;
    public static volatile SingularAttribute<RcConta, String> categoriaSocio;

}