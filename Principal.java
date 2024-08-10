/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipofutbol;

/**
 *
 * @author andre
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquipoFutbol equipofutbol=new EquipoFutbol("Los mejores");
        Jugador jugador1;
        jugador1 = new Jugador("Jose Sanchez", "20", "hombre", "delantero", 7);
        equipofutbol.agregarjugador(jugador1);
        Jugador jugador2;
         jugador2 = new Jugador("Mario Perez", "25", "hombre", "portero", 10);
        equipofutbol.eliminarjugador(jugador2);
        Entrenador entrenador;
        entrenador=new Entrenador("Julio Cesar", "38", "hombre", 15);
        equipofutbol.asignarentrenador(entrenador);
        equipofutbol.entrenamiento();
            }
    
}
