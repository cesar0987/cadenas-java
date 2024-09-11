public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de cadenas(pool de cadenas)
        var cadena1 ="Java";
        var cadena2="Java";
        var cadena3=new String("Java");
        //Comparacion de cadenas (==)comparan la referencia en memoria
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1==cadena2);

        //Comparamos la cadena1 con la cadena2(referencia)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1==cadena3);
        //Comparar contenido usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
