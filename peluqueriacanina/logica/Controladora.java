
package peluqueriacanina.logica;

import java.util.List;
import peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    // Importamos la clase de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observacion, String alergico, String attEsp, String nombreDuenio, String celular) {
        // Creamos un objeto Duenio y le asignamos los valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celular);

        // Creamos un objeto Mascota y le asignamos los valores
        Mascota masco = new Mascota();
        masco.setAlergico(alergico);
        masco.setAttEsp(attEsp);
        masco.setColor(color);
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setObservaciones(observacion);
        masco.setUnDuenio(duenio); // Asignamos el dueño y lo relaciona automáticamente uno a uno

        // Llamamos al método de persistencia para guardar los objetos
        controlPersis.guardar(masco, duenio);
    }

    public List<Mascota> traerMascotas() {
        //La persistencia trae a mascotas
        return controlPersis.traerMascotas();
        
    }

    public void borrarMascota(int num_cliente) {
     controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
      return controlPersis.traerMascota(num_cliente);  
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observacion, String alergico, String attEsp, String nombreDuenio, String celular) {
       
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observacion);
        masco.setAttEsp(attEsp);
        masco.setAlergico(alergico);
        
        //Modifico la mascota
        controlPersis.modificarMascota(masco);
        
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setCelDuenio(celular);
        dueno.setNombre(nombreDuenio);
        
        //Llamo al modificar dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

    

    

  
}

