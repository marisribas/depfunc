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
 * Controller para expor serviços REST de Funcionario
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Funcionario")
public class FuncionarioREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  public Funcionario post(@Validated @RequestBody final Funcionario entity) throws Exception {
    return funcionarioBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Funcionario put(@Validated @RequestBody final Funcionario entity) throws Exception {
    return funcionarioBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
  public Funcionario put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Funcionario entity) throws Exception {
    return funcionarioBusiness.put(entity);
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
  public void delete(@PathVariable("id") java.lang.String id) throws Exception {
    funcionarioBusiness.delete(id);
  }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Funcionario>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.list(pageable   )), HttpStatus.OK);    
  }

  /**
   * NamedQuery listByDepto
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/listByDepto/{depto}")    
  public  HttpEntity<PagedResources<Funcionario>> listByDeptoParams (@PathVariable("depto") Depto depto, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.listByDepto(depto, pageable   )), HttpStatus.OK);    
  }




  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Funcionario get(@PathVariable("id") java.lang.String id) throws Exception {
    return funcionarioBusiness.get(id);
  }
}