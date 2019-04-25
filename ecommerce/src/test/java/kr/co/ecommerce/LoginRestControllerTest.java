package kr.co.ecommerce;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.ecommerce.service.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginRestControllerTest {

	@Autowired
	LoginService loginService;

	@Before
	public void test1() {

	}

	@Test
	public void login() {
	}

}
