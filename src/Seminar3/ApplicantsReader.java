package Seminar3;

import java.io.FileNotFoundException;
import java.util.List;

 interface AplicantsReader {
    List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}