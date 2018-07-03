package com.xxx.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.entity.User;
import com.xxx.service.UserManager;
import com.xxx.util.PageData;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Resource(name="userService")
	private UserManager userService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() throws Exception{
		
		User result = userService.findByUiId("1001");
		return result;
	}
	
	@RequestMapping(value="/saveU")
	@Transactional
	@ResponseBody
	public void saveU() throws Exception{
		PageData pd = new PageData();
		pd.put("USERNAME", "董荣政");					
		pd.put("PASSWORD", "222");
		pd.put("PHONE", "55555555555");
		userService.saveU(pd);
		
		//userService.deleteU(pd);
	}
	
	@RequestMapping(value="/deleteU")
	@Transactional
	@ResponseBody
	public void deleteU() throws Exception{
		userService.deleteU("1003");
	}
	
}
