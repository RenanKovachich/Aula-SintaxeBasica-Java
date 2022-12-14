
public class Variaveis {
	public static void main(String[] args) {
		
		// Comentario de uma linha
		/*
		 * Comentario de mais de uma linha.
		 */
		
		
		// Comando que imprime valor na tela
		//System.out.print("Valor: " + varInt);
		//System.out.println("Ola Mundo!");
		
		// Variáveis inteiros
		
		// Int
		
		int varInt = 11; //4 bytes
		System.out.println(varInt);
		
		System.out.println("Menor valor: " + Integer.MIN_VALUE);
		System.out.println("Maior valor: " + Integer.MAX_VALUE);
		System.out.println(" ");
		
		// Long
		
		long varLong1 = 5000; // 8 Bytes
		long varLong2 = 9225555555555L;
			// Por boas práticas sempre coloque L no fim de variáveis tipo long
		
		System.out.println(varLong1);
		System.out.println(varLong2);
		
		System.out.println("Menor valor: " + Long.MIN_VALUE);
		System.out.println("Maior valor: " + Long.MAX_VALUE);
		System.out.println(" ");
		
		// Short
		
		short varShort; // 2 bytes
		varShort = 32767;
		System.out.println(varShort);
		
		System.out.println("Menor valor: " + Short.MIN_VALUE);
		System.out.println("Maior valor: " + Short.MAX_VALUE);
		System.out.println(" ");
		
		// Byte
		byte varByte = 127; // 1 byte
		System.out.println(varByte);
		
		System.out.println("Menor valor: " + Byte.MIN_VALUE);
		System.out.println("Maior valor: " + Byte.MAX_VALUE);
		System.out.println(" ");
		
		// Variáveis reais (ponto flutuante)
		
		// Float
		
		float varFloat = 3.14159265f; // 4 bytes
			// Por boas práticas sempre coloque f no fim de variáveis tipo float
		System.out.println(varFloat); 
		
		System.out.println("Menor valor: " + Float.MIN_VALUE);
		System.out.println("Menor valor: " + Float.MAX_VALUE);
		System.out.println(" ");
		
		// Double
		
		double varDouble = 3.141592653589793; // 8 bytes
		System.out.println(varDouble);
		
		System.out.println("Menor valor: " + Double.MIN_VALUE);
		System.out.println("Menor valor: " + Double.MAX_VALUE);
		System.out.println(" ");
		
		
		// Outras Variáveis
		
		boolean varBoolean = true; // 1 bit
			// varBoolean = false;
		System.out.println(varBoolean);
		System.out.println(" ");
		
		// Char
		
		char simbolo = 'a';
		System.out.println(simbolo);
			// Trabalha com a tabela ascii
		simbolo = 123;
		System.out.println(simbolo);
		System.out.println(" ");
		
		// String
		
		String palavra = "Uma palavra ou uma frase...";
		System.out.println(palavra + " ok");
		System.out.println(" ");
		
		
		
		
		
	}
}
