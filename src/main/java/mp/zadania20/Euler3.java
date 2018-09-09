package mp.zadania20;
// https://projecteuler.net/problem=5

public class Euler3 {
    public static void main(String[] args) {
        Euler3 euler3 = new Euler3();
        int result = euler3.findNumber(20);
        System.out.println("Szukana liczba to: " + result);
    }

    public int findNumber(int border){
        int i = 1;
        int j = 1;
        while (i <= border) {
            if(j%i==0){
                i++;
            } else {
                i = 1;
                j++;
            }
        }
        return j;
    }

}