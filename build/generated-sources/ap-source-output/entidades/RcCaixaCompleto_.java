package entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(RcCaixaCompleto.class)
public class RcCaixaCompleto_ { 

    public static volatile SingularAttribute<RcCaixaCompleto, Double> totalconta;
    public static volatile SingularAttribute<RcCaixaCompleto, Date> data;
    public static volatile SingularAttribute<RcCaixaCompleto, String> endereco;
    public static volatile SingularAttribute<RcCaixaCompleto, String> numero;
    public static volatile SingularAttribute<RcCaixaCompleto, String> socio;
    public static volatile SingularAttribute<RcCaixaCompleto, String> categoriaSocio;
    public static volatile SingularAttribute<RcCaixaCompleto, Date> vencimento;
    public static volatile SingularAttribute<RcCaixaCompleto, BigDecimal> taxas;
    public static volatile SingularAttribute<RcCaixaCompleto, Double> consumo;
    public static volatile SingularAttribute<RcCaixaCompleto, Integer> numeroconta;
    public static volatile SingularAttribute<RcCaixaCompleto, Integer> numeroSocio;
    public static volatile SingularAttribute<RcCaixaCompleto, Date> pagamento;
    public static volatile SingularAttribute<RcCaixaCompleto, BigDecimal> taxaSocio;
    public static volatile SingularAttribute<RcCaixaCompleto, Double> excessoValor;
    public static volatile SingularAttribute<RcCaixaCompleto, Double> excessoLTd;

}