package Lesson5;

import java.util.Arrays;
import java.util.Comparator;
     class FractionalKnapsack {
        public static void main(String[] args) {

            final Item book = new Item(1, 600);
            final Item binocular = new Item(2, 5000);
            final Item kit = new Item(4, 1500);
            final Item notebook = new Item(2, 40000);
            final Item pot = new Item(1, 500);
            final Item[] items = {book, binocular, kit, notebook,pot};
            Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
            System.out.println(Arrays.toString(items));
            final int W=10;
            int weightSoFar=0;
            double valueSoFar=0;
            int currentItem=0;

            while (currentItem<items.length && weightSoFar !=W){
                if (weightSoFar+items[currentItem].getWeight()<W){
                    valueSoFar+=items[currentItem].getValue();
                    weightSoFar+=items[currentItem].getWeight();

                } else {
                    weightSoFar=W;
                }currentItem++;
            }System.out.println("Ценность наилучшего набора: "+valueSoFar);

        }


    }
    class Item {
        private int weight;
        private int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }

        public double valuePerUnitOfWeight() {
            return value / (double) weight;
        }

        public String toString() {
            return  "weight: " +weight+","+ "value: "+value;
        }
    }
