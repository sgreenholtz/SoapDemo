package com.daehosting.tempconvert;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Tests the Temperature converter
 * @author Sebastian Greenholtz
 */
public class TemperatureConversionsTest {
    @Test
    public void celsiusToFahrenheitTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahreheitResult = service.celsiusToFahrenheit(BigDecimal.ZERO);
        assertEquals("The celsius to fahrenheit conversion failed", BigDecimal.valueOf(32), celsiusToFahreheitResult);
    }

    @Test
    public void fahrenheitToCelsiusTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("The fahrenheit to celsius conversion failed", BigDecimal.ZERO, fahrenheitToCelsiusResult);
    }

    @Test
    public void fahrenheitWindchillTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitWindchillResult = service.windChillInFahrenheit(BigDecimal.valueOf(32), BigDecimal.valueOf(5));
        assertEquals("The windchill temperature calculation failed", BigDecimal.valueOf(24.638),
                fahrenheitWindchillResult);
    }

    @Test
    public void celsiusWindchillTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitWindchillResult = service.windChillInCelsius(BigDecimal.ZERO, BigDecimal.valueOf(5));
        assertEquals("The windchill temperature calculation failed", BigDecimal.valueOf(-4.09),
                fahrenheitWindchillResult);
    }


}