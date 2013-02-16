
package GUI;

import Logic.LogicController;
import Logic.Itinerary.Itinerary;
import Logic.Itinerary.ItineraryItem;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/*
 * @author hongwei
 */
public class EditItineraryItem extends javax.swing.JDialog {

    Itinerary myItinerary;
    ItineraryItem myItineraryItem;
    
    /** Creates new form AddItineraryItem */
    public EditItineraryItem(java.awt.Dialog parent, boolean modal, Itinerary pl, ItineraryItem pli) {
        super(parent, modal);
        initComponents();
        myItinerary = pl;
        myItineraryItem = pli;
        
        TitleText.setText(pli.getName());
        GregorianCalendar d = new GregorianCalendar();
        
        d.setTime(pli.getDate());
        FromHour.setSelectedIndex(d.get(GregorianCalendar.HOUR_OF_DAY));
        FromMinute.setSelectedItem((d.get(GregorianCalendar.MINUTE)+""));
        
        d.setTime(pli.getEndDate());
        ToHour.setSelectedIndex(d.get(GregorianCalendar.HOUR_OF_DAY));
        ToMinute.setSelectedItem((d.get(GregorianCalendar.MINUTE)+""));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBudgetCategoryBackground = new javax.swing.JPanel();
        SubmitItineraryItemButton = new javax.swing.JButton();
        TitleText = new javax.swing.JTextField();
        TitleLabel = new javax.swing.JLabel();
        FromHour = new javax.swing.JComboBox();
        ToHour = new javax.swing.JComboBox();
        ToMinute = new javax.swing.JComboBox();
        EndTimeLabel = new javax.swing.JLabel();
        FromMinute = new javax.swing.JComboBox();
        StartTimeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        AddBudgetCategoryBackground.setBackground(new java.awt.Color(227, 227, 227));
        AddBudgetCategoryBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        AddBudgetCategoryBackground.setLayout(null);

        SubmitItineraryItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png"))); // NOI18N
        SubmitItineraryItemButton.setBorderPainted(false);
        SubmitItineraryItemButton.setContentAreaFilled(false);
        SubmitItineraryItemButton.setFocusPainted(false);
        SubmitItineraryItemButton.setFocusable(false);
        SubmitItineraryItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmitItineraryItemButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubmitItineraryItemButtonMousePressed(evt);
            }
        });
        SubmitItineraryItemButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SubmitItineraryItemButtonMouseMoved(evt);
            }
        });
        SubmitItineraryItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitItineraryItemButtonActionPerformed(evt);
            }
        });
        AddBudgetCategoryBackground.add(SubmitItineraryItemButton);
        SubmitItineraryItemButton.setBounds(270, 100, 38, 38);

        TitleText.setFont(new java.awt.Font("Ubuntu", 0, 14));
        TitleText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        TitleText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        TitleText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TitleText.setSelectionColor(new java.awt.Color(255, 204, 51));
        TitleText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TitleTextFocusGained(evt);
            }
        });
        TitleText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TitleTextKeyTyped(evt);
            }
        });
        AddBudgetCategoryBackground.add(TitleText);
        TitleText.setBounds(10, 30, 295, 33);
        TitleText.setBorder(BorderFactory.createCompoundBorder(
            TitleText.getBorder(),
            BorderFactory.createEmptyBorder(0, 5, 0, 5)));

    TitleLabel.setFont(new java.awt.Font("Ubuntu Bold", 1, 14));
    TitleLabel.setText("Title:");
    AddBudgetCategoryBackground.add(TitleLabel);
    TitleLabel.setBounds(20, 10, 100, 14);

    FromHour.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
    FromHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am", "12noon", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm" }));
    FromHour.setBorder(null);
    FromHour.setFocusable(false);
    AddBudgetCategoryBackground.add(FromHour);
    FromHour.setBounds(70, 80, 60, 19);

    ToHour.setFont(new java.awt.Font("Ubuntu", 0, 11));
    ToHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am", "12noon", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm" }));
    ToHour.setBorder(null);
    ToHour.setFocusable(false);
    AddBudgetCategoryBackground.add(ToHour);
    ToHour.setBounds(70, 110, 60, 19);

    ToMinute.setFont(new java.awt.Font("Ubuntu", 0, 11));
    ToMinute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
    ToMinute.setBorder(null);
    ToMinute.setFocusable(false);
    AddBudgetCategoryBackground.add(ToMinute);
    ToMinute.setBounds(140, 110, 36, 19);

    EndTimeLabel.setFont(new java.awt.Font("Ubuntu", 1, 14));
    EndTimeLabel.setText("End:");
    AddBudgetCategoryBackground.add(EndTimeLabel);
    EndTimeLabel.setBounds(20, 110, 50, 19);

    FromMinute.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
    FromMinute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
    FromMinute.setBorder(null);
    FromMinute.setFocusable(false);
    AddBudgetCategoryBackground.add(FromMinute);
    FromMinute.setBounds(140, 80, 36, 19);

    StartTimeLabel.setFont(new java.awt.Font("Ubuntu", 1, 14));
    StartTimeLabel.setText("Start:");
    AddBudgetCategoryBackground.add(StartTimeLabel);
    StartTimeLabel.setBounds(20, 80, 50, 19);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(AddBudgetCategoryBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(AddBudgetCategoryBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitItineraryItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitItineraryItemButtonActionPerformed
        GregorianCalendar start = new GregorianCalendar(2005,1,1);
        start.set(GregorianCalendar.HOUR_OF_DAY, FromHour.getSelectedIndex());    
        start.set(GregorianCalendar.MINUTE, Integer.parseInt((String)FromMinute.getSelectedItem()));
        start.set(GregorianCalendar.SECOND,0);
        start.set(GregorianCalendar.MILLISECOND,0); 
        
        GregorianCalendar end = new GregorianCalendar(2005,1,1);
        end.set(GregorianCalendar.HOUR_OF_DAY, ToHour.getSelectedIndex());    
        end.set(GregorianCalendar.MINUTE, Integer.parseInt((String)ToMinute.getSelectedItem()));
        end.set(GregorianCalendar.SECOND,0);
        end.set(GregorianCalendar.MILLISECOND,0);
        
        try {
            LogicController.addItineraryItem(myItinerary, TitleText.getText(), start.getTime(), end.getTime());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "..", "Oops!", JOptionPane.PLAIN_MESSAGE);             
            return;
        }        
        
        try {
            LogicController.deleteItineraryItem(myItineraryItem);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "..", "Unexpected error!", JOptionPane.PLAIN_MESSAGE);             
            return;
        }
      
        this.dispose();
        
    }//GEN-LAST:event_SubmitItineraryItemButtonActionPerformed

    private void SubmitItineraryItemButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitItineraryItemButtonMouseExited
        SubmitItineraryItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png"))); 
    }//GEN-LAST:event_SubmitItineraryItemButtonMouseExited

    private void SubmitItineraryItemButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitItineraryItemButtonMouseMoved
        int x = evt.getX();
        int y = evt.getY();
        double dx = SubmitItineraryItemButton.getWidth()/2 - x;
        double dy = SubmitItineraryItemButton.getHeight()/2 - y;
        double sr = Math.sqrt(dx*dx + dy*dy );
        if (sr <= SubmitItineraryItemButton.getWidth()/2)
            SubmitItineraryItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbuttonhover.png")));
        else
            SubmitItineraryItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png")));
    }//GEN-LAST:event_SubmitItineraryItemButtonMouseMoved

    private void TitleTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TitleTextKeyTyped
        if (evt.getKeyChar() == 10){
            GregorianCalendar start = new GregorianCalendar(2005,1,1);
            start.set(GregorianCalendar.HOUR_OF_DAY, FromHour.getSelectedIndex());    
            start.set(GregorianCalendar.MINUTE, Integer.parseInt((String)FromMinute.getSelectedItem()));
            start.set(GregorianCalendar.SECOND,0);
            start.set(GregorianCalendar.MILLISECOND,0); 

            GregorianCalendar end = new GregorianCalendar(2005,1,1);
            end.set(GregorianCalendar.HOUR_OF_DAY, ToHour.getSelectedIndex());    
            end.set(GregorianCalendar.MINUTE, Integer.parseInt((String)ToMinute.getSelectedItem()));
            end.set(GregorianCalendar.SECOND,0);
            end.set(GregorianCalendar.MILLISECOND,0);
            
            try {
                LogicController.addItineraryItem(myItinerary, TitleText.getText(), start.getTime(), end.getTime());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage() + "..", "Oops!", JOptionPane.PLAIN_MESSAGE);             
                return;
            }
            
            try {
                LogicController.deleteItineraryItem(myItineraryItem);
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage() + "..", "Unexpected error!", JOptionPane.PLAIN_MESSAGE);             
                return;
            }

            this.dispose();
            
        }
    }//GEN-LAST:event_TitleTextKeyTyped

    private void TitleTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TitleTextFocusGained
        TitleText.setSelectionStart(0);
        TitleText.setSelectionEnd(TitleText.getText().length());
    }//GEN-LAST:event_TitleTextFocusGained

        private void SubmitItineraryItemButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitItineraryItemButtonMousePressed
        SubmitItineraryItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbuttonclick.png"))); 
    }//GEN-LAST:event_SubmitItineraryItemButtonMousePressed
    
    
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
            java.util.logging.Logger.getLogger(AddBudgetCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBudgetCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBudgetCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBudgetCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                EditItineraryItem dialog = new EditItineraryItem(new javax.swing.JDialog(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddBudgetCategoryBackground;
    private javax.swing.JLabel EndTimeLabel;
    private javax.swing.JComboBox FromHour;
    private javax.swing.JComboBox FromMinute;
    private javax.swing.JLabel StartTimeLabel;
    private javax.swing.JButton SubmitItineraryItemButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField TitleText;
    private javax.swing.JComboBox ToHour;
    private javax.swing.JComboBox ToMinute;
    // End of variables declaration//GEN-END:variables
}
