package com.fafica.aula04.exemplo;
public class ExemploDegubExcecao {
	// chama method2; lan�a exce��es de volta para main
	public static void metodo1() throws Exception {
		metodo2();
	} // fim do m�todo method1
	public static void metodo2() throws Exception {
		metodo3();
	} // fim do m�todo method2
	public static void metodo3() throws Exception {
		throw new Exception( "Exce��o Lan�ada no M�todo 3");
	}
	public static void main(String[] args) {
		try {
			metodo1(); // chama method1
		} // fim de try
		// captura exce��o lan�ada em method1
		catch (Exception e) {
			System.err.printf( "%s\n\n", e.getMessage() );
			e.printStackTrace(); // imprime rastreamento de pilha da exce��o
			
			// obt�m informa��es de rastreamento de pilha
			StackTraceElement[] traceElements = e.getStackTrace();
			System.out.println( "\nRastreamento de pilha getStackTrace:" );
			System.out.println( "Classe\t\t\t\t\t\tArquivo\t\t\t\tLinha\tM�todo" );
			
		 // faz um loop por traceElements para obter a descri��o da exce��o
			for ( StackTraceElement element : traceElements ) {
				System.out.printf( "%s\t", element.getClassName() );
				System.out.printf( "%s\t", element.getFileName() );
				System.out.printf( "%s\t", element.getLineNumber() );
				System.out.printf( "%s\n", element.getMethodName() );
			} // fim de for
		} // fim de catch
	}
}
