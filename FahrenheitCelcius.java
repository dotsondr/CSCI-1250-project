public class FahrenheitCelcius
{
    private Double tempF;

    public FahrenheitCelcius()
    {
        tempF = 0.0;
    }

    public Double convertTempF()
    {
        Double tempFconvert;
        tempFconvert = ((9 * tempF)/5) + 32;
        return tempFconvert;
    }
}