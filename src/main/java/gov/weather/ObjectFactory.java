
package gov.weather;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.weather package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Dwml_QNAME = new QName("", "dwml");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.weather
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LatLong }
     * 
     */
    public LatLong createDwmlType() {
        return new LatLong();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dwml")
    public JAXBElement<LatLong> createDwml(LatLong value) {
        return new JAXBElement<LatLong>(_Dwml_QNAME, LatLong.class, null, value);
    }

}
