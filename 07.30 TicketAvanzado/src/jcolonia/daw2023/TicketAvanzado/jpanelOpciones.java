package jcolonia.daw2023.TicketAvanzado;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class jpanelOpciones extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel jpanelCarniceria;
	private JPanel jpanelMenu;
	private JMenuBar menuBar;
	private JMenu jmenuOpciones;
	private JMenuItem jitemAcercaDe;
	private JMenuItem jitemBienvenida;
	private JPanel jpanelPrincipal;
	private JPanel jpanelBotones;
	private JButton jbotonCancelar;
	private JButton jbotonAceptar;
	private JTextArea jtextoTurno;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public jpanelOpciones() {

		jpanelCarniceria = new JPanel();
		jpanelCarniceria.setBorder(new EmptyBorder(10, 10, 10, 10));
		jpanelCarniceria.setToolTipText("");
		jpanelCarniceria.setLayout(new BorderLayout(0, 0));
		jpanelCarniceria.add(getJpanelPrincipal());
		jpanelCarniceria.add(getJpanelBotones(), BorderLayout.SOUTH);
	}
	private JPanel getJpanelMenu() {
		if (jpanelMenu == null) {
			jpanelMenu = new JPanel();
			jpanelMenu.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelMenu.setLayout(new BorderLayout(0, 0));
			jpanelMenu.add(getMenuBar_1());
		}
		return jpanelMenu;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getJmenuOpciones());
		}
		return menuBar;
	}
	private JMenu getJmenuOpciones() {
		if (jmenuOpciones == null) {
			jmenuOpciones = new JMenu("Opciones");
			jmenuOpciones.add(getJitemBienvenida());
			jmenuOpciones.add(getJitemAcercaDe());
		}
		return jmenuOpciones;
	}
	private JMenuItem getJitemAcercaDe() {
		if (jitemAcercaDe == null) {
			jitemAcercaDe = new JMenuItem("Acerca De");
		}
		return jitemAcercaDe;
	}
	private JMenuItem getJitemBienvenida() {
		if (jitemBienvenida == null) {
			jitemBienvenida = new JMenuItem("Bienvenida");
		}
		return jitemBienvenida;
	}
	private JPanel getJpanelPrincipal() {
		if (jpanelPrincipal == null) {
			jpanelPrincipal = new JPanel();
			jpanelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelPrincipal.setLayout(new GridLayout(0, 2, 10, 0));
			jpanelPrincipal.add(getTextArea());
			jpanelPrincipal.add(getJtextoTurno());
		}
		return jpanelPrincipal;
	}
	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			jpanelBotones.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelBotones.setLayout(new GridLayout(0, 2, 10, 0));
			jpanelBotones.add(getJbotonAceptar());
			jpanelBotones.add(getJbotonCancelar());
		}
		return jpanelBotones;
	}
	private JButton getJbotonCancelar() {
		if (jbotonCancelar == null) {
			jbotonCancelar = new JButton("CANCELAR");
		}
		return jbotonCancelar;
	}
	private JButton getJbotonAceptar() {
		if (jbotonAceptar == null) {
			jbotonAceptar = new JButton("ACEPTAR");
		}
		return jbotonAceptar;
	}
	private JTextArea getJtextoTurno() {
		if (jtextoTurno == null) {
			jtextoTurno = new JTextArea();
		}
		return jtextoTurno;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
