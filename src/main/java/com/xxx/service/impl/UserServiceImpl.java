package com.xxx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xxx.dao.DaoSupport;
import com.xxx.entity.User;
import com.xxx.service.UserManager;
import com.xxx.util.PageData;

import lombok.extern.slf4j.Slf4j;

@Service("userService")
@Slf4j
public class UserServiceImpl implements UserManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void saveU(PageData pd)throws Exception{
		dao.save("UserMapper.saveU", pd);
	}
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void deleteU(String pd)throws Exception{
		dao.delete("UserMapper.deleteU", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void editU(PageData pd)throws Exception{
		dao.update("UserMapper.editU", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@Override
	public User findByUiId(String pd)throws Exception{
		return (User)dao.findForObject("UserMapper.findByUiId", pd);
	}

}
