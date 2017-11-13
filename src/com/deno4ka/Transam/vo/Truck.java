package com.deno4ka.Transam.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Truck {

    @JsonView()
    private String number;

    @JsonView()
    private String type;

    @JsonView()
    private String vinNumber;

    @JsonView()
    private String dotNumber;

    @JsonView()
    private List<String> comments;

    @JsonView()
    private List<LicensePlate> licensePlates;

}