package com.fafica.aula10.exemplo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/**
* Exemplo simples para conectar banco de dados MySql usando o MySQL JDBC driver thin
* Certifique-se de que voc� tem o MySql JDBC driver thin em seu classpath antes de executar este exemplo
* @Author
*/
public class ExemploMySqlTransacao {
    public static void main(String args[]) throws SQLException {
    	
        // Cria a conex�o com o banco de dados MySql usando o JDBC
        Connection conn = DriverManager
        		.getConnection("jdbc:mysql://localhost/aula10", "root", "root");
        
        // Desabilitando o AutoCommit;
        conn.setAutoCommit(false);
        System.out.println("Iniciou");
        /*
         * Exemplo de Insert
         */
        // Criando a String SQL
        String sql ="insert into cliente (nome, cpf, banco) values (?, ?, ?)";
 
        // Criar o PreparedStatement, objeto para executar a query
        PreparedStatement preStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        // Atualizando o primeiro parametro
        preStatement.setString(1, "Mauricio Manoel");
        preStatement.setString(2, "91376081779");
        preStatement.setString(3, "Bradesco");
        preStatement.execute();
        // Retorna um ResultSet com todas as chaves geradas
        ResultSet resultSet = preStatement.getGeneratedKeys();
        Integer clienteId = 0;
        // Pegando o identificador gerado a partir do �ltimo insert
        while(resultSet.next()) {
        	clienteId = resultSet.getInt(1);
        }
        System.out.println("ID do Insert no Banco " + clienteId);
        
        // Criando a String SQL
        sql ="select * from cliente";
        // Criar o PreparedStatement, objeto para executar a query
        preStatement = conn.prepareStatement(sql);
        // Executando o select
        resultSet = preStatement.executeQuery();
        
        /*
         * Exemplo de Select
         */
        
        System.out.println("Imprimindo Dados do Banco");
        System.out.println("ID\tID\tNome\t\tCPF");
        // Verifica se retornou dados na consulta
        while(resultSet.next()){
        	// Pegando as colunas do registro
        	System.out.print(resultSet.getString(1) 	+ "\t");
        	System.out.print(resultSet.getString("cliente_id") 	+ "\t");
        	System.out.print(resultSet.getString("nome") 	+ "\t");
        	System.out.print(resultSet.getString("cpf")	+ "\t");
        	System.out.println();
        }
        
        try {
        	for(int i=1;i<=10;i++) {
        		System.out.println("Tempo: " + i);
        		Thread.sleep(1000);
        	}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //Desfazendo o insert no banco
        //conn.rollback();
        
        // Comitando as a��es no banco
        conn.commit();
        
        // Habilitando o autocommit
        System.out.println("Terminou");
        
        // Fechando conex�es
        conn.close();
        preStatement.close();
        resultSet.close();
    }
}