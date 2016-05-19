package entidades;

import entidades.Categoriasocio;
import entidades.Taxasconta;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Taxa.class)
public class Taxa_ { 

    public static volatile SingularAttribute<Taxa, Integer> id;
    public static volatile SingularAttribute<Taxa, BigDecimal> valor;
    public static volatile ListAttribute<Taxa, Taxasconta> taxascontaList;
    public static volatile SingularAttribute<Taxa, String> nome;
    public static volatile ListAttribute<Taxa, Categoriasocio> categoriasocioList;
    public static volatile SingularAttribute<Taxa, String> descricao;
    public static volatile SingularAttribute<Taxa, String> observacao;

}