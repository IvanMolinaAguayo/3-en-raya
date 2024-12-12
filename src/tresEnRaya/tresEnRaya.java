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

	            //Movimientos totales de los jugadores
	            
	            for (int movimientos = 0; movimientos < 9; movimientos++) {
	            	  for (char[] fila : tablero) {
		                    System.out.println(" " + fila[0] + " | " + fila[1] + " | " + fila[2]);
		                    if (fila != tablero[2]) System.out.println("---|---|---"); //Mostramos el tablero por pantalla
		                }
	            	  
	            	  //Pedimos al jugador que escoga una posición

	            	   System.out.println("\nTurno de " + (turnoJugador1 ? jugador1 : jugador2));
		                System.out.print("Elige una posición (1-9): ");
		                String posicion = scr.nextLine();
		                
		                //Comprobamos que la posición escogida por el jugador es válida y la marcamos
		                
		                try {
		                    int pos = Integer.parseInt(posicion) - 1;
		                    if (tablero[pos / 3][pos % 3] == 'X' || tablero[pos / 3][pos % 3] == 'O') {
		                        System.out.println("Posición incorrecta o ocupada. Prueba otro valor.");
		                        movimientos--;
		                        continue;
		                    }
		                    tablero[pos / 3][pos % 3] = turnoJugador1 ? 'X' : 'O';
		                } catch (Exception e) {
		                    System.out.println("Entrada inválida. Inténtalo de nuevo.");
		                    movimientos--;
		                    continue;
		                }
		                
		                //Comprobamos el ganador en filas y columnas
		                
		                for (int i = 0; i < 3; i++) {
		                    if ((tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) ||
		                        (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i])) {
		                        System.out.println("\n¡" + (turnoJugador1 ? jugador1 : jugador2) + " ha ganado!");
		                        movimientos = 9;
		                        break;
		                    }
		                }
		                
		                //Comprobamos si el ganador está en las diagonales
		                
		                if ((tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) ||
			                    (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0])) {
			                    System.out.println("\n¡" + (turnoJugador1 ? jugador1 : jugador2) + " ha ganado!");
			                    break;
			                }




		                    

	}
}


