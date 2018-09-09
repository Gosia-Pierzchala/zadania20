package mp.zadania20;

public class Euler1 {

    public static void main(String[] args) {
        Euler1 euler1 = new Euler1();
        int result = euler1.calc(1000);
        System.out.println("Wynik to: " + result);
    }

    public int calc (int border){
        int sum = 0;
        for (int i = 0; i < border; i++) {
            if(i%3 == 0 || i%5 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }

}