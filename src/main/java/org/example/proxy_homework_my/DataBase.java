package org.example.proxy_homework_my;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBase implements DataBaseConnection{
    private List<String> names = new ArrayList<>(List.of("Alex", "Anton", "Marina", "Jane", "Mark"));

    @Override
    public List<String> getDatabaseName() {
        return names;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
