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
	}

	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
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
						// TODO Bloque catch generado automáticamente
						e1.printStackTrace();
					}
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
						VentanaAviso frame = new VentanaAviso(ticket.cogerTicket());
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
		}
		return jtexto;
	}
}
