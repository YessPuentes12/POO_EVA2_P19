/*

 */
package eva2_19_interfaces_figuras;


public class Circulo implements Figuras{

private double radio;

    Circulo() {
 
    }
//------------------------------------------------------------------------------
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
//------------------------------------------------------------------------------

    public Circulo(double radio) {
        this.radio = radio;
    }
//------------------------------------------------------------------------------
    
@Override
    
public double calcularA(){
return Math.PI*(radio*radio);    
}    
//------------------------------------------------------------------------------

@Override

public double calcularPe(){
return Math.PI*(radio*2);
}      
//------------------------------------------------------------------------------

public void ImprimirDatos(){
    System.out.println("\nCírculo.");
    System.out.println("Radio: " +radio);
    System.out.println("Área: " +calcularA());
    System.out.println("Perímetro: " +calcularPe());    
}


    
}
