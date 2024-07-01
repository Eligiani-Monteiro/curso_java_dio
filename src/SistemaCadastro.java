
public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("123", "Marcos");

		// definimos o endereco de marcos
		// marcos.setEndereco("Rua das Marias");
		// O endereço de Marcos 

		// imprimindo o marcos sem o nome e cpf

		System.out.println(marcos.getNome() + " - " + marcos.getCpf());
	}

}
//Méto construtor é um método que não tem retorno e
//deve ser identico ao nome da  classe e deve receber parametros.