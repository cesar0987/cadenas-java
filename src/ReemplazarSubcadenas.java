public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas
        var cadenaPrincipal="Hola Mundo";
        System.out.println("cadenaPrincipal = " + cadenaPrincipal);

        //Reemplazer "Mundo" por "a todos"
        var nuevaCadena=cadenaPrincipal.replace("Mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Remplazar "Hola" por "Adios"
        nuevaCadena=cadenaPrincipal.replace("Hola","Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
