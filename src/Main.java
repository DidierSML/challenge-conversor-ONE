import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws Exception {

        Object [] options = {"Currency Converter", "Temperature Converter", "Exit"};

        int select = JOptionPane.showOptionDialog(null,"What do you want to do?", "Converter",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, options, options [0]);

        if(select == 2){
            JOptionPane.showMessageDialog(null,"Application closed");
            System.exit(0);
        }
        if (select == 0){
            DecimalFormat formatCurrency = new DecimalFormat("#.##");
            boolean advance = true;

            while (advance){
               String [] alternatives = {"Colombian Pesos to American Dollars","Colombian Pesos to Euros","Colombian Pesos to Canadian Dollar", "Colombian Pesos to Australian Dollars",
                       "Colombian Pesos to Peruvian Soles", "Colombian Pesos to British Pounds", "Colombian Pesos to Won", "Colombian Pesos to Yen"};

               String change = (String) JOptionPane.showInputDialog(null,"Chose one option","Currency Converter",JOptionPane.QUESTION_MESSAGE, null, options,alternatives [0]);

               String input = JOptionPane.showInputDialog(null, "Enter the Quantity of Colombian pesos to Convert:");

               double colombianPesos = 0;

               try{
                   colombianPesos = Double.parseDouble(input);
               }catch (NumberFormatException e){
                   JOptionPane.showMessageDialog(null,"Invalid value");
               }

               if(change.equals ("Colombian Pesos to American Dollars ")){
                    double dollars = colombianPesos / 3.89;
                    JOptionPane.showMessageDialog(null,colombianPesos + "Colombian Pesos are: " +
                            formatCurrency.format(dollars) + "American Dollars");
               } else if (change.equals ("Colombian Pesos to Euros")){
                   double euro = colombianPesos / 4.79;
                   JOptionPane.showMessageDialog(null,colombianPesos + "Colombian Pesos are: " +
                           formatCurrency.format(euro) + "Euros");
               } else if (change.equals ("Colombian Pesos to Canadian Dollars")){
                   double canadian = colombianPesos / 4.79;
                   JOptionPane.showMessageDialog(null,colombianPesos + "Colombian Pesos are: " +
                           formatCurrency.format(canadian) + "Canadian Dollars");
               }else if (change.equals ("Colombian Pesos to Australian Dollars")){
                   double australian = colombianPesos / 4.79;
                   JOptionPane.showMessageDialog(null,colombianPesos + "Colombian Pesos are: " +
                           formatCurrency.format(australian) + "Australian Dollars");
               }else if (change.equals ("Colombian Pesos to Peruvian Soles")) {
                   double soles = colombianPesos / 4.79;
                   JOptionPane.showMessageDialog(null, colombianPesos + "Colombian Pesos are: " +
                           formatCurrency.format(soles) + "Peruvian Soles");
               }else if (change.equals ("Colombian Pesos to British Pounds")) {
                   double pounds = colombianPesos / 4.79;
                   JOptionPane.showMessageDialog(null, colombianPesos + "Colombian Pesos are: " +
                           formatCurrency.format(pounds) + "British Pounds");
               }else if (change.equals ("Colombian Pesos to Won")) {
                   double won = colombianPesos / 4.79;
                   JOptionPane.showMessageDialog(null, colombianPesos + "Colombian Pesos are: " +
                           formatCurrency.format(won) + "Won");
               } else if (change.equals ("Colombian Pesos to Yen")) {
                   double yen = colombianPesos / 4.79;
                   JOptionPane.showMessageDialog(null, colombianPesos + "Colombian Pesos are: " +
                           formatCurrency.format(yen) + "Yen");
               }




            }

        }
    }
}