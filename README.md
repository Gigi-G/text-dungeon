# Text-Dungeon

------

## *Sommario*

- **[Test](#Test)**
- **[Requisiti](#Requisiti)**
- **[Diagramma UML delle classi](#UML)**

------

## Test
![build](https://github.com/Gigi-G/text-dungeon/workflows/Java%20CI%20with%20Maven/badge.svg)

## Requisiti
Si vuole realizzare un mini-gioco per terminale. All’inizio dovrà essere visualizzato il titolo.
Successivamente dovrà essere visualizzato un menù attraverso il quale l’utente potrà selezionare una tra le
opzioni proposte, che sono: la visualizzazione del regolamento, la scelta di un dungeon da affrontare e
l’uscita dal gioco. Se viene selezionato un dungeon dovrà iniziare una partita. A questo punto, il giocatore
dovrà scegliere un’arma iniziale fra ascia, mannaia e spada. Tutte le armi dovranno possedere delle pietre
che sono: la pietra grigia, che non aumenta il danno; la pietra bianca, che può aumentare il danno del
10%; la pietra nera, che può aumentare il danno del 25%. Ogni pietra dovrà avere una probabilità che
venga generata. Un dungeon dovrà essere popolato da: chimere, ciclopi, goblin, streghe o un sottogruppo
di questi. Ogni nemico dispone di una certa vita e dovrà infliggere un certo danno.
Una volta in battaglia ci sono tre stati in cui dovranno trovarsi il giocatore e il nemico: Attacco, Difesa e
Assalto. L’Attacco batte l’Assalto e chi si trova nello stato di Assalto dovrà subire un danno pari a quello
che può infliggere chi si trova nello stato di attacco; la Difesa batte l’Attacco e chi si trova nello stato di
attacco dovrà subire un danno pari a più o meno alla metà di quello che può essere inflitto da chi si trova
nello stato di difesa; l’Assalto batte la Difesa e chi si trova nello stato di Difesa subisce un danno pari alla
metà di quello che può essere inflitto da chi si trova nello stato di assalto; in caso di pareggio non accade
nulla.
In caso di sconfitta la partita si conclude, ma in caso di vittoria viene proposta una nuova arma (generata
casualmente) che può essere sostituita a quella già in possesso e il gioco va avanti.

## Diagramma UML delle classi
![alt text](https://github.com/Gigi-G/text-dungeon/blob/master/uml/Text_Dungeon.jpg)
