package com.attacomsian.parsecsv.controllers;

import com.attacomsian.parsecsv.domains.Hauslist;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

@Controller
public class UploadController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/upload-csv-file")
    public String uploadCSVFile(@RequestParam("file") MultipartFile file, Model model) {

        // file validation step here
        if (file.isEmpty()) {
            model.addAttribute("message", "Please select a CSV file to upload.");
            model.addAttribute("status", false);
        } else {

            // transfer the contents of CSV file in-order to list the house list contents
            try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {

                // here create the beanreader for csv
                CsvToBean<Hauslist> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(Hauslist.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .withSeparator(';')
                        .build();

                // change the contents of CSV to bean inorder to list the house list contents
                List<Hauslist> hauslists = csvToBean.parse();


                // save content of house list on model
                model.addAttribute("hauslists", hauslists);
                model.addAttribute("status", true);

            } catch (Exception ex) {
                model.addAttribute("message", "Check the content of CSV file, an error had occurred while processing the CSV file.");
                model.addAttribute("status", false);
            }
        }

        return "file-upload-status";
    }
}
