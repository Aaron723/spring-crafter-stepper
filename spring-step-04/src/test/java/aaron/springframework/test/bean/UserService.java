package aaron.springframework.test.bean;

/**
 * @author Ziqi Wang
 * @date 12/3/22 19:05
 */

public class UserService {

    private String uid;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("query user information[" + userDao.queryUserName(uid) + "]");
    }
}
