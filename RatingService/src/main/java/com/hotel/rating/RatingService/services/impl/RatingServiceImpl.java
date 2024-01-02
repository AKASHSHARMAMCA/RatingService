package com.hotel.rating.RatingService.services.impl;

import com.hotel.rating.RatingService.modal.Rating;
import com.hotel.rating.RatingService.repository.RatingRepository;
import com.hotel.rating.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
