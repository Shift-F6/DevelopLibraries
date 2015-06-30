
package TestLibraries;

import Splash.SplashPanel;
import java.awt.Color;
import java.awt.Rectangle;


public class RunFile {

    public static void main(String[] args) {
        LoginExample loginExample = new LoginExample();
        SplashPanel splash = new SplashPanel();
        splash.setImageURL("/Images/Logo.png");
        splash.setColorBar(new Color(215,215,215));
        splash.setProgressBar(new Rectangle(0,0,600,15));
        splash.setTimer(300,10);
        splash.setProgressSpeed(2);
        splash.startSplash(loginExample);
    }
    
}
