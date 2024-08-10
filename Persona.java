/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipofutbol;

/**
 *
 * @author andre
 */
public class Persona {

    public String nombre;
   public  String edad;
    public String sexo;
    Persona(String nombre, String edad, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }
    public void Agregar(){
        System.out.println("La persona "+nombre+" de edad "+edad+ "y sexo "+sexo+ "esta hablando");
    }
    
}


