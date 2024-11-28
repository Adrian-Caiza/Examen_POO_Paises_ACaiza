public class Ciudades extends Regiones{
    String nombre_ciudad;
    int numero_poblacion;
    int numero_autos;

    public Ciudades(String nombre, String ubicacion, int habitantes, String nombre_region, String clima, String topologia, String nombre_ciudad, int numero_poblacion, int numero_autos) {
        super(nombre, ubicacion, habitantes, nombre_region, clima, topologia);
        this.nombre_ciudad = nombre_ciudad;
        this.numero_poblacion = numero_poblacion;
        this.numero_autos = numero_autos;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }

    public int getNumero_poblacion() {
        return numero_poblacion;
    }

    public void setNumero_poblacion(int numero_poblacion) {
        this.numero_poblacion = numero_poblacion;
    }

    public int getNumero_autos() {
        return numero_autos;
    }

    public void setNumero_autos(int numero_autos) {
        this.numero_autos = numero_autos;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Nombre ciudad: " +this.getNombre_ciudad());
        System.out.println("Numero poblacion: " +this.getNumero_poblacion());
        System.out.println("Numero autos: " +this.getNumero_autos());
    }
}
