package mit.domain;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileExplorer {

    private final File dir;

    public FileExplorer(String dir) {
        this.dir = new File(dir);
    }

    /**
     * 디렉토리의 모든 파일을 탐색하는 메서드
     * @return 파일 이름, 파일 크기
     */
    public Map<String, Long> list() {
        Map<String, Long> filesInfo = new HashMap<>();
        Arrays.stream(dir.listFiles())
                .forEach(file -> filesInfo.put(file.getName(), file.length()/1024));
        return filesInfo;
    }
}
