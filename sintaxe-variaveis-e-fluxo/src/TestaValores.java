
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//neste caso segundo ainda estar� valendo 5. Ainda n�o h� 'refer�ncia'.
		System.out.println(segundo);
		
	}

}
