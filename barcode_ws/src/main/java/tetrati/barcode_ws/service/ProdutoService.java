/**
 * 
 */
package tetrati.barcode_ws.service;

import tetrati.barcode_ws.Produto;

/**
 * Interface da camada Service de comunicação 
 * entre os recursos e os dados.
 * 
 * @author Sidronio
 * 11/12/2015
 */
public interface ProdutoService {

	/**
	 * Retorna um produto pela consulta de um código 
	 * de barras caso exista.
	 * 
	 * @param codigoBarras Código de barras para consulta
	 * @return Produto localizado ou null.
	 */
	public Produto buscaProdutoPeloCodigoDeBarras(String codigoBarras);
}
