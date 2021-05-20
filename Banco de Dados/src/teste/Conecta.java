package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {
    public static Connection getConecta(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste", "root", "");
            System.out.println("OK. Conectado com Sucesso!");
        }catch(SQLException e){
            System.out.println("Erro ao conectar!");
        }
        return conn;
    }
    
    public static void main(String[] args){
        Conecta.getConecta();
    }
}
