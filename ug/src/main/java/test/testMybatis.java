package test;

import javax.annotation.Resource;

import com.entity.user;
import com.service.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class testMybatis {
	 private static Logger logger = Logger.getLogger(testMybatis.class);  
	    @Resource  
	    private UserService userService = null;  
	    @Test  
	    public void test1() {  
	        user user = userService.getUserById(1); 
	        logger.info(user.getUsername());}
}
