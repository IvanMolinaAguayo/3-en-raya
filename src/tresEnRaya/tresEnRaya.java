package tresEnRaya;
import java.util.Scanner;
import java.util.Random;
public class tresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		Random random = new Random();

		//Inicio del tres en raya
		
		 System.out.println("Bienvenido al juegod de Tres en Raya");
	        System.out.print("Ingrese el nombre del primer jugador: ");
	        String jugador1 = scr.nextLine();
	        System.out.print("Ingrese el nombre del segundo jugador: ");
	        String jugador2 = scr.nextLine();
	        
	        // Iniciamos el bucle , creamos el tabl

	        do {
	            char[][] tablero = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
	            boolean turnoJugador1 = random.nextBoolean(); //Utilizamos un boolean para dictaminar que jugador inicia
	            System.out.println("Moneda al aire... " + (turnoJugador1 ? jugador1 : jugador2) + " iniciará el juego ");

	            for (int movimientos = 0; movimientos < 9; movimientos++) {



	}
}


