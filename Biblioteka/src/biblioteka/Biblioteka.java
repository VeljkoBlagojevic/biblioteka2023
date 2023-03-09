package biblioteka;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import biblioteka.interfejs.BibliotekaIntefejs;

public class Biblioteka implements BibliotekaIntefejs {

	private List<Knjiga> knjige = new ArrayList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		if(autor == null && ISBN < 0 && naslov == null && izdavac == null) {
			return null;
		}
		
		return knjige.stream()
				.filter(knjiga -> knjiga.getAutori().equals(autor))
				.filter(knjiga -> knjiga.getISBN() == ISBN)
				.filter(knjiga -> knjiga.getNaslov().contains(naslov.toLowerCase().trim()))
				.filter(knjiga -> knjiga.getIzdavac().equals(izdavac))
				.collect(Collectors.toList());
	}

}
