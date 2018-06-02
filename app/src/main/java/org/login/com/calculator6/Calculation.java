package org.login.com.calculator6;

public class Calculation implements ICalculation {
    @Override
    public int getResult(Values values) {

        switch (String.valueOf(values.getActionName())) {
            case "Add":
                String[] valueAdd = values.getValue().split(" \\+ ");
               return Integer.parseInt(valueAdd[0]) + Integer.parseInt(valueAdd[1]);


            case "Sub":

                String[] valueSub = values.getValue().split(" - ");
                return Integer.parseInt(valueSub[0]) - Integer.parseInt(valueSub[1]);


            case "Mul":

                String[] valueMul = values.getValue().split(" \\* ");
                return Integer.parseInt(valueMul[0]) * Integer.parseInt(valueMul[1]);


            case "Div":

                String[] valueDiv = values.getValue().split(" / ");
                return Integer.parseInt(valueDiv[0]) / Integer.parseInt(valueDiv[1]);

        }
            return 0;
    }


}
