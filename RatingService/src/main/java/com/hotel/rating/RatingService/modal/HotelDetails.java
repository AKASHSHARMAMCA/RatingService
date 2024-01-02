package com.hotel.rating.RatingService.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDetails {

    private String id;
    private String name;
    private String location;
    private String about;

}
