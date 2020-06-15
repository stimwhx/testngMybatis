package cases;

import config.TestConfig;
import model.InterfaceName;
import model.User;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ConfigFile;
import utils.DatabaseUtil;

import java.io.IOException;
//提交到git上
public class LoginTest {
    @BeforeTest(groups = "loginTrue" ,description = "登录接口")
    public void beforeTest(){
        //获取登录接口
        TestConfig.loginUrl = ConfigFile.getUrl(InterfaceName.LOGIN);
    }
    @Test(groups = "loginTrue",description = "登录成功测试用例")
    public void LoginTest() throws IOException {
        SqlSession sqlSession= DatabaseUtil.getsqlSession();
        User user = sqlSession.selectOne("logincase",1);
        System.out.println(user.toString());
        System.out.println(TestConfig.loginUrl);
    }
}
