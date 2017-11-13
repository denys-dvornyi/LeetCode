package com.deno4ka.Transam;

import com.deno4ka.Transam.vo.Driver;
import com.deno4ka.Transam.vo.Trailer;
import com.deno4ka.Transam.vo.Truck;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Exporter {

    public void exportDrivers(String driverJson) throws Exception {
        List<Driver> driverList = fromJSON(new TypeReference<List<Driver>>() {}, driverJson);
    }

    void exportTrucks(String truckJson) throws Exception {
        List<Truck> truckList = fromJSON(new TypeReference<List<Truck>>() {}, truckJson);
    }

    void exportTrailers(String trailerJson) throws Exception {
        List<Trailer> trailerList = fromJSON(new TypeReference<List<Trailer>>() {}, trailerJson);
    }

    private static <T> T fromJSON(final TypeReference<T> type, final String jsonPacket) throws Exception {
        T data = null;
        try {
            data = new ObjectMapper().readValue(jsonPacket, type);
        } catch (Exception e) {
            throw new Exception("fromJSON: " + e.toString());
        }
        return data;
    }

}