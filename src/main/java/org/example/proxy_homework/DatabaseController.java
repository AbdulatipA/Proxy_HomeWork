package org.example.proxy_homework;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/databaseControllers")
public class DatabaseController {
    private DataBaseProxy dataBaseProxy;


    @GetMapping("/all")
    public ResponseEntity<List<String>> getNamesDatabases() {
        return ResponseEntity.ok(dataBaseProxy.getDatabaseName());
    }

    public DatabaseController(DataBaseProxy dataBaseProxy) {
        this.dataBaseProxy = dataBaseProxy;
    }
}
