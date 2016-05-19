package entidades;

import entidades.Categoriasocio;
import entidades.Conta;
import entidades.Endereco;
import entidades.Pessoa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2016-05-19T14:48:31")
@StaticMetamodel(Enderecopessoa.class)
public class Enderecopessoa_ { 

    public static volatile SingularAttribute<Enderecopessoa, Pessoa> idPessoa;
    public static volatile SingularAttribute<Enderecopessoa, String> numero;
    public static volatile SingularAttribute<Enderecopessoa, Endereco> idEndereco;
    public static volatile SingularAttribute<Enderecopessoa, Boolean> socioExclusivo;
    public static volatile ListAttribute<Enderecopessoa, Conta> contaList;
    public static volatile SingularAttribute<Enderecopessoa, Categoriasocio> idCategoriaSocio;
    public static volatile SingularAttribute<Enderecopessoa, Boolean> inativo;
    public static volatile SingularAttribute<Enderecopessoa, Integer> id;
    public static volatile SingularAttribute<Enderecopessoa, Date> datamatricula;

}