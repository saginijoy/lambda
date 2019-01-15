package org.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author José
 */
public class ReductionExample {

    public static void main(String... args) {
        
        List<Integer> list = Arrays.asList(-10,-10);
        
        Optional<Integer> red = 
        list.stream()
                .reduce(Integer::max);
        
        Integer red1 = 
                list.stream()
                        .reduce(0,Integer::max);//wrong because of identity
        
        System.out.println("red = " + red);
        System.out.println("red1 = " + red1);
        
        
        
    }
}
