
package Librerias;

/**
 * 201710080097
 * @author Milton David Canales
 */
public abstract class Conversion 
{
    private double TasaDolar;
    private double TasaEuro;
    private double TasaDolarEuro;
    private double TasaEuroDolar;
    
    public abstract String Moneda();
    
    public Conversion()
    {
        //Constructor
    }
    
    public void setTasaDolarLps(double _tasaDolar)
    {
        this.TasaDolar = _tasaDolar;
    }

    public void setTasaEuroLps(double _tasaEuro)
    {
        this.TasaEuro = _tasaEuro;
    }


    public void setTasaDolarEuro(double _tasaDolarEuro)
    {
        this.TasaDolarEuro = _tasaDolarEuro;
    }

    public void setTasaEuroDolar(double _tasaEuroDolar)
    {
        this.TasaEuroDolar = _tasaEuroDolar;
    }

    
    public double ConvertirLempirasDolar(double valorConvertir)
    {
        return valorConvertir / this.TasaDolar;
    }

    public double ConvertirLempirasEuro(double valorConvertir)
    {
        return valorConvertir / this.TasaEuro;
    }

    public double ConvertirDolarLempiras(double valorConvertir)
    {
        return valorConvertir * this.TasaDolar;
    }

    public double ConvertirEuroLempiras(double valorConvertir)
    {
        return valorConvertir * this.TasaEuro;
    }

    public double ConvertirEuroDolar(double valorConvertir)
    {
        return valorConvertir * this.TasaDolarEuro;
    }

    public double ConvertirDolarEuro(double valorConvertir)
    {
        return valorConvertir / this.TasaDolarEuro;
    }
}
