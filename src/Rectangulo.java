public class Rectangulo implements iFigura2D{
    private double lado1;
    private double lado2;
//Constructors
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo() {
    }
    //Métodos
    @Override
    public double perimetre(){
        return 2*(lado1+lado2);
    }
    @Override
    public double area(){
        return lado1*lado2;
    }
    @Override
    public void escalar(double escala){
        lado1*=escala;
        lado2*=escala;
    }
    public String toString(){
        return "El rectangle te el primer costat de "+lado1+" i el segon costat de "+lado2;
    }
}
