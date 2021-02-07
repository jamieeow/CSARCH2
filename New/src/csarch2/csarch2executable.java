/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csarch2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thesm
 */
public class csarch2executable extends javax.swing.JFrame {

    /**
     * Creates new form csarch2executable
     */
    public csarch2executable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableview_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textfield_dividend = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textfield_divisor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        button_next = new javax.swing.JButton();
        button_calculate = new javax.swing.JButton();
        button_export = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label_quotient = new javax.swing.JLabel();
        label_remainder = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Non-restoring Binary Division (16-bit) [CSARCH2 S12 G11]");

        tableview_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Steps", "A", "Q", "M"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableview_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableview_table.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tableview_table);
        tableview_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel1.setText("Binary input (16-bit max):");

        jLabel2.setText("Dividend:");

        textfield_dividend.setToolTipText("Signed binary dividend here");
        textfield_dividend.setName(""); // NOI18N
        textfield_dividend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_dividendActionPerformed(evt);
            }
        });

        jLabel3.setText("/");

        textfield_divisor.setToolTipText("Signed binary divisor here");
        textfield_divisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_divisorActionPerformed(evt);
            }
        });

        jLabel4.setText("Divisor");

        button_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csarch2/playstep.png"))); // NOI18N
        button_next.setText("Step-by-step");
        button_next.setToolTipText("Step-by-step");
        button_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_nextMouseClicked(evt);
            }
        });

        button_calculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csarch2/playall.png"))); // NOI18N
        button_calculate.setText("Play all");
        button_calculate.setToolTipText("Play all");
        button_calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_calculateMouseClicked(evt);
            }
        });

        button_export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csarch2/104647.png"))); // NOI18N
        button_export.setText("Export to .txt");
        button_export.setToolTipText("Export to .txt");
        button_export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_exportMouseClicked(evt);
            }
        });

        jLabel7.setText("Quotient:");

        jLabel8.setText("Remainder:");

        label_quotient.setText("N/A");

        label_remainder.setText("N/A");

        jLabel5.setText("CSARCH Simulation S12");

        jLabel6.setText("Non-restoring division");

        jLabel9.setText("Made by G11:");

        jLabel10.setText("CUSTODIO, Nicholas");

        jLabel11.setText("MAPA, Jamie");

        jLabel12.setText("SANCHEZ, Martin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(191, 191, 191))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textfield_dividend, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(textfield_divisor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(button_calculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_next))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_export, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_quotient)
                    .addComponent(jLabel7)
                    .addComponent(label_remainder)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textfield_dividend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_divisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(button_next)
                                .addComponent(button_calculate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_remainder)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_quotient)
                        .addGap(18, 18, 18)
                        .addComponent(button_export)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield_dividendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_dividendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_dividendActionPerformed

    private void textfield_divisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_divisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_divisorActionPerformed

    private void button_calculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_calculateMouseClicked
        scan();
        // TODO add your handling code here:
    }//GEN-LAST:event_button_calculateMouseClicked

    private void button_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nextMouseClicked
        stepInc();
        // TODO add your handling code here:
    }//GEN-LAST:event_button_nextMouseClicked

    private void button_exportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_exportMouseClicked
        try{export();}catch(Exception e){}
        // TODO add your handling code here:
    }//GEN-LAST:event_button_exportMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(csarch2executable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(csarch2executable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(csarch2executable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(csarch2executable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new csarch2executable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_calculate;
    private javax.swing.JButton button_export;
    private javax.swing.JButton button_next;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_quotient;
    private javax.swing.JLabel label_remainder;
    private javax.swing.JTable tableview_table;
    private javax.swing.JTextField textfield_dividend;
    private javax.swing.JTextField textfield_divisor;
    // End of variables declaration//GEN-END:variables
    private static int passCount;
    private static int stepBy = 0;
    private static String Q;
    private static String M;
    private static String Mneg;
    private static String A;
    private static String restore;
    private static boolean prevPositive;
    private static int minStringSize;
    //SHOW ALL
    public void main(javax.swing.JTable tableview_table) {
        //initialize();
        textfield_dividend.setEditable(false);
        textfield_divisor.setEditable(false);
        //LOOP
        for (int i = 0; i < minStringSize; i++) {
            //Shift Left
            shiftLeft(tableview_table);

            //Last round restore save
            if (passCount == minStringSize - 1)
                restore = A;


            //Add or Subtract
            if (!prevPositive)
                A = addBinary(A, M, tableview_table, false);
            else
                A = addBinary(A, Mneg, tableview_table, true);


            //Complement
            Q = Q + flip(A.charAt(0));

            //prev pos or neg
            setPrevSign();

            printAll();
        }

        stepBy = 0;
        passCount = 0;
        textfield_dividend.setEditable(true);
        textfield_divisor.setEditable(true);
        JOptionPane.showMessageDialog(rootPane, "CALCULATION COMPLETE", "SUCCESS" , JOptionPane.INFORMATION_MESSAGE);

    }

    //STEP BY STEP
    public void mainSteps(javax.swing.JTable tableview_table) {
        textfield_dividend.setEditable(false);
        textfield_divisor.setEditable(false);
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
                A = addBinary(A, M, tableview_table, false);
            else
                A = addBinary(A, Mneg, tableview_table, true);
        }


        if(stepBy%3 == 0) {
            //Complement
            Q = Q + flip(A.charAt(0));

            //prev pos or neg
            setPrevSign();

            printAll();
        }

        if (passCount == minStringSize) {
            stepBy = 0;
            passCount = 0;
            textfield_dividend.setEditable(true);
            textfield_divisor.setEditable(true);
            JOptionPane.showMessageDialog(rootPane, "CALCULATION COMPLETE", "SUCCESS" , JOptionPane.INFORMATION_MESSAGE);
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

        DefaultTableModel model = (DefaultTableModel) tableview_table.getModel();
        while(model.getRowCount() > 0)
        {
            model.removeRow(0);
        }
         boolean invalid = false;

        for(int i = 0; i<Q.length();i++)
            if(Q.charAt(i) != '1' && Q.charAt(i) != '0' )
                invalid = true;

        for(int i = 0; i<M.length();i++)
            if(M.charAt(i) != '1' && M.charAt(i) != '0' )
                invalid = true;

        if(Q.length() >16 || M.length()>16 || Q.equals("") || M.equals("") || invalid) {
            JOptionPane.showMessageDialog(rootPane, "INVALID INPUT", "ERROR" , JOptionPane.ERROR_MESSAGE);
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

            DefaultTableModel model = (DefaultTableModel) tableview_table.getModel();
            while(model.getRowCount() > 0)
            {
                model.removeRow(0);
            }
            boolean invalid = false;

            for(int i = 0; i<Q.length();i++)
                if(Q.charAt(i) != '1' && Q.charAt(i) != '0' )
                    invalid = true;

            for(int i = 0; i<M.length();i++)
                if(M.charAt(i) != '1' && M.charAt(i) != '0' )
                    invalid = true;

            if(Q.length() >16 || M.length()>16 || Q.equals("") || M.equals("") || invalid) {
                JOptionPane.showMessageDialog(rootPane, "INVALID INPUT", "ERROR" , JOptionPane.ERROR_MESSAGE);

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
        A = zeroExtension(minStringSize+1, A);
        M = zeroExtension(minStringSize+1, M);
        if(Q.length() < minStringSize)
            Q = zeroExtension(minStringSize, Q);
        Mneg = printOneAndTwosComplement(M);
        prevPositive = true;
        DefaultTableModel model = (DefaultTableModel) tableview_table.getModel();
        model.addRow(new Object[]{"Initial Values", A,Q,M});

        passCount = 0;
        label_quotient.setText("N/A");
        label_remainder.setText("N/A");
    }

    // This function adds two
    // binary strings and return
    // result as a third string
    private static String addBinary(String a, String b, javax.swing.JTable tableview_table, Boolean negCheck)
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
        DefaultTableModel model = (DefaultTableModel) tableview_table.getModel();
        
        if(negCheck){
            model.addRow(new Object[]{"Subtract", result,Q});
        }
        else{
            model.addRow(new Object[]{"Add", result,Q});
        }
        tableview_table.scrollRectToVisible(tableview_table.getCellRect(tableview_table.getRowCount()-1, 0, true));
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

    private static void shiftLeft(javax.swing.JTable tableview_table){
        char shift = Q.charAt(0);
        Q = Q.substring(1, Q.length());
        A = A.substring(1, A.length()) + shift;

        System.out.println("Shift Left");
        System.out.println("Q: " + Q);
        System.out.println("A: " + A);
        DefaultTableModel model = (DefaultTableModel) tableview_table.getModel();
        model.addRow(new Object[]{"Shift Left", A,Q});
        tableview_table.scrollRectToVisible(tableview_table.getCellRect(tableview_table.getRowCount()-1, 0, true));


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
    
    private static String zeroExtension(int min, String src){
        String extended = "";
        char sign = '0';
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
        DefaultTableModel model = (DefaultTableModel) tableview_table.getModel();
        model.addRow(new Object[]{"Pass number: "+ passCount, A,Q});
          //Last round restore save 2
        if ((passCount== minStringSize) && A.charAt(0) == '1')
        {
            A = restore;
            model.addRow(new Object[]{"Restore", A,Q});
            model.addRow(new Object[]{"Pass number: "+ passCount, A,Q});
        }
        label_quotient.setText(Q);
        label_remainder.setText(A);
        tableview_table.scrollRectToVisible(tableview_table.getCellRect(tableview_table.getRowCount()-1, 0, true));
    }

    public void export() throws Exception{
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(currentPath));


        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            
            File file = fileChooser.getSelectedFile();
            
            String path = file.getAbsolutePath();
            
            Writer writer = null;
            try {
                DefaultTableModel model = (DefaultTableModel) tableview_table.getModel();
                writer = new BufferedWriter(new FileWriter(file+".txt"));
                for (int row = 0; row < model.getRowCount(); row++){
                    for (int column = 0; column < model.getColumnCount(); column++){
                        switch (column) {
                            case 0:
                                writer.write(model.getValueAt(row, column).toString() + "\n");
                                break;
                            case 1:
                                writer.write("A: " + model.getValueAt(row, column).toString() + "\t");
                                break;
                            case 3:
                                if(row == 0)
                                  writer.write("M: " + model.getValueAt(row, column).toString() + "\n\n");
                                break;
                            default:
                                if(row == 0)
                                    writer.write("Q: " + model.getValueAt(row, column).toString() + "\t\t");
                                else
                                    writer.write("Q: " + model.getValueAt(row, column).toString() + "\n\n");
                                break;
                        }
                    }
                    // Probably add new line to 'data'
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                writer.flush();
                writer.close();
            }

        } else {
            System.out.println("File access cancelled by user.");
        }

    }
}
