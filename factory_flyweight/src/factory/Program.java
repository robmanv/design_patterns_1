package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection c = new ConnectionFactory().getConnection();

        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM aulajpa.pessoa");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("id:" + rs.getInt(1) + " - email:" + rs.getString(2) + " - name:" + rs.getString(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
