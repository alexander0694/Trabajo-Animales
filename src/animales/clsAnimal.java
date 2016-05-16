
package animales;


public class clsAnimal {

    private String nombre;
    private String tipo_alimentacion;
    private int edad;
    
    public clsAnimal(){
    }

    public clsAnimal(String nombre,String tipo_alimentacion,int edad){
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }

    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Tipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void Tipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int Edad() {
        return edad;
    }

    public void Edad(int edad) {
        this.edad = edad;
    }
}
    
}
