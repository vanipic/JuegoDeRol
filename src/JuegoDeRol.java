/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class JuegoDeRol {

public static void main (String [] args) {

Jugadores jugador1 = new Jugadores("Júpiter", 100, 25, 90);

Jugadores jugador2 = new Jugadores("Marte", 100, 20, 95);


JOptionPane.showMessageDialog(null, "Bienvenidos a Batalla en el Olimpo");

JOptionPane.showMessageDialog(null, "Jugador 1: "+jugador1.nombre+"\nNivel de energía: "+jugador1.vida+"\nMínimo poder: "+jugador1.minPower+"\nMáximo poder: "+jugador1.maxPower);

JOptionPane.showMessageDialog(null, "Jugador 2: "+jugador2.nombre+"\nNivel de energía: "+jugador2.vida+"\nMínimo poder: "+jugador2.minPower+"\nMáximo poder: "+jugador2.maxPower);

JOptionPane.showMessageDialog(null, "¡Comienza la batalla!");

do {

Random aleatorio = new Random();    

int n = aleatorio.nextInt(10);

JOptionPane.showMessageDialog(null, "Ataca el jugador 1\nPulse Aceptar para dar inicio al ataque");

JOptionPane.showMessageDialog(null, "Descuenta "+n+" puntos a su oponente");

jugador2.vida = jugador2.vida-n;

int b = aleatorio.nextInt(10);

jugador1.vida = jugador1.vida-b;

JOptionPane.showMessageDialog(null, "Ataca el jugador 2\nPulse Aceptar para dar inicio al ataque");

JOptionPane.showMessageDialog(null, "Descuenta "+b+" puntos a su oponente");
Random aleas = new Random();    


}

while (jugador1.vida >0||jugador2.vida>0);

if(jugador1.vida<=0) {

JOptionPane.showMessageDialog(null, "Ganador: Jugador 2");

}

else

{

JOptionPane.showMessageDialog(null, "Ganador: Jugador 1");

}

   
}
}