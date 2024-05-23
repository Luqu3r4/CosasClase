package jcolonia.daw2023.sqlite0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class VentanaPaises extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel jpanelExterior;
	private JPanel jpanelEntrada;
	private JPanel jpanelSalida;
	private JTextArea jtextoSalida;
	private JPanel jpanelBotones;
	private JTextArea jtextoUsuario;
	private JButton btnNewButton;
	private JPanel jpanelTexto;
	private JTextArea jtextoFijo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPaises frame = new VentanaPaises();
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
	public VentanaPaises() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getJpanelExterior(), BorderLayout.CENTER);
	}

	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			jpanelExterior.setLayout(new BorderLayout(0, 0));
			jpanelExterior.add(getJpanelEntrada(), BorderLayout.NORTH);
			jpanelExterior.add(getJpanelSalida(), BorderLayout.CENTER);
		}
		return jpanelExterior;
	}
	private JPanel getJpanelEntrada() {
		if (jpanelEntrada == null) {
			jpanelEntrada = new JPanel();
			jpanelEntrada.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelEntrada.setLayout(new BorderLayout(0, 0));
			jpanelEntrada.add(getJpanelBotones(), BorderLayout.SOUTH);
			jpanelEntrada.add(getJpanelTexto(), BorderLayout.NORTH);
		}
		return jpanelEntrada;
	}
	private JPanel getJpanelSalida() {
		if (jpanelSalida == null) {
			jpanelSalida = new JPanel();
			jpanelSalida.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelSalida.setLayout(new BorderLayout(0, 0));
			jpanelSalida.add(getJtextoSalida());
		}
		return jpanelSalida;
	}
	private JTextArea getJtextoSalida() {
		if (jtextoSalida == null) {
			jtextoSalida = new JTextArea();
		}
		return jtextoSalida;
	}
	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			jpanelBotones.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelBotones.setLayout(new BorderLayout(0, 0));
			jpanelBotones.add(getBtnNewButton(), BorderLayout.EAST);
		}
		return jpanelBotones;
	}
	private JTextArea getJtextoUsuario() {
		if (jtextoUsuario == null) {
			jtextoUsuario = new JTextArea();
		}
		return jtextoUsuario;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
		}
		return btnNewButton;
	}
	private JPanel getJpanelTexto() {
		if (jpanelTexto == null) {
			jpanelTexto = new JPanel();
			jpanelTexto.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelTexto.setLayout(new BorderLayout(10, 0));
			jpanelTexto.add(getJtextoUsuario());
			jpanelTexto.add(getJtextoFijo(), BorderLayout.WEST);
		}
		return jpanelTexto;
	}
	private JTextArea getJtextoFijo() {
		if (jtextoFijo == null) {
			jtextoFijo = new JTextArea();
			jtextoFijo.setText(" PAÍS: ");
		}
		return jtextoFijo;
	}
}
