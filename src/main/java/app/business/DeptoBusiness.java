package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;
/**
 * Classe que representa a camada de negócios de DeptoBusiness
 * 
 * @generated
 **/
@Service("DeptoBusiness")
public class DeptoBusiness {


    /**
     * Instância da classe DeptoDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("DeptoDAO")
    protected DeptoDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Depto post(final Depto entity) throws Exception {
      // begin-user-code  
      // end-user-code  
        repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public Depto get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Depto result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Depto put(final Depto entity) throws Exception {
      // begin-user-code  
      // end-user-code
        repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Depto> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Depto> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Funcionario> findFuncionario(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      Page<Funcionario> result = repository.findFuncionario(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;    
  }



}