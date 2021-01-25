package CSARCH2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UnsignedIntDivController {

    private static String Q;
    private static String M;
    private static String Mneg;
    private static String A;
    private static String restore;
    private static boolean prevPositive;
    private static int minStringSize;
    @FXML TextField textfield_dividend;
    @FXML TextField textfield_divisor;
    @FXML Button button_calculate;
    @FXML TableView tableview_table;
    @FXML TableColumn tablecolumn_i;
    @FXML TableColumn tablecolumn_a;
    @FXML TableColumn tablecolumn_q;
    @FXML Label label_quotient;
    @FXML Label label_remainder;



    public void main() {
        //initialize();

        //LOOP
        for (int i = 0; i < minStringSize; i++) {
            //Shift Left
            shiftLeft();

            //Last round restore save
            if (i == minStringSize - 1)
                restore = A;

            //Add or Subtract
            if (!prevPositive)
                A = addBinary(A, M);
            else
                A = addBinary(A, Mneg);

            //Complement
            Q = Q + flip(A.charAt(0));

            //prev pos or neg
            setPrevSign();


            //Last round restore save 2
            if ((i == minStringSize - 1) && A.charAt(0) == '1')
                A = restore;

            printAll();
        }
    }

    public void scan(){

        //getting first binary number from user
        //System.out.print("Enter Q: ");
        Q = textfield_dividend.getText();
        //getting second binary number from user
        //System.out.print("Enter M: ");
        M = textfield_divisor.getText();
        //closing scanner after use to avoid memory leak
        init();
        main();
    }

    public void init(){
        //INITIALIZE
        minStringSize = Math.max(Q.length(), M.length());
        A = "0";
        A = signExtension(minStringSize+1, A);
        M = signExtension(minStringSize+1, M);
        if(Q.length() < minStringSize)
            Q = signExtension(minStringSize, Q);
        Mneg = printOneAndTwosComplement(M);
        prevPositive = true;
    }

    // This function adds two
    // binary strings and return
    // result as a third string
    private static String addBinary(String a, String b)
    {

        // Initialize result
        String result = "";

        // Initialize digit sum
        int s = 0;

        // Traverse both strings starting
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1)
        {

            // Comput sum of last
            // digits and carry
            s += ((i >= 0)? a.charAt(i) - '0': 0);
            s += ((j >= 0)? b.charAt(j) - '0': 0);

            // If current digit sum is
            // 1 or 3, add 1 to result
            result = (char)(s % 2 + '0') + result;

            // Compute carry
            s /= 2;

            // Move to next digits
            i--; j--;
        }

        if(result.length()>minStringSize+1)
            result = result.substring(1, result.length());

        System.out.println("Add:");
        System.out.println("Q: " + Q);
        System.out.println("A: " + result);

        return result;
    }

    // Returns '0' for '1' and '1' for '0'
    private static char flip(char c)
    {
        return (c == '0') ? '1' : '0';
    }

    // Print 1's and 2's complement of binary number
    // represented by "bin"
    private static String printOneAndTwosComplement(String bin)
    {
        int n = bin.length();
        int i;

        String ones = "", twos = "";
        ones = twos = "";

        // for ones complement flip every bit
        for (i = 0; i < n; i++)
        {
            ones += flip(bin.charAt(i));
        }

        // for two's complement go from right to left in
        // ones complement and if we get 1 make, we make
        // them 0 and keep going left when we get first
        // 0, make that 1 and go out of loop
        twos = ones;
        for (i = n - 1; i >= 0; i--)
        {
            if (ones.charAt(i) == '1')
            {
                twos = twos.substring(0, i) + '0' + twos.substring(i + 1);
            }
            else
            {
                twos = twos.substring(0, i) + '1' + twos.substring(i + 1);
                break;
            }
        }

        // If No break : all are 1 as in 111 or 11111;
        // in such case, add extra 1 at beginning
        if (i == -1)
        {
            twos = '1' + twos;
        }

        return twos;
    }

    private static void shiftLeft(){
        char shift = Q.charAt(0);
        Q = Q.substring(1, Q.length());
        A = A.substring(1, A.length()) + shift;

        System.out.println("Shift Left");
        System.out.println("Q: " + Q);
        System.out.println("A: " + A);

    }

    private static String signExtension(int min, String src){
        String extended = "";
        char sign = src.charAt(0);
        int addSign = min - src.length();

        for(int i = 0; i<addSign ;i++){
            extended+= sign;
        }
        extended = extended + src;

        return extended;
    }

    private static void setPrevSign(){
        if(A.charAt(0) == '1')
            prevPositive = false;
        else
            prevPositive = true;
    }

    //TESTING PURPOSES
     public void printAll(){
//        System.out.println("Nth Pass: ");
//        System.out.println("Q: " + Q);
//        System.out.println("A: " + A);
        label_quotient.setText(Q);
        label_remainder.setText(A);
    }



}
