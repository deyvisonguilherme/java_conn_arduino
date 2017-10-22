package br.com.unisanta.desafio;

public class ArduinoIHM extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public ArduinoIHM() {
		initComponents();
		ArduinoBLL.conectarArduino();
	}

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTextField1 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Controlando dispositivos externos");

		jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jTextField1.setText("00000000");

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel1.setText("Status dos pinos de saída");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel2.setText("Dispositivo 01");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setText("Dispositivo 02");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Dispositivo 03");

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel5.setText("Dispositivo 04");

		jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton1.setText("Ligar");
		jButton1.setName("1"); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				trataBotoes(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton2.setText("Ligar");
		jButton2.setName("2"); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				trataBotoes(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton3.setText("Ligar");
		jButton3.setName("3"); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				trataBotoes(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton4.setText("Ligar");
		jButton4.setName("4"); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				trataBotoes(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton5.setText("Ligar");
		jButton5.setName("7"); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				trataBotoes(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel6.setText("Dispositivo 08");

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel7.setText("Dispositivo 07");

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel8.setText("Dispositivo 06");

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel9.setText("Dispositivo 05");

		jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton6.setText("Ligar");
		jButton6.setName("6"); // NOI18N
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				trataBotoes(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton7.setText("Ligar");
		jButton7.setName("5"); // NOI18N
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				trataBotoes(evt);
			}
		});

		jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton8.setText("Ligar");
		jButton8.setName("8"); // NOI18N
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				trataBotoes(evt);
			}
		});

		jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton9.setText("Apagar Tudo");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton10.setText("Função Alarme - Ativar");
		jButton10.setActionCommand("Função Alarme - Ativar");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton11.setText("Sequencial 01");

		jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton12.setText("Sequencial 02");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(26, 26, 26)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(32, 32, 32).addComponent(jButton6,
												javax.swing.GroupLayout.PREFERRED_SIZE, 85,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addComponent(jLabel9)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel8)))
						.addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addComponent(jLabel7).addGap(41, 41, 41)
										.addComponent(jLabel6))))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel3))
										.addComponent(jLabel1))
								.addGap(29, 29, 29)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
																85, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
																85, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup().addComponent(jLabel4)
														.addGap(41, 41, 41).addComponent(jLabel5)))))
						.addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap(47, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(29, 29, 29)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel1))
				.addGap(39, 39, 39)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel5))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1)
						.addComponent(jButton2).addComponent(jButton3).addComponent(jButton4))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8)
						.addComponent(jLabel7).addComponent(jLabel6).addComponent(jLabel9))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton7)
						.addComponent(jButton6).addComponent(jButton5).addComponent(jButton8))
				.addGap(28, 28, 28).addComponent(jButton9)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton10)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton11)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
				.addComponent(jButton12).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void trataBotoes(java.awt.event.ActionEvent evt) 
	{// GEN-FIRST:event_trataBotoes
		javax.swing.JButton generico = (javax.swing.JButton) evt.getSource();

		if (generico.getText().equals("Ligar")) 
		{
			generico.setText("Desligar");
			ArduinoBLL.ligaDispositivo(generico.getName());
			jTextField1.setText(ArduinoBLL.mostraBits(ArduinoBLL.getDisplay()));
		} 
		else 
		{
			generico.setText("Ligar");
			ArduinoBLL.desligaDispositivo(generico.getName());
			String _valor = ArduinoBLL.mostraBits(ArduinoBLL.getDisplay());
			
			jTextField1.setText(_valor);
			ArduinoBLL.comunicacaoArduino(_valor);
			
		}
	}// GEN-LAST:event_trataBotoes

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
		ArduinoBLL.setDisplay(0);
		jTextField1.setText(ArduinoBLL.mostraBits(ArduinoBLL.getDisplay()));
		jButton1.setText("Ligar");
		jButton2.setText("Ligar");
		jButton3.setText("Ligar");
		jButton4.setText("Ligar");
		jButton5.setText("Ligar");
		jButton6.setText("Ligar");
		jButton7.setText("Ligar");
		jButton8.setText("Ligar");
	}// GEN-LAST:event_jButton9ActionPerformed

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
		if (jButton10.getText().equals("Função Alarme - Ativar")) {
			jButton10.setText("Função Alarme - Desativar");
			ArduinoBLL.setFlag(true);
			alarme = new Alarme(jTextField1);
			alarme.start();
		} else {
			jButton10.setText("Função Alarme - Ativar");
			ArduinoBLL.setFlag(false);
		}

	}// GEN-LAST:event_jButton10ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ArduinoIHM.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ArduinoIHM.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ArduinoIHM.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ArduinoIHM.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ArduinoIHM().setVisible(true);
			}
		});
	}

	private Alarme alarme;
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables
}
