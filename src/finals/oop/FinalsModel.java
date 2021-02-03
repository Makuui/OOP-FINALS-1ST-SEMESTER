package finals.oop;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class FinalsModel extends FinalsView {
    
    private JTextField carSP; 
    
    public FinalsModel(JTextField carSP){
    this.carSP = carSP;
    }
        
    public JTextField getcName() {
        return cName;
    }

    public void setcName(JTextField cName) {
        this.cName = cName;
    }

    public JTextField getcNum() {
        return cNum;
    }

    public void setcNum(JTextField cNum) {
        this.cNum = cNum;
    }

    public JTextField getCarSP() {
        return carSP;
    }

    public void setCarSP(JTextField carSP) {
    }

    public JButton getComButton() {
        return comButton;
    }

    public void setComButton(JButton comButton) {
        this.comButton = comButton;
    }

    public JTextField getPTM() {
        return PTM;
    }

    public void setPTM(JTextField PTM) {
        this.PTM = PTM;
    }

    public JTextField getPTT() {
        return PTT;
    }

    public void setPTT(JTextField PTT) {
        this.PTT = PTT;
    }

    public JTextField getDpmJF() {
        return dpmJF;
    }

    public void setDpmJF(JTextField dpmJF) {
        this.dpmJF = dpmJF;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }

   
    
   
             
}
