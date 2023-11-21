package principal;

import javax.swing.*;

public class DemoTela {

	public static void main(String[] args) {
		JFrame tela = new JFrame("LP2");
		tela.setLayout(null);
		JLabel texto = new JLabel("Digite o seu nome:");
		texto.setBounds(75, 50, 150, 30);
		tela.getContentPane().add(texto);
		JTextField txtNome = new JTextField();
		txtNome.setBounds(75, 90, 150, 30);
		tela.getContentPane().add(txtNome);
		JButton btnNome = new JButton("Enviar");
		btnNome.setBounds(75, 130, 150, 30);
		tela.getContentPane().add(btnNome);
		tela.setSize(280, 270);
		tela.setVisible(true);
		tela.setLocationRelativeTo(null);

	}

}
