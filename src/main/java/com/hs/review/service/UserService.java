package com.hs.review.service;

import com.hs.review.dto.User;

public interface UserService {

	/** 아이디 중복 체크
	  * true면 아이디 사용 가능, false면 아이디 사용 불가
	  */
	boolean idCheck(String id);

	/** 회원 가입 */
	void signup(User user);

	/** 로그인 기능
	 * 	return 로그인 성공 여부
	 */
	boolean login(User user);

	/** 회원 정보 수정 */
	void updateUser(User user);

	/** 회원 탈퇴 
	 * 	return 탈퇴 성공 여부
	 */
	boolean deleteUser(User user);

}