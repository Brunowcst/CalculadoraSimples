import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;


public class JanelaCalculadora extends JFrame implements ActionListener
{
    private Calculadora calc = new Calculadora();
    private JTextField display;
    private JanelaCalculadora j;
    private JButton b0 = new JButton("0"),
                    b1 = new JButton("1"),
                    b2 = new JButton("2"), 
                    b3 = new JButton("3"),
                    b4 = new JButton("4"),
                    b5 = new JButton("5"),
                    b6 = new JButton("6"),
                    b7 = new JButton("7"),
                    b8 = new JButton("8"),
                    b9 = new JButton("9"),
                    bMais = new JButton("+"),
                    bMenos = new JButton("-"),
                    bDiv = new JButton("/"),
                    bMult = new JButton("x"),
                    bRaiz = new JButton("\u221A"),
                    bIgual = new JButton("="),
                    bElev = new JButton("^"),
                    bFat = new JButton("!"),
                    bVirg = new JButton(","),
                    bZerar = new JButton("AC");
                    
                    
    public JanelaCalculadora()
    {
        b0.setBounds(80, 150, 50, 20);
        display = new JTextField(20);
        
        super.getContentPane().setLayout(new FlowLayout());
        super.getContentPane().add(display);
        display.setEditable(false);
        super.getContentPane().add(b1);
        super.getContentPane().add(b2);
        super.getContentPane().add(b3);
        super.getContentPane().add(bMais);
        super.getContentPane().add(bMenos);
        super.getContentPane().add(b4);
        super.getContentPane().add(b5);
        super.getContentPane().add(b6);
        super.getContentPane().add(bMult);
        super.getContentPane().add(bDiv);
        super.getContentPane().add(b7);
        super.getContentPane().add(b8);
        super.getContentPane().add(b9);
        super.getContentPane().add(bFat);
        super.getContentPane().add(bElev);
        super.getContentPane().add(b0);
        super.getContentPane().add(bVirg);
        super.getContentPane().add(bZerar);
        super.getContentPane().add(bRaiz);
        super.getContentPane().add(bIgual);
        
        super.getContentPane().setBackground(new Color(28,28,28));
        bMais.setBackground(new Color(062,105,138));
        bMenos.setBackground(new Color(062,105,138));
        bMult.setBackground(new Color(248,000,000));
        bDiv.setBackground(new Color(248,000,000));
        bZerar.setBackground(new Color(248,000,000));
        bVirg.setBackground(new Color(246,246,246));
        bIgual.setBackground(new Color(076,145,065));
        bElev.setBackground(new Color(228,160,016));
        bRaiz.setBackground(new Color(228,160,016));
        bFat.setBackground(new Color(228,160,016));
        b0.setBackground(new Color(246,246,246));
        b1.setBackground(new Color(246,246,246));
        b2.setBackground(new Color(246,246,246));
        b3.setBackground(new Color(246,246,246));
        b4.setBackground(new Color(246,246,246));
        b5.setBackground(new Color(246,246,246));
        b6.setBackground(new Color(246,246,246));
        b7.setBackground(new Color(246,246,246));
        b8.setBackground(new Color(246,246,246));
        b9.setBackground(new Color(246,246,246));
        
        
        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bMais.addActionListener(this);
        bMenos.addActionListener(this);
        bDiv.addActionListener(this);
        bMult.addActionListener(this);
        bFat.addActionListener(this);
        bElev.addActionListener(this);
        bIgual.addActionListener(this);
        bVirg.addActionListener(this);
        bRaiz.addActionListener(this);
        bZerar.addActionListener(this);
    }

    public void criar()
    {  
        j = new JanelaCalculadora();
        j.setSize(280, 400);
        j.setVisible(true);
    }
    
    
     public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case "0": display.setText(""+calc.zero());break;
            case "1": display.setText(""+calc.um());break;
            case "2": display.setText(""+calc.dois());break;
            case "3": display.setText(""+calc.tres());break;
            case "4": display.setText(""+calc.quatro());break;
            case "5": display.setText(""+calc.cinco());break;
            case "6": display.setText(""+calc.seis());break;
            case "7": display.setText(""+calc.sete());break;
            case "8": display.setText(""+calc.oito());break;
            case "9": display.setText(""+calc.nove());break;
            case "+": display.setText(""+calc.mais());break;
            case "-": display.setText(""+calc.menos());break;
            case "/": display.setText(""+calc.dividir());break;
            case "x": display.setText(""+calc.vezes());break;
            case "^": display.setText(""+calc.elev());break;
            case "!": display.setText(""+calc.fat());break;
            case ",": display.setText(""+calc.virg());break;
            case "=": display.setText(""+calc.igual());break;
            case "AC": display.setText(""+calc.zerar());break;
            case "\u221A": display.setText(""+calc.raiz());break;
        } 
    
    }
    
}

