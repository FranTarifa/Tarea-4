package ordenarNombres;

import javax.swing.JOptionPane;

public class OrdenarNombres {
	public static void main(String[] args) {
		
		String name1 = JOptionPane.showInputDialog(null,"Ingrese el primer nombre:");
		String name2 = JOptionPane.showInputDialog(null,"Ingrese el segundo nombre:");
		String name3 = JOptionPane.showInputDialog(null,"Ingrese el tercer nombre:");
		if(name1.length()> name2.length() || name1.length()> name3.length()) {
			System.out.println(name1 + " es el nombre mas largo entre todos y su longitud es de "+ name1.length() + " caracteres");
			JOptionPane.showMessageDialog(null, name1 + " es el nombre mas largo entre todos y su longitud es de "+ name1.length() + " caracteres");
		}
		else if(name2.length()> name1.length() || name2.length()> name3.length()) {
			System.out.println(name2 + " es el nombre mas largo entre todos y su longitud es de "+ name2.length() + " caracteres");
			JOptionPane.showMessageDialog(null, name2 + " es el nombre mas largo entre todos y su longitud es de "+ name2.length() + " caracteres");
		}
		else if(name3.length()> name2.length() || name3.length()> name1.length()) {
			System.out.println(name3 + " es el nombre mas largo entre todos y su longitud es de "+ name3.length() + " caracteres");
			JOptionPane.showMessageDialog(null, name3 + " es el nombre mas largo entre todos y su longitud es de "+ name3.length() + " caracteres");
		}
		else {
		 System.out.println("Los datos ingresados son incorrectos.");
		}
	}
}
