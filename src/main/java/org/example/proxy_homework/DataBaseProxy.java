package org.example.proxy_homework;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
@Slf4j
public class DataBaseProxy implements DataBaseConnection{
    private  DataBase dataBase;

    @Override
    public List<String> getDatabaseName() {
        log("был вызван метод -> getDatabaseName()");
       return dataBase.getDatabaseName();
    }


    private void log(String message){
        try {
            FileWriter writer = new FileWriter("log", true);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            writer.write("В " + LocalDateTime.now().format(formatter) + " " + message + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public DataBaseProxy(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
