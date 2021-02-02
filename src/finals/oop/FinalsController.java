package finals.oop;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;



public class FinalsController implements ActionListener{
    private JTextField cName, cNum, carSP;
    private String name, num, sp, payment, downpayment;
    private Double number, price;
    private JButton comButton, resetButton;
    private JTextPane cOutput;
    private ButtonGroup ptButton, dpButton;
    Object item;

    public FinalsController(JTextField cName, JTextField cNum, JTextField carSP, JButton comButton, JButton resetButton, JTextPane cOutput, ButtonGroup ptButton, ButtonGroup dpButton){
        this.cName = cName;
        this.cNum = cNum;
        this.carSP = carSP;
        this.comButton = comButton;
        this.resetButton = resetButton;
        this.cOutput = cOutput;
        this.ptButton = ptButton;
        this.dpButton = dpButton;
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
      item = ae.getActionCommand();
      try{
            if(item == "COMPUTE") {
               
               
                name = cName.getText();
                num = cNum.getText();
                sp = carSP.getText();
                number = Double.parseDouble(num);
                price = Double.parseDouble(sp);
                cOutput.setText("============ COMPUTATION ========== " + "\n"
                        +"Customer Name : "+ name + "\n"
                        +"Custumer Number: "+ number + "\n"
                        +"Car Selling Price: "+ price + "\n"
                        +"Downpayment Method : "+ null + "\n"
                        +"Payment Terms : "+ null + "\n"
                        +"Interest Rate : "+ null + "\n"
                        +"Downpayment Amount : "+ null + "\n"
                        +"Amount Financed : "+ null + "\n"
                        +"Montly Amotization : "+ null);
           
           try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write(cOutput.getText());
           bw.close();
        }catch(IOException ex){
        }
             
            }
            if(item == "RESET") {
                cOutput.setText(" ");
                
            }
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Invalid/Missing Inputs");
      }
        
    }
}