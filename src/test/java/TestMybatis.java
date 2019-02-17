import javax.annotation.Resource;  
  
import org.apache.log4j.Logger;  
import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.bz.model.User;
import com.bz.service.UserService;import com.sun.mail.handlers.image_gif;  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMybatis {
	  private static Logger logger = Logger.getLogger(TestMybatis.class);  
	//  private ApplicationContext ac = null;  
	    @Resource  
	    private UserService userService = null;  
	  
	//  @Before  
	//  public void before() {  
//	      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//	      userService = (IUserService) ac.getBean("userService");  
	//  }  
	  
	    @Test  
	    public void testSelect() {  
	        User user = userService.selectByPrimaryKey(3);  
	        // System.out.println(user.getUserName());  
	        // logger.info("值："+user.getUserName());  
	        logger.info(JSON.toJSONString(user));  
	    }  
	    @Test
	    public void testInsert() {
	    	User user=new User();
	    	user.setName("smst");
	    	user.setAge(21);
	    	user.setSex("女");
	    	int i=userService.insert(user);
	    	logger.info(JSON.toJSONString(i));
	    }
	    @Test
	    public void testInsertSelective() {
	    	User user=new User();
	    	user.setAge(23);
	    	user.setName("mqn");
	    	user.setSex("女");
	    	int i=userService.insertSelective(user);
	    	logger.info(JSON.toJSONString(i));
	    }
	    @Test
	    public void testDeleteByPrimaryKey() {
	    	int i=userService.deleteByPrimaryKey(3);
	    	logger.info(JSON.toJSONString(i));
	    }
	    @Test
	    public void testUpdateByPrimaryKey() {
	    	User user=new User();
	    	user.setId(1);
	    	user.setAge(23);
	    	user.setName("林生");
	    	user.setSex("男");
	    	int result=userService.updateByPrimaryKey(user);
	    	logger.info(JSON.toJSONString(result));
	    }
	    @Test
	    public void testUpdateByPrimaryKeySelective() {
			User user=new User();
			user.setId(1);
			user.setName("bz");
			user.setSex("男");
			int result=userService.updateByPrimaryKeySelective(user);
			logger.info(JSON.toJSONString(result));
		}
	    
}
