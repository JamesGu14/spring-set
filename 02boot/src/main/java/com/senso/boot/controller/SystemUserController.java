package com.senso.boot.controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.senso.boot.entity.SystemUser;
import com.senso.boot.mapper.SystemUserMapper;
import com.senso.boot.util.MyBatisUtil;

@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class SystemUserController {

	protected Logger logger;

	@Autowired
	private SystemUserMapper systemUserMapper;

	private SqlSessionFactory sqlSessionFactory;
	private SqlSession session;

	public SystemUserController() {
		logger = LoggerFactory.getLogger(getClass());
		sqlSessionFactory = MyBatisUtil.GetFactory();
		session = sqlSessionFactory.openSession(false);
	}

	@RequestMapping("/insert")
	public String insert(ModelMap map) {

		SystemUser systemUser = new SystemUser();
		systemUser.setEmailaddress("tester2@gmail.com");
		systemUser.setFirstname("Tester2");
		systemUser.setLastname("LastName");
		systemUser.setPassword("123");
		systemUser.setUsername("tester2");
		systemUser.setUserrole(1);
		int insert = systemUserMapper.insert(systemUser);
		map.addAttribute("result", insert);
		return "user";
	}

	/**
	 * Mybatis Transaction
	 */
	@RequestMapping("/transaction")
	public String transaction(ModelMap map) {
		try {
			transBody();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "user";
	}

	// Transaction function body
	public boolean transBody() {

		try {
			SystemUserMapper mapper = session.getMapper(SystemUserMapper.class);
			SystemUser systemUser = new SystemUser();
			systemUser.setEmailaddress("tester3@gmail.com");
			systemUser.setFirstname("Tester3");
			systemUser.setLastname("LastName");
			systemUser.setPassword("123");
			systemUser.setUsername("tester3");
			systemUser.setUserrole(1);
			
			int affectedCount = mapper.insert(systemUser); // 因后面的异常而未执行commit语句
			
			// int i = 2 / 0; // 触发运行时异常
			session.commit(); // 提交会话，即事务提交
		} catch (Exception e) { 
			e.printStackTrace();
		} finally {
			session.close(); // 关闭会话，释放资源
		}
		
		return true;
	}

}
