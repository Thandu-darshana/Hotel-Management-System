package com.HMS.Hotel.Management.Controller;

import com.HMS.Hotel.Management.DTO.HotelDTO;
import com.HMS.Hotel.Management.Entity.Hotel;
import com.HMS.Hotel.Management.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;
    @PostMapping
    public Hotel createHotel(@RequestBody HotelDTO hotelDTO){
        return hotelService.saveHotel(hotelDTO);
    }
}
