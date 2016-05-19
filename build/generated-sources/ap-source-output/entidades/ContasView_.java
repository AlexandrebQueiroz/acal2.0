package entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(ContasView.class)
public class ContasView_ { 

    public static volatile SingularAttribute<ContasView, Integer> anoReferente;
    public static volatile SingularAttribute<ContasView, Double> totalconta;
    public static volatile SingularAttribute<ContasView, Date> data;
    public static volatile SingularAttribute<ContasView, String> endereco;
    public static volatile SingularAttribute<ContasView, String> numero;
    public static volatile SingularAttribute<ContasView, String> socio;
    public static volatile SingularAttribute<ContasView, String> categoriaSocio;
    public static volatile SingularAttribute<ContasView, Date> vencimento;
    public static volatile SingularAttribute<ContasView, BigDecimal> taxas;
    public static volatile SingularAttribute<ContasView, Double> consumo;
    public static volatile SingularAttribute<ContasView, Integer> numeroconta;
    public static volatile SingularAttribute<ContasView, Integer> numeroSocio;
    public static volatile SingularAttribute<ContasView, String> mesReferente;
    public static volatile SingularAttribute<ContasView, Date> pagamento;
    public static volatile SingularAttribute<ContasView, BigDecimal> taxaSocio;
    public static volatile SingularAttribute<ContasView, Double> excessoValor;
    public static volatile SingularAttribute<ContasView, Double> excessoLTd;

}