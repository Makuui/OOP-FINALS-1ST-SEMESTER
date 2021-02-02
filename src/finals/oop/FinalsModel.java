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

    public JRadioButton getRadioPT1() {
        return radioPT1;
    }

    public void setRadioPT1(JRadioButton radioPT1) {
        this.radioPT1 = radioPT1;
    }

    public JRadioButton getRadioPT2() {
        return radioPT2;
    }

    public void setRadioPT2(JRadioButton radioPT2) {
        this.radioPT2 = radioPT2;
    }

    public JRadioButton getRadioPT3() {
        return radioPT3;
    }

    public void setRadioPT3(JRadioButton radioPT3) {
        this.radioPT3 = radioPT3;
    }

    public JRadioButton getRadioPT4() {
        return radioPT4;
    }

    public void setRadioPT4(JRadioButton radioPT4) {
        this.radioPT4 = radioPT4;
    }

    public JRadioButton getRadioPT5() {
        return radioPT5;
    }

    public void setRadioPT5(JRadioButton radioPT5) {
        this.radioPT5 = radioPT5;
    }

    public JRadioButton getRadioT1() {
        return radioT1;
    }

    public void setRadioT1(JRadioButton radioT1) {
        this.radioT1 = radioT1;
    }

    public JRadioButton getRadioT2() {
        return radioT2;
    }

    public void setRadioT2(JRadioButton radioT2) {
        this.radioT2 = radioT2;
    }

    public JRadioButton getRadioT3() {
        return radioT3;
    }

    public void setRadioT3(JRadioButton radioT3) {
        this.radioT3 = radioT3;
    }

    public JRadioButton getRadioT4() {
        return radioT4;
    }

    public void setRadioT4(JRadioButton radioT4) {
        this.radioT4 = radioT4;
    }

    
   public double dpButtonKey(){
       
       double dpm =0;
      if(radioT1.isSelected()){
          dpm = 0.20;
      }if(radioT2.isSelected()){
          dpm = 0.30;
      }if(radioT3.isSelected()){
          dpm = 0.40;
      }else{
          dpm = 0.50;
      }
      
    return dpm;
   
   }
   
   public double prButtonKey(){
   
      double rate = 0;
      if(radioPT1.isSelected()){
          rate = 0.12;
      }if(radioPT2.isSelected()){
          rate = 0.14; 
      }if(radioPT3.isSelected()){
          rate = 0.16;
      }if(radioPT4.isSelected()){
          rate = 0.18;    
      }else {
          rate = 0.20;
      }   
      return rate;
   }
   
    public double ptButtonKey(){
      double pt = 0;
      if(radioPT1.isSelected()){  
          pt = 12;
      }if(radioPT2.isSelected()){
          pt = 18;
      }if(radioPT3.isSelected()){
          pt = 24;
      }if(radioPT4.isSelected()){
          pt = 36;
      }else {
          pt = 48;
      }
      return pt;
   }
   
   public double downPayment(double dpm){
       
        String sp = carSP.getText();
        double val = Double.parseDouble(sp);
        double dpa;
    
    dpa = val * dpm;
    return dpa;
}
   public double amoutFinanced(double dpa){
       
        String sp = carSP.getText();
        double val = Double.parseDouble(sp);
        double af;
       
       af = val - dpa;
       return af;
   }
   
   public double MonthlyAmortization(double af, double rate,double pt){
       
       double ma;
       
       ma = ((af * rate)) + af / pt;
       return ma;
   }
                         
}
