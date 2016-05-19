package entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(Contaslog.class)
public class Contaslog_ { 

    public static volatile SingularAttribute<Contaslog, String> observacoes;
    public static volatile SingularAttribute<Contaslog, String> tipo;
    public static volatile SingularAttribute<Contaslog, Date> horaRegristro;
    public static volatile SingularAttribute<Contaslog, Date> dataVence;
    public static volatile SingularAttribute<Contaslog, String> usuarioAlteracao;
    public static volatile SingularAttribute<Contaslog, Integer> idNumeroSocio;
    public static volatile SingularAttribute<Contaslog, BigDecimal> taxaRelogio;
    public static volatile SingularAttribute<Contaslog, Date> dataPag;
    public static volatile SingularAttribute<Contaslog, Integer> id;
    public static volatile SingularAttribute<Contaslog, Integer> idOriginal;
    public static volatile SingularAttribute<Contaslog, Integer> taxaSocio;

}