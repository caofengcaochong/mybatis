package mapper;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test01 {
    public static void main(String[] args) {
        Trader raoul=new Trader("Raoul","Cambridge");
        Trader mario=new Trader("mario","Milan");
        Trader alan=new Trader("alan","Cambridge");
        Trader brian=new Trader("brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );
        //1:
//        List<Transaction> collect = transactions.stream().filter(a -> a.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
//        System.out.println(collect);
        //2:
//        List<String> collect = transactions.stream().map(a -> a.getTrader().getCity()).distinct().collect(Collectors.toList());
//        System.out.println(collect);

        //3:
//        List<Trader> trader = transactions.stream().map(a -> a.getTrader()).filter(a -> a.getCity().equals("Cambridge")).distinct()
//                .sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
//        System.out.println(trader);
        //4:
//        String collect = transactions.stream().map(a -> a.getTrader().getName()).distinct().sorted(Comparator.comparing(a->a)).reduce("",(n1, n2)->n1+n2);
//        System.out.println(collect);
        OptionalInt sum = transactions.stream().mapToInt(Transaction::getValue).max();
        System.out.println(sum.orElse(1));
        int a = 10;
        IntStream.rangeClosed(1,100).filter(b->Math.sqrt(a*a+b*b)%1==0).boxed();
    }
}
