package aaron.springcrafter.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ziqi Wang
 * @date 12/4/22 17:12
 */

public interface Resource {

    InputStream getInputStream() throws IOException;

}
