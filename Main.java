import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JLabel l,la,lb,lres;
        JTextField a,b,res;
        JButton add,sub;

        JFrame f= new JFrame("Example Code 2");


        l=new JLabel("Calculator");
        la=new JLabel("A:");
        lb=new JLabel("B:");
        lres=new JLabel("Result:");



        a=new JTextField("");
        b=new JTextField("");
        res=new JTextField("0");

        add=new JButton("+");
        sub=new JButton("-");

        //For label
        l.setBounds(150,100,150,40);
        la.setBounds(50,150,150,40);
        lb.setBounds(50,200,150,40);
        lres.setBounds(50,250,150,40);

        //For Button
        add.setBounds(150,300,50,40);
        sub.setBounds(200,300,50,40);

        //For textfield
        a.setBounds(150,150,200,40);
        b.setBounds(150,200,200,40);
        res.setBounds(150,250,200,40);
        res.setEditable(false);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double i1=Double.parseDouble(a.getText());
                double i2=Double.parseDouble(b.getText());

                res.setText((i1+i2)+"");
            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double i1=Double.parseDouble(a.getText());
                double i2=Double.parseDouble(b.getText());

                res.setText((i1-i2)+"");
            }
        });



        f.add(l);
        f.add(la);
        f.add(lb);
        f.add(lres);
        f.add(a);
        f.add(b);
        f.add(res);
        f.add(add);
        f.add(sub);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}