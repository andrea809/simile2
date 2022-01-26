package persistence;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import domain.Data;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersistenzaDatiCsv implements IPersistenzaDatiCsv {
    String nomeFile;
    public PersistenzaDatiCsv(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    @Override
    public void write(List<Data> data) throws PersistenzaException {
        try {
            Writer writer = Files.newBufferedWriter(Paths.get("misurazioni.csv"));
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).withSeparator(';').build();
            beanToCsv.write(data);
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            System.out.println("writer exption");
        }

    }

    @Override
    public List<Data> read() throws PersistenzaException {
        ArrayList<Data> dati = new ArrayList<Data>();
        return dati;
    }
}
