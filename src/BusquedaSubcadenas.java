public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscar cadenas
        //indexof -Devuelve el indice de la primera aparecion de la subcadena
        var cadena1="Hola Mundo";
        //subcadena a buscar "Hola"
        var indice1=cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        //lasIndexOf -Devuelve el indice de la ultima aparicion de la subcadena
        //subcadena de Mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        //Subcadena no encontrada devuelve -1
        var indice3=cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);
        var indice4=cadena1.indexOf("Java");
        System.out.println("indice4 = " + indice4);
    }
}
