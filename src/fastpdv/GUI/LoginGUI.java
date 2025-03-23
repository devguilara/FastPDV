/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fastpdv.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author devguilara
 */
public class LoginGUI extends javax.swing.JFrame {
    
        private Timer timer;
        private int progress = 0;
        
    public LoginGUI() {

        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblUser = new javax.swing.JLabel();
        jlblPass = new javax.swing.JLabel();
        jbtnLogin = new javax.swing.JButton();
        jtxtUser = new javax.swing.JTextField();
        jtxtPass = new javax.swing.JPasswordField();
        jcbxRemeber = new javax.swing.JCheckBox();
        LoginText = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlblUser.setText("Usuario");

        jlblPass.setText("Senha");

        jbtnLogin.setText("Login");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });

        jtxtUser.setBackground(new java.awt.Color(204, 204, 204));
        jtxtUser.setToolTipText("");
        jtxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUserActionPerformed(evt);
            }
        });

        jtxtPass.setBackground(new java.awt.Color(204, 204, 204));

        jcbxRemeber.setBackground(new java.awt.Color(255, 255, 255));
        jcbxRemeber.setText("Lembrar-me");
        jcbxRemeber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxRemeberActionPerformed(evt);
            }
        });

        LoginText.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        LoginText.setText("Login");

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar1.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        jLabel1.setText("Versão 0.0.0.1 |  Build<none>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblUser)
                            .addComponent(jlblPass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbxRemeber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnLogin))
                            .addComponent(jtxtUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(LoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUser)
                    .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPass)
                    .addComponent(jtxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLogin)
                    .addComponent(jcbxRemeber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbxRemeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxRemeberActionPerformed
    }//GEN-LAST:event_jcbxRemeberActionPerformed

    private void jtxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserActionPerformed
    }//GEN-LAST:event_jtxtUserActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        
        String pass = new String(jtxtPass.getPassword());
        if(jtxtPass.equals("admin") || pass.equals("admin")){
            startLoginProgress();
             
        }else{
            JOptionPane.showMessageDialog(LoginGUI.this,"Usuário ou  senha Inválidos", "Login", JOptionPane.INFORMATION_MESSAGE);
        }
         

    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void startLoginProgress() {
        timer = new Timer(25, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progress += 2;  
                jProgressBar1.setValue(progress); 

                if (progress >= 100) {
                    timer.stop(); 
                    JOptionPane.showMessageDialog(LoginGUI.this, "Logado com sucesso", "Login", JOptionPane.INFORMATION_MESSAGE);
                    DashboardGUI dashboard = new DashboardGUI();
                    dashboard.setVisible(true);
                    dispose();
                }
            }
        });
        
        timer.start();  // Inicia o timer
       
    }

     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JCheckBox jcbxRemeber;
    private javax.swing.JLabel jlblPass;
    private javax.swing.JLabel jlblUser;
    private javax.swing.JPasswordField jtxtPass;
    private javax.swing.JTextField jtxtUser;
    // End of variables declaration//GEN-END:variables
}
