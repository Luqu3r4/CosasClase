package jcolonia.daw2023.TicketAvanzado;

public class TicketAvanzado {
	private String titulo;
	private int numeroTurno;
	private char letraTurno;
	private int numeroTicket;
	private char letraTicket;
	private int turno;
	
	public TicketAvanzado(String titulo) {
		this.titulo = titulo;
		numeroTurno = 0;
		letraTurno = 'A';
		numeroTicket = 0;
		letraTicket = 'A';
	}
	
	public void avanzarTurno() throws TicketAvanzadoException {
		if(comprobarDiferencia()) {
			if(numeroTurno == 99) {
				numeroTurno = 0;
				letraTurno++;
			}else {
				numeroTurno++;			
			}
		} else {
			throw new TicketAvanzadoException("NO HAY MAS GENTE EN LA COLA");
		}
	}			
	
	public String cogerTicket() {
		String valorTicket;
		if(numeroTicket == 99) {
			numeroTicket = 0;
			letraTicket++;
		}else {
			numeroTicket++;			
		}
		valorTicket = String.format("%s%s", letraTicket, numeroTicket);
		return valorTicket;
	}
	
	public String getTurno() {
		String turno;
		turno = String.format("Numero: %s\nLetra: %s", numeroTurno, letraTurno);
		return turno;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void restablecer() {
		numeroTurno = 0;
		letraTurno = 'A';
		numeroTicket = 0;
		letraTicket = 'A';
	}
	
	private boolean comprobarDiferencia(){
		boolean aceptado;
		
		if(letraTurno < letraTicket) {
			aceptado = true;
		} else if(numeroTurno >= numeroTicket){
			aceptado = false;
		}else {
			aceptado = true;
		}
		
		return aceptado;
	}

}
