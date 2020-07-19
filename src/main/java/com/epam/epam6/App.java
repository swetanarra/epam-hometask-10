package com.epam.epam6;

import java.util.*;
import java.util.stream.Collectors;

public class App 
{
	public void average(List<Integer> list) {
		System.out.println("the average is:");
		System.out.println(list.stream()
				  .mapToInt(i -> i)
				  .average()
				  .getAsDouble());
	}
	public void search(List<String> list) {
		System.out.println("the list is:");
		list.stream().filter(i -> i.charAt(0)=='a' && i.length()==3).forEach(System.out::println);
	}
	public void palindromes(List<String> list) {
		System.out.println("the palindromes in list are:");
		list.stream().filter(i -> i.equals(new StringBuffer(i).reverse().toString())).forEach(System.out::println);
	}
    public static void main( String[] args )
    {
    	List<Integer> list = Arrays.asList(10, 20, 50, 100, 130, 150, 200, 250, 500);
    	List<String> strList1=Arrays.asList("app","hello","abc","ant","abcd","ans","atm","NN");
    	List<String> strList2=Arrays.asList("madam","radar","dad","rat","rotor","answer","orange");
    	App a=new App();
        a.average(list);
        a.search(strList1);
        a.palindromes(strList2);
    	
    }
}
