import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("test", "tes", "Test", "test", "test", "TEST"));
        task1(nums);
        task2(nums);
        task3(strings);
        task4(strings);
    }


    public static void task1(List<Integer> numbers) {
        System.out.println("Задача 1");
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> numbers) {
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> strings) {
        System.out.println("Задача 3");
        for (String word : strings) {
            if (Collections.frequency(strings, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    } private static void task4(List<String> strings) {
        Map<String, Integer> map = new TreeMap<>();
        System.out.println("Задача 4");
        for (String word : strings) {
            if(!map.containsKey(word)){
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        int wordsWithDuplicates = 0;
        for(Integer count : map.values()){
            if (count > 1){
                wordsWithDuplicates++;
            }
        }
        System.out.println(wordsWithDuplicates);
    }

}