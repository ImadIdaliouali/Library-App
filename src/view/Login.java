package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {

  private JButton connexion;
  private JLabel libTitle;
  private JLabel emailLabel;
  private JLabel passwordLabel;
  private JButton createAccount;
  private JLabel background;
  private JTextField emailInput;
  private JTextField passwordInput;

  public Login() {
    this.setTitle("Login");
    this.setResizable(false);
    this.setVisible(true);
    initComponents();
  }

  private void initComponents() {
    libTitle = new JLabel();
    emailLabel = new JLabel();
    emailInput = new JTextField();
    passwordLabel = new JLabel();
    passwordInput = new JTextField();
    connexion = new JButton();
    createAccount = new JButton();
    background = new JLabel();

    setDefaultCloseOperation(EXIT_ON_CLOSE);

    libTitle.setFont(new Font("Zilla Slab SemiBold", 1, 24));
    libTitle.setText("ESTE BIBLEOTHEQUE");

    emailLabel.setFont(new Font("Zilla Slab Light", 1, 18));
    emailLabel.setText("EMAIL :");

    emailInput.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
          emailInputActionPerformed(evt);
        }
      }
    );

    passwordLabel.setFont(new Font("Zilla Slab Light", 1, 18));
    passwordLabel.setText("PASSWORD :");

    passwordInput.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
          passwordInputActionPerformed(evt);
        }
      }
    );

    connexion.setFont(new Font("Zilla Slab Light", 1, 18));
    connexion.setText("connexion");
    connexion.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
          connexionActionPerformed(evt);
        }
      }
    );

    createAccount.setForeground(new Color(51, 0, 255));
    createAccount.setText("Create Account");
    createAccount.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
          createAccountActionPerformed(evt);
        }
      }
    );

    background.setIcon(
      new ImageIcon(getClass().getResource("../public/images/bibleo.png"))
    );

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addComponent(background)
            .addGroup(
              layout
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(
                      layout
                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(
                          layout
                            .createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(
                              passwordInput,
                              GroupLayout.PREFERRED_SIZE,
                              241,
                              GroupLayout.PREFERRED_SIZE
                            )
                        )
                        .addGroup(
                          layout
                            .createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(passwordLabel)
                        )
                    )
                    .addGroup(
                      layout
                        .createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(
                          layout
                            .createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(
                              emailInput,
                              GroupLayout.PREFERRED_SIZE,
                              241,
                              GroupLayout.PREFERRED_SIZE
                            )
                            .addComponent(connexion)
                        )
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(emailLabel)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(libTitle)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(createAccount)
                )
            )
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(55, 55, 55)
            .addComponent(
              libTitle,
              GroupLayout.PREFERRED_SIZE,
              38,
              GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addComponent(emailLabel)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              emailInput,
              GroupLayout.PREFERRED_SIZE,
              GroupLayout.DEFAULT_SIZE,
              GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(passwordLabel)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              passwordInput,
              GroupLayout.PREFERRED_SIZE,
              GroupLayout.DEFAULT_SIZE,
              GroupLayout.PREFERRED_SIZE
            )
            .addGap(20, 20, 20)
            .addComponent(connexion)
            .addGap(53, 53, 53)
            .addComponent(createAccount)
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        )
        .addGroup(
          layout
            .createSequentialGroup()
            .addComponent(
              background,
              GroupLayout.PREFERRED_SIZE,
              425,
              GroupLayout.PREFERRED_SIZE
            )
            .addGap(0, 0, Short.MAX_VALUE)
        )
    );

    pack();
  }

  private void emailInputActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void passwordInputActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void connexionActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void createAccountActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
    new Register();
  }
}
