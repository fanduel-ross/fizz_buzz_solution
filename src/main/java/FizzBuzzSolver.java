import java.util.ArrayList;
import java.util.stream.IntStream;

public class FizzBuzzSolver {
    private final int lowestNumber;
    private final int highestNumber;

    public FizzBuzzSolver(int lowestNumber, int highestNumber) {
        this.lowestNumber = lowestNumber;
        this.highestNumber = highestNumber;
    }

//   public void fizzBuzzSolution1() {
//        IntStream.rangeClosed(lowestNumber, highestNumber)
//                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
//                        (i % 5 == 0 ? "Buzz" : i))
//              .forEach(System.out::println);
//
//
//   }

    public boolean divisibleBy(int num1, int num2){
        return num1 % num2 == 0;
    }

    public ArrayList<String> fizzBuzzSolution2(){
        ArrayList<String> fizzBuzzArrayList = new ArrayList<>();
        for (int i = lowestNumber; i <= highestNumber  ; i++) {
            if(divisibleBy(i, 15)){
                fizzBuzzArrayList.add("FizzBuzz");
            } else if (divisibleBy(i, 3)){
                fizzBuzzArrayList.add("Fizz");
            } else if (divisibleBy(i, 5)){
                fizzBuzzArrayList.add(("Buzz"));
            } else {
                fizzBuzzArrayList.add(String.valueOf(i));
            }





        }
        return fizzBuzzArrayList;
    }


}
