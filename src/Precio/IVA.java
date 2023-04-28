package Precio;

public class IVA {
   public static double calcularIVA(double precio){
       double iva = precio * 0.21;
       double precioConIva = precio + iva;
       return precioConIva;
   }

   public static void main (String[] args){
       double precio = 100.0;
       double precioConIva = IVA.calcularIVA(precio);

       System.out.println("El precio con IVA incluido es " + precioConIva);
   }
}
