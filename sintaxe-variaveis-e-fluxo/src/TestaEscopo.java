
public class TestaEscopo {
	
	public static void main(String[] args) {
		// atalho sysout p auto complete
		System.out.println("Testando condicionais");
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado;
		
		// testando escopo com o boleano
		if(quantidadePessoas >=2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		System.out.println("Valor de acompanhado e: " + acompanhado);
		
		System.out.println("//////////");
		// if utilizando boleano
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce não pode entrar");
		}
		
	}

}
