public class Departamento_De_Ventas implements Departamento{

    private int id;
    private String nombre;

    public Departamento_De_Ventas(String nombre){
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
}
