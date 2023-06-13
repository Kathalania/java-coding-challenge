Hallo und vielen Dank für Ihr Interesse!

Um Ihren jetzigen Stand in der Programmierung besser einschätzen zu können, haben wir uns für Sie folgende Programmieraufgabe ausgedacht:

In dem Testprojekt sind 4 Klassen hinterlegt. Zum einen eine Personen Klasse, sowie der entsprechende Test dazu. Zum anderen die OcrNumbers Klasse, mit dem ebenfalls dazugehörigen Test.
Die Tests dienen zur Orientierung sowie zur Überprüfung des Ergebnisses. Bitte nehmen Sie keine Änderungen an den Tests vor.
Die Aufgabe unterteilt sich in 4 Aufgaben, wobei sich die 1, 2 und 3 mit der Personen Klasse beschäftigen, während 4 sich mit der OcrNumbers Klasse beschäftigt.

## Aufgabe 1
Die Klasse Personen besteht aus den Eigenschaften `Vorname`, `Nachname` und `Geburtstag`.

Nun soll Folgendes gelten:
Zwei Personen gelten als gleich, wenn alle drei Eigenschaften der Person übereinstimmen.

## Aufgabe 2
Für diese Aufgabe soll die bereits bestehende Methode `GetFirstNames` implementiert werden.  
Diese soll Folgendes erfüllen:
- Ausgabe in folgendem Format: "1. Emma, 2. Ben, 3. Paul"
- Effizienz auch bei vielen Vornamen
- Umgang mit null Werten

## Aufgabe 3
Bei dieser Aufgabe soll nun die Methode "GetFirstNamesOrdered" implementiert werden.
Dabei soll Sie das gleiche Verhalten wie die Methode `GetFirstNames` aus Aufgabe 2 besitzen, mit dem Zusatz, dass die Vornamen nach Alphabet sortiert sein sollen.

## Aufgabe 4
In dieser Aufgabe geht es darum, die Darstellung einer Zahl, abgebildet auf einem Raster von 3 x 4, in eine richtige Zahl umzuwandeln.

Das folgende Beispiel zeigt eine 0:
```
" _ \n" +
"| |\n" +
"|_|\n" +
"   "
```

Dabei wird zur Darstellung dieser Zahl Leerzeichen, Underscores und Pipes benutzt. Die 4. Zeile ist immer leer.

Die 1 wird wie folgt dargestellt:
```
"   \n" +
"  |\n" +
"  |\n" +
"   ";
```

Wenn die Eingabe die korrekte Länge hat, jedoch nicht erkennbar ist, soll das Programm "?" zurückgeben.
Hat die Eingabe nicht die korrekte Länge, soll eine IllegalArgumentException geworfen werden.

Um diese Aufgabe zu lösen, orientieren Sie sich bitte an den Tests. In der "OcrNumbersTests" Klasse ist zunächst nur der erste Test aktiv geschalten.
Wenn Sie den ersten Test gelöst haben, schalten Sie bitte den 2. frei usw.

Es kann sein, dass Sie es zeittechnisch nicht schaffen die Fälle für alle Tests zu implementieren.
Dies ist jedoch so beabsichtigt. Versuchen Sie so viele Tests wie möglich einzubinden.
