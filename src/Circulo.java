public class Circulo implements iFigura2D{
    private double radio;
//Constructors
    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo() {
    }
//Métodos
    @Override
    public double perimetre(){
        return 2* Math.PI * radio;
    }
    @Override
    public double area(){
        return Math.PI * radio * radio;
    }
    @Override
    public void escalar(double escala){
        radio*=escala;
    }
    public String toString(){
        return "El cercle te el radi de "+radio;
    }
}
