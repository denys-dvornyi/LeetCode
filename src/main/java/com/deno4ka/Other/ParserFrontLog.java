package com.deno4ka.Other;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ParserFrontLog implements ParserLog {

    public static final String NEW_LINE = System.getProperty("line.separator");
    private String fileName;

    public ParserFrontLog() {
    }

    public ParserFrontLog(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void parse() {
//		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            Map<String, List<String>> result = new HashMap<>();

            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (s.contains(" Exception:")) {
//					System.out.println(s);
                    String[] parts = s.split(" ");
                    if (parts.length > 1) {
                        String exceptionString = parts[parts.length - 1];
                        String exceptionMethod = parts[parts.length - 2];
                        if (exceptionString.equals("Exception:") && exceptionMethod.contains("()")) {
                            if (scanner.hasNext()) {
                                String exception = scanner.nextLine();
                                String exceptionName;
                                if (exception.contains(":")) {
                                    String[] exceptionParts = exception.split(":");
                                    exceptionName = exceptionParts[0];
                                    String[] exceptionNameParts = exceptionName.split("\\.");
                                    exceptionName = exceptionNameParts[exceptionNameParts.length - 1];
                                } else {
                                    String[] exceptionParts = exception.split("\\.");
                                    exceptionName = exceptionParts[exceptionParts.length - 1];
                                }
                                // TODO: get new line and get java file name and position
                                List<String> exceptionMethods = result.computeIfAbsent(exceptionName, _part -> new ArrayList<>());
                                if (!exceptionMethods.contains(exceptionMethod)) {
                                    exceptionMethods.add(exceptionMethod);
                                }
                            }
//							System.out.println(result);
                        }
                    }
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
