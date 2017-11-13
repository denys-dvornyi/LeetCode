package com.deno4ka.Transam.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TravelDocument {

    @JsonView()
    private String number;

    @JsonView()
    private String type;

    @JsonView()
    private String stateProvince;

    @JsonView()
    private String country;

}