public class Paises {
    String nombre;
    String ubicacion;
    int habitantes;

    public Paises() {
    }

    public Paises(String nombre, String ubicacion, int habitantes) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.habitantes = habitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setAbitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ubicacion: " + getUbicacion());
        System.out.println("Habitantes: " + getHabitantes());

    }
}
