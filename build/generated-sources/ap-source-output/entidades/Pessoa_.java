package entidades;

import entidades.Endereco;
import entidades.Enderecopessoa;
import entidades.Entrada;
import entidades.Funcionario;
import entidades.Socio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-07-05T10:12:33")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> rgNumero;
    public static volatile ListAttribute<Pessoa, Entrada> entradaList;
    public static volatile SingularAttribute<Pessoa, String> sexo;
    public static volatile SingularAttribute<Pessoa, String> cnpj;
    public static volatile SingularAttribute<Pessoa, String> observacoes;
    public static volatile SingularAttribute<Pessoa, Integer> id;
    public static volatile SingularAttribute<Pessoa, String> nomeMae;
    public static volatile SingularAttribute<Pessoa, String> cep;
    public static volatile SingularAttribute<Pessoa, Socio> socio;
    public static volatile SingularAttribute<Pessoa, Integer> numeroMatricula;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, String> apelido;
    public static volatile SingularAttribute<Pessoa, Date> dataNasc;
    public static volatile SingularAttribute<Pessoa, Boolean> status;
    public static volatile SingularAttribute<Pessoa, String> uf;
    public static volatile ListAttribute<Pessoa, Enderecopessoa> enderecopessoaList;
    public static volatile SingularAttribute<Pessoa, String> rgExpedidor;
    public static volatile SingularAttribute<Pessoa, Endereco> idEndereco;
    public static volatile SingularAttribute<Pessoa, Funcionario> funcionario;
    public static volatile SingularAttribute<Pessoa, Date> rgEmissao;
    public static volatile SingularAttribute<Pessoa, String> cidade;
    public static volatile SingularAttribute<Pessoa, String> bairro;
    public static volatile SingularAttribute<Pessoa, String> sobrenome;
    public static volatile SingularAttribute<Pessoa, String> email;
    public static volatile SingularAttribute<Pessoa, String> numeroEndereco;
    public static volatile SingularAttribute<Pessoa, String> telefone;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, String> nomePai;

}