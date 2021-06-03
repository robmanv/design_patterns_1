package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String banco = System.getenv("TIPO_BANCO");

            System.out.println(banco);

            if ("MYSQL".equals(banco)) {
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "robsvel", "1234567");
                System.out.println("Banco MYSQL");
                return c;
            } else {
                if ("POSTGRES".equals(banco)) {
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "robsvel", "1234567");
                    System.out.println("Banco POSTGRES");
                    return c;
                } else {
                    throw new RuntimeException("VARIAVEL DE AMBIENTE DEVE SER DECLARADA (MYSQL OU POSTGRES)");
                }
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
