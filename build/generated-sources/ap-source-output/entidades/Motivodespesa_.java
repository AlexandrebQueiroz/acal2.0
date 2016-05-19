package entidades;

import entidades.Cheque;
import entidades.Saida;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Motivodespesa.class)
public class Motivodespesa_ { 

    public static volatile SingularAttribute<Motivodespesa, Integer> id;
    public static volatile ListAttribute<Motivodespesa, Saida> saidaList;
    public static volatile SingularAttribute<Motivodespesa, String> nome;
    public static volatile SingularAttribute<Motivodespesa, String> descricao;
    public static volatile SingularAttribute<Motivodespesa, String> observacao;
    public static volatile ListAttribute<Motivodespesa, Cheque> chequeList;

}