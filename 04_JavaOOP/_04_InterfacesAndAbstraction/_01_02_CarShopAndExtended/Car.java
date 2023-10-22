package _04_JavaOOP._04_InterfacesAndAbstraction._01_02_CarShopAndExtended;

import java.io.Serializable;

public interface Car extends Serializable {
    public static final int TIRES = 4;

    public String getModel();
    public String getColor();
    public Integer getHorsePower();
    public String countryProduced();
}
