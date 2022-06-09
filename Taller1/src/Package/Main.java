package Package;


public class Main {

    public static void suma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println(resultado);

    }
    public static void main(String[] args) {
    suma(5,10,20);

    Coche miCoche = new Coche(3);
        System.out.println("El numero de puertas de mi coche es: " + miCoche.nuemroPuertas);
        miCoche.setPuerta();
        System.out.println("Le sumamos una purta al coche" + miCoche.nuemroPuertas);
    }


}
