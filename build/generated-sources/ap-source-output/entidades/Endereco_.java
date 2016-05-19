package entidades;

import entidades.Enderecopessoa;
import entidades.Pessoa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, Integer> id;
    public static volatile ListAttribute<Endereco, Pessoa> pessoaList;
    public static volatile ListAttribute<Endereco, Enderecopessoa> enderecopessoaList;
    public static volatile SingularAttribute<Endereco, String> tipo;
    public static volatile SingularAttribute<Endereco, String> nome;
    public static volatile SingularAttribute<Endereco, String> descricao;

}