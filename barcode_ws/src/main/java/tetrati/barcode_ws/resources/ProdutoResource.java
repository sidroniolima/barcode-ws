/**
 * 
 */
package tetrati.barcode_ws.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tetrati.barcode_ws.Produto;
import tetrati.barcode_ws.service.ProdutoService;

/**
 * Resource de Produto que fornece o xml do produto 
 * com o código de barras e descrição buscado pelo 
 * código de barras.
 * 
 * Caso não seja localizado é retornado um código 404.
 * 
 * @author Sidronio
 * 11/12/2015
 */
@Path("/barcode")
public class ProdutoResource {
	
	@Inject
	private ProdutoService produtoSrvc;

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response buscaPeloCodigoDeBarras(@PathParam("id") String codigoBarras) {
		
		Produto prodLocalizado = produtoSrvc.buscaProdutoPeloCodigoDeBarras(codigoBarras);
		
		if (null == prodLocalizado) {
			return Response.status(Status.NOT_FOUND).build();
		}
		
		return Response.status(200).entity(prodLocalizado.toXml()).build();
	}
}
