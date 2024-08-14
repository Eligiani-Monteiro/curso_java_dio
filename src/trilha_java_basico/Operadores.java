package trilha_java_basico;

public class Operadores {
	public static void main(String[] args) {

		// Verificação com operadores logicos
		boolean condicao1 = true;

		boolean condicao2 = true;

		if (condicao1 && condicao2) {
			System.out.println("as duas forem verdadeiras ");
			System.out.println("fim");

		}
	

			if (condicao1 || condicao2) {
				System.out.println("uma das condições  forem verdadeiras ");

		
	}
}
}

//CONCATENAÇÃO
//String concatenacao = "?";
//concatenacao = 1 + 1 + 1 + "1";

// Nesta linha será feito a opração matemática e em seguida
// concatenaçao com a string o resultado será 31;

// System.out.println(concatenacao);

// concatenacao = 1 + "1" + 1 + 1;

// Nesta linha não será feito a opração matemática
// somente a concatenação o resultado será 111.

// System.out.println(concatenacao);

// concatenacao = 1 + "1" + 1 + "1";

// Nesta linha não será feito a opração matemática
// somente a concatenação o resultado será 1111.

// System.out.println(concatenacao);

// concatenacao = "1" + 1 + 1 + 1;

// Nesta linha não será feito a opração matemática
// somente a concatenação o resultado será 1111.

// System.out.println(concatenacao);

//concatenacao = "1" + (1 + 1 + 1);

// Neste caso o programa realizou a soma da aperacão em evidencia,
// que tem precedência e em seguida fez a concatenação o resultado será 13.

//System.out.println(concatenacao);

//----------//----------//-----------//-------//------

//CONVERTENDO PARA POSITIVO
//numero = - numero ;
//System.out.println(numero);

//numero = +  numero*-1;
//System.out.println(numero);
//Neste linha também está convertendo o numero negativo para positivo.

//Neste caso  na linha 6 será negativo e o resultado será - 5;
//Neste caso  na linha 9 será negativo e o resultado será 5;

//------------//-----------//-----------//---------//-----

//INCREMENTANDO E DECREMENTANDO VALORES EM 1
// int numero =5;

// x repetição

// numero = numero +1;
// numero++;

// System.out.println( numero ++);
// imprime o valor depois incrementa

// System.out.println( ++ numero ); imprime 6
// System.out.println( numero ); imprime 6
// Incremnta depois imprime valor

// System.out.println( numero --); //numero =4
// System.out.println( numero ); //numero = 4

//-----------//-----------//--------//----------//-----------

// NEGANDO EXPRESSÕES BOOLEANAS

//boolean variavel = true;

// System.out.print(!variavel);
// Neste caso a expectativa é que imprima false,
// tendo em vista que a variálvel true ainda ets em memória

// variavel = !variavel;
// Mudando a variavel para que o valor seja de fato falsa
//System.out.print(variavel);

// ---------//--------//--------//-------//-------//------------

//EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ESE

//int a, b;
//a = 6;
//b = 6;

//String resultado = a == b ? "verdadeiro"  : "falso";
//int resultado = a == b ?  1  :  0;

//System.out.println(resultado);

//USANDO O OPERADOR TERNARIO

//String resultado = "";
//if(a==b)
// resultado = "verdadeiro";

//else
//resultado  = "falso";

//System.out.println(resultado);

//-------------//-------------//---------------//---------

/*
 * public static void main(String[] args) {
 * 
 * 
 * // VALIDAÇÕES COM OPERADORES RELACIONAIS
 * 
 * int numero1 = 1; int numero2 = 2; boolean simNao = numero1 == numero2;
 * 
 * // if(numero1 < numero2) { //
 * System.out.println(" a nossa condição for verdadeira " );
 * 
 * if (numero1 == numero2) {
 * System.out.println(" a nossa condição for verdadeira "); // Neste cenário
 * essa mensagem não sera impressa
 * 
 * }
 * 
 * System.out.println("numeroUm é igual a numeroDois? " + simNao);
 * 
 * simNao = numero1 != numero2;
 * System.out.println("numeroUm é diferente  que  numeroDois? " + simNao);
 * 
 * simNao = numero1 > numero2;
 * System.out.println("numeroUm é maior que  numeroDois? " + simNao);
 * 
 * }
 */

// ------------//-----------//----------------//--------

// VALIDAÇÕES COM OPERADORES RELACIONAIS
//COMPARANDO TEXTOS E OBJETOS

//String nomeUm =" Eligiani";
//String nomDois =" Eligiani";
//String nomeDios = new String(" Eligiani");

//System.out.println(nomeUm == nomeDios);
//Comparando numeros
//System.out.println(nomeUm.equals(nomeDios));
//Comparando texto
