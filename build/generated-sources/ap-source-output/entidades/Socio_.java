package entidades;

import entidades.Categoriasocio;
import entidades.Entrada;
import entidades.Pessoa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Socio.class)
public class Socio_ { 

    public static volatile SingularAttribute<Socio, Integer> id;
    public static volatile SingularAttribute<Socio, Pessoa> idPessoa;
    public static volatile SingularAttribute<Socio, Boolean> carneDiferenciado;
    public static volatile ListAttribute<Socio, Entrada> entradaList;
    public static volatile SingularAttribute<Socio, Date> dataAprovacao;
    public static volatile SingularAttribute<Socio, Date> dataVence;
    public static volatile SingularAttribute<Socio, Integer> numeroSocio;
    public static volatile SingularAttribute<Socio, Date> dataMatricula;
    public static volatile SingularAttribute<Socio, Boolean> socioExclusivo;
    public static volatile SingularAttribute<Socio, String> observacao;
    public static volatile SingularAttribute<Socio, Categoriasocio> idCategoriaSocio;

}