package temperatura;

import javax.swing.JOptionPane;

public class FuncionesTemperatura {

ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double valor) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elige una opción para convertir:", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Grados Kelvin", "Grados Fahrenheit a Grados Celsius", "Grados Fahrenheit a Grados Kelvin", "Grados Kelvin a Grados Celsius", "Grados Kelvin a Grados Fahrenheit"}, "Seleccione")).toString();
        switch(opcion) {
        case "Grados Celsius a Grados Fahrenheit":
        	temperatura.ConvertirCelsiusFahrenheit(valor);
        	break;
        case "Grados Celsius a Grados Kelvin":
            temperatura.ConvertirCelsiusKelvin(valor);
            break;
        case "Grados Fahrenheit a Grados Celsius":
           temperatura.ConvertirFahrenheitCelsius(valor);
           break;
        case "Grados Fahrenheit a Grados Kelvin":
            temperatura.ConvertirFahrenheitKelvin(valor);
            break;
        case "Grados Kelvin a Grados Celsius":
           temperatura.ConvertirKelvinCelsius(valor);
           break;
        case "Grados Kelvin a Grados Fahrenheit":
        	temperatura.ConvertirKelvinFahrenheit(valor);
        	break;
        }
	}
	
}
