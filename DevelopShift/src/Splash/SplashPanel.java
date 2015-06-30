
package Splash;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.SplashScreen;
import javax.swing.JFrame;

public class SplashPanel {
    
    private final SplashScreen splash;
    private String imageURL;
    private Rectangle progressBar;
    private Color colorBar;
    private int time, speed;
    
    public SplashPanel() {
        splash = SplashScreen.getSplashScreen();
    }
    
    public void startSplash(JFrame mainWindow) {
        timer(time , speed);
        updateImagen();
        if(splash != null){
            Graphics2D g2d = splash.createGraphics();
            for(int i = 0; i < progressBar.width; i += 10){
                g2d.setColor(colorBar);
                g2d.fillRect(progressBar.x,progressBar.y,i,progressBar.height);
                splash.update();
                try{
                    Thread.sleep(speed);
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
            System.out.println(""+this.imageURL);
            splash.setImageURL(getClass().getResource(imageURL));
        }catch(Exception e){
            System.out.println("error"+e.toString());
        }
    }

    private void nextWindow(JFrame mainMenu) {
        mainMenu.setVisible(true);
        mainMenu.toFront();
    }
    
    public void setImageURL(String url) {
        this.imageURL = url;
    }
    
    public void setProgressBar(Rectangle bounds) {
        this.progressBar = bounds;
    }
    
    public void setColorBar(Color color) {
        this.colorBar = color;
    }
    
    public void setTimer(int time, int speed) {
        this.time = time;
        this.speed = speed;
    }
}
