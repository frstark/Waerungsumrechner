##Chain of Responsibility
Je nach Zuständigkeit werden Methoden mit der Chain of Responsibility an verschiedene Umrechner weitergegeben.
![](.doc_images/c80a1fae.png)

![](.doc_images/39d95af6.png)

Hier nochmal in einem ER-Diagramm dargestellt
![](.doc_images/e45ff000.png)

##Template Hook
![](.doc_images/dea35acb.png)
Code-dublikate sollen verhindert werden. 
Bemerkung: Aufgaben wurden mit Hilfe von Kollegen gelöst.
Verbesserungen im Code wurden durchgeführt. 

![](.doc_images/9122d5a0.png)
![](.doc_images/248c7bd0.png)
![](.doc_images/c60734b3.png)

Exception hinzugefügt:
![](.doc_images/d5f1d7ab.png)

Neue Main:
![](.doc_images/b0a50134.png)

ER-Diagramm danach:
![](.doc_images/d08b5ab6.png)


##Decorater
Umrechnungsfunktionlitäten werden erweitert
Zusätzliche Funktionen sollen nicht in die Vorhandenen Umrechner eingreifen.

Aufgaben:
a)  Belegung eines Umrechnungsvorganges mit Gebühren (z.B. 0,5 % des Umrechnungsbetrages)
![](.doc_images/0fca7875.png)
b)  Belegung eines Umrechnungsvorganges für Umrechnungen von Euro nach Währung X (nicht in die
    andere Richtung) mit fixen Gebühren von 5 Euro.
![](.doc_images/7a6ce5fd.png)

![](.doc_images/d578becc.png)

![](.doc_images/05adbd0a.png)


##Builder
(Folgt)


## Adapter
Es beschreibt eine Adapter-Klasse, die die Kooperation ansonsten inkompatibler Klassen und Interfaces ermöglicht. 
Dies geschieht in Java durch Erweiterung einer Klasse und/oder Implementieren eines Interfaces.

SA ist hier die Adapter Klasse

![](.doc_images/84ff0be4.png)

![](.doc_images/3e7c258a.png)

##Observer

Ein Beobachter und ein Subjekt.
Nutzen:
- Subjekt informiert Beobachter falls sich der Zustand des Subjekts ändert.
- Pull:
  - Beobachter holt sich die Information, sobald sich der Zustand geändert hat.
- Push:
  - Beide Informationen werden sofort mitgesendet.






