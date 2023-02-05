package Pro.sky.transport;

import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private int numberOfSeats;

    private Key key;

    public static int count;


    public static class Key {
        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun?"Удаленный запуск двигателя":"Без удаленного запуска двигателя")+ ", " +
                    (withoutAccess?"Безключевой доступ":"Безключевой доступ отсутствует");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public static int getCount() {
        return count;
    }

    public Key getKey() { return key; }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
            this.key = key;
        }

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               Key key) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "Необходимо указать тип коробки передач";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "Необходимо указать тип кузова";
        } else {
            this.bodyType = bodyType;
        }


        this.numberOfSeats = validateCarNumberOfSeats(numberOfSeats);

        this.registrationNumber = validateCarRegistrationNumber(registrationNumber);

        setKey(key);
        count++;

    }

    // region validation
    public String validateCarRegistrationNumber(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
            return number;
        } else {
            System.out.println("Номер указан не верно");
            return "неверный номер";
        }
    }

    public int validateCarNumberOfSeats(int seatCount) {
        return seatCount <= 0 ? 4 : seatCount;
    }

    //endregion

    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", " + color + " цвет, объем двигателя — " + engineVolume + " л. " +
                "Коробка передач: " + transmission + ". Тип кузова: " + bodyType + ". Регистрационный номер автомобиля: " + registrationNumber + ". " +"\n" +
                "Количество мест: " + numberOfSeats + ". Вид зажигания: "  + key;
    }

}