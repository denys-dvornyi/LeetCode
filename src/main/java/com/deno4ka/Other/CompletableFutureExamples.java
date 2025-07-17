package com.deno4ka.Other;

import org.testng.annotations.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CompletableFutureExamples {

    static {
        System.out.println("static");
    }

    {
        System.out.println("test");
    }

    public CompletableFutureExamples() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        test();
        runningMultipleFuturesInParallel();
        handlingErrors();
    }

    @Test
    static void test() {
        try {
            CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");
            CompletableFuture<String> future = completableFuture.thenApply(s -> s + " World");
            System.out.println("future = " + future.get());
            assertEquals("Hello World", future.get());

            CompletableFuture<String> completableFuture2
                    = CompletableFuture.supplyAsync(() -> "Hello")
                    .thenCombine(CompletableFuture.supplyAsync(
                            () -> " World"), (s1, s2) -> s1 + s2);
            System.out.println("completableFuture2 = " + completableFuture2.get());
            assertEquals("Hello World", completableFuture2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    static void runningMultipleFuturesInParallel() {
        try {
            CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
            CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Beautiful");
            CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "World");

            CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);

            combinedFuture.get();

            assertTrue(future1.isDone());
            assertTrue(future2.isDone());
            assertTrue(future3.isDone());

            String combined = Stream.of(future1, future2, future3)
                    .map(CompletableFuture::join)
                    .collect(Collectors.joining(" "));

            assertEquals("Hello Beautiful World", combined);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    static void handlingErrors() {
        String name = null;
        try {
            CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
                if (name == null) {
                    throw new RuntimeException("Computation error!");
                }
                return "Hello, " + name;
            }).handle((s, t) -> {
                        if (t != null) System.out.println(t.getMessage());
                        return s != null ? s : "Hello, Stranger!";
                    }
            );

            if (name == null) {
                assertEquals("Hello, Stranger!", completableFuture.get());
            } else {
                assertEquals("Hello, null", completableFuture.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}
