package utils;


import model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 这个类是用来拼接我们的url，不用我们每次都拼接了就。只要调用这个就拿到url进行请求就行了
 */
public class ConfigFile {
    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);
    //拼接url
    public static String getUrl(InterfaceName name){
        String hostUrl = bundle.getString("test.url");
        String uri = "";
        String testUrl;//最终的测试地址
        if(name==InterfaceName.LOGIN){
            uri=bundle.getString("login.uri");
        }
        if(name==InterfaceName.UPDATE){
            uri=bundle.getString("updateUserInfo.uri");
        }
        if(name == InterfaceName.GET_USER_INFO){
            uri=bundle.getString("getUserInfo.uri");
        }
        if(name == InterfaceName.ADDUSER){
            uri=bundle.getString("addUser.uri");
        }
        testUrl=hostUrl+uri;
        return testUrl;
    }
}
