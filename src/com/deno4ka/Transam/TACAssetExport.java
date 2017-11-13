package com.deno4ka.Transam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TACAssetExport {

    private static final Integer DRIVER_KEY = 1;
    private static final Integer TRUCK_KEY = 2;
    private static final Integer TRAILER_KEY = 3;

    public static void main(String[] args) throws Exception {
        try {
//            Exporter exporter = new Exporter();
//            String driversJson = readJson("c:\\dev\\TACAssetExport\\Transam Drivers.json");
//            exporter.exportDrivers(driversJson);
//            String trailersJson = readJson("c:\\dev\\TACAssetExport\\Transam Trailers.json");
//            exporter.exportTrailers(trailersJson);
//            String trucksJson = readJson("c:\\dev\\TACAssetExport\\Transam Trucks.json");
//            exporter.exportTrucks(trucksJson);
            Map<Integer, String> pathMap = generateFilePathMap(args);
            Set<Integer> pathMapKeys = pathMap.keySet();
            Iterator<Integer> pathMapKeysIt = pathMapKeys.iterator();
            while (pathMapKeysIt.hasNext()) {
                Integer key = pathMapKeysIt.next();
                String path = pathMap.get(key);
                String json = readJson(path);

                Exporter exporter = new Exporter();
                if (key.equals(DRIVER_KEY)) {
                    exporter.exportDrivers(json);
                } else if (key.equals(TRUCK_KEY)) {
                    exporter.exportTrucks(json);
                } else if (key.equals(TRAILER_KEY)) {
                    exporter.exportTrailers(json);
                } else {
                    throw new Exception("Unknown operation type");
                }

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static Map<Integer, String> generateFilePathMap(String[] args) {
        Map<Integer, String> filePathMap = new HashMap<>();
        Integer key = null;
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if ("-drivers".equals(arg)) {
                key = DRIVER_KEY;
                continue;
            } else if ("-trucks".equals(arg)) {
                key = TRUCK_KEY;
                continue;
            } else if ("-trailers".equals(arg)) {
                key = TRAILER_KEY;
                continue;
            } else if (key != null) {
                filePathMap.put(key, arg);
                key = null;
            }
        }
        return filePathMap;
    }

    private static String readJson(String path) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


            String sCurrentLine = null;
            while ((sCurrentLine = br.readLine()) != null) {
                sb.append(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}