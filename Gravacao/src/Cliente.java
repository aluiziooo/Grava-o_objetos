import java.io.Serializable;

/**
 *@date 17 de mai de 2017
 *@author  Neto
 *@time	20:49:00
 */

/**
 * @author Neto
 *
 */
public class Cliente implements Serializable{
	int id;
	String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
