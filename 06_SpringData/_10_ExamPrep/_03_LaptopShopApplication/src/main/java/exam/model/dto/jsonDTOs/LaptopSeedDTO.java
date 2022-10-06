package exam.model.dto.jsonDTOs;

import com.google.gson.annotations.Expose;
import exam.model.entity.enums.WarrantyType;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class LaptopSeedDTO {

    @Expose
    @Size(min = 8)
    private String macAddress;

    @Expose
    @Positive
    private float cpuSpeed;

    @Expose
    @Min(8)
    @Max(128)
    private int ram;

    @Expose
    @Min(128)
    @Max(1024)
    private int storage;

    @Expose
    @Size(min = 10)
    private String description;

    @Expose
    @Positive
    private BigDecimal price;

    @Expose
    @NotNull
    private WarrantyType warrantyType;

    @Expose
    private ShopNameDTO shop;

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public float getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(float cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public WarrantyType getWarrantyType() {
        return warrantyType;
    }

    public void setWarrantyType(WarrantyType warrantyType) {
        this.warrantyType = warrantyType;
    }

    public ShopNameDTO getShop() {
        return shop;
    }

    public void setShop(ShopNameDTO shop) {
        this.shop = shop;
    }
}
