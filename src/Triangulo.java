public class Triangulo implements iFigura2D{
    private double base;
    private double altura;
//Constructors
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo() {
    }
//Métodos
    @Override
    public double perimetre(){
        return base*3;
    }
    @Override
    public double area(){
        return (base*altura)/2;
    }
    @Override
    public void escalar(double escala){
        base*=escala;
        altura*=escala;
    }
    public String toString(){
        return "El triangle te la base de "+base+" i l'altura de "+altura;
    }
}
