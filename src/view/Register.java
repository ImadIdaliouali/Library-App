package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register extends JFrame {

        private JButton createAccountButton;
        private JLabel jLabel1;
        private JLabel emailLabel;
        private JLabel background;
        private JLabel newAccountLabel;
        private JLabel firstNameLabel;
        private JLabel lastNameLabel;
        private JLabel userNameLabel;
        private JLabel passwordLabel;
        private JLabel confirmPasswordLabel;
        private JLabel jLabel9;
        private JTextField firstNameInput;
        private JTextField lastNameInput;
        private JTextField userNameInput;
        private JTextField passwordInput;
        private JTextField confirmPasswordInput;
        private JTextField emailInput;

        public Register() {
                this.setTitle("Register");
                this.setResizable(false);
                this.setVisible(true);
                initComponents();
        }

        private void initComponents() {

                jLabel1 = new JLabel();
                background = new JLabel();
                newAccountLabel = new JLabel();
                firstNameLabel = new JLabel();
                firstNameInput = new JTextField();
                lastNameLabel = new JLabel();
                lastNameInput = new JTextField();
                userNameLabel = new JLabel();
                userNameInput = new JTextField();
                passwordLabel = new JLabel();
                passwordInput = new JTextField();
                confirmPasswordLabel = new JLabel();
                confirmPasswordInput = new JTextField();
                jLabel9 = new JLabel();
                createAccountButton = new JButton();
                emailLabel = new JLabel();
                emailInput = new JTextField();

                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                background.setIcon(new ImageIcon(getClass().getResource("../public/images/bibleo.png"))); // NOI18N

                newAccountLabel.setFont(new Font("Zilla Slab Medium", 3, 36)); // NOI18N
                newAccountLabel.setForeground(new Color(255, 51, 51));
                newAccountLabel.setText("Create New account :");

                firstNameLabel.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
                firstNameLabel.setText("First name:");

                firstNameInput.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                                firstNameInputActionPerformed(evt);
                        }
                });

                lastNameLabel.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
                lastNameLabel.setText("Last name:");

                userNameLabel.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
                userNameLabel.setText("USERNAME:");

                userNameInput.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                                userNameInputActionPerformed(evt);
                        }
                });

                passwordLabel.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
                passwordLabel.setText("Password:");

                confirmPasswordLabel.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
                confirmPasswordLabel.setText("Comfirm password:");

                confirmPasswordInput.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                                confirmPasswordInputActionPerformed(evt);
                        }
                });

                createAccountButton.setBackground(new Color(51, 0, 51));
                createAccountButton.setForeground(new Color(255, 51, 51));
                createAccountButton.setText("Create Account");
                createAccountButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                                createAccountButtonActionPerformed(evt);
                        }
                });

                emailLabel.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
                emailLabel.setText("EMAIL:");

                emailInput.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                                emailInputActionPerformed(evt);
                        }
                });

                GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(background, GroupLayout.PREFERRED_SIZE,
                                                                                432, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel1)
                                                                                                .addGap(51, 51, 51)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel9)
                                                                                                                                                .addComponent(userNameLabel))
                                                                                                                                .addContainerGap(
                                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                                                GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addComponent(firstNameLabel)
                                                                                                                                                                                .addComponent(lastNameLabel)
                                                                                                                                                                                .addComponent(passwordLabel)
                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                confirmPasswordLabel)
                                                                                                                                                                                .addComponent(emailLabel))
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                40,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                                                GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addGroup(layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                lastNameInput,
                                                                                                                                                                                                                GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                200,
                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                firstNameInput,
                                                                                                                                                                                                                GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                200,
                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                userNameInput,
                                                                                                                                                                                                                GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                200,
                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                confirmPasswordInput,
                                                                                                                                                                                                                GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                199,
                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                .addGroup(layout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addGap(1, 1, 1)
                                                                                                                                                                                                .addGroup(layout
                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                passwordInput,
                                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                200,
                                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                emailInput,
                                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                199,
                                                                                                                                                                                                                                GroupLayout.PREFERRED_SIZE)))))
                                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                                                                .addComponent(newAccountLabel)
                                                                                                                                                                .addGap(1, 1, 1)))
                                                                                                                                .addGap(69, 69, 69))))
                                                                                .addGroup(GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(createAccountButton)
                                                                                                                .addGap(43, 43, 43)))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(newAccountLabel)
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(firstNameLabel)
                                                                                                                .addComponent(firstNameInput,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(29, 29, 29)
                                                                                                                                .addComponent(jLabel1))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(lastNameLabel)
                                                                                                                                                .addComponent(lastNameInput,
                                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                GroupLayout.PREFERRED_SIZE))))
                                                                                                .addGap(25, 25, 25)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(userNameLabel)
                                                                                                                .addComponent(userNameInput,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(29, 29, 29)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(emailLabel)
                                                                                                                .addComponent(emailInput,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(28, 28, 28)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(passwordInput,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(passwordLabel))
                                                                                                .addGap(25, 25, 25)
                                                                                                .addComponent(jLabel9)
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(confirmPasswordInput,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(confirmPasswordLabel))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(createAccountButton))
                                                                                .addComponent(background))
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                pack();
        }// </editor-fold>

        private void firstNameInputActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void userNameInputActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void confirmPasswordInputActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void createAccountButtonActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void emailInputActionPerformed(ActionEvent evt) {
                // TODO add your handling code here:
        }
}