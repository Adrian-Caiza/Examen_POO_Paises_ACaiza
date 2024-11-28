//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("___________________________________________________________________");
        System.out.println("                         PAISES Y SUS LUGARES       ");
        System.out.println(" ¡¡ Aqui encontraras informacion sobre regiones, ciudades, etc..!! ");
        System.out.println("________________________________LUGAR 1____________________________");
        Barrios barrio1=new Barrios("Ecuador","America del sur",20000000,"Sierra", "Frio","Diversa","Quito",2900000,17500,"Nueva Aurora","buena",500);
        barrio1.imprimirDatos();
        System.out.println("________________________________LUGAR 2____________________________");
        Barrios barrio2=new Barrios("Colombia","America del sur",52000000,"Andina", "Templado","Diversa","Medeillin",4900000,24500,"Antoquia","Mala",300);
        barrio2.imprimirDatos();








    }
}
