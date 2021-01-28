package CSARCH2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Paths;

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
    @FXML Button button_export;
    @FXML Button button_next;
    @FXML TableView <Steps> tableview_table;
    @FXML TableColumn <Steps,String>tablecolumn_s;
    @FXML TableColumn <Steps,String>tablecolumn_a;
    @FXML TableColumn <Steps,String>tablecolumn_q;
    @FXML Label label_quotient;
    @FXML Label label_remainder;
    private Stage stage;
    @FXML AnchorPane ap;
    private static int passCount;
    private static int stepBy = 0;
    private static Alert a1;


    //SHOW ALL
    public void main(TableView tableview_table) {
        //initialize();

        //LOOP
        for (int i = 0; i < minStringSize; i++) {
            //Shift Left
            shiftLeft(tableview_table);

            //Last round restore save
            if (i == minStringSize - 1)
                restore = A;


            //Add or Subtract
            if (!prevPositive)
                A = addBinary(A, M, tableview_table);
            else
                A = addBinary(A, Mneg, tableview_table);


            //Complement
            Q = Q + flip(A.charAt(0));

            //prev pos or neg
            setPrevSign();


            //Last round restore save 2
            if ((i == minStringSize - 1) && A.charAt(0) == '1')
                A = restore;

            printAll();
        }

        stepBy = 0;
        passCount = 0;
        a1 = new Alert(Alert.AlertType.NONE,
                "Success!",ButtonType.OK);
        // show the dialog
        a1.show();
    }

    //STEP BY STEP
    public void mainSteps(TableView tableview_table) {

        if(stepBy%3 == 1)
        {
            shiftLeft(tableview_table);

            //Last round restore save
            if (passCount == minStringSize-1)
                restore = A;
        }


        if(stepBy%3 == 2)
        {
            //Add or Subtract
            if (!prevPositive)
                A = addBinary(A, M, tableview_table);
            else
                A = addBinary(A, Mneg, tableview_table);
        }


        if(stepBy%3 == 0) {
            //Complement
            Q = Q + flip(A.charAt(0));

            //prev pos or neg
            setPrevSign();


            //Last round restore save 2
            if ((passCount== minStringSize-1) && A.charAt(0) == '1')
                A = restore;

            printAll();
        }

        if (passCount == minStringSize) {
            stepBy = 0;
            passCount = 0;
            a1 = new Alert(Alert.AlertType.NONE,
                    "Success!",ButtonType.OK);
            // show the dialog
            a1.show();
        }
    }

    //play all button
    public void scan(){
        //getting first binary number from user
        //System.out.print("Enter Q: ");
        Q = textfield_dividend.getText();
        //getting second binary number from user
        //System.out.print("Enter M: ");
        M = textfield_divisor.getText();

        tableview_table.getItems().clear();
         boolean invalid = false;

        for(int i = 0; i<Q.length();i++)
            if(Q.charAt(i) != '1' && Q.charAt(i) != '0' )
                invalid = true;

        for(int i = 0; i<M.length();i++)
            if(M.charAt(i) != '1' && M.charAt(i) != '0' )
                invalid = true;

        if(Q.length() >16 || M.length()>16 || Q.equals("") || M.equals("") || invalid) {
            a1 = new Alert(Alert.AlertType.ERROR,
                    "INVALID INPUT!",ButtonType.OK);
            // show the dialog
            a1.show();
        }
        else{
            stepBy = 0;
            init();
            main(tableview_table);
        }
    }

    //STEPBYSTEP BUTTON
    public void stepInc(){

        if(stepBy == 0)
        {
            //getting first binary number from user
            //System.out.print("Enter Q: ");
            Q = textfield_dividend.getText();
            //getting second binary number from user
            //System.out.print("Enter M: ");
            M = textfield_divisor.getText();

            tableview_table.getItems().clear();
            boolean invalid = false;

            for(int i = 0; i<Q.length();i++)
                if(Q.charAt(i) != '1' && Q.charAt(i) != '0' )
                    invalid = true;

            for(int i = 0; i<M.length();i++)
                if(M.charAt(i) != '1' && M.charAt(i) != '0' )
                    invalid = true;

            if(Q.length() >16 || M.length()>16 || Q.equals("") || M.equals("") || invalid) {
                a1 = new Alert(Alert.AlertType.ERROR,
                        "INVALID INPUT!",ButtonType.OK);
                // show the dialog
                a1.show();
            }

            else{
                stepBy = 1;
                init();
                mainSteps(tableview_table);
            }
        }
        else{
            stepBy++;
            mainSteps(tableview_table);
        }

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
        tablecolumn_s.setCellValueFactory(new PropertyValueFactory<>("Step"));
        tablecolumn_a.setCellValueFactory(new PropertyValueFactory<>("A"));
        tablecolumn_q.setCellValueFactory(new PropertyValueFactory<>("Q"));
        passCount = 0;
        label_quotient.setText("N/A");
        label_remainder.setText("N/A");
    }

    // This function adds two
    // binary strings and return
    // result as a third string
    private static String addBinary(String a, String b, TableView tableview_table)
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

            // Compute   sum of last
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
        Steps person = new Steps("Add", result,Q);
        tableview_table.getItems().add(person);
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

    private static void shiftLeft(TableView tableview_table){
        char shift = Q.charAt(0);
        Q = Q.substring(1, Q.length());
        A = A.substring(1, A.length()) + shift;

        System.out.println("Shift Left");
        System.out.println("Q: " + Q);
        System.out.println("A: " + A);
        Steps person = new Steps("Shift Left", A,Q);
        tableview_table.getItems().add(person);


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
         passCount++;
//        System.out.println("Nth Pass: ");
//        System.out.println("Q: " + Q);
//        System.out.println("A: " + A);
        label_quotient.setText(Q);
        label_remainder.setText(A);
        Steps person = new Steps("Pass number: "+ passCount, A,Q);
        tableview_table.getItems().add(person);
    }
    public void setStage(Stage stage){
        this.stage=stage;
    }
    public void writeExcel() throws Exception {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        fileChooser.setInitialDirectory(new File(currentPath));
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text files (.txt)", ".txt"));
        Stage stage = (Stage) ap.getScene().getWindow();
        File selectedDirectory = fileChooser.showSaveDialog(stage);
        var path = selectedDirectory.getAbsolutePath();

        Writer writer = null;
        try {
            File file = new File(path);
            writer = new BufferedWriter(new FileWriter(file));
            for (Steps steps : tableview_table.getItems()) {
                String text = "Step: " + steps.getStep() + "\nA:" + steps.getA() + " Q:" + steps.getQ() + "\n\n";
                writer.write(text);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            writer.flush();
            writer.close();
        }
    }

}
