package com.chenbo.fileupload.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class fileupController {
    @PostMapping("/fileupController")
    public String fileUp(MultipartFile upload) throws IOException {
        System.out.println(upload.getOriginalFilename());
        upload.transferTo(new File("D:/"+upload.getOriginalFilename()));
         return "ok";


    }
}
