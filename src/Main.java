import java.util.*;

public class Main {

    import java.util .*;

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

        }
    }

    public static void task2() {
        Collection.sort(nums);
        int privNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 = 0 && num != privNum) {
                System.out.println(num);
                privNum = num;
            }
        }

    }
    public static void task3() {
        Set<String> uniqueStrings = new HashSet<>(strings);
        System.out.println(uniqueStrings);
    }
    public static void task4() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(strings.size() - uniqueWords.size());
    }

}