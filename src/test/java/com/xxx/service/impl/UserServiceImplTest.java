package com.xxx.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import com.xxx.service.UserManager;
import com.xxx.util.PageData;

public class UserServiceImplTest {

	@Resource(name="appuserService")
	private UserManager userService;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void saveU() {
		//userService.saveU(pd);
	}
	
	@Test
	public void findByUiId() throws Exception{
		/*PageData pd = new PageData();
		pd.put("USERID", "1001");
		PageData result = userService.findByUiId(pd);
		System.out.println(result.size());*/
	}

}
