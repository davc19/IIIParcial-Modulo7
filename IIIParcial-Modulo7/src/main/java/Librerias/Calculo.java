/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librerias;

/**
 *
 * @author Personal
 */
public class Calculo extends Conversion
{
    private double Total;
    private String Moneda1, Moneda2;
    
    public Calculo()
    {
        
    }
    
    public double Calcular(String moneda1, String moneda2, double cantidad)
    {
        this.Moneda1 = moneda1;
        this.Moneda2 = moneda2;
        
        if (moneda1 == moneda2) 
        {
            Total = cantidad;
        }
        
        if (moneda1 == "Lempira" && moneda2 == "Dolar") 
        {
            Total = ConvertirLempirasDolar(cantidad);
        }
        
        if (moneda1 == "Lempira" && moneda2 == "Euro") 
        {
            Total = ConvertirLempirasEuro(cantidad);
        }
        
        if (moneda1 == "Dolar" && moneda2 == "Lempira") 
        {
            Total = ConvertirDolarLempiras(cantidad);
        }
        
        if (moneda1 == "Euro" && moneda2 == "Lempira") 
        {
            Total = ConvertirEuroLempiras(cantidad);
        }
        
        if (moneda1 == "Dolar" && moneda2 == "Euro") 
        {
            Total = ConvertirDolarEuro(cantidad);
        }
        
        if (moneda1 == "Euro" && moneda2 == "Dolar") 
        {
            Total = ConvertirEuroDolar(cantidad);
        }
        
        return Total;
    }
    
    
  @Override
            public String Moneda() 
            {
                return "Conversion de " + this.Moneda1 + " a " + this.Moneda2;
            }
}
