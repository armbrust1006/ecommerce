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
public class SessionInfoDto {
	private String account;
	private String name;

	@Builder
	public SessionInfoDto(String account, String name) {
		this.account = account;
		this.name = name;
	}

}
