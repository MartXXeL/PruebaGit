package gui.main;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import domain.Athlete;

public class AthleteListCellRender extends DefaultListCellRenderer  {
	/**
	 *
	 */
	 private static final long serialVersionUID = 1L;
	 
	 // Ej 6
	 
//	 3. Modifica el método para, utilizando el componente ya creado en la clase antecesora,
//	 JLabel por defecto, hacer que su texto sea el nombre completo del atleta actual.
//	 4. Establece en MainWindow el renderer del JList al que acabas de crear y comprueba si
//	 ahora las celdas se renderizan con el nombre de cada atleta
	 @Override
	    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
	        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
	        
	        Athlete athlete = (Athlete) value;
	        setText(athlete.getName());
	        return this;
	    }
}
