package org.leeonscoding.zip;

import java.io.File;
import java.util.Arrays;

public class TestClient {
    public static void main(String[] args) {
        MyZipUtil zip = new MyZipUtil();
        zip.zip(Arrays.asList("test1.txt", "test2.txt"), new File("").getAbsolutePath());
    }
}
