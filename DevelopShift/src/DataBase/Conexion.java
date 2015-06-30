
package Main;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    //VARIABLES
    private Connection conexion;
    
    private final String nombreBD;
    private final String hostBD;
    private final String usuarioBD;
    private final String contrasenaBD;
    
    public Conexion(String nBD, String hBD, String uBD, String cBD) {
        this.nombreBD = nBD;
        this.hostBD = hBD;
        this.usuarioBD = uBD;
        this.contrasenaBD = cBD;
    }
    
    public Connection conectarMySQL(){
        try{
            Class.forName("java.sql.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://" + hostBD + "/" + nombreBD, usuarioBD, contrasenaBD);
            System.out.println("Conexion exitosa");
            return conexion;
        }catch(ClassNotFoundException | SQLException e){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"No se pudo realizar la conexión a la base de datos [" + nombreBD + "] \n Error: " + e.getMessage(), "Conexión a MySQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }//END TRY-CATCH
    }//END CONECTARMYSQL
    
    public void terminarConexion(){
        try{
            conexion.close();
            System.out.println("Conexion finalizada");
        }catch(SQLException sqle){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"No se pudo realizar la conexión a la base de datos [" + nombreBD + "] \n Error: " + sqle.getMessage(), "Conexión a MySQL", JOptionPane.ERROR_MESSAGE);
        }//END TRY-CATCH
    }//END TERMINAR CONEXION
    
}//END CLASS
