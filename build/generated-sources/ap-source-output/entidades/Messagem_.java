package entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(Messagem.class)
public class Messagem_ { 

    public static volatile SingularAttribute<Messagem, String> corpo;
    public static volatile SingularAttribute<Messagem, Date> data;
    public static volatile SingularAttribute<Messagem, String> titulo;
    public static volatile SingularAttribute<Messagem, Integer> id;
    public static volatile SingularAttribute<Messagem, String> responsavel;

}