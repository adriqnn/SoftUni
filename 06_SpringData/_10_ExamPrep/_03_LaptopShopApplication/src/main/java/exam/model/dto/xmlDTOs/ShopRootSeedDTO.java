package exam.model.dto.xmlDTOs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "shops")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopRootSeedDTO {

    @XmlElement(name = "shop")
    private List<ShopSeedDTO> shops;

    public List<ShopSeedDTO> getShops() {
        return shops;
    }

    public void setShops(List<ShopSeedDTO> shops) {
        this.shops = shops;
    }
}
