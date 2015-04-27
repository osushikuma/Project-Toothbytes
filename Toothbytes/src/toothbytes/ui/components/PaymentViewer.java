package toothbytes.ui.components;
import java.util.Calendar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;
import toothbytes.database.DBAccess;
import toothbytes.model.Patient;
import toothbytes.model.PatientX;
import toothbytes.ui.forms.SetPaymentSchedule;

public class PaymentViewer extends JPanel{
    
    PatientX px;
    
    public PaymentViewer(int patientID) {
        initComponents();
        
        px = DBAccess.getData(patientID);
        patientNameLabel.setText(px.getFullName());
        
        try{
            contactNumberLabel.setText(px.getCellNo());
        }catch(Exception e){
            contactNumberLabel.setText("");
        }
        
        if(px.getGender() == 'M'){
            genderLabel.setText("Male");
        } else {
            genderLabel.setText("Female");
        }
        
        Calendar now = Calendar.getInstance();
        int age = 0;
        if(px.getBdate().isSet(Calendar.YEAR)){
            age = now.get(Calendar.YEAR)-px.getBdate().get(Calendar.YEAR);
        }
        
        ageLabel.setText(String.valueOf(age));
        if(px.getHomeAddress().isEmpty()){
            addressLabel.setText("");
        } else {
            addressLabel.setText(px.getHomeAddress());
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillingPanel = new javax.swing.JPanel();
        personalInformationPanel = new javax.swing.JPanel();
        patientPhotoPanel = new javax.swing.JPanel();
        patientNameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        transactionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionsTable = new javax.swing.JTable();
        detailsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();

        personalInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Information"));

        patientPhotoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout patientPhotoPanelLayout = new javax.swing.GroupLayout(patientPhotoPanel);
        patientPhotoPanel.setLayout(patientPhotoPanelLayout);
        patientPhotoPanelLayout.setHorizontalGroup(
            patientPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        patientPhotoPanelLayout.setVerticalGroup(
            patientPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        patientNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patientNameLabel.setText("Last, First MI.");

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressLabel.setText("Address...");

        contactNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contactNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        contactNumberLabel.setText("09123456789");

        genderLabel.setText("Gender...");

        ageLabel.setText("00 years old...");

        javax.swing.GroupLayout personalInformationPanelLayout = new javax.swing.GroupLayout(personalInformationPanel);
        personalInformationPanel.setLayout(personalInformationPanelLayout);
        personalInformationPanelLayout.setHorizontalGroup(
            personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientPhotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contactNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalInformationPanelLayout.createSequentialGroup()
                        .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(personalInformationPanelLayout.createSequentialGroup()
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        personalInformationPanelLayout.setVerticalGroup(
            personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalInformationPanelLayout.createSequentialGroup()
                        .addComponent(patientPhotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(personalInformationPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(ageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addressLabel)
                        .addGap(21, 21, 21))))
        );

        transactionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Transaction"));

        transactionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Total Amount Charged", "Total Amount Paid", "Discounted", "Status"
            }
        ));
        transactionsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        transactionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(transactionsTable);

        javax.swing.GroupLayout transactionPanelLayout = new javax.swing.GroupLayout(transactionPanel);
        transactionPanel.setLayout(transactionPanelLayout);
        transactionPanelLayout.setHorizontalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        transactionPanelLayout.setVerticalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );

        detailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Treatment Done", "Tooth No.", "Amount Charged", "Amount Paid", "Outstanding Balance"
            }
        ));
        detailsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(detailsTable);

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BillingPanelLayout = new javax.swing.GroupLayout(BillingPanel);
        BillingPanel.setLayout(BillingPanelLayout);
        BillingPanelLayout.setHorizontalGroup(
            BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personalInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BillingPanelLayout.setVerticalGroup(
            BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(transactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transactionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionsTableMouseClicked
        evt.getButton();
      JPopupMenu menu = new JPopupMenu("Popup");
      menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            }
        });
      JMenuItem menuItem1 = new JMenuItem("Set schedule of payment");
      menuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JFrame paymentSchedContainer = new JFrame();
                paymentSchedContainer.setSize(440, 480);
                paymentSchedContainer.setLocationRelativeTo(null);
                paymentSchedContainer.setResizable(false);
                SetPaymentSchedule paymentSched = new SetPaymentSchedule();
                paymentSchedContainer.add(paymentSched);
                paymentSchedContainer.setVisible(true);
                paymentSched.setVisible(true);
            }
        });
      menu.add(menuItem1);
      if(evt.getButton() == 3){
          menu.show(evt.getComponent(), evt.getX(), evt.getY());
          menu.setVisible(true);
      }
      evt.consume();
    }//GEN-LAST:event_transactionsTableMouseClicked
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillingPanel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JTable detailsTable;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JPanel patientPhotoPanel;
    private javax.swing.JPanel personalInformationPanel;
    private javax.swing.JPanel transactionPanel;
    private javax.swing.JTable transactionsTable;
    // End of variables declaration//GEN-END:variables
}