public class Regiones extends Paises{
    String nombre_region;
    String clima;
    String topologia;

    public Regiones(String nombre, String ubicacion, int habitantes, String nombre_region, String clima, String topologia) {
        super(nombre, ubicacion, habitantes);
        this.nombre_region = nombre_region;
        this.clima = clima;
        this.topologia = topologia;
    }

    public String getNombre_region() {
        return nombre_region;
    }

    public void setNombre_region(String nombre_region) {
        this.nombre_region = nombre_region;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTopologia() {
        return topologia;
    }

    public void setTopologia(String topologia) {
        this.topologia = topologia;
    }

    @Override

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Nombre del region: " +this.getNombre_region());
        System.out.println("Clima del region: " +this.getClima());
        System.out.println("Topologia del region: " +this.getTopologia());

    }
}
