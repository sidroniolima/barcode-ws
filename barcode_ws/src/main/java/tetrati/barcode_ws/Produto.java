/**
 * 
 */
package tetrati.barcode_ws;

import javax.enterprise.inject.Vetoed;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.thoughtworks.xstream.XStream;

/**
 * Entidade Produto.
 * 
 * @author Sidronio
 * 11/12/2015
 */
@Entity
@Vetoed
@Table(name="produto")
public class Produto {

	@Id
	@Column(name="codigo_barras")
	private String codigoBarras;
	
	@Column(nullable=false)
	private String descricao;
	
	/**
	 * Retorna o xml do produto gerado pelo 
	 * XStream.
	 * 
	 * @return Xml do produto.
	 */
	public String toXml() {
		return new XStream().toXML(this);
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoBarras == null) ? 0 : codigoBarras.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigoBarras == null) {
			if (other.codigoBarras != null)
				return false;
		} else if (!codigoBarras.equals(other.codigoBarras))
			return false;
		return true;
	}
}
