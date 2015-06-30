
package DataBase;

import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;


public class LeerArchivo {
    
    //VARIABLES
    private List <String> content;
    private String nameDB;
    private String hostDB;
    private String userDB;
    private String passwordDB;
    
    public LeerArchivo(String ruta){
        try{
            this.content = Files.readAllLines(Paths.get(getClass().getResource(ruta).toURI()),Charset.defaultCharset());
            this.nameDB = content.get(2);
            this.hostDB = content.get(4);
            this.userDB = content.get(6);
            this.passwordDB = content.get(8);
        }catch(IOException | URISyntaxException ioe){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Error: " + ioe.getMessage(), "Datos de Conexion", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public String toString() {
        String datos = "Base de Datos: " + nameDB + "\n"
                + "Host: " + hostDB + "\n"
                + "Usuario: " + userDB + "\n"
                + "Contraseña: " + passwordDB;
        return datos;
    }

    public String getNameDB() {
        return nameDB;
    }

    public String getHostDB() {
        return hostDB;
    }

    public String getUserDB() {
        return userDB;
    }

    public String getPasswordDB() {
        return passwordDB;
    }
    
    
}
