package com.green.hoteldog.review;

import com.green.hoteldog.review.model.ReveiwDelDto;
import com.green.hoteldog.review.model.ReviewFavDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper {

int delUserReveiw(ReveiwDelDto dto);
}
