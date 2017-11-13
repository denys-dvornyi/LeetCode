package com.deno4ka.Transam.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {

    @JsonView()
    private String driverNumber;

    @JsonView()
    private String firstName;

    @JsonView()
    private String middleName;

    @JsonView()
    private String lastName;

    @JsonView()
    private String gender;

    @JsonView()
    private String dateOfBirth;

    @JsonView()
    private String citizenshipCountry;

    @JsonView()
    private String fastCardNumber;

    @JsonView()
    private List<String> comments;

    @JsonView()
    private List<TravelDocument> travelDocuments;

}