import java.util.ArrayList;
import java.util.List;

public class Departamento_Jefe implements Departamento{
    
    private int id;
    private String nombre;
    private ArrayList<Departamento> dependencias = new ArrayList<>();;

    public Departamento_Jefe( String nombre){
        this.nombre=nombre;
    }

    @Override
    public void mostrarNombreApartamento() {
        System.out.println(nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void anadirDepartamentos(Departamento depar){
        this.dependencias.add(depar);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Departamento> getDependencias() {
        return dependencias;
    }
}
