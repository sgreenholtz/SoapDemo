package gov.weather;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.io.StringReader;

import static org.junit.Assert.*;

/**
 * Testing the NOAH weather serivce
 * @author Sebastian Greenholtz
 */
public class NdfdXMLBindingStubTest {
    @Test
    public void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53704");
        String expected = "43.0798,-89.3875";
        JAXBContext jaxbContext = JAXBContext.newInstance(LatLong.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        LatLong latLong = (LatLong) unmarshaller.unmarshal(new StringReader(result));
        assertEquals("Error retreiving lat and long", expected, latLong.getLatLonList());
    }

}