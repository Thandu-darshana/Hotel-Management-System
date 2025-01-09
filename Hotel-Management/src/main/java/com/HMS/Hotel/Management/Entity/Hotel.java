package com.HMS.Hotel.Management.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String city;
    private float rating;
    private int postalCode;
    @Column(name = "Available")
    private boolean isAvailable;


}
