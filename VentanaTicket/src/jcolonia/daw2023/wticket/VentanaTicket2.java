package jcolonia.daw2023.wticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class VentanaTicket2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel jpanelExterior;
	private JPanel jpanelBotones;
	private JPanel jpanelBorde;
	private JButton jbotonAceptar;
	private JButton jbotonCancelar;
	private JPanel jpanelPrincipal;
	private JScrollPane jpanelDeslizante;
	private JTextArea jtexto;
	private JButton jbotonAvanzar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTicket2 frame = new VentanaTicket2();
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
	public VentanaTicket2() {
		setTitle("UT7 : Ventana Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getJpanelExterior());
	}

	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelExterior.setLayout(new BorderLayout(0, 0));
			jpanelExterior.add(getJpanelBotones(), BorderLayout.SOUTH);
			jpanelExterior.add(getJpanelBorde(), BorderLayout.CENTER);
		}
		return jpanelExterior;
	}
	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			jpanelBotones.setLayout(new GridLayout(1, 0, 0, 0));
			jpanelBotones.add(getJbotonAceptar());
			jpanelBotones.add(getJbotonCancelar());
		}
		return jpanelBotones;
	}
	private JPanel getJpanelBorde() {
		if (jpanelBorde == null) {
			jpanelBorde = new JPanel();
			jpanelBorde.setBorder(new TitledBorder(null, "UT7: Eventos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			jpanelBorde.setLayout(new BorderLayout(0, 0));
			jpanelBorde.add(getJpanelPrincipal(), BorderLayout.CENTER);
		}
		return jpanelBorde;
	}
	private JButton getJbotonAceptar() {
		if (jbotonAceptar == null) {
			jbotonAceptar = new JButton("Aceptar");
		}
		return jbotonAceptar;
	}
	private JButton getJbotonCancelar() {
		if (jbotonCancelar == null) {
			jbotonCancelar = new JButton("Cancelar");
		}
		return jbotonCancelar;
	}
	private JPanel getJpanelPrincipal() {
		if (jpanelPrincipal == null) {
			jpanelPrincipal = new JPanel();
			jpanelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelPrincipal.setLayout(new BorderLayout(0, 0));
			jpanelPrincipal.add(getJpanelDeslizante());
			jpanelPrincipal.add(getJbotonAvanzar(), BorderLayout.SOUTH);
		}
		return jpanelPrincipal;
	}
	private JScrollPane getJpanelDeslizante() {
		if (jpanelDeslizante == null) {
			jpanelDeslizante = new JScrollPane();
			jpanelDeslizante.setViewportView(getJtexto());
		}
		return jpanelDeslizante;
	}
	private JTextArea getJtexto() {
		if (jtexto == null) {
			jtexto = new JTextArea();
		}
		return jtexto;
	}
	private JButton getJbotonAvanzar() {
		if (jbotonAvanzar == null) {
			jbotonAvanzar = new JButton("Avanzar");
		}
		return jbotonAvanzar;
	}
}
