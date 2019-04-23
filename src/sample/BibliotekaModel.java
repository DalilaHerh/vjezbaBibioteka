package sample;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BibliotekaModel {
    private ObservableList<Knjiga> knjige = FXCollections.observableArrayList();
    private SimpleObjectProperty<Knjiga> trenutnaKnjiga = new SimpleObjectProperty<>();

    public void napuni(){
        knjige.add(new  Knjiga("Ivo Andrić", "Travnička hronika", "12345"));
        knjige.add(new  Knjiga("Meša Selimović", "Tvrđava", "62345"));
        knjige.add(new  Knjiga("J. K. Rowling ", "Harry Potter", "54321"));
        trenutnaKnjiga.set(null);

    }

    public ObservableList<Knjiga> getKnjige() {
        return knjige;
    }

    public void setKnjige(ObservableList<Knjiga> knjige) {
        this.knjige = knjige;
    }

    public Knjiga getTrenutnaKnjiga() {
        return trenutnaKnjiga.get();
    }

    public SimpleObjectProperty<Knjiga> trenutnaKnjigaProperty() {
        return trenutnaKnjiga;
    }

    public void setTrenutnaKnjiga(Knjiga trenutnaKnjiga) {
        this.trenutnaKnjiga.set(trenutnaKnjiga);
    }
}
