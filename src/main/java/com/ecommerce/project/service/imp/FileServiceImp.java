package com.ecommerce.project.service.imp;

import com.ecommerce.project.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImp implements FileService {

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        System.out.println("originalFilename: " + originalFilename);

        String randomId = UUID.randomUUID().toString();
        System.out.println("randomId: " + randomId);
        String fileName = randomId.concat(originalFilename.substring(originalFilename.lastIndexOf('.')));
        System.out.println("fileName: " + fileName);
        String filePath = path + File.separator + fileName;
        System.out.println("filePath: " + filePath);

        File folder = new File(path);
        if (!folder.exists()){
            folder.mkdir();
        }

        Files.copy(file.getInputStream(), Paths.get(filePath));

        return fileName;
    }
}
