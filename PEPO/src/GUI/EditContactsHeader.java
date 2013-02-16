
package GUI;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * @author kuan
 */
public class EditContactsHeader extends javax.swing.JDialog {

    /** Creates new form AddBudgetCategory */
    public EditContactsHeader(java.awt.Frame parent, boolean modal, ArrayList<String> hlist) {
        super(parent, modal);
        initComponents();

        
        ((DefaultTableModel) AttributeTable.getModel()).setRowCount(hlist.size());
        for (int i = 0; i < hlist.size(); i++)
            AttributeTable.setValueAt(hlist.get(i), i, 0);
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
        AddAttributeButton = new javax.swing.JButton();
        AttributeTableBackground = new javax.swing.JScrollPane();
        AttributeTable = new javax.swing.JTable();
        DeleteAttributeButton = new javax.swing.JButton();
        SubmitAttributeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        AddBudgetCategoryBackground.setBackground(new java.awt.Color(227, 227, 227));
        AddBudgetCategoryBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        AddAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbutton.png"))); // NOI18N
        AddAttributeButton.setBorderPainted(false);
        AddAttributeButton.setContentAreaFilled(false);
        AddAttributeButton.setFocusable(false);
        AddAttributeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddAttributeButtonMouseExited(evt);
            }
        });
        AddAttributeButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddAttributeButtonMouseMoved(evt);
            }
        });
        AddAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAttributeButtonActionPerformed(evt);
            }
        });

        AttributeTableBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        AttributeTable.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        AttributeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attribute"
            }
        ));
        AttributeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AttributeTable.setFocusable(false);
        AttributeTable.setIntercellSpacing(new java.awt.Dimension(0, 1));
        AttributeTable.setRowHeight(20);
        AttributeTable.setSelectionBackground(new java.awt.Color(255, 204, 51));
        AttributeTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        AttributeTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        AttributeTableBackground.setViewportView(AttributeTable);
        AttributeTable.getTableHeader().setFont(new java.awt.Font("Ubuntu Bold", 0, 14));
        AttributeTable.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer newrendererheaders = new DefaultTableCellRenderer();
        newrendererheaders.setBackground(new Color(51,51,51));
        newrendererheaders.setForeground(Color.white);
        AttributeTable.getTableHeader().setDefaultRenderer(newrendererheaders);

        DeleteAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deletebutton.png"))); // NOI18N
        DeleteAttributeButton.setBorderPainted(false);
        DeleteAttributeButton.setContentAreaFilled(false);
        DeleteAttributeButton.setFocusable(false);
        DeleteAttributeButton.setMargin(new java.awt.Insets(1, 14, 1, 14));
        DeleteAttributeButton.setMaximumSize(new java.awt.Dimension(41, 41));
        DeleteAttributeButton.setMinimumSize(new java.awt.Dimension(41, 41));
        DeleteAttributeButton.setPreferredSize(new java.awt.Dimension(41, 41));
        DeleteAttributeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteAttributeButtonMouseExited(evt);
            }
        });
        DeleteAttributeButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DeleteAttributeButtonMouseMoved(evt);
            }
        });
        DeleteAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAttributeButtonActionPerformed(evt);
            }
        });

        SubmitAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png"))); // NOI18N
        SubmitAttributeButton.setBorderPainted(false);
        SubmitAttributeButton.setContentAreaFilled(false);
        SubmitAttributeButton.setFocusable(false);
        SubmitAttributeButton.setMargin(new java.awt.Insets(1, 14, 1, 14));
        SubmitAttributeButton.setMaximumSize(new java.awt.Dimension(41, 41));
        SubmitAttributeButton.setMinimumSize(new java.awt.Dimension(41, 41));
        SubmitAttributeButton.setPreferredSize(new java.awt.Dimension(41, 41));
        SubmitAttributeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmitAttributeButtonMouseExited(evt);
            }
        });
        SubmitAttributeButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SubmitAttributeButtonMouseMoved(evt);
            }
        });
        SubmitAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitAttributeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddBudgetCategoryBackgroundLayout = new javax.swing.GroupLayout(AddBudgetCategoryBackground);
        AddBudgetCategoryBackground.setLayout(AddBudgetCategoryBackgroundLayout);
        AddBudgetCategoryBackgroundLayout.setHorizontalGroup(
            AddBudgetCategoryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddBudgetCategoryBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AttributeTableBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddBudgetCategoryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitAttributeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddAttributeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteAttributeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        AddBudgetCategoryBackgroundLayout.setVerticalGroup(
            AddBudgetCategoryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBudgetCategoryBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddBudgetCategoryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AttributeTableBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddBudgetCategoryBackgroundLayout.createSequentialGroup()
                        .addComponent(AddAttributeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteAttributeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitAttributeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddBudgetCategoryBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddBudgetCategoryBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAttributeButtonActionPerformed
       ((DefaultTableModel) AttributeTable.getModel()).setRowCount(AttributeTable.getRowCount()+1);
        AttributeTable.getSelectionModel().setSelectionInterval(AttributeTable.getRowCount()-1, AttributeTable.getRowCount()-1);
        AttributeTable.scrollRectToVisible(new Rectangle(AttributeTable.getCellRect(AttributeTable.getRowCount()-1, 0, true)));
        AttributeTable.getModel().setValueAt("New Attribute", AttributeTable.getRowCount()-1, 0);
        AttributeTable.grabFocus();
        AttributeTable.setRowSelectionInterval(AttributeTable.getRowCount()-1, AttributeTable.getRowCount()-1);
        

        //AttributeTable.editCellAt(AttributeTable.getRowCount()-1, 0);
        
    }//GEN-LAST:event_AddAttributeButtonActionPerformed

        private void SubmitAttributeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitAttributeButtonMouseExited
        SubmitAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png")));
    }//GEN-LAST:event_SubmitAttributeButtonMouseExited

    private void SubmitAttributeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitAttributeButtonMouseMoved
        int x = evt.getX();
        int y = evt.getY();
        double dx = SubmitAttributeButton.getWidth()/2 - x;
        double dy = SubmitAttributeButton.getHeight()/2 - y;
        double sr = Math.sqrt(dx*dx + dy*dy );
        if (sr <= SubmitAttributeButton.getWidth()/2)
            SubmitAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbuttonhover.png")));
        else
            SubmitAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitbutton.png")));
    }//GEN-LAST:event_SubmitAttributeButtonMouseMoved

    private void SubmitAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitAttributeButtonActionPerformed
        if (AttributeTable.getCellEditor() != null)
                AttributeTable.getCellEditor().stopCellEditing();  
        
        ArrayList<String> headers = new ArrayList<>();
        for (int i = 0; i < AttributeTable.getRowCount(); i++){
            if (AttributeTable.getModel().getValueAt(i,0) == null)
                headers.add("");
            else
                headers.add((String)AttributeTable.getModel().getValueAt(i,0));
        }

        if (headers.size() < start){
            int n = JOptionPane.showConfirmDialog(this,
            "Confirm?",
            "Confirmation",
            JOptionPane.YES_NO_OPTION);
            if (n == 0){
                JTable t = PEPOGUI.getContactsTable();
                ((DefaultTableModel) t.getModel()).setColumnCount(headers.size()+2);
               
                for (int i = 0 ; i < headers.size(); i++)
                    t.getColumn(i).setHeaderValue(headers.get(i));
                this.dispose();
            }  
        } else {
            JTable t = PEPOGUI.getContactsTable();
            ((DefaultTableModel) t.getModel()).setColumnCount(headers.size()+2);

            for (int i = 0 ; i < headers.size(); i++)
                t.getColumnModel().getColumn(i+2).setHeaderValue(headers.get(i));
            this.dispose();
        }
        
    }//GEN-LAST:event_SubmitAttributeButtonActionPerformed

    private void DeleteAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAttributeButtonActionPerformed
        if (AttributeTable.getSelectedRow() >= 0)
            ((DefaultTableModel) AttributeTable.getModel()).removeRow(AttributeTable.getSelectedRow());
    }//GEN-LAST:event_DeleteAttributeButtonActionPerformed

    private void AddAttributeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAttributeButtonMouseExited
        AddAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbutton.png")));
    }//GEN-LAST:event_AddAttributeButtonMouseExited

    private void DeleteAttributeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAttributeButtonMouseExited
        DeleteAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deletebutton.png")));
    }//GEN-LAST:event_DeleteAttributeButtonMouseExited

    private void AddAttributeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAttributeButtonMouseMoved
        int x = evt.getX();
        int y = evt.getY();
        double dx = AddAttributeButton.getWidth()/2 - x;
        double dy = AddAttributeButton.getHeight()/2 - y;
        double sr = Math.sqrt(dx*dx + dy*dy );
        if (sr <= AddAttributeButton.getWidth()/2)
            AddAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbuttonhover.png")));
        else
            AddAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addbutton.png")));
    }//GEN-LAST:event_AddAttributeButtonMouseMoved

    private void DeleteAttributeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAttributeButtonMouseMoved
        int x = evt.getX();
        int y = evt.getY();
        double dx = DeleteAttributeButton.getWidth()/2 - x;
        double dy = DeleteAttributeButton.getHeight()/2 - y;
        double sr = Math.sqrt(dx*dx + dy*dy );
        if (sr <= DeleteAttributeButton.getWidth()/2)
            DeleteAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deletebuttonhover.png")));
        else
            DeleteAttributeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deletebutton.png")));
    }//GEN-LAST:event_DeleteAttributeButtonMouseMoved

    
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
            java.util.logging.Logger.getLogger(EditContactsHeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditContactsHeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditContactsHeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditContactsHeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                EditContactsHeader dialog = new EditContactsHeader(new javax.swing.JFrame(), true,null);
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
    
    int start;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAttributeButton;
    private javax.swing.JPanel AddBudgetCategoryBackground;
    private javax.swing.JTable AttributeTable;
    private javax.swing.JScrollPane AttributeTableBackground;
    private static javax.swing.JButton DeleteAttributeButton;
    private static javax.swing.JButton SubmitAttributeButton;
    // End of variables declaration//GEN-END:variables
}
