package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static List<Integer> getList(){
        Integer[] intAry={1,1,4,4,3,3};
        List<Integer> intList = Arrays.asList(intAry);
        return intList;
    }
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
       List<Integer> finalList = getList().stream().distinct().sorted().toList();
       System.out.println(finalList);
    }
}
