package Pro.sky;


import Pro.sky.transport.Car;


public class Main {

    public static void chapter() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }



    public static void task1() {

        Human human = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human human1 = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human human2 = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human human3 = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Human human4 = new Human("Владимир", 2001, "Казань", "");
        System.out.println(human);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
    }

    public static void task2() {

        Bouquet bouquet1 = new Bouquet(new Flower[]{
                new Flower("Роза", "Голландия", 33.59, 0),
                new Flower("Роза", "Голландия", 33.59, 0),
                new Flower("Хризантема", "", 15, 5),
                new Flower("Хризантема", "", 15, 5),
                new Flower("Хризантема", "", 15, 5),
                new Flower("Хризантема", "", 15, 5),
                new Flower("Хризантема", "", 15, 5),
                new Flower("Пион", "Англия", 69.9, 1),
                new Flower("Пион", "Англия", 69.9, 1),
                new Flower("Пион", "Англия", 69.9, 1),
                new Flower("Пион", "Англия", 69.9, 1),
                new Flower("Пион", "Англия", 69.9, 1),
                new Flower("Пион", "Англия", 69.9, 1),
                new Flower("Гипсофила", "Турция", 19.5, 10),
                new Flower("Гипсофила", "Турция", 19.5, 10),
                new Flower("Гипсофила", "Турция", 19.5, 10),
                new Flower("Гипсофила", "Турция", 19.5, 10),
                new Flower("Гипсофила", "Турция", 19.5, 10),
                new Flower("Гипсофила", "Турция", 19.5, 10),
                new Flower("Гипсофила", "Турция", 19.5, 10),
        });

        System.out.println(bouquet1);

    }

    public static void task3() {

        Car automobile1 = new Car("Hyundai",
                "Avante",
                1.6f,
                "оранжевый",
                2016,
                "Южная Корея",
                "АКПП",
                "Седан",
                "п777от122",
                4,
                new Car.Key(true,true));

        System.out.println(automobile1);
        chapter();

        Car automobile2 = new Car("Lada",
                "Granta",
                1.3f,
                "Баклажан",
                2013,
                "Россия",
                "МКПП",
                "Хэтчбек",
                "в666ад133",
                4,
                new Car.Key(true,false));

        System.out.println(automobile2);
        chapter();

        Car automobile3 = new Car("BMW",
                "Z4 ROADSTER",
                3f,
                "Баклажан",
                1998,
                "Германия",
                "АКПП",
                "Хэтчбек",
                "л435ак195",
                3,
                new Car.Key(false,true));

        System.out.println(automobile3);
        chapter();

    }

}