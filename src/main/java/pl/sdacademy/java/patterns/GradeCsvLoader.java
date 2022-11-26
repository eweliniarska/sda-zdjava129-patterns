package pl.sdacademy.java.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;


public class GradeCsvLoader extends AbstractCsvLoader<Grade> {

    private final Supplier<InputStream> inputStreamSupplier;

    public GradeCsvLoader(Supplier<InputStream> inputStreamSupplier) {
        this.inputStreamSupplier = inputStreamSupplier;
    }

    public List<Grade> loadGrades() {

        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        inputStreamSupplier.get()
                )
        )) {
            return bufferedReader.lines()
                    .map(line -> line.split(","))
                    .map(this::parseLine)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private Grade parseLine(String[] fields) {
        return new Grade(
                UUID.fromString(fields[0]))
                .gradeType(fields[2])
                .value(fields[1])
                .issueDateTime();
                )
                .build();
    }


}

