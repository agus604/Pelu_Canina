        
package peluqueriacanina.logica;
//Modelo Logico

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Mascota implements Serializable {
    //Clave primariaa
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Trabaja con secuencia
    
    //Atributos
    private int num_cliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String AttEsp;
    private String observaciones;
    @OneToOne      //la notacion va arriba de lo que quiero mapear
    //Relaciones en java
    //relacionar 1 a 1, se hace con lista de objeto, mascota como principal
    private Duenio unDuenio; //Creamos la relacion
    
    //Contructor vacio
    public Mascota() {
    }
    //Constructor con parametros.
    public Mascota(int num_cliente, String nombre, String raza, String color, String alergico, String AttEsp, String observaciones, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.AttEsp = AttEsp;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }
    //Metodos get y set
    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAttEsp() {
        return AttEsp;
    }

    public void setAttEsp(String AttEsp) {
        this.AttEsp = AttEsp;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
   
    
    
}
