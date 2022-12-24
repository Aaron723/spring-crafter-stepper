package aaron.springcrafter.springframework.core.io;

import aaron.springcrafter.springframework.util.ClassUtils;
import cn.hutool.core.lang.Assert;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ziqi Wang
 * @date 12/4/22 17:11
 */

public class ClassPathResource implements Resource{

    private final String path;

    private ClassLoader classLoader;


    public ClassPathResource(String path) {
        this(path, null);
    }

    public ClassPathResource(String path, ClassLoader classLoader) {
        Assert.notNull(path, "Path must not be null");
        this.path = path;
        this.classLoader = classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is = classLoader.getResourceAsStream(path);
        if (is == null) {
            throw new FileNotFoundException(path + " can't be opened because it does not exist");
        }
        return is;
    }
}
