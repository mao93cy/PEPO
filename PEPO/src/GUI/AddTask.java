
package GUI;

import Logic.Event.Event;
import Logic.LogicController;
import Logic.Memo.Task;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/*
 * @author kuan
 */
public class AddTask extends javax.swing.JDialog {

    /** Creates new form AddEventDay */
    public AddTask(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        events = LogicController.getEventList();
        EventDropDown.addItem("");
        for (int i =0 ; i < events.size(); i++)
            EventDropDown.addItem(events.get(i).getTitle());
        AlertButton.setText("No Alert");
        AlertButton.setForeground(Color.LIGHT_GRAY);
        alerton = false;
        PriorityDropDown.setSelectedIndex(1);
        AlertCalendar.setVisible(false);
        AlertHour.setVisible(false);
        AlertMinute.setVisible(false);
        
        DeadlineCalendar.setDate(new Date(System.currentTimeMillis()));
        AlertCalendar.setDate(new Date(System.currentTimeMillis()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        DescriptionLabel = new javax.swing.JLabel();
        PriorityLabel = new javax.swing.JLabel();
        DescriptionText = new javax.swing.JTextField();
        DoneButton = new javax.swing.JButton();
        PriorityDropDown = new javax.swing.JComboBox();
        EventLabel = new javax.swing.JLabel();
        EventDropDown = new javax.swing.JComboBox();
        AlertButton = new javax.swing.JButton();
        DeadlineHour = new javax.swing.JComboBox();
        DeadlineMinute = new javax.swing.JComboBox();
        DeadlineCalendar = new com.toedter.calendar.JDateChooser();
        DeadlineLabel1 = new javax.swing.JLabel();
        AlertCalendar = new com.toedter.calendar.JDateChooser();
        AlertHour = new javax.swing.JComboBox();
        AlertMinute = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setResizable(false);

        Background.setBackground(new java.awt.Color(227, 227, 227));
        Background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Background.setFocusable(false);
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DescriptionLabel.setFont(new java.awt.Font("Ubuntu", 1, 14));
        DescriptionLabel.setText("Description:");
        Background.add(DescriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        PriorityLabel.setFont(new java.awt.Font("Ubuntu", 1, 14));
        PriorityLabel.setText("Priority:");
        Background.add(PriorityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, 30));

        DescriptionText.setFont(new java.awt.Font("Ubuntu", 0, 14));
        DescriptionText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        DescriptionText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        DescriptionText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DescriptionText.setSelectionColor(new java.awt.Color(255, 204, 51));
        DescriptionText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescriptionTextKeyTyped(evt);
            }
        });
        Background.add(DescriptionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 310, 33));
        DescriptionText.setBorder(BorderFactory.createCompoundBorder(
            DescriptionText.getBorder(),
            BorderFactory.createEmptyBorder(0, 5, 0, 5)));

    DoneButton.setBackground(new java.awt.Color(255, 255, 255));
    DoneButton.setFont(new java.awt.Font("Segoe Print", 1, 14));
    DoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png"))); // NOI18N
    DoneButton.setBorder(null);
    DoneButton.setBorderPainted(false);
    DoneButton.setContentAreaFilled(false);
    DoneButton.setFocusPainted(false);
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
    Background.add(DoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 38, 38));

    PriorityDropDown.setFont(new java.awt.Font("Ubuntu", 0, 14));
    PriorityDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Med", "Low" }));
    PriorityDropDown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    PriorityDropDown.setFocusable(false);
    Background.add(PriorityDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, 30));

    EventLabel.setFont(new java.awt.Font("Ubuntu", 1, 14));
    EventLabel.setText("Event:");
    Background.add(EventLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 30));

    EventDropDown.setFont(new java.awt.Font("Ubuntu", 0, 14));
    EventDropDown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    EventDropDown.setFocusable(false);
    Background.add(EventDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 190, 30));

    AlertButton.setFont(new java.awt.Font("Ubuntu", 0, 11));
    AlertButton.setText("No Alert");
    AlertButton.setFocusable(false);
    AlertButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AlertButtonActionPerformed(evt);
        }
    });
    Background.add(AlertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

    DeadlineHour.setFont(new java.awt.Font("Ubuntu", 0, 11));
    DeadlineHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am", "12noon", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm" }));
    DeadlineHour.setBorder(null);
    DeadlineHour.setFocusable(false);
    Background.add(DeadlineHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

    DeadlineMinute.setFont(new java.awt.Font("Ubuntu", 0, 11));
    DeadlineMinute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
    DeadlineMinute.setBorder(null);
    DeadlineMinute.setFocusable(false);
    Background.add(DeadlineMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 60, -1));
    Background.add(DeadlineCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 110, 100, -1));

    DeadlineLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14));
    DeadlineLabel1.setText("Deadline:");
    Background.add(DeadlineLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
    Background.add(AlertCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 140, 100, -1));

    AlertHour.setFont(new java.awt.Font("Ubuntu", 0, 11));
    AlertHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am", "12noon", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm" }));
    AlertHour.setBorder(null);
    AlertHour.setFocusable(false);
    Background.add(AlertHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

    AlertMinute.setFont(new java.awt.Font("Ubuntu", 0, 11));
    AlertMinute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
    AlertMinute.setBorder(null);
    AlertMinute.setFocusable(false);
    Background.add(AlertMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 60, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        Event e = null;
        GregorianCalendar start = new GregorianCalendar();
        start.setTime(DeadlineCalendar.getDate());
        start.set(GregorianCalendar.HOUR_OF_DAY, DeadlineHour.getSelectedIndex());    
        start.set(GregorianCalendar.MINUTE, Integer.parseInt((String)DeadlineMinute.getSelectedItem()));
        start.set(GregorianCalendar.SECOND,0);
        start.set(GregorianCalendar.MILLISECOND,0); 

        if (EventDropDown.getSelectedIndex() > 0)
            e = events.get(EventDropDown.getSelectedIndex()-1);
        Task t;
        try {
            t = LogicController.addTask(e, DescriptionText.getText(), start.getTime(), PriorityDropDown.getSelectedIndex());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage()+"..", "Oops!", JOptionPane.PLAIN_MESSAGE);  
            return;
        }
        if (alerton){
            start = new GregorianCalendar();
            start.setTime(AlertCalendar.getDate());

            start.set(GregorianCalendar.HOUR_OF_DAY, AlertHour.getSelectedIndex());
            start.set(GregorianCalendar.MINUTE, Integer.parseInt((String)AlertMinute.getSelectedItem()));
            start.set(GregorianCalendar.SECOND,0);
            start.set(GregorianCalendar.MILLISECOND,0); 

            LogicController.addTaskAlert(t, start.getTime());        
        }
        
        this.dispose();
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void AlertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlertButtonActionPerformed
        if (AlertButton.getText().equals("Alert")){
            AlertButton.setText("No Alert");
            AlertButton.setForeground(Color.LIGHT_GRAY);
            AlertCalendar.setVisible(false);
            AlertHour.setVisible(false);
            AlertMinute.setVisible(false);
            alerton = false;
        } else {
            AlertButton.setText("Alert");
            AlertCalendar.setDate(new Date(System.currentTimeMillis()));
            AlertButton.setForeground(Color.BLACK);
            AlertCalendar.setVisible(true);
            AlertHour.setVisible(true);
            AlertMinute.setVisible(true);
            alerton = true;
        }
    }//GEN-LAST:event_AlertButtonActionPerformed

    private void DescriptionTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescriptionTextKeyTyped
        if (evt.getKeyChar() == 10){
            Event e = null;
            GregorianCalendar start = new GregorianCalendar();
            start.setTime(DeadlineCalendar.getDate());
            start.set(GregorianCalendar.HOUR_OF_DAY, DeadlineHour.getSelectedIndex());    
            start.set(GregorianCalendar.MINUTE, Integer.parseInt((String)DeadlineMinute.getSelectedItem()));
            start.set(GregorianCalendar.SECOND,0);
            start.set(GregorianCalendar.MILLISECOND,0); 

            if (EventDropDown.getSelectedIndex() > 0)
                e = events.get(EventDropDown.getSelectedIndex()-1);
            Task t;
            try {
                t = LogicController.addTask(e, DescriptionText.getText(), start.getTime(), PriorityDropDown.getSelectedIndex());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage()+"..", "Oops!", JOptionPane.PLAIN_MESSAGE);  
                return;
            }
            if (alerton){
                start = new GregorianCalendar();
                start.setTime(AlertCalendar.getDate());

                start.set(GregorianCalendar.HOUR_OF_DAY, AlertHour.getSelectedIndex());
                start.set(GregorianCalendar.MINUTE, Integer.parseInt((String)AlertMinute.getSelectedItem()));
                start.set(GregorianCalendar.SECOND,0);
                start.set(GregorianCalendar.MILLISECOND,0); 

                LogicController.addTaskAlert(t, start.getTime());  

            }
            this.dispose();
        }
    }//GEN-LAST:event_DescriptionTextKeyTyped

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
            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AddTask dialog = new AddTask(new javax.swing.JFrame(), true);
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
    
    boolean alerton = false;
    ArrayList<Event> events;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlertButton;
    private com.toedter.calendar.JDateChooser AlertCalendar;
    private javax.swing.JComboBox AlertHour;
    private javax.swing.JComboBox AlertMinute;
    private javax.swing.JPanel Background;
    private com.toedter.calendar.JDateChooser DeadlineCalendar;
    private javax.swing.JComboBox DeadlineHour;
    private javax.swing.JLabel DeadlineLabel1;
    private javax.swing.JComboBox DeadlineMinute;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionText;
    private javax.swing.JButton DoneButton;
    private javax.swing.JComboBox EventDropDown;
    private javax.swing.JLabel EventLabel;
    private javax.swing.JComboBox PriorityDropDown;
    private javax.swing.JLabel PriorityLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
