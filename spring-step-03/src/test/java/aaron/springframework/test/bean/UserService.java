package aaron.springframework.test.bean;

/**
 * @author Ziqi Wang
 * @date 12/3/22 19:05
 */

public class UserService {

    private String username;

    public UserService(String username) {
        this.username = username;
    }

    public void queryUserInfo() {
        System.out.println("query user information[" + username + "]");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(username);
        return sb.toString();
    }



}
