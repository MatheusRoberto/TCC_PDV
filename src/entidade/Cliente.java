package entidade;
// Generated 21/11/2016 20:40:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private Endereco endereco;
     private String nome;
     private String cnpjCpf;
     private String telefone;
     private String email;
     private String razaoSocial;
     private Set stands = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }
    public Cliente(Endereco endereco, String nome, String cnpjCpf, String telefone, String email, String razaoSocial, Set stands) {
       this.endereco = endereco;
       this.nome = nome;
       this.cnpjCpf = cnpjCpf;
       this.telefone = telefone;
       this.email = email;
       this.razaoSocial = razaoSocial;
       this.stands = stands;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpjCpf() {
        return this.cnpjCpf;
    }
    
    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public Set getStands() {
        return this.stands;
    }
    
    public void setStands(Set stands) {
        this.stands = stands;
    }




}


