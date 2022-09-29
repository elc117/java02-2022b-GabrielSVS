import java.util.*;

public class TestShrek {
  
	public static void main(String[] args) {

	Shrek teste1 = new Shrek();
	Shrek teste2 = new Shrek();

	System.out.println(teste1.getCebola());
	teste1.setCamada();
	System.out.println(teste1.soma());
    
	System.out.println(teste2.getCamada());
	teste2.setCebola();
	System.out.println(teste2.soma());
	
	}
 
}

/* 
Contenha um método main, seguindo as convenções do Java (ver exemplos desta aula e da anterior).
Dentro do main, instancie pelo menos 2 objetos da classe que você criou.
Para cada objeto criado, chame pelo menos 3 métodos implementados.
*/
