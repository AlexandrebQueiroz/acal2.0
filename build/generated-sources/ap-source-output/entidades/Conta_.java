package entidades;

import entidades.Enderecopessoa;
import entidades.Hidrometro;
import entidades.Taxasconta;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Conta.class)
public class Conta_ { 

    public static volatile SingularAttribute<Conta, Integer> id;
    public static volatile SingularAttribute<Conta, BigDecimal> valorOutros;
    public static volatile SingularAttribute<Conta, Date> dataVence;
    public static volatile SingularAttribute<Conta, BigDecimal> valorTaxa;
    public static volatile SingularAttribute<Conta, Hidrometro> hidrometro;
    public static volatile ListAttribute<Conta, Taxasconta> taxascontaList;
    public static volatile SingularAttribute<Conta, Enderecopessoa> idEnderecoPessoa;
    public static volatile SingularAttribute<Conta, Boolean> socioExclusivo;
    public static volatile SingularAttribute<Conta, String> observacoes;
    public static volatile SingularAttribute<Conta, Date> dataPag;
    public static volatile SingularAttribute<Conta, Date> dataGerada;

}