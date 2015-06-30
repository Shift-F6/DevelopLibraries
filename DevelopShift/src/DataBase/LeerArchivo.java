
package Main;

import java.awt.Toolkit;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;


public class LeerArchivo {
    
    //VARIABLES
    private List <String> contenido;
    private String nombreBD;
    private String hostBD;
    private String usuarioBD;
    private String contrasenaBD;
    
    public LeerArchivo(){
        try{
            this.contenido = Files.readAllLines(Paths.get(""),Charset.defaultCharset());
        }catch(IOException ioe){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Error: " + ioe.getMessage(), "Datos de Conexion", JOptionPane.ERROR_MESSAGE);
        }
    }
}
