
package Splash;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import javax.swing.JFrame;

public class SplashPanel {
    
    private final SplashScreen splash;
    
    public SplashPanel() {
        splash = SplashScreen.getSplashScreen();
    }
    
    public void startSplash(JFrame mainWindow) {
        timer(300 , 10);
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
        nextWindow(mainWindow);
    }
    
    private void timer(int time, int speed) {
        for(int i = 0; i < time; i++){
                try{
                    Thread.sleep(speed);
                }catch(InterruptedException ie){
                    System.out.println("error timer");
                }//END TRY/CATCH
            }//END FOR
    }
    
    private void updateImagen() {
        try{
            splash.setImageURL(getClass().getResource("/Images/Logo.png"));
        }catch(Exception e){
            System.out.println("error"+e.getStackTrace());
        }
    }

    private void nextWindow(JFrame mainMenu) {
        mainMenu.setVisible(true);
        mainMenu.toFront();
    }
    
}
