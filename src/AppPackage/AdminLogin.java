/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Symon Hasan
 */
public class AdminLogin extends javax.swing.JFrame {

    boolean checkflag=false,found=false;
    Connection conn=null;
    private Object Connect;
    public AdminLogin() {
     
        initComponents();
    }

/**
     * Creates new form AdminLogin
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        hover = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        userbox = new javax.swing.JTextField();
        passwordbox = new javax.swing.JPasswordField();
        checkbox = new javax.swing.JCheckBox();
        usericon = new javax.swing.JLabel();
        passwordicon = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        signintag = new javax.swing.JLabel();
        admintag = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componants/Close.png"))); // NOI18N
        close.setText("jLabel1");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(870, 0, 30, 25);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componants/Minimize.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize);
        minimize.setBounds(840, 0, 25, 25);

        hover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componants/hover_mainui.jpg"))); // NOI18N
        getContentPane().add(hover);
        hover.setBounds(0, 0, 920, 25);

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 580));
        jPanel1.setLayout(null);

        userbox.setBackground(new java.awt.Color(52, 49, 44));
        userbox.setFont(new java.awt.Font("Prestige Elite Std", 0, 18)); // NOI18N
        userbox.setForeground(new java.awt.Color(255, 255, 255));
        userbox.setText("Username");
        userbox.setBorder(null);
        userbox.setOpaque(false);
        userbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userboxMouseExited(evt);
            }
        });
        jPanel1.add(userbox);
        userbox.setBounds(290, 160, 400, 35);

        passwordbox.setBackground(new java.awt.Color(62, 55, 49));
        passwordbox.setFont(new java.awt.Font("Prestige Elite Std", 0, 18)); // NOI18N
        passwordbox.setForeground(new java.awt.Color(255, 255, 255));
        passwordbox.setText("........");
        passwordbox.setBorder(null);
        passwordbox.setEchoChar('\u2022');
        passwordbox.setOpaque(false);
        passwordbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordboxMouseExited(evt);
            }
        });
        jPanel1.add(passwordbox);
        passwordbox.setBounds(290, 240, 400, 35);

        checkbox.setBackground(new java.awt.Color(75, 66, 49));
        checkbox.setFont(new java.awt.Font("Prestige Elite Std", 0, 14)); // NOI18N
        checkbox.setText(" I accept the terms and conditions");
        checkbox.setBorder(null);
        checkbox.setOpaque(false);
        checkbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkboxMouseClicked(evt);
            }
        });
        jPanel1.add(checkbox);
        checkbox.setBounds(240, 320, 330, 30);

        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componants/adminiconsmall.png"))); // NOI18N
        jPanel1.add(usericon);
        usericon.setBounds(230, 160, 30, 30);

        passwordicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componants/passwordiconsmall.png"))); // NOI18N
        jPanel1.add(passwordicon);
        passwordicon.setBounds(230, 240, 30, 30);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componants/Back.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 20, 30, 40);

        signin.setBackground(new java.awt.Color(65, 58, 42));
        signin.setFont(new java.awt.Font("Prestige Elite Std", 1, 14)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Sign In");
        signin.setBorder(null);
        signin.setOpaque(false);
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signinMousePressed(evt);
            }
        });
        jPanel1.add(signin);
        signin.setBounds(400, 390, 120, 40);

        signintag.setFont(new java.awt.Font("Prestige Elite Std", 0, 24)); // NOI18N
        signintag.setForeground(new java.awt.Color(167, 117, 80));
        signintag.setText("Sign In");
        signintag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signintagMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signintagMouseExited(evt);
            }
        });
        jPanel1.add(signintag);
        signintag.setBounds(40, 10, 160, 60);

        admintag.setFont(new java.awt.Font("Prestige Elite Std", 0, 14)); // NOI18N
        admintag.setForeground(new java.awt.Color(167, 117, 80));
        admintag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admintag.setText("Adminstration");
        jPanel1.add(admintag);
        admintag.setBounds(70, 50, 140, 20);

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/AdminUI.jpg"))); // NOI18N
        jPanel1.add(wallpaper);
        wallpaper.setBounds(0, 0, 900, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 20, 900, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void checkboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkboxMouseClicked

        if(!checkflag)
            checkflag=true;
        else
            checkflag=false;
        if(checkflag)
            checkbox.setForeground(Color.white);
        else
            checkbox.setForeground(Color.black);
    }//GEN-LAST:event_checkboxMouseClicked

    private void signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseEntered
        Color c;
        c=new Color(76,67,49);
        signin.setBackground(c);
    }//GEN-LAST:event_signinMouseEntered

    private void signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseExited
        Color c;
        c=new Color(65,58,42);
        signin.setBackground(c);
    }//GEN-LAST:event_signinMouseExited

    private void signinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMousePressed
        Color c;
        c=new Color(177,135,87);
        signin.setBackground(c);
    }//GEN-LAST:event_signinMousePressed

    private void signintagMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signintagMouseEntered
       Color c;
        c=new Color(221,129,61);
        signintag.setForeground(c);
        admintag.setForeground(c);
    }//GEN-LAST:event_signintagMouseEntered

    private void signintagMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signintagMouseExited
        Color c;
        c=new Color(167,117,80);
        signintag.setForeground(c);
        admintag.setForeground(c);
    }//GEN-LAST:event_signintagMouseExited

    private void userboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userboxMouseClicked
       userbox.setForeground(Color.white);
        userbox.setText("");
    }//GEN-LAST:event_userboxMouseClicked

    private void userboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userboxMouseExited
        if(userbox.getText().isEmpty()) 
            userbox.setText("Username");
    }//GEN-LAST:event_userboxMouseExited

    private void passwordboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordboxMouseClicked

            passwordbox.setText("");
    }//GEN-LAST:event_passwordboxMouseClicked

    private void passwordboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordboxMouseExited
        if(passwordbox.getText().isEmpty())
            passwordbox.setText("••••••••");
    }//GEN-LAST:event_passwordboxMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        MainUI MU=new MainUI();
        MU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
       this.setState(AdminLogin.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn=Sqlite.ConnectDB();
    }//GEN-LAST:event_formWindowOpened

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String n= userbox.getText();
      String i= passwordbox.getText();
      s="select * from AdminLogin";
      try{
          ps=conn.prepareStatement(s);
          rs=ps.executeQuery();
          while(rs.next()){
              
          if(n.equals(rs.getString("Username")) && i.equals(rs.getString("Password"))){
              found=true;
              rs.close();
              ps.close();
              break;
          }
          rs.close();
          ps.close();
          } 
      }catch(Exception e){
          
      }
      if(found)
      {
          if(checkflag){
          AdminPanel AP=new AdminPanel();
          AP.setVisible(true);
          this.setVisible(false);
          }
          else
          {
              checkbox.setForeground(Color.red);
          }
          
      }
      else
      {
          userbox.setForeground(Color.red);
          userbox.setText("Invalid Username Or Password");
      }
    }//GEN-LAST:event_signinMouseClicked

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admintag;
    private javax.swing.JLabel back;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JLabel close;
    private javax.swing.JLabel hover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField passwordbox;
    private javax.swing.JLabel passwordicon;
    private javax.swing.JButton signin;
    private javax.swing.JLabel signintag;
    private javax.swing.JTextField userbox;
    private javax.swing.JLabel usericon;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}