package com.fabriciolfj.github.patterns;

import com.fabriciolfj.github.patterns.file.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

    @Test
    public void consumeFileJson() throws IOException {
        Path path = Paths.get("src/test/resources/json/person.json");
        var file = Files.readString(path);

        var mapper = new ObjectMapper();

        System.out.println(mapper.readValue(file, Person.class));
    }
}
