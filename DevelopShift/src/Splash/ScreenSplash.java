    
package Splash;

import TestLibraries.LoginExample;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SplashScreen;

public class ScreenSplash {
    
    private final SplashScreen splash;
    
//CONSTRUCTOR
    public ScreenSplash() {
        splash = SplashScreen.getSplashScreen();
    }//END CONSTRUCTOR
    
//ANIMAR
    public void Animar() {
        for(int i = 0; i < 300; i++){
                try{
                    Thread.sleep(10);
                }catch(InterruptedException ie){
                    
                }//END TRY/CATCH
            }//END FOR
        updateImagen();
        if(splash != null){
            Graphics2D g2d = splash.createGraphics();
            for(int i = 0; i < 540; i++){
                g2d.setColor(new Color(215,215,215));
                g2d.fillRect(0,0,i,15);
                splash.update();
                try{
                    Thread.sleep(1);
                }catch(InterruptedException ie){
                    
                }//END TRY/CATCH
            }//END FOR
            splash.close();
        }//END IF
        LoginExample menuPrincipal = new LoginExample();
        menuPrincipal.setTitle("La Escondida Ver 1.0 | Punto de Venta");
        //menuPrincipal.setState(JFrame.MAXIMIZED_BOTH);
        menuPrincipal.setLocationRelativeTo(null);
        menuPrincipal.setResizable(false);
        menuPrincipal.setVisible(true);
        menuPrincipal.toFront();
    }//END ANIMAR

    private void updateImagen() {
        try{
            splash.setImageURL(getClass().getResource("/Images/Logo.png"));
        }catch(Exception e){
            System.out.println("error");
        }
    }
    
}//END CLASS
