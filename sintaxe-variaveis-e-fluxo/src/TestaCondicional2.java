
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		// atalho sysout p auto complete
		System.out.println("Testando condicionais");
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado = true;
		// expressao boleana --- 
		//boolean acompanhado = quantidadePessoas >=3;
		
		//reduzindo os Ifs com OR ou AND
		if (idade >= 18 || quantidadePessoas >=2) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce não pode entrar");
		}
		
		System.out.println("//////////");
		// if com and
		if (idade >= 18 && quantidadePessoas >=2) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce não pode entrar");
		}
		
		System.out.println("//////////");
		// if utilizando boleano
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce não pode entrar");
		}
		
	}
}
