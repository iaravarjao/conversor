package conversorTemperaturas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConversorTemperaturas {
	
	String[] opcoes = {
			"Celsius a Fahrenheit",
			"Fahrenheit a Celsius",
	};
	
	ImageIcon iconTermometro = new ImageIcon("src/termometro.png");
	
	public void executar() {
		String entrada = (String) JOptionPane.showInputDialog(null,
				"Insira um valor:", 
				"Conversor de Temperaturas",
				JOptionPane.QUESTION_MESSAGE);
		double input = Double.parseDouble(entrada);
		
		String escolha = (String) JOptionPane.showInputDialog(null,
	            "Escolha um tipo de conversão:", 
	            "Opções de Conversão",
	            JOptionPane.QUESTION_MESSAGE,
	            iconTermometro, opcoes, opcoes[0]);
		
		double resultadoConversao = 0.00;
		
		switch (escolha) {
	        case "Celsius a Fahrenheit":
	            resultadoConversao = celsiusFahrenheit(input);
	            JOptionPane.showMessageDialog(null,
                        input + "º Celsius  =  " + resultadoConversao + "º Fahrenheit",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE,
                        iconTermometro);
	            break;
	        case "Fahrenheit a Celsius":
	        	resultadoConversao = fahrenheitCelsius(input);
	            JOptionPane.showMessageDialog(null,
	            		input + "º Fahrenheit  =  " + resultadoConversao + "º Celsius",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
                        iconTermometro);
	            break;
		}
	}
	
	private double celsiusFahrenheit(double input){
		double tempFahrenheit = input * 1.8 + 32; //cotação em 30/07/23
		tempFahrenheit = (double) Math.round(tempFahrenheit * 100d) / 100;
	    return tempFahrenheit;
	}
	private double fahrenheitCelsius(double input) {
		double tempCelsius = (input - 32) / 1.8; //cotação em 30/07/23
		tempCelsius = (double) Math.round(tempCelsius * 100d) / 100;
	    return tempCelsius;
	}
}
