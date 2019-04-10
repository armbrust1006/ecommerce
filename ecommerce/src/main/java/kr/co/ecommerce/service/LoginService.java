package kr.co.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.MemberTable;
import kr.co.ecommerce.repository.hibernate.HomeJpaRepository;

@Service
public class LoginService {

	@Autowired
	private HomeJpaRepository homeJpaRepository;

	public MemberTable getLoginState(String loginId) {
		return homeJpaRepository.findById(1L).get();
	}
}
