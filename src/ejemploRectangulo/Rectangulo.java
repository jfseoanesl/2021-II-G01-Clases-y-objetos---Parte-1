
package ejemploRectangulo;


public class Rectangulo { // Cabecera de la clase
    
    // atributos de instancia
    private double base;
    private double altura;
    
    // atributo de clase
    public static final String COLOR = "Blanco";
    
    // contructor
    public Rectangulo(){
        this.base=10;
        this.altura=20;
    }
    
    // metodos getter
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    //metodos setters
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    //metodos miembros 
    
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    public double calcularPerimetro(){
        return 2*(this.altura + this.base);
    }
    
    
}
