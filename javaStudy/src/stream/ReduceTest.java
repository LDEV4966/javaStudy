package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class compareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length>=s2.getBytes().length){
            return s1;
        } else {
            return s2;
        }
    }
}

public class ReduceTest {

    public static void main(String[] args) {
        String [] strList = {"a","bb","ccc","dddd"};

        String retString1 = Arrays.stream(strList).reduce("",(s1,s2)-> {
            if(s1.getBytes().length>=s2.getBytes().length){
                return s1;
            } else {
                return s2;
            }
        });

        String retString2 = Arrays.stream(strList).reduce(new compareString()).get();

        System.out.println(retString1);
        System.out.println(retString2);
    }
}
