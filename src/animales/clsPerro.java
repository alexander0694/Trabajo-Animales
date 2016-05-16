
package animales;

public class clsPerro extends clsAnimal {

    private String raza;

    public clsPerro(String nombre,String tipo_alimentacion,int edad,String raza){
        super(nombre,tipo_alimentacion,edad);
        this.raza = raza;
    }

    public String Raza() {
        return raza;
    }

    public void Raza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println(Nombre() + "-"+Tipo_alimentacion()+"-"+Edad()+"-"+Raza());
    }
    
}
