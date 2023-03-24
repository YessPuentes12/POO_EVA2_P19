/*

 */
package eva2_19_interfaces_figuras;


public class EVA2_19_INTERFACES_FIGURAS {


    public static void main(String[] args) {
   //Figuras fig = new Figuras();
   //MostrarDatos data = new MostrarDatos();   
   
   //No se puede crear instancias de interfaces
   
    Circulo circ = new Circulo();   
    circ.setRadio(12);
    circ.ImprimirDatos();
    
    Triangulo tri = new Triangulo();
    tri.setBase(4);
    tri.setAltura(8);
    tri.ImprimirDatos();
    }
    
}
