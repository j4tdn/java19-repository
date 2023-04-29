package ex02;
import java.util.*;
public class Ex02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18);
        System.out.println(sortNumbers(numbers));
    }
    
	public static List<Integer> sortNumbers(List<Integer> numbers) {
        List<Integer> divisibleBy7 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();
        
        // categorize the numbers into three lists
        for (int num : numbers) {
            if (num % 7 == 0 && num % 5 == 0) {
            	otherNumbers.add(num);
            } else if (num % 7 == 0) {
                divisibleBy7.add(num);
            } else if (num % 5 == 0) {
                divisibleBy5.add(num);
            }else {
            	otherNumbers.add(num);
            }
        }
        
        // sort three lists into resultList 
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(divisibleBy7);
        resultList.addAll(otherNumbers);
        resultList.addAll(divisibleBy5);  
        return resultList;
    }


}
