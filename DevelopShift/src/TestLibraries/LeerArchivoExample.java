
package TestLibraries;

import DataBase.LeerArchivo;

public class LeerArchivoExample {

    public static void main(String[] args) {
        LeerArchivo leer = new LeerArchivo("/DataBase/ConnectionData");
        System.out.println(leer.toString());
    }
    
}
