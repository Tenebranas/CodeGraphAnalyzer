package com.xavier.codegraphanalyzer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class MyController {
    @RequestMapping("/")
    public String listUploadedFiles() throws IOException {
        return "default";
    }
}
