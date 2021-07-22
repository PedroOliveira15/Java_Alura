
public class TestaCondicional {

	public static void main(String[] args) {
		// atalho sysout p auto complete
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else if (quantidadePessoas >= 2) {
			System.out.println("voce não tem 18, mas pode entrar");
		} else {
			System.out.println("Infelizmente voce não pode entrar");
		}
	}
}
