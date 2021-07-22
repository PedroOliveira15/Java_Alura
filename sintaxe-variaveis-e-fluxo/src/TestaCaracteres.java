
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a';
		
		System.out.println(letra);
		
		//tabela unicode - vai converter o valor para uma string (letra B)
		char valor = 66;
		System.out.println(valor);
		
		//concatenar string com int
		valor = (char) (valor +1);
		System.out.println(valor);
		
		//Guardando strins
		
		String palavra = "Alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
		//concatenação de duas strings
		String parcela1 = "10";
		String parcela2 = "20";

		System.out.println(parcela1 + parcela2);
		
		
	}
}
