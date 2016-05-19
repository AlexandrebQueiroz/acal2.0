package entidades;

import entidades.TablesPrivPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(TablesPriv.class)
public class TablesPriv_ { 

    public static volatile SingularAttribute<TablesPriv, String> columnpriv;
    public static volatile SingularAttribute<TablesPriv, String> grantor;
    public static volatile SingularAttribute<TablesPriv, String> tablepriv;
    public static volatile SingularAttribute<TablesPriv, TablesPrivPK> tablesPrivPK;
    public static volatile SingularAttribute<TablesPriv, Date> timestamp;

}