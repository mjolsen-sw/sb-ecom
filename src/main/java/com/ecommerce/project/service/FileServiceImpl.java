package com.ecommerce.project.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
@NoArgsConstructor
public class FileServiceImpl implements FileService {
    public String uploadImage(String path, MultipartFile image) throws IOException {
        String originalFilename = image.getOriginalFilename();
        String randomId = UUID.randomUUID().toString();
        String filename = randomId.concat(originalFilename.substring(originalFilename.lastIndexOf(".")));
        String filePath = path + File.separator + filename;

        new File(path).mkdirs();
        Files.copy(image.getInputStream(), Paths.get(filePath));

        return filename;
    }
}
