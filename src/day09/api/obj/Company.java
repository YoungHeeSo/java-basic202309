package day09.api.obj;

import java.util.Objects;

public class Company {
    private String Company;
    private String address;

    public Company(String company, String address) {
        Company = company;
        this.address = address;
    }

    // 객체를 찍으면 주소 값이 나오기 때문에, 주소 안에 값을 보여달라는 의미로 toString으로 오버라이딩
    @Override
    public String toString() {
        return "Company{" +
                "Company='" + Company + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(Company, company.Company) && Objects.equals(address, company.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Company, address);
    }
}
