/**
 * 
 */
package tetrati.barcode_ws.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import tetrati.barcode_ws.Produto;

/**
 * Implementação da Camada Dao da entidade Produto.
 * 
 * @author Sidronio
 * 11/12/2015
 */
@Stateless
public class HibernateProdutoDao extends HibernateGenericDao<Produto, String> implements ProdutoDao, Serializable{

	private static final long serialVersionUID = 975229923093886506L;

}
