/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.SplashScreen;
import javax.swing.ImageIcon;


public class ScreenSplash{
    public final SplashScreen splash;
    //CONSTRUCTOR
    public ScreenSplash() {
        splash = SplashScreen.getSplashScreen();
    }//END CONSTRUCTOR
    
    public void animar(){
        
        if(splash != null){
            Graphics2D g2d = splash.createGraphics();
            g2d.setColor(Color.black);
            g2d.drawImage(new ImageIcon(getClass().getResource("/images/Header.png")).getImage(),0,0,400,112,null);
            g2d.drawImage(new ImageIcon(getClass().getResource("/images/Shift-F6.png")).getImage(),120 , 140, 400, 80, null);
            g2d.drawImage(new ImageIcon(getClass().getResource("/images/logoShiftKey.png")).getImage(),410, 120, 120, 120,null);
            g2d.setColor(Color.black);            
            g2d.setFont(new Font("'Ejecutando Grandes Ideas'",Font.BOLD,20));
            g2d.drawString(g2d.getFont().getName(), 140, 260);
            for(int i = 0; i < 395; i++){
                g2d.setPaint(new GradientPaint(5,3,Color.RED, 100, 10, Color.BLACK,true));
                //g2d.setPaint(new GradientPaint(100,20,Color.red, 10, 100, Color.black,true));
                //g2d.setColor(new Color(150,0,0));
                g2d.fillRect(186, 280, i, 15);
                splash.update();
                try{
                    Thread.sleep(1);
                }catch(InterruptedException ie){
            }//END TRY CATCH
              
        }//END FOR
            
        splash.close();
        }
        ventanaPrincipal ventana = new ventanaPrincipal();
        ventana.setTitle("SplashScreen Shift-F6");
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.toFront();
    }//END ANIMAR
}//END CLASS
