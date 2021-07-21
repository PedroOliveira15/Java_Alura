
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		//int valor = salario; - vamos perder os pontos flutuantes
		// vamos testar conversao 
		int valor = (int) salario;
		System.out.println("o valor e " + valor);
		
		
	}

}
