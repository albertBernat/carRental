# carRental

Stwórz aplikację łączącą się z bazą danych MySQL(podgląd w workbench)
Aplikacja będzie prostym systemem do obsługi wypożyczani samochodów
Zamodeluj używając JPA tabele:

```
Samochód
Wypożyczone samochody klienta
Klient
Pracownik
```

System ma mieć możliwość 
1. Wykonania operacji CRUD na powyższych tabelach(z wystawionym REST API)
2. Wypożyczenia samochodu przez klienta (Przyda się jakiś enum ze statusem?)
3. Oddania samochodu przez klienta 
4. Obliczenia rachunku za wynajęcie samochodu(ile dni był w wypożyczeniu * cena za wypożyczenie)


Propozycje dla zawartości tabel:

```
Samochód:
	Id
	Marka
	Model 
	Rocznik
	Koszt wynajmu za dzień
	Kolor

Klient
	Id
	Imie
	Nazwisko
	Numer prawa jazdy
	Data urodzenia
	Adres? (do decyzji czy osobna tabela czy tutaj)
	Płeć
	
Wypożyczenia
	Id samochodu
	Id klienta
	data rozpoczęcia
	data oddania

Pracownik:
	Id 
	imie  
	Nazwisko
	Pensja
	Data urodzenia
	Adres
	Płeć
```
