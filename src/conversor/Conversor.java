package conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import conversorMoedas.ConversorMoedas;
import conversorTemperaturas.ConversorTemperaturas;


public class Conversor extends JFrame{
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem conversorMoedas;
	private JMenuItem conversorTemperatura;
	private JMenuItem sair;
	ImageIcon iconTermometro = new ImageIcon("src/termometro.png");
	ImageIcon iconMoeda = new ImageIcon("src/cambio.png");
	
	public Conversor() {
		setSize(400, 150);
		setTitle("Challenge Conversor - Por Iara");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel painel = new JPanel();
				
		exibirMenu();
		painel.add(menuBar);
		add(painel);
	}
	
	private void exibirMenu() {
		menu = new JMenu("Escolha um Conversor: ");
		menuBar = new JMenuBar();
		conversorMoedas = new JMenuItem("Conversor de Moedas");
		conversorTemperatura = new JMenuItem("Conversor de Temperatura");
		sair = new JMenuItem("Sair");	
	
		menu.add(conversorMoedas);
		menu.add(conversorTemperatura);
		menu.add(sair);
		menuBar.add(menu);
			
		conversorMoedas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ConversorMoedas conversorMoedas = new ConversorMoedas();
				conversorMoedas.executar();
				int continuar = JOptionPane.showConfirmDialog(
						null, "Deseja continuar?", 
						"Conversor de moedas",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						iconMoeda)
						;
			    if (JOptionPane.OK_OPTION == continuar) {
			    } else {
			        JOptionPane.showMessageDialog(null,
			        		"Programa finalizado",
			        		"Conversor de Moedas",
			        		JOptionPane.INFORMATION_MESSAGE,
			        		iconMoeda
			        		);
			    }
			}});
		
		conversorTemperatura.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ConversorTemperaturas conversorTemperaturas = new ConversorTemperaturas();
				conversorTemperaturas.executar();
				int continuar = JOptionPane.showConfirmDialog(
						null, "Deseja continuar?", 
						"Conversor de Temperaturas",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						iconTermometro)
						;
			    if (JOptionPane.OK_OPTION == continuar) {
			    } else {
			        JOptionPane.showMessageDialog(null,
			        		"Programa finalizado",
			        		"Conversor de Temperaturas",
			        		JOptionPane.INFORMATION_MESSAGE,
			        		iconTermometro);
			    }
			}});
		
		sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}

	public static void main(String[] args) {
		Conversor janela = new Conversor();
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
	}
}