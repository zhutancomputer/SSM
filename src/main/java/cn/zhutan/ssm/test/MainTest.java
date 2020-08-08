package cn.zhutan.ssm.test;

import cn.zhutan.ssm.model.User;
import cn.zhutan.ssm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class MainTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testMybatis() {
        // System.out.println(Arrays.toString(userService.selectAll().toArray()));
        User user = new User();
        user.setUsername("zhutan");
        user.setPassword("aaa");
        userService.insertUser(user);
    }
}
