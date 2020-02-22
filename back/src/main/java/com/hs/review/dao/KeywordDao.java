package com.hs.review.dao;

import java.util.List;

import com.hs.review.dto.Keyword;

public interface KeywordDao {

	/** 모든 키워드 리스트 검색 */
	List<Keyword> selectAll();

	/** 카테고리별 키워드 리스트 검색 */
	List<Keyword> selectByCategory(String category);

}