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
 * Classe que representa a camada de negócios de FuncionarioBusiness
 * 
 * @generated
 **/
@Service("FuncionarioBusiness")
public class FuncionarioBusiness {


    /**
     * Instância da classe FuncionarioDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("FuncionarioDAO")
    protected FuncionarioDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Funcionario post(final Funcionario entity) throws Exception {
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
    public Funcionario get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Funcionario result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Funcionario put(final Funcionario entity) throws Exception {
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
  public Page<Funcionario> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Funcionario> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Funcionario> listByDepto ( Depto depto , Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Funcionario> result = repository.listByDepto ( depto ,  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    



}