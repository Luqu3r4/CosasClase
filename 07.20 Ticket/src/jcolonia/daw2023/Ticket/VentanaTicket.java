package jcolonia.daw2023.Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class VentanaTicket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel jpanelExterior;
	private JPanel jpanelBotones;
	private JButton jbotonAvanzar;
	private JButton jbotonRestablecer;
	private JPanel jpanelPrincipal;
	private JScrollPane jpanelDeslizante;
	private JButton jbotonTicket;
	private JTextArea jtexto;
	private Ticket ticket;
	private JPanel jpanelMenu;
	private JMenuBar menuBar;
	private JMenu jmenuOpciones;
	private JMenuItem jitemBienvenida;
	private JMenuItem jitemAcercaDe;

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
		Ticket ticket = new Ticket("Mariscos Recio");
		this.ticket = ticket;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getJpanelExterior());
		contentPane.add(getJpanelMenu_1(), BorderLayout.NORTH);
	}

	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setToolTipText("");
			jpanelExterior.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), ticket.getTitulo(), TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jpanelExterior.setLayout(new BorderLayout(0, 0));
			jpanelExterior.add(getJpanelBotones(), BorderLayout.SOUTH);
			jpanelExterior.add(getJpanelPrincipal(), BorderLayout.CENTER);
		}
		return jpanelExterior;
	}
	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			jpanelBotones.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelBotones.setLayout(new GridLayout(1, 0, 10, 0));
			jpanelBotones.add(getJbotonAvanzar());
			jpanelBotones.add(getJbotonRestablecer());
		}
		return jpanelBotones;
	}
	private JButton getJbotonAvanzar() {
		if (jbotonAvanzar == null) {
			jbotonAvanzar = new JButton("AVANZAR TURNO");
			jbotonAvanzar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ticket.avanzarTurno();
					} catch (TicketException e1) {
						String texto = """
								No queda gente en la cola
								""";
						JOptionPane.showMessageDialog(getVentana(), texto);
					}
					jtexto.setText(ticket.getTurno());
				}
			});
		}
		return jbotonAvanzar;
	}
	private JButton getJbotonRestablecer() {
		if (jbotonRestablecer == null) {
			jbotonRestablecer = new JButton("RESTABLECER");
			jbotonRestablecer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ticket.restablecer();
					jtexto.setText(ticket.getTurno());
				}
			});
		}
		return jbotonRestablecer;
	}
	private JPanel getJpanelPrincipal() {
		if (jpanelPrincipal == null) {
			jpanelPrincipal = new JPanel();
			jpanelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelPrincipal.setLayout(new BorderLayout(0, 10));
			jpanelPrincipal.add(getJpanelDeslizante(), BorderLayout.CENTER);
			jpanelPrincipal.add(getJbotonTicket(), BorderLayout.SOUTH);
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
	private JButton getJbotonTicket() {
		if (jbotonTicket == null) {
			jbotonTicket = new JButton("COGER TICKET");
			jbotonTicket.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						VentanaAviso frame = new VentanaAviso(ticket.cogerTicket(),32);
						frame.setVisible(true);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		}
		return jbotonTicket;
	}
	private JTextArea getJtexto() {
		if (jtexto == null) {
			jtexto = new JTextArea(ticket.getTurno());
			jtexto.setFont(new Font("Monospaced", Font.PLAIN, 32));
		}
		return jtexto;
	}
	private JPanel getJpanelMenu_1() {
		if (jpanelMenu == null) {
			jpanelMenu = new JPanel();
			jpanelMenu.setLayout(new BorderLayout(0, 0));
			jpanelMenu.add(getMenuBar_2(), BorderLayout.NORTH);
		}
		return jpanelMenu;
	}
	private JMenuBar getMenuBar_2() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getJmenuOpciones());
		}
		return menuBar;
	}
	private JMenu getJmenuOpciones() {
		if (jmenuOpciones == null) {
			jmenuOpciones = new JMenu("OPCIONES");
			jmenuOpciones.add(getJitemBienvenida());
			jmenuOpciones.add(getJitemAcercaDe());
		}
		return jmenuOpciones;
	}
	private JMenuItem getJitemBienvenida() {
		if (jitemBienvenida == null) {
			jitemBienvenida = new JMenuItem("Bienvenida");
			jitemBienvenida.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String texto = """
							Este programa permite ver cual es tu ticket 
							          y en que turno va la fila.
							""";
					JOptionPane.showMessageDialog(getVentana(), texto);
				}
			});
		}
		return jitemBienvenida;
	}
	private JMenuItem getJitemAcercaDe() {
		if (jitemAcercaDe == null) {
			jitemAcercaDe = new JMenuItem("AcercaDe");
			jitemAcercaDe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String texto = """
							Autor: Rubén Lacalle
							Versión: 1.0
							""";
					JOptionPane.showMessageDialog(getVentana(), texto);
				}
			});
		}
		return jitemAcercaDe;
	}
	private JFrame getVentana() {
		return this;
	}
}
