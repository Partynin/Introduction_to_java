package Chapter_28;

public class City {
    private String cityName;
    private int population;
    private String mayor;

    public City(String cityName, int population, String mayor) {
        this.cityName = cityName;
        this.population = population;
        this.mayor = mayor;
    }

    public String getCityName() {
        return cityName;
    }

    public int getPopulation() {
        return population;
    }

    public String getMayor() {
        return mayor;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }
}
