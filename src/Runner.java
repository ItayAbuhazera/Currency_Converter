import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        Function f = new Function();
        Object[] option1 = {"Dollar to NIS", "NIS to Dollar", "Quit"};
        Object[] option2 = {"Try again", "Quit"};
        boolean y = true;
        while(y) {
            String input = JOptionPane.showInputDialog("Enter the amount: ");
            System.out.println(input);
            if (f.checkNum(input)) { // if input is a number
                double x = Double.parseDouble(input); // convert to double
                int choice1 = f.getChoice1(option1); // get choice from option1
                switch (choice1) {
                    case 0:
                        f.dollarToNis(x);
                        int choice2 = f.getChoice2(option2); // get choice from option2
                        if(choice2 == 0) {
                            continue;
                        }
                        else {
                            y = false;
                            break;
                        }
                    case 1:
                        f.nisToDollar(x);
                        int choice3 = f.getChoice2(option2); // get choice from option2
                        if(choice3 == 0) {
                            continue;
                        }
                        else {
                            y = false;
                            break;
                        }
                    case 2:
                        int choice4 = f.getChoice2(option2); // get choice from option2
                        if(choice4 == 0) {
                            continue;
                        }
                        else {
                            y = false;
                            break;
                        }



                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid input, try again.");
                int choice2 = f.getChoice2(option2); // get choice from option2
                if(choice2 == 0) {
                    continue;
                }
                else {
                    break;
                }
            }

        }
    }

}
