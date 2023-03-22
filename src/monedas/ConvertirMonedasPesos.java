package monedas;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class ConvertirMonedasPesos {

	public void ConvertirDolaresPesos(double valor) {
		double monedaDolar = valor * 822.30;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + BigDecimal.valueOf(monedaDolar).setScale(2, RoundingMode.HALF_UP) + " CLP");
	}
	
	public void ConvertirEurosPesos(double valor) {
		double monedaEuro = valor * 885.06;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + BigDecimal.valueOf(monedaEuro).setScale(2, RoundingMode.HALF_UP) + " CLP");
	}
	
	public void ConvertirLibrasPesos(double valor) {
		double monedaLibra = valor * 1004.59;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + BigDecimal.valueOf(monedaLibra).setScale(2, RoundingMode.HALF_UP) + " CLP");
	}
	
	public void ConvertirYenPesos(double valor) {
		double monedaYen = valor * 6.21;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + BigDecimal.valueOf(monedaYen).setScale(2, RoundingMode.HALF_UP) + " CLP");
	}
	
	public void ConvertirWonPesos(double valor) {
		double monedaWon = valor * 0.63;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + BigDecimal.valueOf(monedaWon).setScale(2, RoundingMode.HALF_UP) + " CLP");
	}
	
}
