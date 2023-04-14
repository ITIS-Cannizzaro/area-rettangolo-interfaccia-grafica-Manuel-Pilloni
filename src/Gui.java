import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui extends JFrame implements ActionListener{

    JButton b1, b2;
    JTextField f1, f2;
    JLabel l;
    JLabel l1,l2,l3;

    JTextArea a1;
    Gui(){

        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();

        l1.setText("LUNGHEZZA DELLA BASE: ");
        l1.setBounds(50,50,180,20);
        this.add(l1);

        l2.setText("LUNGHEZZA DELL'ALTEZZA: ");
        l2.setBounds(50,100,190,20);
        this.add(l2);

        l3.setText("RISULTATO: ");
        l3.setBounds(150, 200, 180,20);
        this.add(l3);

        f1= new JTextField();
        f1.setBounds(300, 50, 120, 20);
        this.add(f1);

        f2= new JTextField();
        f2.setBounds(300, 100, 120, 20);
        this.add(f2);

        a1= new JTextArea();
        a1.setBounds(300, 200, 120, 20);
        a1.setEditable(false);
        this.add(a1);

        b1=new JButton("CANCELLA");
        b1.setBounds(360, 150, 100, 25);
        this.add(b1);
        b1.addActionListener(this);

        b2=new JButton("CALCOLA");
        b2.setBounds(250, 150, 100, 25);
        this.add(b2);
        b2.addActionListener(this);

        l= new JLabel();
        this.add(l);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setResizable(false);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int num1= Integer.parseInt(f1.getText());
        int num2= Integer.parseInt(f2.getText());
        String ris= "" + num1 * num2;
        if(e.getSource()==b1){
            f1.setText(null);
            f2.setText(null);
            a1.setText(null);
        }else if(e.getSource()==b2){
            a1.setText(ris);

        }
    }
}