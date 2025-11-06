public class Quadrado { 
       //criar a classe quadrado, com atributos area e perimetro com os metodos calcular area, calcular perimetro e imprimir//

       //atributos//
       public double area;
       private double perimetro;
       private double lado;

       //metodo construtor//
       public Quadrado(double lado){
              this.lado = lado;

       }

       //metodos proprios//
       public double CalcularArea(){
              area = lado * lado;
              return this.area;
       }
      
       public double Perimetro(){
              area = lado * 4;
              return perimetro;
       }
       
       public void imprimir(){
              System.out.println("Lado: " + this.lado);
              System.out.println("Area: " + this.area);
              System.out.println("Perimetro: " + this.perimetro);
       }


    
}