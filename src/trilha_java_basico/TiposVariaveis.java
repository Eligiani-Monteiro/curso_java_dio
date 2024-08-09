package trilha_java_basico;

public class TiposVariaveis {
	
	
	public static void main (String[] args)throws Exception{
		double salarioMinimo = 2500;
		
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto  ;
		short  numeroCurto2 = (short) numeroNormal  ;
		
		int numero =5;
		
		 numero =10;
		 
		 System.out.print(numero);
		 final double VALOR_DE_PI = 3.14;
		 //para que seja  possível alterar o valor do  PI será preciso remover o final.
		 
		 //VALOR_DE_PI = 10.75;
		 
		 
		 //valor nunca poderá mudar
		 //Toda constante deve ser representada pela palavra reservada final e 
		 // em jva deve ser CAIXA ALTA.
	}
	


}
