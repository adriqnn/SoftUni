package exam.model.dto.jsonDTOs;

import com.google.gson.annotations.Expose;

import javax.validation.constraints.NotNull;

public class ShopNameDTO {

    @Expose
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
