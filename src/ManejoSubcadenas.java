public class ManejoSubcadenas {
    public static void main(String[] args) {
        //Tema de subcadenas
        var cadena1="Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //Subcadena
        var subcadena1 =cadena1.substring(0,4);
        System.out.println("subcadena = " + subcadena1);

        //Subcadena de Mundo
        var subcadena2=cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
