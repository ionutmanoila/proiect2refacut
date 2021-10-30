import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Proiect2_v1 {
    private JLabel lblnume;
    private JTextField txtnume;
    private JLabel lblprenume;
    private JTextField txtnota1;
    private JTextField txtprenume;
    private JButton btncalculati;
    private JTextField txtnota2;
    private JTextField txtnota3;
    private JLabel lblnota1;
    private JLabel lblmedia;
    private JLabel lblmediaint;
    private JLabel lblnota2;
    private JLabel lblnota3;
    private JLabel lblnp;
    private JPanel rootPanel;
    private JLabel lblnrmat;
    private JTextField txtnrmat;
    private JLabel lblnumarmatricol;
    private JLabel lblnumeprenume;
    private JLabel lblnrmatint;

    public Proiect2_v1() { btncalculati.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int result = JOptionPane.showConfirmDialog(null,
                    "Calculati media?",
                    "Question",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            final int nrnote = 3;
            String n = txtnume.getText();
            String p =  txtprenume.getText();
            String nm = txtnrmat.getText();
            String n1 = txtnota1.getText();
            String n2 = txtnota2.getText();
            String n3 = txtnota3.getText();
            ArrayList<String> infostud = new ArrayList<String>();
            infostud.add(n);
            infostud.add(p);
            infostud.add(nm);
            infostud.add(n1);
            infostud.add(n2);
            infostud.add(n3);

            int nrmat = Integer.parseInt(infostud.get(2));
            double nota1 = Double.parseDouble(infostud.get(3));
            double nota2 = Double.parseDouble(infostud.get(4));
            double nota3 = Double.parseDouble(infostud.get(5));

            Student stud1 = new Student(infostud.get(0),infostud.get(1));

            double media = (nota1 + nota2 + nota3)/nrnote;
            lblmediaint.setText(Double.toString(media));

            lblnrmatint.setText(Integer.toString(nrmat));

            StringBuffer strgbuf = new StringBuffer();
            strgbuf.append(infostud.get(0)).append(" ").append(infostud.get(1));
            lblnp.setText(strgbuf.toString());
        }
    } );
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculul mediei");
        frame.setContentPane(new Proiect2_v1().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    class Student {
        public String nume;
        public String prenume;

        public Student (String nume, String prenume) {
            this.nume = nume;
            this.prenume = prenume;
        }
    }
}
