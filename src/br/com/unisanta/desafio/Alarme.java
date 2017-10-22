package br.com.unisanta.desafio;

import javax.swing.JTextField;

public class Alarme extends Thread {

	private JTextField tf1;

	Alarme(JTextField _tf1) {
		tf1 = _tf1;
	}

	public void run() {
		while (ArduinoBLL.getFlag()) {
			ArduinoBLL.setDisplay(0);
			tf1.setText(ArduinoBLL.mostraBits(ArduinoBLL.getDisplay()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			ArduinoBLL.setDisplay(255);
			tf1.setText(ArduinoBLL.mostraBits(ArduinoBLL.getDisplay()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
