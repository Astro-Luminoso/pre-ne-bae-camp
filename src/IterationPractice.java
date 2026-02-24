
import java.util.stream.IntStream;

public class IterationPractice {


    public void iterate(int start, int end, int increment) {

        for(int i=start; i<=end; i+=increment) {
            System.out.println(i);
        }
    }
    public void part1() {

        // part 1
        this.iterate(1, 100, 1);
        // int index = 0;
        // while (index < 100) {
        //     System.out.println(++index);
        // }


//        for (int i=1; i<=100; i++) {
//            System.out.println(i);
//        }

    }

    public void part2() {

        // part 2
        this.iterate(2, 100, 2);

        // int evenIndex = 0;
        // do {
        //     evenIndex += 2;
        //     System.out.println(evenIndex);
        // } while (evenIndex < 100);

//        for(int i=2; i<=100; i+=2) {
//            System.out.println(i);
//        }

    }

    public void part3() {

        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++) {
                System.out.printf("%d ", i*j);
            }
        System.out.println();
        }

         IntStream.rangeClosed(2, 9).forEach(i -> {
             IntStream.rangeClosed(1, 9).forEach(j -> {
                 System.out.printf("%d ", i*j);
             });
             System.out.println();
         });
    }

    public static void main(String[] args) {

        IterationPractice test1 = new IterationPractice();
        test1.part1();
        test1.part2();
        test1.part3();
    }
}
