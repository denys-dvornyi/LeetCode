package com.deno4ka.Other;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Puzzlers {

    String str;

    public Java8Puzzlers() {
//		streamAdd();
//		streamSublist();
//		executor();
//		max();
//		maps();
//		compareAndFindMax();
//		compareAndFindMaxWithNull();
//		class CatoDog implements CatI, DogI {}
//		catAndDog(new CatoDog());
//		System.out.println(System.getProperty("java.version"));
//		suppliers();
//		removeFromStream();
    }

    private void removeFromStream() {
        // stream().forEach() проверяет на ConcurrentModification в самом конце
        // НО мы "упадём" раньше ConcurrentModificationException
        // на NullPointerException: из-за null.equals()
        List<String> list = new ArrayList<>(Arrays.asList("Arne", "Chuck", "Slay"));
//		list.stream().forEach(x -> {
//			if (x.equals("Chuck")) { // NullPointerException
//				list.remove(x);
//			}
//			if ("Chuck".equals(x)) { // ConcurrentModificationException
//				list.remove(x);
//			}
//		});
        // лучше так НЕ писать, а использовать removeIf
        list.removeIf("Chuck"::equals);
    }

    private void suppliers() {
        str = "Hello";
        Supplier<String> s1 = str::toUpperCase;
        Supplier<String> s2 = () -> str.toUpperCase();
        str = "World";
        System.out.println(s1.get());
        System.out.println(s2.get());
    }

    private void catAndDog(Object obj) {
        // в Java8 можно кастовать к пересечению двух типов
        // но нельзя создать переменную такого пересечения
        // когда будут val & var - это наверное будет возможным...
        // аргументу lambda тип явно можно не указывать
        Optional.of((CatI & DogI) obj).ifPresent(x -> {
            x.myau();
            x.gav();
        });
    }

    private void compareAndFindMax() {
        List<String> list = Arrays.asList("Martha", "Denis", "Leonid");
        Comparator<String> cmp = Comparator.nullsLast(Comparator.naturalOrder());

        System.out.println(Collections.max(list, cmp)); // Martha
        System.out.println(list.stream().collect(Collectors.maxBy(cmp)).get()); // Martha
        System.out.println(list.stream().max(cmp).get()); // Martha
    }

    private void compareAndFindMaxWithNull() {
        List<String> list = Arrays.asList("Martha", null, "Leonid");
        Comparator<String> cmp = Comparator.nullsLast(Comparator.naturalOrder());

        System.out.println(Collections.max(list, cmp)); // null
        System.out.println(list.stream().collect(Collectors.maxBy(cmp)).get()); // NoSuchElementException
        System.out.println(list.stream().max(cmp).get()); // NullPointerException
    }

    private void maps() {
        final String BUILD_TOOL = "buildTool";
        final String LANG = "lang";
        final String IOC = "IOC";

        Map<String, String> oldSchool = new HashMap<>();
        oldSchool.put(BUILD_TOOL, "maven");
        oldSchool.put(LANG, "java");
        oldSchool.put(IOC, "jee");

        Map<String, String> proper = new HashMap<>();
        proper.put(BUILD_TOOL, "gradle");
        proper.put(LANG, "groovy");
        proper.put(IOC, "spring");

        oldSchool.replaceAll(proper::put); // поменяет местами значения map
    }

    private void max() {
        System.out.println(
                Stream.of(-3, -2, -1, 0, 1, 2, 3).max(Math::max).get()
        );
        // explanation
//		System.out.println(Math.max(-3, -2)); // -2<0 , get -2
//		System.out.println(Math.max(-2, -1)); // -1<0 , get -1
//		System.out.println(Math.max(-1, 0)); // 0 , stay -1
//		System.out.println(Math.max(-1, 1)); // 1>0 , stay -1
//		System.out.println(Math.max(-1, 2)); // 2>0 , stay -1
//		System.out.println(Math.max(-1, 3)); // 3>0 , stay -1
    }

    private void executor() {
        ExecutorService es = Executors.newSingleThreadExecutor();
        List<String> sentence = Arrays.asList("Execute");

        // "укороченная" lambda сама возвращает результат (без return), поэтому воспринимается как Callable, у которого в сигнатуре есть выброс Exception
        es.submit(() -> Files.write(Paths.get("Judgment.txt"), sentence)); // 1

        // "разернутая" lambda сама не возвращает ничего, поэтому воспринимается компилятором как Runnable (public abstract void run()) и который Exception выбрасывать не должен
//		es.submit(() -> { Files.write(Paths.get("Judgment.txt"), sentence); }); // 2

        // так работает, т.к. компилятор воспринял выражение с возвращаемым результатом, как Callable
        es.submit(() -> {
            return Files.write(Paths.get("Judgment.txt"), sentence);
        }); // 3 так работает
    }

    public void streamAdd() {
        List<String> list = new ArrayList();
        list.add("milk");
        list.add("bread");
        list.add("sausage");
        Stream<String> stream = list.stream();
        list.add("eggs, eggs also");
        stream.forEach(System.out::println);
    }

    public void streamSublist() {
        List<String> list = new ArrayList();
        list.add("milk");
        list.add("bread");
        list.add("sausage");
        list = list.subList(0, 2);
        Stream<String> stream = list.stream();
        list.add("eggs, eggs also");
        stream.forEach(System.out::println); // ConcurrentModificationException
        // это баг Java 8. есть тикет. в Java 11 починили (я проверил)
    }

    private interface CatI {
        default void myau() {
            System.out.println("Myau");
        }
    }

    private interface DogI {
        default void gav() {
            System.out.println("Gav");
        }
    }

}