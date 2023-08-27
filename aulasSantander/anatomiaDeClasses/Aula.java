package aulasSantander.anatomiaDeClasses;

public class Aula {
	
	public static void main(String[] args) {

		System.out.println("Ola turma, sejam bem-vindos!");
		
		// Variavel
		//String meuNome = "Gabriel";
		//int anoFabricacao = 2022;
		//boolean verdadeira = false;
	
		//anoFabricacao = 2018;
		
		// Método
		String primeiroNome = "Gabriel";
		String segundoNome = "Sellan";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		
		
}
	
	// Método
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
