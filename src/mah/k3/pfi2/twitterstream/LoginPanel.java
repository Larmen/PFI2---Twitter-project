package mah.k3.pfi2.twitterstream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * Just a simple Login widget. To make the Main.java implementation
 * easier/cleaner we define the login panel as it's own component which we can
 * just place as any other standard component in the drag-and-drop interface.
 * 
 * @author andreas
 * 
 */
public class LoginPanel extends JPanel {
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton btnReadTweetSteam;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null), "Login", TitledBorder.LEADING, TitledBorder.TOP, null,
				null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 120, 123, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblLogin = new JLabel("Username");
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.anchor = GridBagConstraints.WEST;
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 0;
		gbc_lblLogin.gridy = 0;
		add(lblLogin, gbc_lblLogin);

		usernameField = new JTextField();
		GridBagConstraints gbc_usernameField = new GridBagConstraints();
		gbc_usernameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_usernameField.insets = new Insets(0, 0, 5, 5);
		gbc_usernameField.gridx = 1;
		gbc_usernameField.gridy = 0;
		add(usernameField, gbc_usernameField);
		usernameField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(0, 0, 0, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 1;
		add(lblPassword, gbc_lblPassword);

		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 0, 5);
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 1;
		add(passwordField, gbc_passwordField);

		btnReadTweetSteam = new JButton("Read Tweet Steam");
		GridBagConstraints gbc_btnReadTweetSteam = new GridBagConstraints();
		gbc_btnReadTweetSteam.fill = GridBagConstraints.BOTH;
		gbc_btnReadTweetSteam.gridheight = 2;
		gbc_btnReadTweetSteam.gridx = 2;
		gbc_btnReadTweetSteam.gridy = 0;
		add(btnReadTweetSteam, gbc_btnReadTweetSteam);

	}

	public JTextField getUsernameField() {
		return usernameField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JButton getButton() {
		return btnReadTweetSteam;
	}
}
