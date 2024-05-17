package jcolonia.daw2023.Ticket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VentanaAviso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel jpanelPrincipal;
	private JPanel jpanelBotones;
	private JTextArea jtexto;
	private String aviso;
	private JButton jbotonAceptar;
	private int tamañoFuente;

	/**
	 * Create the frame.
	 */
	public VentanaAviso(String aviso) {
		this.aviso = aviso;
		tamañoFuente = 18;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getJpanelPrincipal());
		contentPane.add(getJpanelBotones(), BorderLayout.SOUTH);
	}
	/**
	 * @param aviso texto con el que saldra el aviso
	 * @param tamañoFuente tamaño del texto del aviso
	 * @wbp.parser.constructor
	 */
	public VentanaAviso(String aviso, int tamañoFuente) {
		this.aviso = aviso;
		this.tamañoFuente = tamañoFuente;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getJpanelPrincipal());
		contentPane.add(getJpanelBotones(), BorderLayout.SOUTH);
	}

	private JPanel getJpanelPrincipal() {
		if (jpanelPrincipal == null) {
			jpanelPrincipal = new JPanel();
			jpanelPrincipal.setLayout(new BorderLayout(0, 0));
			jpanelPrincipal.add(getJtexto(tamañoFuente), BorderLayout.CENTER);
		}
		return jpanelPrincipal;
	}
	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			jpanelBotones.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelBotones.setLayout(new BorderLayout(0, 0));
			jpanelBotones.add(getJbotonAceptar(), BorderLayout.CENTER);
		}
		return jpanelBotones;
	}
	private JTextArea getJtexto(int tamañoFuente) {
		if (jtexto == null) {
			jtexto = new JTextArea(aviso);
			jtexto.setFont(new Font("Monospaced", Font.PLAIN, tamañoFuente));
			jtexto.setEditable(false);
		}
		return jtexto;
	}
	private JButton getJbotonAceptar() {
		if (jbotonAceptar == null) {
			jbotonAceptar = new JButton("ACEPTAR");
			jbotonAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return jbotonAceptar;
	}
}
