package jcolonia.daw2023.wticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class VentanaTicket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton jBotónAvanzar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTicket frame = new VentanaTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaTicket() {
		setTitle("UT7: Ejemplo Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel jpanelExterior = new JPanel();
		jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
		jpanelExterior.setBackground(new Color(240, 240, 240));
		contentPane.add(jpanelExterior, BorderLayout.CENTER);
		jpanelExterior.setLayout(new BorderLayout(0, 10));
		
		JPanel jpanelBotones = new JPanel();
		jpanelExterior.add(jpanelBotones, BorderLayout.SOUTH);
		jpanelBotones.setLayout(new GridLayout(1, 0, 10, 0));
		
		JButton jbotónAceptar = new JButton("Aceptar");
		jbotónAceptar.setBackground(new Color(255, 255, 255));
		jpanelBotones.add(jbotónAceptar);
		
		JButton jBotónCancelar = new JButton("Cancelar");
		jBotónCancelar.setBackground(new Color(255, 255, 255));
		jBotónCancelar.setMnemonic(KeyEvent.VK_C);
		jpanelBotones.add(jBotónCancelar);
		
		JPanel jpanelBorde = new JPanel();
		jpanelBorde.setBorder(new TitledBorder(null, "UT7: Eventos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpanelExterior.add(jpanelBorde, BorderLayout.CENTER);
		jpanelBorde.setLayout(new BorderLayout(0, 0));
		
		JPanel jpanelPrincipal = new JPanel();
		jpanelBorde.add(jpanelPrincipal);
		jpanelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
		jpanelPrincipal.setLayout(new BorderLayout(0, 10));
		
		JScrollPane jpanelDeslizante = new JScrollPane();
		jpanelPrincipal.add(jpanelDeslizante, BorderLayout.CENTER);
		
		JTextArea jtexto = new JTextArea();
		jtexto.setBackground(new Color(255, 255, 255));
		jpanelDeslizante.setViewportView(jtexto);
		jpanelPrincipal.add(getJBotónAvanzar(), BorderLayout.SOUTH);
	}

	private JButton getJBotónAvanzar() {
		if (jBotónAvanzar == null) {
			jBotónAvanzar = new JButton("Avanzar");
			jBotónAvanzar.setBackground(Color.WHITE);
		}
		return jBotónAvanzar;
	}
}
