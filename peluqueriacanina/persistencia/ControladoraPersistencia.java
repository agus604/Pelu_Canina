package peluqueriacanina.persistencia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import peluqueriacanina.logica.Duenio;
import peluqueriacanina.logica.Mascota;
import peluqueriacanina.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

   
   
   DuenioJpaController1 duenioJpa = new DuenioJpaController1();
   MascotaJpaController1 mascoJpa = new MascotaJpaController1();
   


    public void guardar(Mascota masco, Duenio duenio) {
       
       duenioJpa.create(duenio);
       mascoJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
    return mascoJpa.findMascotaEntities();
    }



    public void borrarMascota(int num_cliente) {
        try{
            mascoJpa.destroy(num_cliente);
          } catch (NonexistentEntityException ex){
          }
     
    }

    public Mascota traerMascota(int num_cliente) {
      return mascoJpa.findMascota(num_cliente);  
    }

    public void modificarMascota(Mascota masco) {
       try {
           mascoJpa.edit(masco);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    public Duenio traerDuenio(int id_duenio) {
       return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
       try {
           duenioJpa.edit(dueno);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
}
