package com.abhi.springdemo.invoice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/invoices")
public class InvoiceController {

    @GetMapping(path = "/listsAll")
    public ResponseEntity<?> listAll(){
        return null;
    }

}
