package equipofutbol;

public class EquipoFutbol {

    private String nombreequipo;
    private Jugador jugadores;
    private Entrenador entrenadores;

    public EquipoFutbol(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public void agregarjugador(Jugador jugadores) {
        this.jugadores=jugadores;
        System.out.println("El jugador "+jugadores.nombre+" ha sigo agregado al equipo");
    }
    public void eliminarjugador(Jugador jugadores){
        this.jugadores=jugadores;
        System.out.println("El jugador "+jugadores.nombre+" ha sido eliminado del equipo");
    }
    public void asignarentrenador(Entrenador entrenadores){
      this.entrenadores=entrenadores;
        System.out.println("El entrenador "+entrenadores.nombre+" ha sido asignado al equipo "+nombreequipo);
    }
    public void entrenamiento(){
        System.out.println("El equipo "+nombreequipo+ "esta entrenando");
        entrenadores.entrenar();
    }

}
