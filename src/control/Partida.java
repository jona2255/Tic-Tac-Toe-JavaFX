package control;

import java.util.ArrayList;

public class Partida {

    int puntosJug1 = 0;
    int puntosJug2 = 0;

    int turno = 1;

    private int[][] wins = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 4, 7 }, { 3, 6, 9 }, { 2, 5, 8 }, { 1, 5, 9 }, { 7, 5, 3 } };

    ArrayList<Integer> posicionesJug1 = new ArrayList<>();
    ArrayList<Integer> posicionesJug2 = new ArrayList<>();

    public void jugarTurno(int pos){

        // turnos impares
        if (turno % 2 == 1){
            posicionesJug1.add(pos);
            comprobarGanador(posicionesJug1);
            turno++;
        } else {
            posicionesJug2.add(pos);
            comprobarGanador(posicionesJug2);
            turno++;
        }


    }

    public int getPuntosJug1() {
        return puntosJug1;
    }

    public int getPuntosJug2() {
        return puntosJug2;
    }

    public int getTurno() {
        return turno;
    }


   void comprobarGanador(ArrayList jugador){

       System.out.println("turno" + turno);

       for (int i = 0; i < wins.length; i++) {

           // Contador con el cual sabemos si ganamos. Para ganar tiene que llegar a 3
           int contador = 0;

           for (int j = 0; j < wins[i].length; j++) {

               for (int k = 0; k < jugador.size(); k++) {
                   if (jugador.get(k).equals(wins[i][j])){
                       contador++;
                   }
               }


           }
           if (contador == 3){
               ganar();
               break;
           }
       }


   }

    private void ganar() {

        System.out.println("has ganado");
    }
}
