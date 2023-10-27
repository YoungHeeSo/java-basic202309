package day11.quiz;

public class Trader {
    private final String name; // 이름
    private final String city; // 사는 도시

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return String.format("Trader: %s in %s", name, city);
    }
}
