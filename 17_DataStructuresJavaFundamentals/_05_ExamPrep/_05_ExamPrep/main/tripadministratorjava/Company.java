package tripadministratorjava;

import java.util.Objects;

public class Company {
    public String name;
    public int tripOrganizationLimit;

    public Company(String name, int tripOrganizationLimit) {
        this.name = name;
        this.tripOrganizationLimit = tripOrganizationLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        
        return tripOrganizationLimit == company.tripOrganizationLimit && name.equals(company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tripOrganizationLimit);
    }
}
