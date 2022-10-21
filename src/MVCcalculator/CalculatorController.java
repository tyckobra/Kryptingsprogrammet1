package MVCcalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView View;
    private CalculatorModel Model;

    public CalculatorController(CalculatorView View, CalculatorModel Model) {
        this.View = View;
        this.Model = Model;

        this.View.addCalculateListener(new CalculateListener());
    }

    private class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int message, key = 0;

            try{
                message = View.getFirstNumber();
                key = View.getSecondNumber();
                Model.CryptMessageKey(message, key);
                View.setCalcSolution(Model.getValue());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                View.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }
}