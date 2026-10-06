package first;

public class ifElse {
    public static void main(String[] args) {
        int score = 21;

        if (score >= 90) {
            System.out.println("Оценка : 5");
        }else if (score >= 75) {
            System.out.println("Оценка : 4");
        }else if (score >= 60) {
            System.out.println("Оценка : 3");
        }else  {
            System.out.println("Оценка : 2");
        }
    }
}
