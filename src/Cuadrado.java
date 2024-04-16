public class Cuadrado implements iFigura2D{
    private double lado;

    //CONSTRUCTORS
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }
    //Métodos
    @Override
    public double perimetre(){
        return 4*lado;
    }
    @Override
    public double area(){
        return lado*lado;
    }
    @Override
    public void escalar(double escala){
        lado *= escala;
    }
    public String toString(){
        return "El cuadrat te els costats de "+lado;
    }
}
