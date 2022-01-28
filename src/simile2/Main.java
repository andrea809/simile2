package simile2;

import persistence.PersistenzaDatiCsv;
import persistence.PersistenzaException;

public class Main {

    public static void main(String[] args) {
        PersistenzaDatiCsv persistenza = new PersistenzaDatiCsv("misurazioni.csv");
        FileJson fileJson = new FileJson("https://api-simile.como.polimi.it/v1/observations");
        try {
            persistenza.write(fileJson.getData());
        } catch (PersistenzaException | NullPointerException e) {
            System.out.println("L'operazione non è andata a buon fine.");
        }
    }
}
