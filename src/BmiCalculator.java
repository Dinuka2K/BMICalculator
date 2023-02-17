import javax.swing.*;

public class BmiCalculator extends JFrame {

    private JPanel calPanel;
    private JLabel lblTitle;
    private JLabel lblFristField;
    private JLabel lblSecondField;
    private JTextArea txtWeight;
    private JTextArea txtHeight;
    private JButton submitBtn;
    private JButton ClearBtn;

    BmiCalculator(){
        add(calPanel);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {

    }
}
