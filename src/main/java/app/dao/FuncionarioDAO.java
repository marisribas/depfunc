package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 
/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("FuncionarioDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface FuncionarioDAO extends JpaRepository<Funcionario, java.lang.String> {

  /**
   * Obtém a instância de Funcionario utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Funcionario entity WHERE entity.id = :id")
  public Funcionario findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Funcionario utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Funcionario entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Funcionario c")
  public Page<Funcionario> list ( Pageable pageable );
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select f from Funcionario f where f.depto = :depto")
  public Page<Funcionario> listByDepto (@Param(value="depto") Depto depto , Pageable pageable );
  






}