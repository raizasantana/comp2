package telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;



public class TelaInicial extends JFrame{
	
	public TelaInicial() //@TODO adicionar login? 
	{
		initUI();
		
	}

	private void initUI() {
		
		JMenuBar menubar = new JMenuBar();
      
        // Define e adiciona dois menus drop down na barra de menus
        JMenu userMenu = new JMenu("Usuario");
        JMenu filmMenu = new JMenu("Filmes");
        JMenu exitMenu = new JMenu("Sair");
        filmMenu.addSeparator();
        JMenu aboutMenu = new JMenu("Help");
        
        menubar.add(userMenu);
        menubar.add(filmMenu);
        menubar.add(exitMenu);
        menubar.add(aboutMenu);
        
        aboutMenu.add(new JMenuItem("About")).addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Atividade Acadêmica para a Disciplina de Computação 2\nJulho de 2015\nZ Software");
				
			}
		});
        
        JMenuItem newAction = new JMenuItem("Criar Usuario");
      
        newAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            		CriarUsuarioUI usr = new CriarUsuarioUI();
            		usr.setVisible(true);
            }
        });
        
        JMenuItem editAction = new JMenuItem("Editar Usuario");
        JMenuItem removeAction = new JMenuItem("Remover Usuario");
        
        userMenu.add(newAction);
        userMenu.add(editAction);
        userMenu.add(removeAction);
        
        
        JMenuItem ratingAction = new JMenuItem("Avaliar Filme");
        JMenuItem watchAction = new JMenuItem("Ver filmes assistidos");
        JMenuItem addAction = new JMenuItem("Marcar filme assistido");
        JMenuItem listAction = new JMenuItem("Listar todos os filmes");
        JMenuItem recomAction = new JMenuItem("Filmes Recomendados");
        JMenuItem bestAction = new JMenuItem("Melhores Filmes");
        
        filmMenu.add(ratingAction);
        filmMenu.add(watchAction);
        filmMenu.add(addAction);
        filmMenu.add(listAction);
        filmMenu.add(recomAction);
        filmMenu.add(bestAction);

       
       setJMenuBar(menubar);
        
        this.setTitle("Tela inicial");
        this.pack();
        this.setSize(1200, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
	
	
	
	
	public static void main(String[] args) {
        TelaInicial ex = new TelaInicial();
        ex.setVisible(true);
        
       /* EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                TelaInicial ex = new TelaInicial();
                ex.setVisible(true);
            }
        });*/
}
}
