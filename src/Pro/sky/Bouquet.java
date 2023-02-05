package Pro.sky;

import java.text.DecimalFormat;

public class Bouquet {

    public Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    private double calculateBouquetCost() {
        double totalCost = 0;
        for (Flower flower : this.flowers) {
            totalCost += flower.getCost();
        }
        return totalCost * 1.1;
    }

    private int calculateBouquetLifeSpan() {
        int minlifeSpan = Integer.MAX_VALUE;
        for (Flower flower : this.flowers) {
            if (flower.lifeSpan < minlifeSpan) {
                minlifeSpan = flower.lifeSpan;
            }
        }
        return minlifeSpan;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#0.00");
        StringBuilder builder = new StringBuilder();
        builder.append("Букет состоит из: \n");

        for (Flower flower : this.flowers) {
            builder.append(flower);
            builder.append("\n");
        }
        builder.append("Общая стоимость букета составляет " + format.format(calculateBouquetCost()) + " рублей. \n" + "Срок стояния букета " + calculateBouquetLifeSpan() + " дней.");


        return builder.toString();

    }


}