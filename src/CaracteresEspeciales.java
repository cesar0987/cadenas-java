public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres especiales
        // \n imprimir un salto de linea
        var cadena1="Hola \n Mundo";
        System.out.println("cadena1 = " + cadena1);

        // '\t' agrega una tabulacion
        var cadena2 ="\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        //Comilla simple \'
        var cadena3="Hola \' Mundo";
        System.out.println("cadena3 = " + cadena3);

        // Comilla doble \""
        var cadena4="Hola \"Mundo";
        System.out.println("cadena4 = " + cadena4);

        // Diagonal Inversa \\
        var cadena5="Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);

    }
}
