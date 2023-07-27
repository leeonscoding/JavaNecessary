package org.leeonscoding.zip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZipUtil {
    public void zip(List<String> fileList, String destinationPath) {

        String outputFileName = Long.toString(System.currentTimeMillis())+".zip";

        String destination = destinationPath.concat("/")
                                            .concat(outputFileName);

        try (
                ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(destination))
        ) {
            for (String fileStr : fileList) {
                FileInputStream fis = new FileInputStream(fileStr);
                zipOutputStream.putNextEntry(new ZipEntry(fileStr));

                byte[] bytes = new byte[1024];
                int length;
                while ((length = fis.read(bytes)) >= 0) {
                    zipOutputStream.write(bytes, 0, length);
                }
                fis.close();
            }
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
