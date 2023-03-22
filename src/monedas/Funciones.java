package monedas;

import javax.swing.JOptionPane;

public class Funciones {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasPesos pesos = new ConvertirMonedasPesos();
	
    public void ConvertirMonedas(double valor) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elige la moneda a la que deseas convertir tu dinero", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"Pesos a Dólar", "Pesos a Euro", "Pesos a Libras", "Pesos a Yen", "Pesos a Won Coreano", "Dólar a Pesos", "Euro a Pesos", "Libras a Pesos", "Yen a Pesos", "Won Coreano a Pesos"}, 
    			"Seleccione")).toString();
        switch(opcion) {
        case "Pesos a Dólar":
        	monedas.ConvertirPesosDolares(valor);
        	break;
        case "Pesos a Euro":
        	monedas.ConvertirPesosEuros(valor);
        	break;
        case "Pesos a Libras":
        	monedas.ConvertirPesosLibras(valor);
        	break;
        case "Pesos a Yen":
        	monedas.ConvertirPesosYen(valor);
        	break;
        case "Pesos a Won Coreano":
        	monedas.ConvertirPesosWon(valor);
        	break;    	    	                          
        case "Dólar a Pesos":
        	pesos.ConvertirDolaresPesos(valor);
        	break;
        case "Euro a Pesos":
        	pesos.ConvertirEurosPesos(valor);
        	break;
        case "Libras a Pesos":
        	pesos.ConvertirLibrasPesos(valor);
        	break;
        case "Yen a Pesos":
        	pesos.ConvertirYenPesos(valor);
        	break;
        case "Won Coreano a Pesos":
            pesos.ConvertirWonPesos(valor);
            break;
        }      
    }
}
