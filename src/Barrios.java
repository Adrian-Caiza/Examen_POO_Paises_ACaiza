public class Barrios extends Ciudades{
    String nombre_barrio;
    String seguridad;
    int numero_casas;

    public Barrios(String nombre, String ubicacion, int habitantes, String nombre_region, String clima, String topologia, String nombre_ciudad, int numero_poblacion, int numero_autos, String nombre_barrio, String seguridad, int numero_casas) {
        super(nombre, ubicacion, habitantes, nombre_region, clima, topologia, nombre_ciudad, numero_poblacion, numero_autos);
        this.nombre_barrio = nombre_barrio;
        this.seguridad = seguridad;
        this.numero_casas = numero_casas;
    }

    public String getNombre_barrio() {
        return nombre_barrio;
    }

    public void setNombre_barrio(String nombre_barrio) {
        this.nombre_barrio = nombre_barrio;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    public int getNumero_casas() {
        return numero_casas;
    }

    public void setNumero_casas(int numero_casas) {
        this.numero_casas = numero_casas;
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Nombre Barrio: " + nombre_barrio);
        System.out.println("Seguridad: " + seguridad);
        System.out.println("Numero Casas: " + numero_casas);
    }

}
