package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Depto
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Depto")
public class DeptoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DeptoBusiness")
  private DeptoBusiness deptoBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("FuncionarioBusiness")
  private FuncionarioBusiness funcionarioBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Depto post(@Validated @RequestBody final Depto entity) throws Exception {
    return deptoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Depto put(@Validated @RequestBody final Depto entity) throws Exception {
    return deptoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
  public Depto put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Depto entity) throws Exception {
    return deptoBusiness.put(entity);
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
  public void delete(@PathVariable("id") java.lang.String id) throws Exception {
    deptoBusiness.delete(id);
  }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Depto>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(deptoBusiness.list(pageable   )), HttpStatus.OK);    
  }



  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Funcionario")    
  public HttpEntity<PagedResources<Funcionario>> findFuncionario(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(deptoBusiness.findFuncionario(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Funcionario/{relationId}")    
  public void deleteFuncionario(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.funcionarioBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/Funcionario/{relationId}")
  public Funcionario putFuncionario(@Validated @RequestBody final Funcionario entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
    return this.funcionarioBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/Funcionario")
  public Funcionario postFuncionario(@Validated @RequestBody final Funcionario entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
  Depto depto = this.deptoBusiness.get(instanceId);
  entity.setDepto(depto);
    return this.funcionarioBusiness.post(entity);
  }   




  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Depto get(@PathVariable("id") java.lang.String id) throws Exception {
    return deptoBusiness.get(id);
  }
}