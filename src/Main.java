import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<iFigura2D> figuras = new ArrayList<>();
        boolean av = true;
        while(av=true) {
            System.out.println("---Menu---");
            System.out.println("1. Afegir figures");
            System.out.println("2. Mostrar informació de totes les figures");
            System.out.println("3. Escalar totes les figures según un valor");
            System.out.println("4. Mostra el área de una figura seleccionada");
            System.out.println("5. Mostra el perímetre de una figura seleccionada");
            System.out.println("6. Ixir");
            int menu = Leer.leerEntero("Que vols fer? ");
            String seguir = "s";

            if (menu == 1) {
                while (seguir.equalsIgnoreCase("s")) {
                    System.out.println("1. Cuadrat");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Triangle");
                    System.out.println("4. Cercle");
                    int tipo = Leer.leerEntero("Quin tipo de figura vols afegir? ");
                    if (tipo == 1) {
                        Cuadrado c1;
                        double costat = Leer.leerDouble("De quant es el costat? ");
                        c1 = new Cuadrado(costat);
                        figuras.add(c1);
                        seguir = Leer.leerTexto("Vols afegir una altra figura?(s/n) ");
                    }
                    if (tipo == 2) {
                        Rectangulo r1;
                        double costat1 = Leer.leerDouble("De quant es el primer costat? ");
                        double costat2 = Leer.leerDouble("De quant es el segon costat? ");
                        r1 = new Rectangulo(costat1, costat2);
                        figuras.add(r1);
                        seguir = Leer.leerTexto("Vols afegir una altra figura?(s/n) ");
                    }
                    if (tipo == 3) {
                        Triangulo t1;
                        double base = Leer.leerDouble("De quant es la base? ");
                        double altura = Leer.leerDouble("De quant es l'altura? ");
                        t1 = new Triangulo(base, altura);
                        figuras.add(t1);
                        seguir = Leer.leerTexto("Vols afegir una altra figura?(s/n) ");
                    }
                    if (tipo == 4) {
                        Circulo ci1;
                        double radio = Leer.leerDouble("De quant es el radi? ");
                        ci1 = new Circulo(radio);
                        figuras.add(ci1);
                        seguir = Leer.leerTexto("Vols afegir una altra figura?(s/n) ");
                    }
                }
            }
                if (menu == 2) {
                    for (int i = 0; i < figuras.size(); i++) {
                        System.out.println(i + "-" + figuras.get(i));
                    }
                }
                if (menu == 3){
                    double escala = Leer.leerDouble("De quant vols que siga l'escala? ");
                    for (iFigura2D f:figuras){
                        f.escalar(escala);
                    }
                }
                if (menu == 4){
                    for (int i = 0; i < figuras.size(); i++) {
                        System.out.println(i + "-" + figuras.get(i));
                    }
                    int ff = Leer.leerEntero("De quina figura vols vore l'area'? ");
                    System.out.println("El area de la figura es: "+figuras.get(ff).area());
                }
                if (menu == 5){
                    for (int i = 0; i < figuras.size(); i++) {
                        System.out.println(i + "-" + figuras.get(i));
                    }
                    int ff = Leer.leerEntero("De quina figura vols vore el perímetre'? ");
                    System.out.println("El perimetre de la figura es: "+figuras.get(ff).perimetre());
                }
                if (menu == 6){
                    break;
                }
            }
        }
    }
