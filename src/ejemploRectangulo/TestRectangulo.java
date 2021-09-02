package ejemploRectangulo;

public class TestRectangulo {
    
    public static void main(String[] args) {
        
        Rectangulo a = new Rectangulo();
        imprimirInfoRectangulo(a);
        
        Rectangulo b = new Rectangulo();
        imprimirInfoRectangulo(b);
        
        b.setBase(30);
        imprimirInfoRectangulo(b);
        
        b.setAltura(50);
        imprimirInfoRectangulo(b);
        
        
    }
    
    public static void imprimirInfoRectangulo(Rectangulo r){
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Color: "+ Rectangulo.COLOR);
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: "+r.calcularPerimetro());
        System.out.println("--------------------------------");
    }
}
