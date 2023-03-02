package biblioteka.interfejs;

import java.util.List;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaIntefejs {

	void dodajKnjigu(Knjiga knjiga);

	void obrisiKnjigu(Knjiga knjiga);

	List<Knjiga> vratiSveKnjige();

	List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac);
}
