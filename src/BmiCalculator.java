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
    private JLabel lblDisplayState;
    private JTextField txtResult;
    private JLabel txtLine;
    private JRadioButton radioKG;
    private JRadioButton radioPounds;
    private JRadioButton radioMeter;
    private JRadioButton radioInches;

    BmiCalculator(){
        add(calPanel);
        setSize(700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioPounds.isSelected() == true && radioInches.isSelected()==true){
                    double h = Double.parseDouble(txtHeight.getText());
                    double w = Double.parseDouble(txtWeight.getText());

                    double bmi = w*703/(h*h);
                    String calc = String.format("%.2f",bmi);
                    txtResult.setText(calc);

                    if (bmi <= 18.5 ){
                        txtLine.setText("Underweight");
                    } else if (bmi <= 24.9) {
                        txtLine.setText("Normal");
                    } else if (bmi <= 29.9) {
                        txtLine.setText("OverWeight");
                    }else{
                        txtLine.setText("Obese");
                    }
                }
                else {
                    double h = Double.parseDouble(txtHeight.getText());
                    double w = Double.parseDouble(txtWeight.getText());

                    double bmi = w / (h * h);
                    String calc = String.format("%.2f", bmi);
                    txtResult.setText(calc);

                    if (bmi <= 18.5) {
                        txtLine.setText("Underweight");
                    } else if (bmi <= 24.9) {
                        txtLine.setText("Normal");
                    } else if (bmi <= 29.9) {
                        txtLine.setText("OverWeight");
                    } else {
                        txtLine.setText("Obese");
                    }
                }

            }
        });
        ClearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHeight.setText("");
                txtWeight.setText("");
                txtResult.setText("");
                txtLine.setText("");

            }
        });


    }
    public static void main(String[] args) {
        BmiCalculator cal = new BmiCalculator();
    }
}
