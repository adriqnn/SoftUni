package exam.model.dto.jsonDTOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import exam.model.dto.xmlDTOs.TownNameDTO;
import exam.model.entity.Town;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class CustomerSeedDTO {

    @Expose
    @NotNull
    @Size(min = 2)
    private String firstName;

    @Expose
    @NotNull
    @Size(min = 2)
    private String lastName;

    @Expose
    @NotNull
    @Email
    private String email;

    @Expose
    @NotNull
    private String registeredOn;

    @Expose
    @NotNull
    private TownNameDTOJSON town;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(String registeredOn) {
        this.registeredOn = registeredOn;
    }

    public TownNameDTOJSON getTown() {
        return town;
    }

    public void setTown(TownNameDTOJSON town) {
        this.town = town;
    }
}
