package se15_Exception.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import se15_Exception.model.entities.exceptions.DominioException;

public class Reserva {

	private Integer numeroQuarto;
	private Date checkOut;
	private Date checkIn;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		if(!checkOut.after(checkIn)) {
		  throw new DominioException("Data de checkout deve ser depois da data de entrada!");	
		}
		
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	
	public long duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	
	public void atualizarDatas(Date checkIn, Date checkOut) {
		Date agora = new Date();
		
		if(checkIn.before(agora) || checkOut.before(agora)) {
			throw new DominioException("Datas de Reserva devem ser datas futuras");
		}
		
		if(!checkOut.after(checkIn)) {
			throw new DominioException("Data de checkout deve ser depois da data de entrada!");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Reserva: "
				+ "\nQuarto = " + numeroQuarto
				+ "\ncheckIn = " + sdf.format(checkIn)
				+ "\ncheckOut = " + sdf.format(checkOut) 
				+ "\nNoites = " +duracao();
	}
		
}
