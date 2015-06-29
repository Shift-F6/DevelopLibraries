
package TestLibraries;

import Splash.SplashPanel;


public class RunFile {

    public static void main(String[] args) {
        LoginExample loginExample = new LoginExample();
        SplashPanel splash = new SplashPanel();
        splash.startSplash(loginExample);
    }
    
}
