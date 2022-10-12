                         ATM system
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput= new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$'###,##0.00");
    
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(952141, 191904);
                data.put(989947, 71976);
                
                System.out.println("Welcome to the ATM project");
                System.out.println("Enter your customer no.");
                setCustomerNumber(menuInput.nextInt());
                
                System.out.print("Enter your PIN number");
                setPinNumber(menuInput.nextInt()); }
            catch (Exception e) {
                System.out.println("\n"+"Invalid Character. Only Number" + "\n");
                x=2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKEy(cn) && data.get(cn) == pn) {
                getAccountType(); 
            } else
                System.out.println("\n"+"Wrong Customer NUmber or Pin Number"+"\n");
            }
            
           } while (x==1);
        }
        public void getAccountType() {
            System.out.println("Select the account to be accesed");
            System.out.println("Type 1- Checking Account");
            System.out.println("Type 2- Saving Account");
            System.out.println("Type 3- Exit");
            
            int selection = menuInput.nextInt();
            
            switch(selection) {
                case 1:
                    getChecking()
                    break;
                case 2:
                    getSaving();
                    break;
                case 3:
                    System.out.println("thank you for using the atm");
                    break;
                default:
                    System.out.println("\n"+"Invalid Choice"+"\n");
                    getAccountType();
                    
            }
        }
        public void getChecking() {
            System.out.println("Checking account");
            System.out.println("Type 1- View balance");
            System.out.println("Type 2- Withdraw funds");
            System.out.println("Type 3- Deposit funds");
