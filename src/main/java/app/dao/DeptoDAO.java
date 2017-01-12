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
@Repository("DeptoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface DeptoDAO extends JpaRepository<Depto, java.lang.String> {

  /**
   * Obtém a instância de Depto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Depto entity WHERE entity.id = :id")
  public Depto findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Depto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Depto entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Depto c")
  public Page<Depto> list ( Pageable pageable );
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Funcionario entity WHERE entity.depto.id = :id")
  public Page<Funcionario> findFuncionario(@Param(value="id") java.lang.String id,  Pageable pageable );





}