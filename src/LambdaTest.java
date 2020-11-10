import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
Lambda 表达式是 JDK8 的一个新特性，可以取代大部分的匿名内部类，写出更优雅的 Java 代码，尤其在集合的遍历和其他集合操作中，可以极大地优化代码结构。
JDK 也提供了大量的内置函数式接口供我们使用，使得 Lambda 表达式的运用更加方便、高效。
虽然使用 Lambda 表达式可以对某些接口进行简单的实现，但并不是所有的接口都可以使用 Lambda 表达式来实现。
-----Lambda 规定接口中只能有一个需要被实现的方法，不是规定接口中只能有一个方法-----
@FunctionalInterface#
修饰函数式接口的，要求接口中的抽象方法只有一个。 这个注解往往会和 lambda 表达式一起出现
 */
public class LambdaTest {
    public static void main(String[] args) {
        /*
        通过 ArrayList.asList()函数得到的List是AbstractList
        该AbstractList只是简单地在已有的元素数组上套了一层List的接口，所以不支持增删改操作
        如果希望能增删改，必须new一个LinkedList或ArrayList
         */
        List<String> list = Arrays.asList("ZhangSan","LiSi","WangWu","WangWu","ZhaoLiu","QianQi","SunBa");
        list.forEach(v -> System.out.println(v));
        System.out.println("----------------------------------");
        list.forEach(System.out::println);
        System.out.println("----------------------------------");
//        list.removeIf(v -> "SunBa".equals(v));//会抛错
        //代替匿名类的排序
        list.sort((o1, o2) -> o1.length() - o2.length());
        list.forEach(System.out::println);
        System.out.println("----------------------------------");
        //以及创建新的线程等

        /*
        Stream 流是 Java 8 中引入的重要概念， 把真正的函数式编程风格引入到Java中
         */
        //可以通过 Stream.of() 很容易地将一组元素转化成为流，参数可以是一组用逗号分隔的对象，也可 以是一个集合对象，也可以是数组
//        Stream stream = Stream.of();
        //每个集合都可以通过调用 stream() 方法来产生一个流
//        Stream stream1 = list.stream();
        //Rondom 类对象可以产生随机数流
//        Stream stream2 = new Random(20).ints().boxed();
        //IntStream 类提供了 range() 方法用于生成整型序列的流。编写循环时，这个方法会更加便利
        // 传统方法:
        int result = 0;
        for (int i = 10; i < 20; i++){
                result += i;
        }
        // for-in 循环:
        result = 0;
        for (int i : IntStream.range(10, 20).toArray()){
                result += i;
        }

        //stream中间操作:filter,distinct,limit,skip,sorted,map,flatMap等
        //stream结束操作:forEach,allMatch,anyMatch,noneMatch,findFirst,findAny,count,reduce,collect等
        list.stream().distinct()//去重
                .limit(5)//限制5个
                .skip(2)//跳过2个
                .sorted((a,b)->b.length()-a.length())//排序
                .peek(s-> {s+="S";System.out.println(s+"---");})//操作每一个元素，不消耗元素
                .map(s -> s+"S")//对每个元素操作，会消耗元素
//                .flatMap(?)//对每个元素操作，涉及到元素中的元素
                .filter(s->s.startsWith("Wang"))//条件过滤
                .forEach(System.out::println);//终结遍历
        System.out.println("-------------------------------");
        System.out.println(list.stream().allMatch(s->s.length()>4));//boolean
        System.out.println(list.stream().anyMatch(s->s.startsWith("Wang")));//boolean
        System.out.println(list.stream().findFirst().get());//optional
        System.out.println(list.stream().findAny().get());//optional
        System.out.println(list.stream().count());//int
        System.out.println(list.stream().min(Comparator.comparing(String::length)).get());//optional
        System.out.println(list.stream().reduce("name:",(a,b)->a.concat(b)));//
        List<String> l = list.stream().filter(s->s.contains("i"))
                .collect(Collectors.toList());//
        l.forEach(System.out::println);
        System.out.println("----------------------------------");

    }
}
