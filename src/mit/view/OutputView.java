package mit.view;

import java.util.Map;

public class OutputView {

    public static void printFilesList(Map<String, Long> filesInfo) {
        StringBuilder printer = new StringBuilder();
        int index = 1;
        for (Map.Entry<String, Long> fileInfo : filesInfo.entrySet()) {
            printer.append(index)
                    .append(".")
                    .append(fileInfo.getKey())
                    .append(" | ")
                    .append(fileInfo.getValue())
                    .append("KB")
                    .append('\n');
            index++;
        }
        System.out.print(printer);
    }

}
