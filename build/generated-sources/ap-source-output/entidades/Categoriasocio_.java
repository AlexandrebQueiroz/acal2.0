package entidades;

import entidades.Enderecopessoa;
import entidades.Socio;
import entidades.Taxa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(Categoriasocio.class)
public class Categoriasocio_ { 

    public static volatile SingularAttribute<Categoriasocio, Taxa> taxasId;
    public static volatile SingularAttribute<Categoriasocio, String> nome;
    public static volatile SingularAttribute<Categoriasocio, Integer> id;
    public static volatile ListAttribute<Categoriasocio, Enderecopessoa> enderecopessoaList;
    public static volatile ListAttribute<Categoriasocio, Socio> socioList;
    public static volatile SingularAttribute<Categoriasocio, String> descricao;

}