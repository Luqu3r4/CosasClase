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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VetanaTicket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel jpanelExterior;
	private JPanel jpanelBorde;
	private JPanel jpanelBotones;
	private JButton jbotonAvanzarTurno;
	private JButton jbotonRestablecer;
	private JPanel jpanelPrincipal;
	private JButton jbotonCogerTicket;
	private JScrollPane jpanelDeslizante;
	private JTextArea jtexto;
	private Ticket ticket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket ticket = new Ticket("Marisco Recio");
					VetanaTicket frame = new VetanaTicket(ticket);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param ticket 
	 */
	public VetanaTicket(Ticket ticket) {
		this.ticket=ticket;
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
			jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelExterior.setLayout(new BorderLayout(0, 0));
			jpanelExterior.add(getJpanelBorde(), BorderLayout.CENTER);
			jpanelExterior.add(getJpanelBotones(), BorderLayout.SOUTH);
		}
		return jpanelExterior;
	}
	private JPanel getJpanelBorde() {
		if (jpanelBorde == null) {
			jpanelBorde = new JPanel();
			jpanelBorde.setLayout(new BorderLayout(0, 0));
			jpanelBorde.add(getJpanelPrincipal(), BorderLayout.CENTER);
		}
		return jpanelBorde;
	}
	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			jpanelBotones.setBorder(new EmptyBorder(10, 10, 10, 10));
			GroupLayout gl_jpanelBotones = new GroupLayout(jpanelBotones);
			gl_jpanelBotones.setHorizontalGroup(
				gl_jpanelBotones.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_jpanelBotones.createSequentialGroup()
						.addGap(4)
						.addComponent(getJbotonAvanzarTurno(), GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(getJbotonRestablecer(), GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
			);
			gl_jpanelBotones.setVerticalGroup(
				gl_jpanelBotones.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_jpanelBotones.createParallelGroup(Alignment.BASELINE)
						.addComponent(getJbotonRestablecer())
						.addComponent(getJbotonAvanzarTurno()))
			);
			jpanelBotones.setLayout(gl_jpanelBotones);
		}
		return jpanelBotones;
	}
	private JButton getJbotonAvanzarTurno() {
		if (jbotonAvanzarTurno == null) {
			jbotonAvanzarTurno = new JButton("AVANZAR TURNO");
		}
		return jbotonAvanzarTurno;
	}
	private JButton getJbotonRestablecer() {
		if (jbotonRestablecer == null) {
			jbotonRestablecer = new JButton("RESTABLECER");
		}
		return jbotonRestablecer;
	}
	private JPanel getJpanelPrincipal() {
		if (jpanelPrincipal == null) {
			jpanelPrincipal = new JPanel();
			jpanelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelPrincipal.setLayout(new BorderLayout(0, 10));
			jpanelPrincipal.add(getJbotonCogerTicket(), BorderLayout.SOUTH);
			jpanelPrincipal.add(getJpanelDeslizante(), BorderLayout.CENTER);
		}
		return jpanelPrincipal;
	}
	private JButton getJbotonCogerTicket() {
		if (jbotonCogerTicket == null) {
			jbotonCogerTicket = new JButton("Coger Ticket");
			jbotonCogerTicket.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaAviso numeroTicket = new VentanaAviso(ticket.cogerTicket());
				}
			});
		}
		
		return jbotonCogerTicket;
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
			jtexto = new JTextArea(ticket.getTurno());
		}
		return jtexto;
	}
}
