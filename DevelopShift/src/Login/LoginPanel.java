package Login;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoginPanel extends JPanel {

    //Variables
    public JTextField txtUser;
    public JPasswordField pswPassword;
    public JButton btnLogin;
    public JLabel lblUser, lblPassword;
    public ImageIcon background;
    
    //Propiedades
    private Font labelFont, textFont, buttonFont;
    private Color labelColorFont, textColorFont, buttonColorFont, textColor, buttonColor;
    private Border textBorder, buttonBorder;
    private int buttonAlignment, textAlignment;
    private Space imgLogoPosition;
    
    public LoginPanel() {
        initComponentes();
        initVariables();
    }

    private void initComponentes() {
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getImage(), imgLogoPosition.posX, imgLogoPosition.posY, imgLogoPosition.width, imgLogoPosition.heigh, this);
    }//END PAINTCOMPONENT

    private void initVariables() {
        txtUser = new JTextField("usuario");
        pswPassword = new JPasswordField("contraseña");
        btnLogin = new JButton("ENTRAR");
        lblUser = new JLabel("Usuario:");
        lblPassword = new JLabel("Contraseña:");
    }//END INITVARIABLES
    
    public void placeComponents(Component component, Space dimPos) {
        this.add(component, new org.netbeans.lib.awtextra.AbsoluteConstraints(dimPos.posX, dimPos.posY, dimPos.width, dimPos.heigh));
    }
    
    public void setFontProperties(String component, Font font, Color color) {
        switch(component){
            case "labels":
                this.setLabelFont(font);
                this.setLabelColorFont(color);
                this.refreshLabelProperties();
                break;
            case "fields":
                this.setTextFont(font);
                this.setTextColorFont(color);
                this.refreshTextProperties();
                break;
            case "buttons":
                this.setButtonFont(font);
                this.setButtonColorFont(color);
                this.refreshButtonProperties();
                break;
        }
    }
    
    public void setComponentProperties(String component, Color color, Border border, int aligHorizontal) {
       switch(component){
            case "fields":
                this.textColor = color;
                this.textBorder = border;
                this.textAlignment = aligHorizontal;
                this.refreshTextProperties();
                break;
            case "buttons":
                this.buttonColor = color;
                this.buttonBorder = border;
                this.buttonAlignment = aligHorizontal;
                this.refreshButtonProperties();
                break;
       }
    }
    
    public void setImageLogo(ImageIcon background) {
        this.background = background;
    }

    public void setLabelFont(Font labelFont) {
        this.labelFont = labelFont;
    }

    public void setTextFont(Font textFont) {
        this.textFont = textFont;

    }

    public void setButtonFont(Font buttonFont) {
        this.buttonFont = buttonFont;
    }

    public void setLabelColorFont(Color labelColorFonr) {
        this.labelColorFont = labelColorFonr;
    }

    public void setTextColorFont(Color textColorFont) {
        this.textColorFont = textColorFont;
    }

    public void setButtonColorFont(Color buttonColorFont) {
        this.buttonColorFont = buttonColorFont;
    }
    
    public void refreshLabelProperties(){
        lblUser.setFont(this.labelFont);
        lblUser.setForeground(this.labelColorFont);
        lblPassword.setFont(this.labelFont);
        lblPassword.setForeground(labelColorFont);
    }
    
    public void refreshTextProperties(){
        txtUser.setFont(this.textFont);
        txtUser.setForeground(this.textColorFont);
        txtUser.setBackground(textColor);
        txtUser.setBorder(textBorder);
        txtUser.setHorizontalAlignment(textAlignment);
        pswPassword.setFont(this.textFont);
        pswPassword.setForeground(textColorFont);
        pswPassword.setBackground(textColor);
        pswPassword.setBorder(textBorder);
        pswPassword.setHorizontalAlignment(textAlignment);
    }
    
    public void refreshButtonProperties(){btnLogin.setOpaque(true);
        btnLogin.setContentAreaFilled(true);
        btnLogin.setFont(this.buttonFont);
        btnLogin.setForeground(this.buttonColorFont);
        btnLogin.setBackground(buttonColor);
        btnLogin.setBorder(buttonBorder);
        btnLogin.setHorizontalAlignment(buttonAlignment);
        btnLogin.setOpaque(true);
        btnLogin.setContentAreaFilled(true);
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void setImgLogoPosition(Space imgLogo) {
        this.imgLogoPosition = imgLogo;
    }
    
    public void setBackgroundColor(Color color) {
        super.setBackground(color);
    }
}
