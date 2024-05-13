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
	
	public String tirarTicket() {
		String valorTicket;
		if(numero == 99) {
			numero = 0;
			int valorAscii = letra.charAt(0);
			valorAscii++;
			letra = String.valueOf((char) valorAscii);
		}else {
			numero++;			
		}
		valorTicket = String.format("Letra: %s\nNumero: %s", letra, numero);
		return valorTicket;
	}
	
	public int getTurno() {
		return turno;
	}
	
	public void restablecer() {
		numero = 0;
		letra = "A";
		turno = 0;
	}
}
