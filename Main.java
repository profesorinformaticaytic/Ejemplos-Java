import javax.imageio.stream.MemoryCacheImageInputStream;

public class Main{
public static void main(String[] args) {
    Animal a = new Gato();
    Animal b = new Perro();

    //Forma 1 de llamar a los metodos
    //a.hacerRuido();
    //b.hacerRuido();
    //Forma 2
    test(a);
    test(b);
}   //main

public static void test(Animal miAnimal){  
    // Si no definimos el metodo como "static" necesitariamos instanciar el objeto para 
    // llamar a test() - Main m = new Main(); m.test(a)
    miAnimal.hacerRuido();
}

} // Main clase
