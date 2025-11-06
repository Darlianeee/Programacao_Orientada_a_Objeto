public class Circulo {
    private double raio;
    private double area;
    private double perimetro;
    private double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getPerimetro(){
        return perimetro;
    }

    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }

    public void areaCirculo(){
        area = pi * raio * raio;
    }

    public void perimetroCirculo(){
        perimetro = 2 * pi * raio;
    }

    public void imprimir(){
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}