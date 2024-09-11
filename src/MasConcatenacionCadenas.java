public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2= "Mundo";

        //Usando el operador mas
        var cadena3= cadena1+ " " +cadena2;
        System.out.println("cadena3 = " + cadena3);

        //Metodo de concat
        cadena3=cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat= " + cadena3);

        //StringBuilder
        var constructorCadenas=new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        //StringBuffer , es recomendable para varios procesos a la vez o varios hilos
        var cadenaStringBuffer = new StringBuffer();
        cadenaStringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado=cadenaStringBuffer.toString();
        System.out.println("cadenaStringBuffer = " + cadenaStringBuffer);

        //Metodo join
        resultado=String.join(" ",cadena1,cadena2,",Adios!");
        System.out.println("resultado de join  = " + resultado);

    }
}
