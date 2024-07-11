import java.util.Random;

public class RandomNumbers {
    private int max;
    private int min;
    private Random random;

    public RandomNumbers() {
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        random = new Random();
    }

    public void generateNumbers() {
        int sum = 0;
        while (sum <= 5000) {
            int number = random.nextInt(31);
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            sum += number;
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateNumbers();
        System.out.println("Największa wylosowana wartość: " + randomNumbers.getMax());
        System.out.println("Najmniejsza wylosowana wartość: " + randomNumbers.getMin());
    }
}