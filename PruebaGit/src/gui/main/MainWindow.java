package gui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import domain.Athlete;
import domain.Athlete.Genre;


public class MainWindow extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainWindow() {
		// Ej 1
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JJ.OO. Paris 2024");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		// Ej 2
//		String[] atletas = {
//				"Carlos",
//				"Pedro",
//				"Carlos1",
//				"Pedro1",
//				"Carlos2",
//				"Pedro2",
//				"Carlos",
//				"Pedro",
//				"Carlos1",
//				"Pedro1",
//				"Carlos2",
//				"Pedro2",
//				"Carlos",
//				"Pedro",
//				"Carlos1",
//				"Pedro1",
//				"Carlos2",
//				"Pedro2",
//				"Carlos",
//				"Pedro",
//				"Carlos1",
//				"Pedro1",
//				"Carlos2",
//				"Pedro2", 
//				"Carlos",
//				"Pedro",
//				"Carlos1",
//				"Pedro1",
//				"Carlos2",
//				"Pedro2"
//		};
//		
//		
//		JList lista_atletas = new JList(atletas);
//		JScrollPane jScrollPane = new JScrollPane(lista_atletas);
//		lista_atletas.setFixedCellWidth(200);
//		add(jScrollPane, BorderLayout.WEST);
		
		JTabbedPane tabbed_pane = new JTabbedPane();
		add(tabbed_pane, BorderLayout.CENTER);
		
		JPanel datos = new JPanel();
		tabbed_pane.addTab("Datos", datos);
		
		JPanel medallas = new JPanel();
		tabbed_pane.addTab("Medallas", medallas);
		
		// Ej 3
		JMenuBar barra_menu = new JMenuBar();
		
		JMenu menu_fichero = new JMenu("Fichero");
		menu_fichero.setMnemonic(KeyEvent.VK_F);
		menu_fichero.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JMenuItem nuevo_atleta = new JMenuItem("Nuevo atleta");
		nuevo_atleta.setMnemonic(KeyEvent.VK_N);
		nuevo_atleta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JMenuItem importar = new JMenuItem("Importar");
		importar.setMnemonic(KeyEvent.VK_I);
		JMenuItem exportar = new JMenuItem("Exportar");
		exportar.setMnemonic(KeyEvent.VK_E);
		JMenuItem salir = new JMenuItem("Salir");
		salir.setMnemonic(KeyEvent.VK_S);
		salir.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		menu_fichero.add(nuevo_atleta);
		menu_fichero.add(importar);
		menu_fichero.add(exportar);
		menu_fichero.add(salir);
		
		barra_menu.add(menu_fichero);
		
		setJMenuBar(barra_menu);
		
