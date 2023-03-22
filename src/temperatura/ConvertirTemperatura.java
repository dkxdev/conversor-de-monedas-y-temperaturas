package temperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public double ConvertirCelsiusFahrenheit(double valor) {
		double fahrenheit = valor * 1.800 + 32;
    	fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " Grados Celsius son " + fahrenheit + " Grados Fahrenheit.");
		return fahrenheit;
	}
	
	public void ConvertirCelsiusKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " Grados Celsius son " + kelvin + " Grados Kelvin.");
	}
	
	public void ConvertirFahrenheitCelsius(double valor) {
		double celsius = (valor - 32) / 1.800;
        celsius = (double) Math.round(celsius * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son " + celsius + " Grados Celsius.");
	}
	
	public void ConvertirFahrenheitKelvin(double valor) {
		double fahrenheitKelvin = (valor - 32 ) / 1.800 + 273.15;
		fahrenheitKelvin = (double) Math.round(fahrenheitKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son " + fahrenheitKelvin + " Grados Kelvin.");
	}
	
	public double ConvertirKelvinCelsius(double valor) {
		 double kelvinCelsius = valor - 273.15;
         kelvinCelsius = (double) Math.round(kelvinCelsius * 100d) / 100;
         JOptionPane.showMessageDialog(null, valor + " Grados Kelvin son " + kelvinCelsius + " Grados Celsius.");
         return kelvinCelsius;
	}
	
	public void ConvertirKelvinFahrenheit(double valor) {
		double kelvinFahrenheit = (valor - 273.15)* 1.800 + 32;
		kelvinFahrenheit = (double) Math.round(kelvinFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " Grados Kelvin son " + kelvinFahrenheit + " Grados Fahrenheit.");
	}
	
}
