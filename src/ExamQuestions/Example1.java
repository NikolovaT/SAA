package ExamQuestions;

public class Example1 {
    public static void main(String[] args) {
        int sum=0;
        int x=2;

        do {
            x = 2*x + 3;
            if(x>100) {
                sum += x;
            }
        }
        while (x <= 10000);

        System.out.println(sum);
    }
}
