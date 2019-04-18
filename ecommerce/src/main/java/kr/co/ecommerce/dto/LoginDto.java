package kr.co.ecommerce.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@EqualsAndHashCode
public class LoginDto {
	private String email;
	private String password;
}
