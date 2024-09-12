public class RetoCadenas {
    public static void main(String[] args) {
        System.out.println("**Reto de cadenas**");
        //Cadenas a utilizar
        var nombre="Cesar Fernando Benitez";
        var empresa="Terracota Comercial";
        var dominio="com.py";
        //Resultado
        var resultado= new StringBuilder();
        resultado.append(nombre.replace(" ","").toLowerCase());
        resultado.append("@");
        resultado.append(empresa.toLowerCase().replace(" ",""));
        resultado.append(dominio);
        System.out.println("resultado = " + resultado);
    }
}
