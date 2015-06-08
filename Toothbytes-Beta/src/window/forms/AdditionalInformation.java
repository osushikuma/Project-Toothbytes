/*
 * Copyright (c) 2014, 2015, Project Toothbytes. All rights reserved.
 *
 *
*/
package window.forms;

import java.awt.Dialog;
import java.util.Calendar;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import utilities.AdditionalInfo;
import utilities.MedicalCond;
import utilities.PersonalInfo;

public class AdditionalInformation extends javax.swing.JPanel {
    private PersonalInfo pi;
    private AdditionalInfo ai;
    private MedicalCond mc;
    private JDialog tb;
       
    public AdditionalInformation(JDialog tb, PersonalInfo pi) {
        initComponents();
        this.pi = pi;
        this.tb = tb;
    }
    
    public AdditionalInformation(JDialog tb, PersonalInfo pi, AdditionalInfo ai, MedicalCond mc) {
        initComponents();
        this.tb = tb;
        this.pi = pi;
        this.ai = ai;
        this.mc = mc;
        
        dentalInsuranceTF.setText(ai.getDentalInsurance());
        guardiansNameTF.setText(ai.getGuardianName());
        occupationTF.setText(ai.getOccupation());
        referrerTF.setText(ai.getReferrer());
        reasonTF.setText(ai.getReason());
        previousDentistTF.setText(ai.getPreviousDentist());
        nameOfPhysicianTF.setText(ai.getPhysicianName());
        officeAddressTF.setText(ai.getOfficeNumber());
        specializationTF.setText(ai.getSpecialization());
        officeNumberTF.setText(ai.getOfficeNumber());
        
        //Dates
        effectiveDateDayCB.setSelectedIndex(ai.getEffectiveDate().get(Calendar.DAY_OF_MONTH));
        effectiveDateMonthCB.setSelectedIndex(ai.getEffectiveDate().get(Calendar.MONTH));
        effectiveDateYearTF.setText(String.valueOf(ai.getEffectiveDate().get(Calendar.YEAR)));
        
        lastDentalVisitDayCB.setSelectedIndex(ai.getLastDentalVisit().get(Calendar.DAY_OF_MONTH));
        lastDentalVisitMonthCB.setSelectedIndex(ai.getLastDentalVisit().get(Calendar.MONTH));
        lastDentalVisitYearTF.setText(String.valueOf(ai.getLastDentalVisit().get(Calendar.YEAR)));
        
        
    }
    
    public boolean hasNumbers(String numberlessString){
        String pattern = "[0-9]";
        if(Pattern.compile(pattern).matcher(numberlessString).find()) {
            // There is a number in the string
            return true;
        } else {
            // The string has no numbers
            return false;
        }
    }
    
    public boolean hasSpecialCharacters(String specialCharacterlessString) {
        String pattern = "[^A-Za-z0-9]+";
        if(Pattern.compile(pattern).matcher(specialCharacterlessString).find()) {
            // There is a special character in the string
            return true;
        } else {
            return false;
        }
    }
    
    public boolean hasLetters(String letterlessString) {
        String pattern = "[A-Za-z]";
        if(Pattern.compile(pattern).matcher(letterlessString).find()) {
            // There is a letter on the string
            return true;
        } else {
            return false;
        }   
    }
    
    final private String BUTTON_DIR = "res/buttons/";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dentalInsuranceTF = new javax.swing.JTextField();
        effectiveDateMonthCB = new javax.swing.JComboBox();
        effectiveDateDayCB = new javax.swing.JComboBox();
        effectiveDateYearTF = new javax.swing.JTextField();
        guardiansNameTF = new javax.swing.JTextField();
        occupationTF = new javax.swing.JTextField();
        imagePanel = new javax.swing.JPanel();
        addImageButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        referrerTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        reasonTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        previousDentistTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lastDentalVisitMonthCB = new javax.swing.JComboBox();
        lastDentalVisitDayCB = new javax.swing.JComboBox();
        lastDentalVisitYearTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nameOfPhysicianTF = new javax.swing.JTextField();
        officeAddressTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        specializationTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        officeNumberTF = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 255, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Additional Information");

        jLabel2.setText("Dental Insurance:");

        jLabel3.setText("Effective Date:");

        jLabel4.setText("Guardian's Name:");

        jLabel5.setText("Occupation:");

        dentalInsuranceTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dentalInsuranceTFFocusLost(evt);
            }
        });
        dentalInsuranceTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dentalInsuranceTFKeyReleased(evt);
            }
        });

        effectiveDateMonthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        effectiveDateMonthCB.setEnabled(false);

        effectiveDateDayCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        effectiveDateDayCB.setEnabled(false);

        effectiveDateYearTF.setText("Year");
        effectiveDateYearTF.setEnabled(false);

        imagePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        addImageButton.setText("Add Image");

        jLabel6.setText("Person who reffered the patient:");

        jLabel7.setText("Reason for dental consultation:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Dental History");

        jLabel9.setText("Previous Dentist:");

        jLabel10.setText("Last Dental Visit:");

        lastDentalVisitMonthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        lastDentalVisitDayCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        lastDentalVisitYearTF.setText("Year");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Medical History");

        jLabel12.setText("Name of Physician:");

        jLabel13.setText("Office Address:");

        jLabel14.setText("Specialization:");

        jLabel15.setText("Office Number:");

        nextButton.setIcon(new ImageIcon(BUTTON_DIR+"Next.png"));
        nextButton.setText("Next");
        nextButton.setToolTipText("");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new ImageIcon(BUTTON_DIR+"Back.png"));
        backButton.setText("Back");
        backButton.setToolTipText("");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new ImageIcon(BUTTON_DIR+"Cancel.png"));
        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(addImageButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dentalInsuranceTF)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(effectiveDateMonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(effectiveDateDayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(effectiveDateYearTF))
                                    .addComponent(guardiansNameTF)
                                    .addComponent(occupationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(referrerTF)
                            .addComponent(reasonTF, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(previousDentistTF, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lastDentalVisitMonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(lastDentalVisitDayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(lastDentalVisitYearTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameOfPhysicianTF)
                                    .addComponent(officeAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(specializationTF)
                                    .addComponent(officeNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dentalInsuranceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(effectiveDateMonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(effectiveDateDayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(effectiveDateYearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(guardiansNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(occupationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addImageButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(referrerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(reasonTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastDentalVisitMonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastDentalVisitDayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastDentalVisitYearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(previousDentistTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nameOfPhysicianTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(specializationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(officeAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(officeNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(backButton)
                    .addComponent(cancelButton))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        grayTFBorders();
        if(entriesValid()) {
            // Proceed to medical condition form
            String dentalInsurance = dentalInsuranceTF.getText();    
            String guardiansName = guardiansNameTF.getText();              
            String occupation = occupationTF.getText();                     
            String referrer = referrerTF.getText();                         
            String reason = reasonTF.getText();                           
            String previousDentist = previousDentistTF.getText();   
            String nameOfPhysician = nameOfPhysicianTF.getText();          
            String officeAddress = officeAddressTF.getText();             
            String specialization = specializationTF.getText();           
            String officeNumber = officeNumberTF.getText();    
            
            Calendar effectiveDate = Calendar.getInstance();
            
            if(!effectiveDateYearTF.getText().equalsIgnoreCase("Year") ||
                    effectiveDateDayCB.getSelectedIndex() != 0 ||
                    effectiveDateMonthCB.getSelectedIndex() != 0){
                int effectiveDateDay = effectiveDateDayCB.getSelectedIndex();
                int effectiveDateMonth = effectiveDateMonthCB.getSelectedIndex();
                int effectiveDateYear = Integer.parseInt(effectiveDateYearTF.getText());
                effectiveDate.set(effectiveDateYear, effectiveDateMonth, effectiveDateDay);
            } else {
                effectiveDate = null;
            }
                    
            Calendar lastDentalVisit = Calendar.getInstance();
            if(!lastDentalVisitYearTF.getText().equalsIgnoreCase("Year") ||
                    lastDentalVisitDayCB.getSelectedIndex() != 0 ||
                    lastDentalVisitMonthCB.getSelectedIndex() != 0){
                int lastDentalVisitDay = lastDentalVisitDayCB.getSelectedIndex();
                int lastDentalVisitMonth = lastDentalVisitMonthCB.getSelectedIndex();
                int lastDentalVisitYear = Integer.parseInt(lastDentalVisitYearTF.getText());
                lastDentalVisit.set(lastDentalVisitYear, lastDentalVisitMonth, lastDentalVisitDay);
            } else {
                lastDentalVisit = null;
            }
            
            ai = new AdditionalInfo(dentalInsurance, effectiveDate, guardiansName, occupation, referrer, reason, previousDentist,
                                                lastDentalVisit, nameOfPhysician, officeAddress, specialization, officeNumber);
            
            launchMedicalCondition();
        } else {
            if(reasonTF.getText().isEmpty()){reasonTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(hasLetters(officeNumberTF.getText())){officeNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            JOptionPane.showMessageDialog(null,"One or more fields are invalid. \nPlease recheck inputs.");
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void launchMedicalCondition() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog tb = new JDialog();
                tb.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                MedicalCondition mc = new MedicalCondition(tb, pi, ai);
                System.out.println(mc.isVisible());
                tb.setSize(mc.getPreferredSize());
                tb.add(mc);
                tb.pack();
                tb.setVisible(true);
                tb.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                }
            }
        );
        tb.dispose();
    }
    
    private void dentalInsuranceTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dentalInsuranceTFKeyReleased
        if(!dentalInsuranceTF.getText().isEmpty()){
            effectiveDateMonthCB.setEnabled(true);
            effectiveDateDayCB.setEnabled(true);
            effectiveDateYearTF.setEnabled(true);
        }
    }//GEN-LAST:event_dentalInsuranceTFKeyReleased

    private void dentalInsuranceTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dentalInsuranceTFFocusLost
        if(dentalInsuranceTF.getText().isEmpty()){
            effectiveDateMonthCB.setEnabled(false);
            effectiveDateDayCB.setEnabled(false);
            effectiveDateYearTF.setEnabled(false);
        }
    }//GEN-LAST:event_dentalInsuranceTFFocusLost

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        launchPersonalInformation();
    }//GEN-LAST:event_backButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        tb.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    private void launchPersonalInformation() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog tb = new JDialog();
                PersonalInformation psi = new PersonalInformation(tb, pi, ai, mc);
                System.out.println(psi.isVisible());
                tb.setSize(psi.getPreferredSize());
                tb.add(psi);
                tb.pack();
                tb.setVisible(true);
                tb.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                }
            }
        );
        tb.dispose();
    }
    
    public boolean entriesValid() {
        // Get values from fields
        String dentalnsurance = dentalInsuranceTF.getText();            //no filter
        String effectiveDateYear = effectiveDateYearTF.getText();       //no letter, special chars
        String guardiansName = guardiansNameTF.getText();               //no number
        String occupation = occupationTF.getText();                     //no filter
        String referrer = referrerTF.getText();                         //no number
        String reason = reasonTF.getText();                             //no filter
        String previousDentist = previousDentistTF.getText();           //no number
        String lastDentalVisitYear = lastDentalVisitYearTF.getText();   //no letter
        String nameOfPhysician = nameOfPhysicianTF.getText();           //no number
        String officeAddress = officeAddressTF.getText();               //no filter
        String specialization = specializationTF.getText();             //no filter
        String officeNumber = officeNumberTF.getText();                 //no letters
        
        if(!entriesNull(reason)&& 
           !hasNumbers(guardiansName) && 
           !hasNumbers(referrer) &&
           !hasNumbers(previousDentist) &&
           !hasNumbers(nameOfPhysician) &&
           !hasLetters(officeNumber)){
           return true;
        }else{
           return false;
        }
    }
    
    public void grayTFBorders() {
        dentalInsuranceTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        effectiveDateYearTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        guardiansNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        occupationTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        referrerTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        reasonTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        previousDentistTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        lastDentalVisitYearTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        nameOfPhysicianTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        officeAddressTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        specializationTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        officeNumberTF .setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
    }
    
    public boolean entriesNull(String reason) {
        if(reason.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImageButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField dentalInsuranceTF;
    private javax.swing.JComboBox effectiveDateDayCB;
    private javax.swing.JComboBox effectiveDateMonthCB;
    private javax.swing.JTextField effectiveDateYearTF;
    private javax.swing.JTextField guardiansNameTF;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox lastDentalVisitDayCB;
    private javax.swing.JComboBox lastDentalVisitMonthCB;
    private javax.swing.JTextField lastDentalVisitYearTF;
    private javax.swing.JTextField nameOfPhysicianTF;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField occupationTF;
    private javax.swing.JTextField officeAddressTF;
    private javax.swing.JTextField officeNumberTF;
    private javax.swing.JTextField previousDentistTF;
    private javax.swing.JTextField reasonTF;
    private javax.swing.JTextField referrerTF;
    private javax.swing.JTextField specializationTF;
    // End of variables declaration//GEN-END:variables
}
