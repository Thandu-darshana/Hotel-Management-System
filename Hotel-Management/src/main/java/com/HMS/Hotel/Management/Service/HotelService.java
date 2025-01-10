package com.HMS.Hotel.Management.Service;

import com.HMS.Hotel.Management.DTO.HotelDTO;
import com.HMS.Hotel.Management.Entity.Hotel;
import com.HMS.Hotel.Management.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HotelService {

    @Autowired
    HotelRepository hotelrepository;
    public Hotel saveHotel(HotelDTO hotelDTO){
        Hotel hotel = new Hotel();

        hotel.setName(hotelDTO.getName());
        hotel.setAddress(hotelDTO.getAddress());
        hotel.setCity(hotelDTO.getCity());
        hotel.setPostalCode(hotelDTO.getPostalCode());
        hotel.setRating(hotel.getRating());
        hotel.setAvailable(hotelDTO.isAvailable());

        hotelrepository.save(hotel);
        return  hotel;


    }
}
