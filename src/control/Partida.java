package control;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Partida {

    SampleController sampleController;

    int puntosJug1 = 0;
    int puntosJug2 = 0;
    int puntosEmpate = 0;
    int turno = 1;

    private int[][] wins = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 4, 7 }, { 3, 6, 9 }, { 2, 5, 8 }, { 1, 5, 9 }, { 7, 5, 3 } };

    ArrayList<Integer> posicionesJug1 = new ArrayList<>();
    ArrayList<Integer> posicionesJug2 = new ArrayList<>();

    public Partida(SampleController sampleController) {
        this.sampleController = sampleController;
    }

    public void jugarTurno(int pos){

        // turnos impares
        if (turno % 2 == 1){
            posicionesJug1.add(pos);
            comprobarGanador(posicionesJug1,1);
            turno++;
        } else {
            posicionesJug2.add(pos);
            comprobarGanador(posicionesJug2,2);
            turno++;
        }


    }

    public int getTurno() {
        return turno;
    }


   void comprobarGanador(ArrayList jugador, int numJugador){

       boolean ganador = false;

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
               ganador = true;
               ganar(numJugador);
               break;
           }
       }

       if (posicionesJug1.size() == 5 && posicionesJug2.size() == 4 && !ganador){
           empate();
       }

   }

    private void ganar(int jugador){

        if (jugador == 1){
            puntosJug1++;
        } else {
            puntosJug2++;
        }

        sampleController.reinicio();

    }

    private void empate(){

        puntosEmpate++;
        sampleController.reinicio();

    }
}
