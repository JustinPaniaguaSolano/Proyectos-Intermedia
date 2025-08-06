/*
    Proyecto 1 programacion intermedia 

    Autor del proyecto:Justin Paniagua Solano

    Celula:305530632

    Segundo Cuatrimestre 2024
*/

package Clases;

public class CalculadoraImpuestos {

    private static Repuesto repuesto;//atrituto para la clase Repuesto
    
    //atritutos de la clase
    private double precio;//variable para guardar el precio sin impuesto
    private double impuesto;//variable para guardar el impuesto
    private double precioConImpuesto;//variable para guardar el precio con el impuesto

    //constructor con atrituos
    public CalculadoraImpuestos(double precio, double impuesto, double precioConImpuesto) {
        this.precio = precio;
        this.impuesto = impuesto;
        this.precioConImpuesto = precioConImpuesto;
    }
//constructor sin atrituos
    public CalculadoraImpuestos() {
        this.precio = 0;
        this.impuesto = 0;
        this.precioConImpuesto = 0;
    }

    public CalculadoraImpuestos(Repuesto repuesto) {
        this.repuesto = repuesto;
    }
//metodo para sacar el impuesto acorde al precio
    public void calcularImpuesto(Repuesto repuesto) {
        precio = repuesto.getPrecioSinImpuesto();//obtener el precio de la clase repuesto
        //if para calcular el impuesto
        if (precio > 0 & precio <= 10000) {
            impuesto = (float) 0.02;
        } else if (precio > 10001 & precio <= 50000) {
            impuesto = (float) 0.05;
        } else if (precio > 50001 & precio <= 100000) {
            impuesto = (float) 0.010;
        } else if (precio > 100001) {
            impuesto = (float) 0.015;
        }
        //codigo sacado de 
        //https://www.youtube.com/watch?v=e4Yvksl2hyo
        String impuestoF = String.format("%.3f", impuesto);//recortar el impuesto
     double impuesto2 = Double.parseDouble(impuestoF);//convertir de string a double
     
        repuesto.setImpuesto(impuesto2);//guardado del impuesto en la clase repuesto
    }
    
    //metodo para sacar el precio con el impuesto
    public void PrecioConImpuesto(Repuesto repuesto) {
         precio = repuesto.getPrecioSinImpuesto();//obtener el precio sin impuesto
         impuesto=repuesto.getImpuesto();//obtener el impuesto
        precioConImpuesto = precio+ (precio * impuesto);//sacar el precio con el impuesto
        
        repuesto.setPrecioConImpuestos(precioConImpuesto);//guardar el precio con el impuesto
       String precioF = String.format("%.7f", precioConImpuesto);//recortar el impuesto
     double precioConImpuesto2 = Double.parseDouble(precioF);//convertir de string a double
     
        repuesto.setPrecioConImpuestos(precioConImpuesto2);//guardar el precio con el impuesto
      
    }
}

   