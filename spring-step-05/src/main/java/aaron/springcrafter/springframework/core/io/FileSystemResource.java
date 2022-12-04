package aaron.springcrafter.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ziqi Wang
 * @date 12/4/22 17:12
 */

public class FileSystemResource implements Resource{

    private final File file;

    private final String path;

    public FileSystemResource(String path) {
        file = new File(path);
        this.path = path;
    }

    public FileSystemResource(File file) {
        this.file = file;
        path = file.getPath();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(file);
    }

    public String getPath() {
        return path;
    }
}
