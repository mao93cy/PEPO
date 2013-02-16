
package GUI;

import Logic.LogicController;
import Logic.Venue.Venue;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/*
 * @author kuan
 */
public class AddVenueBooking extends javax.swing.JDialog {

    /** Creates new form AddVenueBooking2 */
    public AddVenueBooking(java.awt.Frame parent, boolean modal, Venue v) {
        super(parent, modal);
        initComponents();
        venue = v;
        VenueText.setText(venue.getName());
        CapacityText.setText(venue.getCapacity()+"");
        FacultyText.setText(venue.getFaculty());
        TypeText.setText(venue.getType());
        StartCalendar.setDate(new Date(System.currentTimeMillis()));
        EndCalendar.setDate(new Date(System.currentTimeMillis()));
        StartHour.setSelectedIndex(8);
        EndHour.setSelectedIndex(9);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddVenueBookingBackground = new javax.swing.JPanel();
        VenueLabel = new javax.swing.JLabel();
        CapacityLabel = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        FacultyLabel = new javax.swing.JLabel();
        VenueText = new javax.swing.JTextField();
        CapacityText = new javax.swing.JTextField();
        TypeText = new javax.swing.JTextField();
        FacultyText = new javax.swing.JTextField();
        StartLabel = new javax.swing.JLabel();
        EndLabel = new javax.swing.JLabel();
        DoneButton = new javax.swing.JButton();
        StartCalendar = new com.toedter.calendar.JDateChooser();
        EndCalendar = new com.toedter.calendar.JDateChooser();
        StartHour = new javax.swing.JComboBox();
        EndHour = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        AddVenueBookingBackground.setBackground(new java.awt.Color(227, 227, 227));
        AddVenueBookingBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        AddVenueBookingBackground.setLayout(null);

        VenueLabel.setFont(new java.awt.Font("Ubuntu Bold", 0, 14));
        VenueLabel.setText("Venue:");
        AddVenueBookingBackground.add(VenueLabel);
        VenueLabel.setBounds(20, 20, 60, 33);

        CapacityLabel.setFont(new java.awt.Font("Ubuntu Bold", 0, 14));
        CapacityLabel.setText("Capacity:");
        AddVenueBookingBackground.add(CapacityLabel);
        CapacityLabel.setBounds(20, 60, 70, 33);

        TypeLabel.setFont(new java.awt.Font("Ubuntu Bold", 0, 14));
        TypeLabel.setText("Type:");
        AddVenueBookingBackground.add(TypeLabel);
        TypeLabel.setBounds(20, 100, 50, 33);

        FacultyLabel.setFont(new java.awt.Font("Ubuntu Bold", 0, 14));
        FacultyLabel.setText("Faculty:");
        AddVenueBookingBackground.add(FacultyLabel);
        FacultyLabel.setBounds(20, 140, 60, 33);

        VenueText.setBackground(new java.awt.Color(51, 51, 51));
        VenueText.setEditable(false);
        VenueText.setFont(new java.awt.Font("Ubuntu", 0, 14));
        VenueText.setForeground(new java.awt.Color(255, 255, 255));
        VenueText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        VenueText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        VenueText.setSelectionColor(new java.awt.Color(255, 204, 51));
        AddVenueBookingBackground.add(VenueText);
        VenueText.setBounds(100, 20, 248, 33);
        VenueText.setBorder(BorderFactory.createCompoundBorder(
            VenueText.getBorder(),
            BorderFactory.createEmptyBorder(0, 5, 0, 5)));

    CapacityText.setBackground(new java.awt.Color(51, 51, 51));
    CapacityText.setEditable(false);
    CapacityText.setFont(new java.awt.Font("Ubuntu", 0, 14));
    CapacityText.setForeground(new java.awt.Color(255, 255, 255));
    CapacityText.setMargin(new java.awt.Insets(5, 5, 5, 5));
    CapacityText.setSelectedTextColor(new java.awt.Color(255, 204, 51));
    CapacityText.setSelectionColor(new java.awt.Color(255, 255, 255));
    AddVenueBookingBackground.add(CapacityText);
    CapacityText.setBounds(100, 60, 248, 33);
    CapacityText.setBorder(BorderFactory.createCompoundBorder(
        CapacityText.getBorder(),
        BorderFactory.createEmptyBorder(0, 5, 0, 5)));

TypeText.setBackground(new java.awt.Color(51, 51, 51));
TypeText.setEditable(false);
TypeText.setFont(new java.awt.Font("Ubuntu", 0, 14));
TypeText.setForeground(new java.awt.Color(255, 255, 255));
TypeText.setMargin(new java.awt.Insets(5, 5, 5, 5));
TypeText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
TypeText.setSelectionColor(new java.awt.Color(255, 204, 51));
AddVenueBookingBackground.add(TypeText);
TypeText.setBounds(100, 100, 248, 33);
TypeText.setBorder(BorderFactory.createCompoundBorder(
    TypeText.getBorder(),
    BorderFactory.createEmptyBorder(0, 5, 0, 5)));

    FacultyText.setBackground(new java.awt.Color(51, 51, 51));
    FacultyText.setEditable(false);
    FacultyText.setFont(new java.awt.Font("Ubuntu", 0, 14));
    FacultyText.setForeground(new java.awt.Color(255, 255, 255));
    FacultyText.setMargin(new java.awt.Insets(5, 5, 5, 5));
    FacultyText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
    FacultyText.setSelectionColor(new java.awt.Color(255, 204, 51));
    AddVenueBookingBackground.add(FacultyText);
    FacultyText.setBounds(100, 140, 248, 33);
    FacultyText.setBorder(BorderFactory.createCompoundBorder(
        FacultyText.getBorder(),
        BorderFactory.createEmptyBorder(0, 5, 0, 5)));

StartLabel.setFont(new java.awt.Font("Ubuntu Bold", 0, 14));
StartLabel.setText("Start:");
AddVenueBookingBackground.add(StartLabel);
StartLabel.setBounds(20, 190, 50, 30);

EndLabel.setFont(new java.awt.Font("Ubuntu Bold", 0, 14));
EndLabel.setText("End:");
AddVenueBookingBackground.add(EndLabel);
EndLabel.setBounds(20, 230, 50, 30);

DoneButton.setBackground(new java.awt.Color(255, 255, 255));
DoneButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
DoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png"))); // NOI18N
DoneButton.setBorder(null);
DoneButton.setBorderPainted(false);
DoneButton.setContentAreaFilled(false);
DoneButton.setFocusable(false);
DoneButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
DoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseExited(java.awt.event.MouseEvent evt) {
        DoneButtonMouseExited(evt);
    }
    public void mousePressed(java.awt.event.MouseEvent evt) {
        DoneButtonMousePressed(evt);
    }
    });
    DoneButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
        public void mouseMoved(java.awt.event.MouseEvent evt) {
            DoneButtonMouseMoved(evt);
        }
    });
    DoneButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            DoneButtonActionPerformed(evt);
        }
    });
    AddVenueBookingBackground.add(DoneButton);
    DoneButton.setBounds(320, 220, 39, 39);
    AddVenueBookingBackground.add(StartCalendar);
    StartCalendar.setBounds(100, 190, 129, 30);
    StartCalendar.setDate(new Date());

    EndCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            EndCalendarPropertyChange(evt);
        }
    });
    AddVenueBookingBackground.add(EndCalendar);
    EndCalendar.setBounds(100, 230, 129, 30);
    StartCalendar.setDate(new Date());

    StartHour.setFont(new java.awt.Font("Ubuntu", 0, 11));
    StartHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am", "12noon", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm" }));
    StartHour.setBorder(null);
    StartHour.setFocusable(false);
    AddVenueBookingBackground.add(StartHour);
    StartHour.setBounds(240, 190, 60, 30);

    EndHour.setFont(new java.awt.Font("Ubuntu", 0, 11));
    EndHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am", "12noon", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm" }));
    EndHour.setBorder(null);
    EndHour.setFocusable(false);
    AddVenueBookingBackground.add(EndHour);
    EndHour.setBounds(240, 230, 60, 30);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(AddVenueBookingBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(AddVenueBookingBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        if (StartCalendar.getDate() == null || EndCalendar.getDate() == null){
            JOptionPane.showMessageDialog(this, "Dates seems to be wrong...", "Oops!", JOptionPane.PLAIN_MESSAGE);
            return;
        }
            
        GregorianCalendar start = new GregorianCalendar();
        start.setTime(StartCalendar.getDate());
        start.set(GregorianCalendar.HOUR_OF_DAY, StartHour.getSelectedIndex());    
        start.set(GregorianCalendar.MINUTE, 0);
        start.set(GregorianCalendar.SECOND,0);
        start.set(GregorianCalendar.MILLISECOND,0); 
        
        GregorianCalendar end = new GregorianCalendar();
        end.setTime(EndCalendar.getDate());
        end.set(GregorianCalendar.HOUR_OF_DAY, EndHour.getSelectedIndex());    
        end.set(GregorianCalendar.MINUTE, 0);
        end.set(GregorianCalendar.SECOND,0);
        end.set(GregorianCalendar.MILLISECOND,0); 
        
        try {
            LogicController.addVenueBooking(venue, start.getTime(), end.getTime());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage()+"..", "Oops!", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        this.dispose();
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void DoneButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseExited
        DoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png")));
    }//GEN-LAST:event_DoneButtonMouseExited

    private void DoneButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseMoved
        int x = evt.getX();
        int y = evt.getY();
        double dx = DoneButton.getWidth()/2 - x;
        double dy = DoneButton.getHeight()/2 - y;
        double sr = Math.sqrt(dx*dx + dy*dy );
        if (sr <= DoneButton.getWidth()/2)
            DoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbuttonhover.png")));
        else
            DoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png")));
    }//GEN-LAST:event_DoneButtonMouseMoved

    private void EndCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_EndCalendarPropertyChange

    }//GEN-LAST:event_EndCalendarPropertyChange

    private void DoneButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMousePressed
        DoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbuttonclick.png")));
    }//GEN-LAST:event_DoneButtonMousePressed

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
            java.util.logging.Logger.getLogger(AddVenueBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVenueBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVenueBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVenueBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AddVenueBooking dialog = new AddVenueBooking(new javax.swing.JFrame(), true,null);
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
    
    Venue venue;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddVenueBookingBackground;
    private javax.swing.JLabel CapacityLabel;
    private javax.swing.JTextField CapacityText;
    private javax.swing.JButton DoneButton;
    private static com.toedter.calendar.JDateChooser EndCalendar;
    private javax.swing.JComboBox EndHour;
    private javax.swing.JLabel EndLabel;
    private javax.swing.JLabel FacultyLabel;
    private javax.swing.JTextField FacultyText;
    private static com.toedter.calendar.JDateChooser StartCalendar;
    private javax.swing.JComboBox StartHour;
    private javax.swing.JLabel StartLabel;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JTextField TypeText;
    private javax.swing.JLabel VenueLabel;
    private javax.swing.JTextField VenueText;
    // End of variables declaration//GEN-END:variables
}
