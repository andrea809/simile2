package simile2;

import com.google.gson.Gson;
import persistence.PersistenzaDatiCsv;
import persistence.PersistenzaException;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        PersistenzaDatiCsv persistenza = new PersistenzaDatiCsv("misurazioni.csv");
        FileJson fileJson = new FileJson("https://api-simile.como.polimi.it/v1/observations");
        try {
            persistenza.write(fileJson.getData());
        } catch (PersistenzaException e) {
            e.printStackTrace();
        }
    }
}
