package com.hotel.rating.RatingService.services;

import com.hotel.rating.RatingService.modal.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);
    //get all rating
    List<Rating> getRatings();
    //get all by UserId
    List<Rating> getRatingUserId(String userId);
    //get all by hotel
    List<Rating> getRatingHotelId(String hotelId);
}
