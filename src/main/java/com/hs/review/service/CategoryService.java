package com.hs.review.service;

import java.util.List;

import com.hs.review.dto.Category;

public interface CategoryService {

	/** 카테고리 목록 조회  */
	List<Category> searchAll();

	/** 카테고리 추가  */
	void insert(Category category);

}