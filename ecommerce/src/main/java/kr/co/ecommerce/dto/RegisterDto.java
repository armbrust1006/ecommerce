package kr.co.ecommerce.dto;

import lombok.Builder;
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
	private String birthdayYear;
	private String birthdayMonth;
	private String birthdayDate;
	private String email;
	private String password;
	private String address;

	@Builder
	public RegisterDto(String name, String birthdayYear, String birthdayMonth, String birthdayDate, String email,
			String password, String address) {
		this.name = name;
		this.birthdayYear = birthdayYear;
		this.birthdayMonth = birthdayMonth;
		this.birthdayDate = birthdayDate;
		this.email = email;
		this.password = password;
		this.address = address;
	}

}
