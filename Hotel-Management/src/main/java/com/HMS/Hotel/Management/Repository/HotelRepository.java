package com.HMS.Hotel.Management.Repository;

import com.HMS.Hotel.Management.Entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepository extends JpaRepository <Hotel,Long> {
}
