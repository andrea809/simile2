package persistence;

import domain.Data;

import java.util.List;

public interface IPersistenzaDatiCsv {
    void write(List<Data> dati) throws PersistenzaException;
    List<Data> read() throws PersistenzaException;
}
