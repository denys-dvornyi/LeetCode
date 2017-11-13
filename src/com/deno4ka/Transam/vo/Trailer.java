package com.deno4ka.Transam.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trailer {

    @JsonView()
    private String number;

    @JsonView()
    private String type;

    @JsonView()
    private List<LicensePlate> licensePlates;

}