		// Ej 4
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir?", "Salir",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (JOptionPane.YES_OPTION == respuesta) {
				System.exit(0);
			}
		}
		});
		
		salir.addActionListener((e)->{
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir?", "Salir",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (JOptionPane.YES_OPTION == respuesta) {
				System.exit(0);
			}
		});
		
		// Ej 5
		
		Athlete[] atletas = {
			    new Athlete(01, "Usain Bolt", Genre.MALE, "Jamaica", LocalDate.of(1986, 8, 21)),
			    new Athlete(02, "Michael Phelps", Genre.MALE, "USA", LocalDate.of(1985, 6, 30)),
			    new Athlete(03, "Simone Biles", Genre.FEMALE, "USA", LocalDate.of(1997, 3, 14)),
			    new Athlete(04, "Carl Lewis", Genre.MALE, "USA", LocalDate.of(1961, 7, 1)),
			    new Athlete(05, "Nadia Comaneci", Genre.FEMALE, "Romania", LocalDate.of(1961, 11, 12)),
			    new Athlete(06, "Paavo Nurmi", Genre.MALE, "Finland", LocalDate.of(1897, 6, 13)),
			    new Athlete(07, "Larisa Latynina", Genre.FEMALE, "Russia", LocalDate.of(1934, 12, 27)),
			    new Athlete(8, "Jesse Owens", Genre.MALE, "USA", LocalDate.of(1913, 9, 12)),
			    new Athlete(9, "Allyson Felix", Genre.FEMALE, "USA", LocalDate.of(1985, 11, 18)),
			    new Athlete(10, "Mark Spitz", Genre.MALE, "USA", LocalDate.of(1950, 2, 10)),
			    new Athlete(11, "Jackie Joyner-Kersee", Genre.FEMALE, "USA", LocalDate.of(1962, 3, 3)),
			    new Athlete(12, "Yelena Isinbayeva", Genre.FEMALE, "Russia", LocalDate.of(1982, 6, 3)),
			    new Athlete(13, "Haile Gebrselassie", Genre.MALE, "Ethiopia", LocalDate.of(1973, 4, 18)),
			    new Athlete(14, "Birgit Fischer", Genre.FEMALE, "Germany", LocalDate.of(1962, 2, 25)),
			    new Athlete(15, "Abebe Bikila", Genre.MALE, "Ethiopia", LocalDate.of(1932, 8, 7)),
			    new Athlete(16, "Katie Ledecky", Genre.FEMALE, "USA", LocalDate.of(1997, 3, 17)),
			    new Athlete(17, "Serena Williams", Genre.FEMALE, "USA", LocalDate.of(1981, 9, 26)),
			    new Athlete(18, "Andy Murray", Genre.MALE, "UK", LocalDate.of(1987, 5, 15)),
			    new Athlete(19, "Kohei Uchimura", Genre.MALE, "Japan", LocalDate.of(1989, 1, 3)),
			    new Athlete(20, "Mo Farah", Genre.MALE, "UK", LocalDate.of(1983, 3, 23)),
			    new Athlete(21, "Florence Griffith-Joyner", Genre.FEMALE, "USA", LocalDate.of(1959, 12, 21)),
			    new Athlete(22, "Ryan Lochte", Genre.MALE, "USA", LocalDate.of(1984, 8, 3)),
			    new Athlete(23, "Irena Szewinska", Genre.FEMALE, "Poland", LocalDate.of(1946, 5, 24)),
			    new Athlete(24, "Marit Bjørgen", Genre.FEMALE, "Norway", LocalDate.of(1980, 3, 21)),
			    new Athlete(25, "Steve Redgrave", Genre.MALE, "UK", LocalDate.of(1962, 3, 23)),
			    new Athlete(26, "Natalie Coughlin", Genre.FEMALE, "USA", LocalDate.of(1982, 8, 23)),
			    new Athlete(27, "David Rudisha", Genre.MALE, "Kenya", LocalDate.of(1988, 12, 17)),
			    new Athlete(28, "Alina Zagitova", Genre.FEMALE, "Russia", LocalDate.of(2002, 5, 18)),
			    new Athlete(29, "Gerd Kanter", Genre.MALE, "Estonia", LocalDate.of(1979, 5, 6)),
			    new Athlete(30, "Shelly-Ann Fraser-Pryce", Genre.FEMALE, "Jamaica", LocalDate.of(1986, 12, 27)),
			    new Athlete(31, "Hicham El Guerrouj", Genre.MALE, "Morocco", LocalDate.of(1974, 9, 14)),
			    new Athlete(32, "Oksana Chusovitina", Genre.FEMALE, "Uzbekistan", LocalDate.of(1975, 6, 19)),
			    new Athlete(33, "Alistair Brownlee", Genre.MALE, "UK", LocalDate.of(1988, 4, 23)),
			    new Athlete(34, "Pau Gasol", Genre.MALE, "Spain", LocalDate.of(1980, 7, 6)),
			    new Athlete(35, "Kimia Alizadeh", Genre.FEMALE, "Iran", LocalDate.of(1998, 7, 10)),
			    new Athlete(36, "Saori Yoshida", Genre.FEMALE, "Japan", LocalDate.of(1982, 10, 5)),
			    new Athlete(37, "Shaun White", Genre.MALE, "USA", LocalDate.of(1986, 9, 3)),
			    new Athlete(38, "Ruth Beitia", Genre.FEMALE, "Spain", LocalDate.of(1979, 4, 1)),
			    new Athlete(39, "Yohan Blake", Genre.MALE, "Jamaica", LocalDate.of(1989, 12, 26))
			};
		DefaultListModel<Athlete> modelo = new DefaultListModel<>();
		for (Athlete athlete : atletas) {
			modelo.addElement(athlete);
		}
		
		JList<Athlete> lista_atletas = new JList<>(modelo);
		lista_atletas.setCellRenderer(new AthleteListCellRender());
		JScrollPane jScrollPane = new JScrollPane(lista_atletas);
		lista_atletas.setFixedCellWidth(200);
		add(jScrollPane, BorderLayout.WEST);
		
	
		setVisible(true);
	}

	

	
}
