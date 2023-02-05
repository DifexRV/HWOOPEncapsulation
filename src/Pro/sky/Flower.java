package Pro.sky;

public class Flower {

    private String flowerName;
    private String country;
    private double cost;
    int lifeSpan;

    Flower(String flowerName, final String country, final double cost, int lifeSpan) {

        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }

        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }


        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public String toString() {
        return getFlowerName() + ", страна происхождения — " + getCountry() + ", стоимость штуки — " + getCost() + ", срок стояния — " + lifeSpan;
    }


}
