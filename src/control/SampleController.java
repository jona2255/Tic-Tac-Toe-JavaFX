package control;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;


public class SampleController implements Initializable {

    Partida partida;

    @FXML
    Button pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        partida = new Partida();
        posInicial();
    }



    private void posInicial() {

        pos1.setVisible(true);
        pos2.setVisible(true);
        pos3.setVisible(true);
        pos4.setVisible(true);
        pos5.setVisible(true);
        pos6.setVisible(true);
        pos7.setVisible(true);
        pos8.setVisible(true);
        pos9.setVisible(true);

    }

    @FXML
    private void marcarPos(Event event) {

        // turnos impares
        if (partida.getTurno() % 2 == 1){

            if (event.getTarget() == pos1){
                pos1.setVisible(false);

                partida.jugarTurno(1);
            } else if (event.getTarget() == pos2){
                pos2.setVisible(false);

                partida.jugarTurno(2);
            } else if (event.getTarget() == pos3){
                pos3.setVisible(false);

                partida.jugarTurno(3);
            } else if (event.getTarget() == pos4){
                pos4.setVisible(false);

                partida.jugarTurno(4);
            } else if (event.getTarget() == pos5){
                pos5.setVisible(false);

                partida.jugarTurno(5);
            } else if (event.getTarget() == pos6){
                pos6.setVisible(false);

                partida.jugarTurno(6);
            } else if (event.getTarget() == pos7){
                pos7.setVisible(false);

                partida.jugarTurno(7);
            } else if (event.getTarget() == pos8){
                pos8.setVisible(false);

                partida.jugarTurno(8);
            } else if (event.getTarget() == pos9){
                pos9.setVisible(false);

                partida.jugarTurno(9);
            }

        }else {
            // turnos pares

            if (event.getTarget() == pos1) {
                pos1.setVisible(false);
                partida.jugarTurno(1);
            } else if (event.getTarget() == pos2) {
                pos2.setVisible(false);

                partida.jugarTurno(2);
            } else if (event.getTarget() == pos3) {
                pos3.setVisible(false);

                partida.jugarTurno(3);

            } else if (event.getTarget() == pos4) {
                pos4.setVisible(false);

                partida.jugarTurno(4);


            } else if (event.getTarget() == pos5) {
                pos5.setVisible(false);

                partida.jugarTurno(5);

            } else if (event.getTarget() == pos6) {
                pos6.setVisible(false);

                partida.jugarTurno(6);

            } else if (event.getSource() == pos7) {
                pos7.setVisible(false);

                partida.jugarTurno(7);

            } else if (event.getSource() == pos8) {
                pos8.setVisible(false);

                partida.jugarTurno(8);

            } else if (event.getSource() == pos9) {
                pos9.setVisible(false);

                partida.jugarTurno(9);

            }

        }

    }


}
