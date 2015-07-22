package telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class CriarUsuarioUI extends JFrame{
	
	public CriarUsuarioUI()
	{
		initUI();
	}
	
	public void initUI()
	{
		/*
		 * A cria¸c˜ao de novos usu´arios. Um novo usu´ario deve apresentar um nome,
idade, genero, ocupa¸c˜ao e CEP informados por uma tela;
		 */
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS)); 
		
		
		JPanel formUsuario = new JPanel();
		
		formUsuario.setMaximumSize(new Dimension(600,300));
		formUsuario.setLayout(new GridLayout(5, 2));
		JLabel nomeLabel = new JLabel("Nome: ");
		formUsuario.add(nomeLabel);		
		JTextField name = new JTextField(20);
		formUsuario.add(name);
		 
		
		JLabel idadeLabel = new JLabel("Idade: ");
		formUsuario.add(idadeLabel);		
		JTextField idade = new JTextField(2);
		formUsuario.add(idade);
		
		JLabel generoLabel = new JLabel("Genero:");
		formUsuario.add(generoLabel);
		JTextField genero = new JTextField(20);
		formUsuario.add(genero);
		
		JLabel ocupacaoLabel = new JLabel("Ocupação: ");
		formUsuario.add(ocupacaoLabel);
		JTextField ocupacao = new JTextField(80);
		formUsuario.add(ocupacao);
		
		JLabel cepLabel = new JLabel("CEP: ");
		formUsuario.add(cepLabel);
		JTextField cep = new JTextField(80);
		formUsuario.add(cep);
		
		
		JPanel bt = new JPanel();
		bt.setLayout(new GridLayout(1,1));
		JButton createBt = new JButton("Criar usuario");
		createBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Clicou em criar usuario");
				
				
			}
		});
		bt.setMaximumSize(new Dimension(300,30));
		bt.add(createBt);
		
		JPanel con = new JPanel();
		con.add(formUsuario);
		con.add(bt);
		con.setLayout(new FlowLayout());
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		this.setContentPane(con);
		
		
		 this.setTitle("Criar Usuario");
		 
	        this.pack();
	        this.setSize(600, 400);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		CriarUsuarioUI usuario = new CriarUsuarioUI();
		usuario.setVisible(true);
	}

}
