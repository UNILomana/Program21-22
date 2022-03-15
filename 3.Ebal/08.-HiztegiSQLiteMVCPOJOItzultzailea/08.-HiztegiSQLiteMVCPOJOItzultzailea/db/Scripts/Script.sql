DROP TABLE Terminoak;
CREATE TABLE Terminoak(
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	euskaraz VARCHAR(20),
	gaztelera VARCHAR(20));
	
INSERT INTO Terminoak VALUES (1, "sagarra", "manzana");
INSERT INTO Terminoak VALUES (2,"udarea","pera");
INSERT INTO Terminoak VALUES (3,"marrubia", "fresa");