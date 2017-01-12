package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela FUNCIONARIO
 * @generated
 */
@Entity
@Table(name = "\"FUNCIONARIO\""
)
@XmlRootElement
public class Funcionario implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1280717403l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_depto", referencedColumnName = "id", insertable=true, updatable=true)
  private Depto depto;
  
  /**
   * Construtor
   * @generated
   */
  public Funcionario(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Funcionario setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nome
   * @param nome nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Funcionario setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém depto
   * @param depto depto
   * return depto
   * @generated
   */
  public Depto getDepto(){
    return this.depto;
  }
  
  /**
   * Define depto
   * @param depto depto
   * @generated
   */
  public Funcionario setDepto(Depto depto){
    this.depto = depto;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof Funcionario))
        return false;
      
      Funcionario other = (Funcionario)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}