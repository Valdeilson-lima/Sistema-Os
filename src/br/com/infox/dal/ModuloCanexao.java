package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author zorinos
 */
public class ModuloCanexao {

    //Metodo responsavel por estabelecer a conexã com o banco
    public static Connection conector() {
        Connection conexao = null;
        // A linha abaixo chama o driver 
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referente ao banco de dados
        String url = "Jdbc:mysql://db-server.c1igqkg00y30.us-east-1.rds.amazonaws.com:3306/dbinfox?characterEncoding=utf-8";
        String user = "admin";
        String password = "1095254235";
        //Estabelecendo a conexao com o banco de dados!
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }

    }
}
