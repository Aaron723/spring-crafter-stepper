package aaron.springcrafter.springframework.beans;

/**
 * @author Ziqi Wang
 * @date 12/4/22 00:13
 */

public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(Throwable cause) {
        super(cause);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}