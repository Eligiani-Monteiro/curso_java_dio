package trilha_java_basico;
//Classe
public class MinhaClasse {
	// método principal
	public static void main(String[] args) {

		// classe de operações de input e output (Impressão)
		// System.out.print("Olá turma , sejam bem-vindos ");

		String primeiroNome = "Eligiani";
		String segundoNome = "Monteiro";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		System.out.print(nomeCompleto);
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resutado do método " + primeiroNome.concat(" ").concat(segundoNome);
	}
}