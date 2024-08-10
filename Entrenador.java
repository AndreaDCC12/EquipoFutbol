/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipofutbol;

/**
 *
 * @author andre
 */
public class Entrenador extends Persona implements Trabajoentrenador {
    int añosexperiencia;
    public Entrenador(String nombre, String edad, String sexo, int añosexperiencia) {
        super(nombre, edad, sexo);
        this.añosexperiencia=añosexperiencia;
    }
    @Override
    public void entrenar(){
        System.out.println("El entrenador: "+nombre+" con "+añosexperiencia+" años de experiencia  esta entrenando a los jugadores");
    }
    
}
