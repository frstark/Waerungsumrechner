

#SOLID und Modulierungen
„S“ wie „Single-Responsibility-Prinzip“
Die Kernaussage des Prinzips ist, dass jede Klasse nur genau eine fest definierte Aufgabe zu erfüllen hat

„O“ wie „Open-Closed-Prinzip“
Dieses Prinzip besagt, dass Klassen, Methoden, Module et cetera so entwickelt werden sollen, dass sie einfach zu erweitern sind – ohne aber ihr Verhalten zu ändern.

„L“ wie „Liskovsches Substitutionsprinzip“
Das (Ersetzungs-)Prinzip sagt aus, dass eine Subklasse immer alle Eigenschaften der Superklasse erfüllen und immer als Objekt der Superklasse verwendbar sein muss.

„I“ wie „Interface-Segregation-Prinzip“
Wie der Name erahnen lässt, geht es hierbei darum, Interfaces aufzuspalten beziehungsweise sie nicht unnötig groß zu machen.

„D“ wie „Dependency-Inversion-Prinzip“
In Modulen, die eine höhere Hierarchie innerhalb der Software aufweisen, werden generelle Abläufe beschrieben, die von spezielleren Modulen verwendet werden.

Quelle: https://t3n.de/news/prinzipien-software-entwicklung-solid-615556/


## Table of Contents
1.[Chain of Responsibility](#chain_of_responses)
2.[Template Hook](#template_hook)
3.[Decorater](#decorater)
4.[Builder](#builder)
5.[Adapter](#adapter)
6.[Observer](#observer)





## Chain of Responsibility <a name="chain_of_responses"></a>
Je nach Zuständigkeit werden Methoden mit der Chain of Responsibility an verschiedene Umrechner weitergegeben.
![](.doc_images/c80a1fae.png)

![](.doc_images/39d95af6.png)

Hier nochmal in einem ER-Diagramm dargestellt
![](.doc_images/e45ff000.png)

## Template Hook <a name="template_hook"></a>
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


## Decorater<a name="decorater"></a>
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


## Builder<a name="builder"></a>
(Folgt)


## Adapter <a name= "adapter"></a>
Es beschreibt eine Adapter-Klasse, die die Kooperation ansonsten inkompatibler Klassen und Interfaces ermöglicht. 
Dies geschieht in Java durch Erweiterung einer Klasse und/oder Implementieren eines Interfaces.

SA ist hier die Adapter Klasse

![](.doc_images/84ff0be4.png)

![](.doc_images/3e7c258a.png)

## Observer <a name="observer"></a>

Ein einzelner 'Erzähler' möchte, 
dass eine von ihm gesandte Nachricht von einer beliebigen Vielzahl von 'Zuhörern' wahrgenommen wird.
"https://javabeginners.de/Design_Patterns/Observer_-Pattern.php"

Ein Beobachter und ein Subjekt.
Nutzen:
- Subjekt informiert Beobachter falls sich der Zustand des Subjekts ändert.
- Pull:
  - Beobachter holt sich die Information, sobald sich der Zustand geändert hat.
- Push:
  - Beide Informationen werden sofort mitgesendet.
  
![](.doc_images/0a824ab1.png)
![](.doc_images/b10dc731.png)


![](.doc_images/9102ca61.png)






