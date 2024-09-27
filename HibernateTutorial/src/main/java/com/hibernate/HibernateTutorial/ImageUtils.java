package com.hibernate.HibernateTutorial;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;

public class ImageUtils {

    // Method to convert image file to byte array
    public static byte[] convertImageToBytes(String imagePath) throws IOException {
        File file = new File(imagePath);
        return Files.readAllBytes(file.toPath());
    }
}

