package softuni.exam.models.dto.xml;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class OfferSeedDTO {

    @XmlElement(name = "price")
    @Positive
    @NotNull
    private BigDecimal price;

    @XmlElement(name = "agent")
    @NotNull
    private AgentNameDTO agent;

    @XmlElement(name = "apartment")
    @NotNull
    private ApartmentIdDTO apartment;

    @XmlElement(name = "publishedOn")
    @NotNull
    private String publishedOn;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public AgentNameDTO getAgent() {
        return agent;
    }

    public void setAgent(AgentNameDTO agent) {
        this.agent = agent;
    }

    public ApartmentIdDTO getApartment() {
        return apartment;
    }

    public void setApartment(ApartmentIdDTO apartment) {
        this.apartment = apartment;
    }

    public String getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(String publishedOn) {
        this.publishedOn = publishedOn;
    }
}