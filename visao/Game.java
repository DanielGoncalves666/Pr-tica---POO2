package visao;
import Personagem.Observer.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import controle.*;

//A camada de visao faz referencia tanto ao modelo quanto ao controle, ja que precisa se comunicar com ambas

public class Game extends JPanel {

    private static Jogador jg;
    private static Inimigo i1;
    private static Inimigo i2;
    private static Inimigo i3;
    private static Inimigo i4;
    private static Inimigo i5;
    
    private static Controle c; 
    
    public Jogador getJogador(){return this.jg;}
    
    public Game() {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true); //So that the JPanel object receives the keyboard notifications it is necessary to include the instruction setFocusable(true), which allows KeyboardExample to receive the focus.

        jg = new Jogador(512, 384);
        i1 = new Inimigo(10,450);
        i2 = new Inimigo(400,20);
        i3 = new Inimigo(50,50);      
        i4 = new Inimigo(350,100);
        i5 = new Inimigo(20,300);
        
        
        c = new Controle();
        c.setCommand(new MoverEsq(jg),0);
        c.setCommand(new MoverDir(jg),1);
        c.setCommand(new MoverCima(jg),2);
        c.setCommand(new MoverBaixo(jg),3);
        c.setCommand(new Atacar(jg),4);
        
        /*
        Macro m = new Macro();
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new Atacar(bola, j8));        
        */

        //c.setCommand(m,5);
        
        jg.registrarObservador(i1);
        jg.registrarObservador(i2);
        jg.registrarObservador(i3);
        jg.registrarObservador(i4);
        jg.registrarObservador(i5);     
    
    }       
    
    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == KeyEvent.VK_LEFT){                
                c.pressionar(0);    
        }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                c.pressionar(1);    
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
                c.pressionar(2);    
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                c.pressionar(3);    
               
            if (e.getKeyCode() == KeyEvent.VK_SPACE)
                c.pressionar(4);    

            if (e.getKeyCode() == KeyEvent.VK_ENTER)
                c.pressionar(5);    

            if (e.getKeyCode() == KeyEvent.VK_R)
                c.replay();    
                
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
}    
    
    public void paint(Graphics g) {
        super.paint(g); //The call to "super.paint(g)", cleans the screen 

        Graphics2D g2d = (Graphics2D) g;
        //The instruction; "g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)" makes the borders of the figures smoother

        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(jg.getX(), jg.getY(), 20, 20);

        g2d.setColor(Color.GREEN);        
        g2d.fillOval(i1.getX(), i1.getY(), 20, 20);

        g2d.setColor(Color.RED);                
        g2d.fillOval(i2.getX(), i2.getY(), 20, 20);

        g2d.setColor(Color.WHITE);        
        g2d.fillOval(i3.getX(), i3.getY(), 20, 20);

        g2d.setColor(Color.BLUE);        
        g2d.fillOval(i4.getX(), i4.getY(), 20, 20);

        g2d.setColor(Color.DARK_GRAY);                
        g2d.fillOval(i5.getX(), i5.getY(), 20, 20);               
    }

}
