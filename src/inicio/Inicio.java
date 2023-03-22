package inicio;

import javax.swing.JOptionPane;

import monedas.Funciones;
import temperatura.FuncionesTemperatura;

public class Inicio {

	public static void main(String[] args) {

		Funciones monedas = new Funciones();
		FuncionesTemperatura temperatura = new FuncionesTemperatura();
		
		boolean comprobar = true;

		try {
			
			while (comprobar) {

				String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión: ", "Menú",
						JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Conversor de Monedas", "Conversor de Temperaturas" }, "Seleccione")).toString();

				switch (opciones) {
				case "Conversor de Monedas":
					String valor = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir: ");
					if (validar(valor) == true) {
						double dValor = Double.parseDouble(valor);
						monedas.ConvertirMonedas(dValor);

						int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
						if (JOptionPane.OK_OPTION == respuesta) {
						} else {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							comprobar = false;
						}

					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
					break;

				case "Conversor de Temperaturas":
					valor = JOptionPane.showInputDialog("Ingrese el valor que desea convertir: ");
					if (validar(valor) == true) {
						double dValor = Double.parseDouble(valor);
						temperatura.ConvertirTemperatura(dValor);

						int respuesta = 0;
						respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
						if ((respuesta == 0) && (validar(valor) == true)) {
						} else {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							comprobar = false;
						}

					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
					break;
				}
			}
			
		} catch (NullPointerException e) {
			
		}
		

	}

	public static boolean validar(String valor) {
		try {
			double x = Double.parseDouble(valor);
			if (x >= 0 || x < 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}