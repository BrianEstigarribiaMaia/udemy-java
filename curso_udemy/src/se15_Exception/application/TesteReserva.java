package se15_Exception.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import se15_Exception.model.entities.Reserva;
import se15_Exception.model.entities.exceptions.DominioException;

public class TesteReserva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Numero do quarto: ");
			int num = sc.nextInt();
			System.out.print("Data chechIn (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data chechOut (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(num, checkIn, checkOut);
			System.out.println();
			System.out.println("Digite os dados de atualização da reserva");
			System.out.print("Data chechIn (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data chechOut (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reserva.atualizarDatas(checkIn, checkOut);
			System.out.println("Reserva: "+ reserva);
			
		} catch (ParseException e) {
			System.out.println("Formato Invalido");
		} catch (DominioException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		sc.close();
	}

}
