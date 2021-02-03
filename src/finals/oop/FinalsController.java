package finals.oop;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;



public class FinalsController implements ActionListener{
    FinalsModel fm;
    private JTextField cName, cNum, carSP,dpmJF,PTT,PTM;
    private String name, num, sp,dpm,ptm,ptt;
    private Double number, price;
    private JTextPane cOutput;
    private JButton comButton, resetButton;
    Object item;

    public FinalsController(JTextField cName, JTextField cNum, JTextField carSP, JButton comButton, JButton resetButton, JTextPane cOutput,JTextField dpmJF,JTextField PTT,JTextField PTM){
        this.cName = cName;
        this.cNum = cNum;
        this.carSP = carSP;
        this.comButton = comButton;
        this.resetButton = resetButton;
        this.cOutput = cOutput;
        this.dpmJF = dpmJF;
        this.PTM = PTM;
        this.PTT = PTT;
    } 
    @Override
    public void actionPerformed(ActionEvent ae) {
      item = ae.getActionCommand();
      try{
            if(item == "COMPUTE") {
               
                dpm = dpmJF.getText();
                ptm = PTM.getText();
                ptt = PTT.getText();
                name = cName.getText();
                num = cNum.getText();
                sp = carSP.getText();
                int cnumber = Integer.parseInt(num);
                int carSPP = Integer.parseInt(sp);
                double dpmn = Double.parseDouble(dpm);
                double pttt = Double.parseDouble(ptt);
                double ptmm = Double.parseDouble(ptm);
                
                //computation
                
                double dpa = carSPP * dpmn;
                double af = carSPP - dpa;
                double ma = ((af * pttt)) + af / ptmm;
                
                cOutput.setText("============ COMPUTATION ========== " + "\n"
                        +"Customer Number: " + cnumber
                        +"Customer Name : "+ name + "\n"
                        +"Car Selling Price: "+ carSPP + "\n"
                        +"Downpayment Method : "+ dpmn + "\n"
                        +"Payment Terms : "+ ptmm + "\n"
                        +"Interest Rate : "+ ptt + "\n"
                        +"Downpayment Amount : "+ dpa + "\n"
                        +"Amount Financed : "+ af + "\n"
                        +"Montly Amotization : "+ ma);
           
           try{
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
                        bw.write(cOutput.getText());
                    }
        }catch(IOException ex){
        }
            }
            if(item == "RESET") {
               cOutput.setText("");
               cNum.setText("");
               cName.setText("");
               carSP.setText("");
               dpmJF.setText("");
               PTM.setText("");
               PTT.setText("");
                
            }
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Invalid/Missing Inputs");
      }
        
    }
}