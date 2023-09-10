package ex01;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Transaction> input = mock();
        // 1.
        List<Transaction> Ex01 = input.stream()
                                        .filter(t -> t.getYear() == 2011)
                                        .sorted(Comparator.comparing(t -> t.getValue()))
                                        .collect(Collectors.toList());
        Ex01.forEach(System.out::println);
        System.out.println("==============================");
        // 2.
        List<Transaction> Ex02 = input.stream()
                .filter(t -> t.getValue() > 300)
                .sorted(Comparator.comparing(t -> t.getTrader().getCity()))
                .collect(Collectors.toList());
        Ex02.forEach(System.out::println);
        System.out.println("==============================");
        // 3.
        List<String> Ex03 = input.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        Ex03.forEach(System.out::println);
        System.out.println("==============================");
        // 4.
        List<Trader> Ex04 = input.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getTrader())
                .distinct()
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .collect(Collectors.toList());
        Ex04.forEach(System.out::println);
        System.out.println("==============================");
        // 5.
        String Ex05 = input.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (t1, t2) -> t1 + t1);
        System.out.println(Ex05);
        System.out.println("==============================");
        // 6.
        Boolean Ex06 = input.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(Ex06);
        System.out.println("==============================");
        // 7.
        long Ex07 = input.stream()
                .filter(t -> t.getTrader().getCity().equals("Milan"))
                .count();
        System.out.println(Ex07);
        System.out.println("==============================");
        // 8.
        List<Integer> Ex08 = input.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        Ex08.forEach(System.out::println);
        System.out.println("==============================");
        // 9.
        OptionalInt Ex09 = input.stream()
                .mapToInt(Transaction::getValue)
                .max();
        System.out.println(Ex09.orElse(1));
        System.out.println("==============================");
        // 10.
        Optional<Transaction> Ex10 = input.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(Ex10.orElse(null));
    }

    public static List<Transaction> mock() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }
}