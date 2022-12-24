package aaron.springcrafter.springframework.core.io;

/**
 * @author Ziqi Wang
 * @date 12/4/22 17:12
 */

public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
