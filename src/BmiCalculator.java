import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BmiCalculator extends JFrame {

    private JPanel calPanel;
    private JLabel lblTitle;
    private JLabel lblFristField;
    private JLabel lblSecondField;
    private JTextArea txtWeight;
    private JTextArea txtHeight;
    private JButton submitBtn;
    private JButton ClearBtn;
    private JComboBox cmBoxWeight;
    private JComboBox cmBoxHeight;
    private JLabel lblDisplayState;
    private JTextField txtResult;

    BmiCalculator(){
        add(calPanel);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = txtWeight.getText()/txtHeight.getText()*txtHeight.getText();
                txtResult.setColumns(result);
            }
        });
        ClearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cmBoxWeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cmBoxHeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    public static void main(String[] args) {
        BmiCalculator cal = new BmiCalculator();
    }
}
