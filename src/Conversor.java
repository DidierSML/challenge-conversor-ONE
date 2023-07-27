import javax.swing.*;

public class Conversor {
    public static void main(String[] args) throws Exception {

        Object[] options = {"Currency Converter", "Temperature Converter", "Exit"};

        int select = JOptionPane.showOptionDialog(null, "What do you want to do?", "Converter",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (select == 2) {
            JOptionPane.showMessageDialog(null, "Application closed");
            System.exit(0);
        }

        if (select == 0) {
            boolean advanceProgram = true;

            while (advanceProgram) {
                String[] alternatives = {"Colombian Pesos to American Dollars", "Colombian Pesos to Euros",
                        "Colombian Pesos to Canadian Dollar", "Colombian Pesos to Australian Dollars",
                        "Colombian Pesos to Peruvian Soles", "Colombian Pesos to British Pounds",
                        "Colombian Pesos to Won", "Colombian Pesos to Yen"};

                String change = (String) JOptionPane.showInputDialog(null, "Chose one option", "Currency Converter",
                        JOptionPane.QUESTION_MESSAGE, null, alternatives, alternatives[0]);

                String input = JOptionPane.showInputDialog(null, "Enter the Quantity of Colombian pesos to Convert:");

                double colombianPesos = 0;

                try {
                    colombianPesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid value");
                }

                if (change.equals("Colombian Pesos to American Dollars")) {
                    double dollars = colombianPesos / 3894.34;
                    String formattedDollars = String.format("%.2f", dollars);
                    JOptionPane.showMessageDialog(null, colombianPesos + " Colombian Pesos are: " +
                            formattedDollars + " American Dollars");
                } else if (change.equals("Colombian Pesos to Euros")) {
                    double euro = colombianPesos / 4473.25;
                    String formattedEuro = String.format("%.2f", euro);
                    JOptionPane.showMessageDialog(null, colombianPesos + " Colombian Pesos are: " +
                            formattedEuro + " Euros");
                } else if (change.equals("Colombian Pesos to Canadian Dollars")) {
                    double canadian = colombianPesos / 3066.78;
                    String formattedCanadian = String.format("%.2f", canadian);
                    JOptionPane.showMessageDialog(null, colombianPesos + " Colombian Pesos are: " +
                            formattedCanadian + " Canadian Dollars");
                } else if (change.equals("Colombian Pesos to Australian Dollars")) {
                    double australian = colombianPesos / 2649.27;
                    String formattedAustralian = String.format("%.2f", australian);
                    JOptionPane.showMessageDialog(null, colombianPesos + " Colombian Pesos are: " +
                            formattedAustralian + " Australian Dollars");
                } else if (change.equals("Colombian Pesos to Peruvian Soles")) {
                    double soles = colombianPesos / 1083.29;
                    String formattedSoles = String.format("%.2f", soles);
                    JOptionPane.showMessageDialog(null, colombianPesos + " Colombian Pesos are: " +
                            formattedSoles + " Peruvian Soles");
                } else if (change.equals("Colombian Pesos to British Pounds")) {
                    double pounds = colombianPesos / 5062.07;
                    String formattedPounds = String.format("%.2f", pounds);
                    JOptionPane.showMessageDialog(null, colombianPesos + " Colombian Pesos are: " +
                            formattedPounds + " British Pounds");
                } else if (change.equals("Colombian Pesos to Won")) {
                    double won = colombianPesos / 308.77;
                    String formattedWon = String.format("%.2f", won);
                    JOptionPane.showMessageDialog(null, colombianPesos + " Colombian Pesos are: " +
                            formattedWon + " Won");
                } else if (change.equals("Colombian Pesos to Yen")) {
                    double yen = colombianPesos / 28.12;
                    String formattedYen = String.format("%.2f", yen);
                    JOptionPane.showMessageDialog(null, colombianPesos + " Colombian Pesos are: " +
                            formattedYen + " Yen");
                }

                int confirm = JOptionPane.showConfirmDialog(null, "Would you like Continue using the App?",
                        "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION){
                    advanceProgram = false;
                    JOptionPane.showMessageDialog(null, "Program finished");
                }
            }
        }

        if (select == 1){

            boolean proceed = true;

            while (proceed){

                String [] alternatives = {"Celsius to Fahrenheit","Fahrenheit to Celsius"};

                String selectedOption = (String) JOptionPane.showInputDialog(null, "Chose one option",
                        "Temperature Converter",
                        JOptionPane.QUESTION_MESSAGE, null, alternatives, alternatives[0]);

                int option = 0;

                if (selectedOption.equals("Fahrenheit to Celsius")) {
                    option = 1;
                }

                String valueToCalculate = JOptionPane.showInputDialog(null, "Enter the value to Convert");

                double value = 0.0;

                try{
                    value = Double.parseDouble(valueToCalculate);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Invalid value");
                    System.exit(0);
                }

                double result = 0;

                if (option == 0){
                    result = (value * 9/5) + 32;
                    JOptionPane.showMessageDialog(null, value + " Celsius Degree are: " +
                            "" + result + "Fahrenheit Degree");
                } else if (option == 1) {
                    result = (value - 32) * 5/9;
                    JOptionPane.showMessageDialog(null, value + " Fahrenheit Degree are: " +
                            "" + result + " Celsius Degree");
                }

                int proceed2 = JOptionPane.showConfirmDialog(null, "Do you want to keep using the program?",
                        "",JOptionPane.YES_NO_OPTION);
                if (proceed2 == JOptionPane.NO_OPTION){
                    proceed = false;
                    JOptionPane.showMessageDialog(null, "Program finished");
                }

            }
        }

    }
}

