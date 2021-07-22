
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//neste caso segundo ainda estará valendo 5. Ainda não há 'referência'.
		System.out.println(segundo);
		
	}

}
