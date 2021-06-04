class Pruebas {
    public static void main (String []args){
    int numero = 5;
    //Forma 1
    //String miarray[] = {"uno","dos","tres"}; // Empieza en 0
    //Forma 2
    String miarray[] = new String[3];
    char miarray2[]={'h','o','l','a'};
    miarray[1]= "uno";
    miarray[2]= "dos";
    String cadena = new String("Hola mundo");
    System.out.println(numero);
    System.out.println(cadena);
    System.out.println(miarray[2]);
    System.out.println(cadena.indexOf("mu"));
    System.out.println(miarray);
    System.out.println(String.valueOf(miarray2));
    }
}