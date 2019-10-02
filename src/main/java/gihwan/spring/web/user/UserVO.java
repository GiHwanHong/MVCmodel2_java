package gihwan.spring.web.user;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j

public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
		
	}
}
