import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *@date 17 de mai de 2017
 *@author  Neto
 *@time	20:50:18
 */

/**
 * @author Neto
 *
 */
public class LerObjeto {
	
	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome1 = leitor.nextLine();
		
	try {
		
		FileInputStream fis = new FileInputStream(nome1+".ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Cliente novo = (Cliente) ois.readObject();
		
		int id = novo.getId();
		System.out.println(id);
		String nome = novo.getNome();
		System.out.println(nome);
		ois.close();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}