package control;

import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;


public class SampleController implements Initializable {

    Partida partida;

    @FXML
    Button pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9;

    @FXML
     ImageView cruz1, cruz2, cruz3, cruz4, cruz5, cruz6, cruz7, cruz8, cruz9, circulo1, circulo2, circulo3, circulo4, circulo5, circulo6, circulo7, circulo8, circulo9;

    @FXML
     Text textEmpate, textJug1, textJug2, textPuntosJug1, textPuntosJug2 ,textPuntosEmpate;

    int puntuacionJug1 = 0;
    int puntuacionJug2 = 0;
    int puntuacionEmpate = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        partida = new Partida(this);
        posInicial();
    }

    @FXML
    public void reinicio() {

        puntuacionJug1 += partida.puntosJug1;
        puntuacionJug2 += partida.puntosJug2;
        puntuacionEmpate += partida.puntosEmpate;

        partida = new Partida(this);
        posInicial();


    }

    @FXML
    void posInicial() {

        pos1.setVisible(true);
        pos2.setVisible(true);
        pos3.setVisible(true);
        pos4.setVisible(true);
        pos5.setVisible(true);
        pos6.setVisible(true);
        pos7.setVisible(true);
        pos8.setVisible(true);
        pos9.setVisible(true);

        cruz1.setVisible(false);
        cruz2.setVisible(false);
        cruz3.setVisible(false);
        cruz4.setVisible(false);
        cruz5.setVisible(false);
        cruz6.setVisible(false);
        cruz7.setVisible(false);
        cruz8.setVisible(false);
        cruz9.setVisible(false);

        circulo1.setVisible(false);
        circulo2.setVisible(false);
        circulo3.setVisible(false);
        circulo4.setVisible(false);
        circulo5.setVisible(false);
        circulo6.setVisible(false);
        circulo7.setVisible(false);
        circulo8.setVisible(false);
        circulo9.setVisible(false);

        textEmpate.setVisible(true);
        textJug1.setVisible(true);
        textJug2.setVisible(true);

        textPuntosJug1.setText(String.valueOf(puntuacionJug1));
        textPuntosJug2.setText(String.valueOf(puntuacionJug2));
        textPuntosEmpate.setText(String.valueOf(puntuacionEmpate));

        textPuntosJug1.setVisible(true);
        textPuntosJug2.setVisible(true);
        textPuntosEmpate.setVisible(true);

    }

    @FXML
    private void marcarPos(Event event) {

        // turnos impares
        if (partida.getTurno() % 2 == 1){

            if (event.getTarget() == pos1){
                pos1.setVisible(false);
                cruz1.setVisible(true);

                partida.jugarTurno(1);
            } else if (event.getTarget() == pos2){
                pos2.setVisible(false);
                cruz2.setVisible(true);

                partida.jugarTurno(2);
            } else if (event.getTarget() == pos3){
                pos3.setVisible(false);
                cruz3.setVisible(true);

                partida.jugarTurno(3);
            } else if (event.getTarget() == pos4){
                pos4.setVisible(false);
                cruz4.setVisible(true);

                partida.jugarTurno(4);
            } else if (event.getTarget() == pos5){
                pos5.setVisible(false);
                cruz5.setVisible(true);

                partida.jugarTurno(5);
            } else if (event.getTarget() == pos6){
                pos6.setVisible(false);
                cruz6.setVisible(true);

                partida.jugarTurno(6);
            } else if (event.getTarget() == pos7){
                pos7.setVisible(false);
                cruz7.setVisible(true);

                partida.jugarTurno(7);
            } else if (event.getTarget() == pos8){
                pos8.setVisible(false);
                cruz8.setVisible(true);

                partida.jugarTurno(8);
            } else if (event.getTarget() == pos9){
                pos9.setVisible(false);
                cruz9.setVisible(true);

                partida.jugarTurno(9);
            }

        } else {
            // turnos pares

            if (event.getTarget() == pos1) {
                pos1.setVisible(false);
                circulo1.setVisible(true);

                partida.jugarTurno(1);
            } else if (event.getTarget() == pos2) {
                pos2.setVisible(false);
                circulo2.setVisible(true);

                partida.jugarTurno(2);
            } else if (event.getTarget() == pos3) {
                pos3.setVisible(false);
                circulo3.setVisible(true);

                partida.jugarTurno(3);

            } else if (event.getTarget() == pos4) {
                pos4.setVisible(false);
                circulo4.setVisible(true);

                partida.jugarTurno(4);

            } else if (event.getTarget() == pos5) {
                pos5.setVisible(false);
                circulo5.setVisible(true);

                partida.jugarTurno(5);

            } else if (event.getTarget() == pos6) {
                pos6.setVisible(false);
                circulo6.setVisible(true);

                partida.jugarTurno(6);

            } else if (event.getSource() == pos7) {
                pos7.setVisible(false);
                circulo7.setVisible(true);

                partida.jugarTurno(7);

            } else if (event.getSource() == pos8) {
                pos8.setVisible(false);
                circulo8.setVisible(true);

                partida.jugarTurno(8);

            } else if (event.getSource() == pos9) {
                pos9.setVisible(false);
                circulo9.setVisible(true);

                partida.jugarTurno(9);

            }

        }

    }

}
