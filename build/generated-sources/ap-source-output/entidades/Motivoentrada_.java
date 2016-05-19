package entidades;

import entidades.Entrada;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Motivoentrada.class)
public class Motivoentrada_ { 

    public static volatile SingularAttribute<Motivoentrada, Integer> id;
    public static volatile ListAttribute<Motivoentrada, Entrada> entradaList;
    public static volatile SingularAttribute<Motivoentrada, String> nome;
    public static volatile SingularAttribute<Motivoentrada, String> descricao;
    public static volatile SingularAttribute<Motivoentrada, String> observacao;

}