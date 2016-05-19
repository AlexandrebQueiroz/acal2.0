package entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Chequeslog.class)
public class Chequeslog_ { 

    public static volatile SingularAttribute<Chequeslog, Integer> id;
    public static volatile SingularAttribute<Chequeslog, Date> dataPagamento;
    public static volatile SingularAttribute<Chequeslog, BigDecimal> valor;
    public static volatile SingularAttribute<Chequeslog, Integer> idFuncionarioAlteracao;
    public static volatile SingularAttribute<Chequeslog, String> usuariobanco;
    public static volatile SingularAttribute<Chequeslog, String> tipo;
    public static volatile SingularAttribute<Chequeslog, Integer> idMotivoDepesa;
    public static volatile SingularAttribute<Chequeslog, Date> dataAlteracao;
    public static volatile SingularAttribute<Chequeslog, String> observacoes;
    public static volatile SingularAttribute<Chequeslog, Integer> idOriginal;
    public static volatile SingularAttribute<Chequeslog, Date> dataVencimento;
    public static volatile SingularAttribute<Chequeslog, Integer> numero;

}