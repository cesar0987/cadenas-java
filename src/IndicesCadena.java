public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de indices de cadenas
        var cadena1 ="Hola Mundo";

        //Recuperar el primer caracter
        var primerCaracter=cadena1.charAt(0);//Recupera el Caracter de H
        System.out.println("primerCaracter = " + primerCaracter);
        //Recuperar el ultimo caracter
        var ultimoCaracter=cadena1.charAt(9);//Recupera el Caracter de O
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        //Recuperar el caracter m,indice 5
        var caracterEspecifico=cadena1.charAt(5);
        System.out.println("caracterEspecifico = " + caracterEspecifico);

    }
}
