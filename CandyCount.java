class CandyCount{

    static double money = 12.4;
    static double price = 1.2;
    static int candies = 0;

    public static void main(String[] args) {

        while (money >= price && money > 0 && price > 0) {
            candies++; 
            money -= price; 
        }

        System.out.println("number candy =" + candies);

    }

}