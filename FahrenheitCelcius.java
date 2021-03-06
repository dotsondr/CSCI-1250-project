/**
 * ---------------------------------------------------------------------------
 * File name: FahrenheitCelsius.java
 * Project name: CSCI 1250 Semester Project
 * ---------------------------------------------------------------------------
 * Creator's name and email: Daniel Dotson, dotsondr@etsu.edu
 * Course:  CSCI 1250
 * Creation Date: October 28, 2020 
 * ---------------------------------------------------------------------------
*/

/**
 * This class accepts a parameter from the driver and converts Fahrenheit temps to
 * Celsius temperatures. 
 *
 * Date created: October 28, 2020
 * 
 * @author Daniel Dotson
 */
public class FahrenheitCelcius
{
    private Double tempF;

    /**
	 * Constructor for Class. Instantiates the tempF variable to 0.0 as a default. 
	 *
	 * Date created: October 28, 2020 
	 *
	 * @param 
	 * @return 
	 */
    public FahrenheitCelcius()
    {
        tempF = 0.0;
    }

    /**
	 * Converts the temp from Fahrenheit to Celsius and returns the result as a double. 
     * Should be called externally from the Driver. 
	 *
	 * Date created: October 28, 2020 
	 *
	 * @param 
	 * @return Double: The converted Celsius temperature. 
	 */
    public Double convertTempF()
    {
        Double tempFconvert;
        tempFconvert = ((tempF - 32) * 5)/9;
        return tempFconvert;
    }
}