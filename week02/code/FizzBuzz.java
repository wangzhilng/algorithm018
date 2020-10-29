import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);
            boolean divisibleBy15 = (i % 5 == 0 && i % 3 == 0);
            if (divisibleBy15) {
                list.add( "FizzBuzz" );
            } else if (divisibleBy3) {
                list.add( "Fizz" );
            } else if (divisibleBy5) {
                list.add( "Buzz" );
            } else {
                list.add( String.valueOf( i ) );
            }


        }
        return list;
    }
}
