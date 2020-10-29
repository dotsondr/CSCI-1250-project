/**
 * ---------------------------------------------------------------------------
 * File name: CelsiusFahrenheit.java
 * Project name: CSCI 1250 Semester Project
 * ---------------------------------------------------------------------------
 * Creator's name and email: Daniel Dotson, dotsondr@etsu.edu
 * Course:  CSCI 1250
 * Creation Date: October 28, 2020 
 * ---------------------------------------------------------------------------
*/

/**
 * This class accepts a parameter from the driver and converts Celsius temps to
 * Fahrenheit temperatures. 
 *
 * Date created: October 28, 2020
 * 
 * @author Daniel Dotson
 */
public class CelsiusFahrenheit 
{
    private Double tempC;

    /**
	 * Constructor for Class. Instantiates the tempC variable to 0.0 as a default. 
	 *
	 * Date created: October 28, 2020 
	 *
	 * @param 
	 * @return 
	 */
    public CelsiusFahrenheit()
    {
        tempC = 0.0;
    }

    /**
	 * Converts the temp from Celsius to Fahrenheit and returns the result as a double. 
     * Should be called externally from the Driver. 
	 *
	 * Date created: October 28, 2020 
	 *
	 * @param 
	 * @return Double: The converted Fahrenheit temperature. 
	 */
    public Double convertTempC()
    {
        Double tempCConvert;
        tempCConvert = ((9 * tempC)/5) + 32;
        return tempCConvert;
    }
}
