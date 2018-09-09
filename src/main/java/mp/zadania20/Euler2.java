package mp.zadania20;

public class Euler2 {

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        int result = euler2.calculateSum(4000000);
        System.out.println("Suma to: " + result);
    }

    public int calculateSum (int border){
        int number1 = 0;
        int number2 = 1;
        int sum = 0;

        boolean boundExceeded = false;

        while (!boundExceeded){
            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            if(number3 > border){
                boundExceeded = true;
                break;
            }
            if(number3%2 == 0){
                sum = sum + number3;
            }
        }
        return sum;
    }

}