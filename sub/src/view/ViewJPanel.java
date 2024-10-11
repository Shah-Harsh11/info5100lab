/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Patient;
/**
 *
 * @author Harshshah
 */
public class ViewJPanel extends javax.swing.JPanel {
ImageIcon profilePicture;
Patient p1;
    /**
     * Creates new form FormJPanel
     */
    public ViewJPanel() {
        initComponents();
    }
        public ViewJPanel(Patient p1){
            this.p1 = p1; 
        initComponents();
        populateData();
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonSubmit = new javax.swing.JButton();
        ImagejLabel = new javax.swing.JLabel();
        imageJButton = new javax.swing.JButton();
        patientTypeJLabel = new javax.swing.JLabel();
        patientJComboBox = new javax.swing.JComboBox<>();
        jRadioButtonOthers = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jLabelGender = new javax.swing.JLabel();
        jLabelFirstname = new javax.swing.JLabel();
        jTextFieldFirstname = new javax.swing.JTextField();
        imgJLabel = new javax.swing.JLabel();
        jLabelLastname = new javax.swing.JLabel();
        jTextFieldLastname = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        ImagejLabel.setText("Select Image");

        imageJButton.setText("Select Image file");
        imageJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageJButtonActionPerformed(evt);
            }
        });

        patientTypeJLabel.setText("Patient Type:");

        patientJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in" }));
        patientJComboBox.setSelectedIndex(-1);

        buttonGroupGender.add(jRadioButtonOthers);
        jRadioButtonOthers.setText("Others");
        jRadioButtonOthers.setActionCommand("OTHERS");
        jRadioButtonOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOthersActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.setActionCommand("FEMALE");

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setActionCommand("MALE");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });

        jLabelGender.setText("Gender:");

        jLabelFirstname.setText("First Name:");

        imgJLabel.setMaximumSize(new java.awt.Dimension(60, 80));

        jLabelLastname.setText("Last Name");

        jTextFieldLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastnameActionPerformed(evt);
            }
        });

        jLabelAge.setText("Age");

        jTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAgeActionPerformed(evt);
            }
        });

        jLabelEmail.setText("Email Id");

        jLabelMessage.setText("Message");

        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMessage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLastname)
                            .addComponent(ImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelAge)
                                    .addComponent(jLabelMessage))
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldLastname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(49, 49, 49)
                                .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientTypeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(313, 313, 313))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSubmit)
                .addGap(354, 354, 354))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstname)
                    .addComponent(jTextFieldFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jLabelGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonFemale)
                .addGap(12, 12, 12)
                .addComponent(jRadioButtonOthers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientTypeJLabel)
                    .addComponent(patientJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ImagejLabel)
                            .addComponent(imageJButton))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLastname)
                            .addComponent(jTextFieldLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAge))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMessage)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonSubmit)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        try{
            String fname = this.jTextFieldFirstname.getText();
                        String lname = this.jTextFieldLastname.getText();
            String gender =this.buttonGroupGender.getSelection().getActionCommand();
                        String age =this.jTextFieldAge.getText();
             String msg = this.jTextAreaMessage.getText();
                        String email =this.jTextFieldEmail.getText();
            String patientType = this.patientJComboBox.getSelectedItem().toString();

            if (fname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "First Name is required.");
                return;
            }
                        if (lname.isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Last Name is required.");
                                return;
                            }
                        if (gender == null) {  // In case no gender is selected
                                JOptionPane.showMessageDialog(this, "Gender is required.");
                                return;
                            }
                        if (age.isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Age is required.");
                                return;
                            }
                        
                        if (email.isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Email is required.");
                                return;
                            }
//                        if (!isValidEmail(email)) {
//                                JOptionPane.showMessageDialog(this, "Invalid email format.");
//                                return;
//                            }

            String displayMessage = "Firstname:" +fname+"Gender:" +gender +" Patient Type:" + patientType;

            System.out.println(this.jTextFieldFirstname.getText());
                        System.out.println(this.jTextFieldLastname.getText());
            System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
                        System.out.println(this.jTextFieldAge.getText());
                        System.out.println(this.jTextAreaMessage.getText());
                        System.out.println(this.jTextFieldEmail.getText());
                        JOptionPane.showMessageDialog(this,displayMessage);
            JOptionPane.showMessageDialog(this, displayMessage, fname, HEIGHT,this.profilePicture);
        }catch(NullPointerException ne){
            String errorMessage = "You must enter something";
            JOptionPane.showMessageDialog(this,errorMessage);
        }
        catch(Exception e){
            System.out.println("Error has occured");
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void imageJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageJButtonActionPerformed
        // TODO add your handling code here:

        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80,
                    Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    //this.imgJLabel.setText(file.getSelectedFile().getAbsolutePath());
                    this.imgJLabel.setIcon(new ImageIcon(edited_image));
                    this.profilePicture = new ImageIcon(edited_image);
                    //this.userInfo.setPic(new ImageIcon(edited_image));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_imageJButtonActionPerformed

    private void jRadioButtonOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonOthersActionPerformed

    
    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void jTextFieldLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastnameActionPerformed

    private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgeActionPerformed
            public void populateData(){
            this.jTextFieldFirstname.setText(p1.getName());
            String gender = p1.getGender();
            if(gender.equals("MALE")){
            this.buttonGroupGender.setSelected(this.jRadioButtonMale.getModel(), true);
            }else if(gender.equals("FEMALE")){
                this.buttonGroupGender.setSelected(this.jRadioButtonFemale.getModel(), true);
            }else{
                this.buttonGroupGender.setSelected(this.jRadioButtonOthers.getModel(), true);
            }
            this.patientJComboBox.setSelectedItem(p1.getPatientType());
            this.jTextFieldLastname.setText(p1.getLastname());
            this.jTextFieldAge.setText(p1.getAge());
            this.jTextFieldEmail.setText(p1.getEmail());
            this.jTextAreaMessage.setText(p1.getMessage());
             if (p1.getProfilePicture() != null) {
        this.profilePicture = p1.getProfilePicture();  // Assuming Patient model has a getProfilePicture() method
        this.imgJLabel.setIcon(this.profilePicture);  // Display the profile picture in imgJLabel
    } else {
        // If no profile picture is set, you can set a default image or leave it empty
        this.imgJLabel.setIcon(null); // Or you can add a default icon here
    }
            }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagejLabel;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton imageJButton;
    private javax.swing.JLabel imgJLabel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstname;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelLastname;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOthers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMessage;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstname;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JComboBox<String> patientJComboBox;
    private javax.swing.JLabel patientTypeJLabel;
    // End of variables declaration//GEN-END:variables
}
