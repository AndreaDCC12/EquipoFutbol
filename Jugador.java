/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipofutbol;

/**
 *
 * @author andre
 */
public   class Jugador extends Persona implements Trabajojugador{
    String posicion;
    int numerocamiseta;
    
    public Jugador(String nombre, String  edad, String sexo, String posicion, int numerocamiseta) {
        super(nombre, edad, sexo);
        this.posicion=posicion;
        this.numerocamiseta=numerocamiseta;
    }

    @Override
    public void jugar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void anotargol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    



   

