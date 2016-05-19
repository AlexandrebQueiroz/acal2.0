package entidades;

import entidades.TablesPrivPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(TablesPriv.class)
public class TablesPriv_ { 

    public static volatile SingularAttribute<TablesPriv, Date> timestamp;
    public static volatile SingularAttribute<TablesPriv, TablesPrivPK> tablesPrivPK;
    public static volatile SingularAttribute<TablesPriv, String> tablepriv;
    public static volatile SingularAttribute<TablesPriv, String> columnpriv;
    public static volatile SingularAttribute<TablesPriv, String> grantor;

}