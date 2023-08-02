package core.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExecutorServiceInThead {


    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (a, b) -> a.length() == b.length();

        boolean s = biPredicate.test("hello", "hello");
        System.out.println(s);



        List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
        List<List<String>> allproducts = new ArrayList<>();
//adding elements to the list
        allproducts.add(productlist1);
        allproducts.add(productlist2);
        allproducts.add(productlist3);
        allproducts.add(productlist4);

        List<String> flatMapList = allproducts .stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(flatMapList);

//        St/*/**/*/ring [] st = {"rakeh","hello"};
        Stream stream = Stream.of("st","3","4","9349","9943");
        System.out.println(stream.sorted().collect(Collectors.toList()));

        Random random = new Random();




        List<String> prefixAndSuffix = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");

        System.out.println(prefixAndSuffix.stream().map(i -> "R" + i + "S").collect(Collectors.toList()));


        //flatMapList.stream().f

//        ExecutorService service = Executors.newFixedThreadPool(10);
//
//        Future<Integer> future = service.submit(new Tas());
//
//        try {
//            Integer resut = future.get();
//
//            System.out.println("The informatinon is"+ resut);
//        } catch (Exception e) {
//
//        }
    }
}

class Tas implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
