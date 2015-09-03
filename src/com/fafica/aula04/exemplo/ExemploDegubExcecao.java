package com.fafica.aula04.exemplo;
public class ExemploDegubExcecao {
	// chama method2; lança exceções de volta para main
	public static void metodo1() throws Exception {
		metodo2();
	} // fim do método method1
	public static void metodo2() throws Exception {
		metodo3();
	} // fim do método method2
	public static void metodo3() throws Exception {
		throw new Exception( "Exceção Lançada no Método 3");
	}
	public static void main(String[] args) {
		try {
			metodo1(); // chama method1
		} // fim de try
		// captura exceção lançada em method1
		catch (Exception e) {
			System.err.printf( "%s\n\n", e.getMessage() );
			e.printStackTrace(); // imprime rastreamento de pilha da exceção
			
			// obtém informações de rastreamento de pilha
			StackTraceElement[] traceElements = e.getStackTrace();
			System.out.println( "\nRastreamento de pilha getStackTrace:" );
			System.out.println( "Classe\t\t\t\t\t\tArquivo\t\t\t\tLinha\tMétodo" );
			
		 // faz um loop por traceElements para obter a descrição da exceção
			for ( StackTraceElement element : traceElements ) {
				System.out.printf( "%s\t", element.getClassName() );
				System.out.printf( "%s\t", element.getFileName() );
				System.out.printf( "%s\t", element.getLineNumber() );
				System.out.printf( "%s\n", element.getMethodName() );
			} // fim de for
		} // fim de catch
	}
}
