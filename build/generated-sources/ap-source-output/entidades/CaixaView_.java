package entidades;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(CaixaView.class)
public class CaixaView_ { 

    public static volatile SingularAttribute<CaixaView, Double> totalconta;
    public static volatile SingularAttribute<CaixaView, Double> consumo;
    public static volatile SingularAttribute<CaixaView, Date> data;
    public static volatile SingularAttribute<CaixaView, Date> vencimento;
    public static volatile SingularAttribute<CaixaView, Double> excessoLTd;
    public static volatile SingularAttribute<CaixaView, Integer> numeroconta;
    public static volatile SingularAttribute<CaixaView, String> numero;
    public static volatile SingularAttribute<CaixaView, BigDecimal> taxaSocio;
    public static volatile SingularAttribute<CaixaView, BigInteger> taxas;
    public static volatile SingularAttribute<CaixaView, String> socio;
    public static volatile SingularAttribute<CaixaView, Double> excessoValor;
    public static volatile SingularAttribute<CaixaView, Date> pagamento;
    public static volatile SingularAttribute<CaixaView, Integer> numeroSocio;
    public static volatile SingularAttribute<CaixaView, Boolean> socioExclusivo;
    public static volatile SingularAttribute<CaixaView, String> endereco;
    public static volatile SingularAttribute<CaixaView, String> categoriaSocio;

}