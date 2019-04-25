package kr.co.ecommerce.service.domain;

import org.springframework.dao.DuplicateKeyException;

public class ThrowDuplicateKeyException extends DuplicateKeyException {

	public ThrowDuplicateKeyException(String msg, Throwable cause) {
		super(msg, cause);
		// TODO Auto-generated constructor stub
	}
	
}
