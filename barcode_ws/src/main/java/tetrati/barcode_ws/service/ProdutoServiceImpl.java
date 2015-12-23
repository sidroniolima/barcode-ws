/**
 * 
 */
package tetrati.barcode_ws.service;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import tetrati.barcode_ws.Produto;
import tetrati.barcode_ws.dao.ProdutoDao;

/**
 * Implementação do serviço da entidade Produto.
 * 
 * @author Sidronio
 * 11/12/2015
 */
@Stateless
public class ProdutoServiceImpl implements ProdutoService, Serializable {

	private static final long serialVersionUID = 154491614137248979L;
	
	@Inject
	private ProdutoDao produtoDao;
	
	@Override
	public Produto buscaProdutoPeloCodigoDeBarras(String codigoBarras) {
		return produtoDao.buscarPeloCodigo(codigoBarras);
	}

}
