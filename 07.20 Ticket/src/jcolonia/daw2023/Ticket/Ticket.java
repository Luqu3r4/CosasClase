package jcolonia.daw2023.Ticket;

public class Ticket {
	private String titulo;
	private int numero;
	private String letra;
	private int turno;
	
	public Ticket(String titulo) {
		this.titulo = titulo;
		numero = 0;
		letra = "A";
		turno = 0;
	}
	
	public void avanzarTurno() {
		turno++;
	}
	
	public int tirarTicket() {
		int numeroTicket;
		if(numero == 99) {
			numero = 0;
			int valorAscii = letra.charAt(0);
			valorAscii++;
			letra = valorAscii.;
		}
		numeroTicket = numero;
		numero++;
		
		return numeroTicket;
	}
	
	public int getTurno() {
		return turno;
	}
	
	public void restablecer() {
		numero = 0;
		turno = 0;
	}
}
