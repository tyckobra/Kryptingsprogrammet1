package MVCcalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView View;
    private CalculatorModel Model;

    public CalculatorController(CalculatorView View, CalculatorModel Model) {
        this.View = View;
        this.Model = Model;
        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class
        this.View.addCalculateListener(new CalculateListener());
    }

    private class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try{
                firstNumber = View.getFirstNumber();
                secondNumber = View.getSecondNumber();
                Model.CryptMessageKey(firstNumber, secondNumber);
                View.setCalcSolution(Model.getCalculationValue());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                View.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }
}