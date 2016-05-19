package telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.UnsupportedLookAndFeelException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Splash extends JWindow{
         
    private AbsoluteConstraints absBarra;
    private AbsoluteConstraints absImage;
    private AbsoluteLayout absl;
    private ImageIcon image;
    private JLabel label;
    private JLabel texto;
    private JProgressBar progress;
     
    public static void main(String[] args) {
        
        try {
        
            Properties p = new Properties();
            p.put("logoString", "ACAL2000");
            com.jtattoo.plaf.luna.LunaLookAndFeel.setTheme(p);
            javax.swing.UIManager.setLookAndFeel(new com.jtattoo.plaf.luna.LunaLookAndFeel());
    
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }  
        
        Splash splash = new Splash();
    }
    
    
    
    public Splash(){
        
        absBarra = new AbsoluteConstraints(0,480);
        absImage = new AbsoluteConstraints(0,0);
        
        absl = new AbsoluteLayout();
        label = new JLabel();
        image = new ImageIcon(getClass().getResource("/img/acal.png"));
        label.setIcon(image);
        progress = new JProgressBar();
        progress.setPreferredSize(new Dimension(640,20));
        progress.setBackground(Color.WHITE);
        progress.setString("Carregando");
        progress.setStringPainted(true);
        progress.setForeground(Color.ORANGE);
        setLayout(absl);
        getContentPane().add(label,absImage);
        getContentPane().add(progress,absBarra);
     
        new Thread(){
       
            @Override
            public void run(){
                
                int i = 0;
                while( i  < 101){
                    progress.setValue(i++);
                }
                new TelaLogin().setVisible(true);
          
                dispose();
            }
           }.start();
     
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/4 ,   
        Toolkit.getDefaultToolkit().getScreenSize().height/5 );  
        pack();
        setVisible(true);
    }
   
}
