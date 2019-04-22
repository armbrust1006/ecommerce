package kr.co.ecommerce.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@EqualsAndHashCode
public class RegisterDto {
	private String name;
	private String brithdayYear;
	private String brithdayMonth;
	private String brithdayDate;
	private String email;
	private String password;
	private String address;
}
