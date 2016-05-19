package entidades;

import entidades.Cheque;
import entidades.Saida;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(Motivodespesa.class)
public class Motivodespesa_ { 

    public static volatile SingularAttribute<Motivodespesa, String> observacao;
    public static volatile SingularAttribute<Motivodespesa, String> nome;
    public static volatile ListAttribute<Motivodespesa, Cheque> chequeList;
    public static volatile SingularAttribute<Motivodespesa, Integer> id;
    public static volatile ListAttribute<Motivodespesa, Saida> saidaList;
    public static volatile SingularAttribute<Motivodespesa, String> descricao;

}