package com.deno4ka.Transam.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LicensePlate {

    @JsonView()
    private String number;

    @JsonView()
    private String stateProvince;

}