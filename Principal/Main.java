
package Principal;
import Vistas.*;
import Modelo.*;
import java.sql.SQLException;


public class Main {
    
    public static void main(String[] args) throws SQLException {
        // crear instancia a la base de datos
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
        // crear instancia al Login
        Login login = new Login();
        login.setVisible(true);
        
    }
}
