
package element_any_type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accept" type="{}List"/>
 *         &lt;element name="return" type="{}Map"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accepts",
    "returns"
})
@XmlRootElement(name = "conversion")
public class Conversion {

    @XmlElementWrapper(name = "accept", required = true)
    @XmlElement(name = "elements")
    protected List<Object> accepts = new ArrayList<Object>();
    @XmlElementWrapper(name = "return", required = true)
    @XmlElement(name = "entry")
    protected List<Entry> returns = new ArrayList<Entry>();

    public List<Object> getAccepts() {
        return accepts;
    }

    public void setAccepts(List<Object> accepts) {
        this.accepts = accepts;
    }

    public List<Entry> getReturns() {
        return returns;
    }

    public void setReturns(List<Entry> returns) {
        this.returns = returns;
    }

}
