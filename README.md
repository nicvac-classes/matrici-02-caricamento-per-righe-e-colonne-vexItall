[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21442664)
|Attenzione|
|----------|
|Per leggere correttamente questo documento, click destro su README.md e seleziona "Open Preview".|

# Riempimento di una matrice per righe o colonne

Vediamo, nel problema svolto che segue, come avviene il riempimento della matrice utilizzando due diverse modalità per inserire dei numeri.

## Il problema
Si deve riempire una matrice per righe scrivendo nelle celle della matrice una riga alla volta, riempiendo cioè dapprima la riga 0, quindi la 1 e via di seguito fino all’ultima.
La prima cella dovrà contenere il valore 1, la seconda cella il valore  2, e così via. 
Ad esempio, per una matrice 3x5 si vuole ottenere il seguente risultato:
![image](assets/image.png)

## L’analisi e la strategia risolutiva
Come prima operazione definiamo una matrice di interi con dimensione parametrica, indicando come costanti **RIGHE** e **COLONNE** rispettivamente il numero di righe e colonne della matrice. 

```Java
...
public static void main(String[] args) {
  int RIGHE = 3;
  int COLONNE = 5;
  int [][] miaMatrice = new int[RIGHE][COLONNE];
  ...
}
```

Per riempire la prima riga (indice di riga uguale a 0) dobbiamo scrivere 5 numeri. Come abbiamo visto nella lezione precedente:

![image](assets/image_2.png)

Nella lezione precedente abbiamo anche visto come scrivere questa operazione utilizzando un ciclo for, usando l'indice di riga 0 per riempire la prima riga.<br/>
Inoltre per riempire le celle con i valori richiesti (1, 2, 3, 4, ...) utilizziamo la variabile **conta** che parte dal valore 0 e incrementiamo di una unità per ogni numero inserito nella cella corrente.


```Java
...
int conta = 0;
for(int j = 0; j <= COLONNE-1; j=j+1){
  conta = conta + 1;
  miaMatrice[0][j] = conta;
}
```

Anche per riempire la seconda riga (indice di riga uguale a 1) dobbiamo scrivere 5 numeri:

![image](assets/image_3.png)

Anche per la seconda riga utilizziamo pertanto lo stesso ciclo scritto in precedenza modificando solo il valore dell'indice che indica appunto la seconda riga (quindi 1, anzichè indice 0):

```Java
...
for(int j = 0; j <= COLONNE-1; j=j+1){
  conta = conta + 1;
  miaMatrice[1][j] = conta;
}
```

Analogo discorso per l’ultima riga, dove avremo l’indice di riga = 2:

![image](assets/image_4.png)

```Java
...
for(int j = 0; j <= COLONNE-1; j=j+1) {
  conta = conta + 1;
  miaMatrice[2][j] = conta;
}
```

Quindi il programma completo per riempire la matrice con numeri progressivi è il seguente:
```Java
int RIGHE = 3;
int COLONNE = 5;
int [][] miaMatrice = new int[RIGHE][COLONNE];
int conta = 0;

for(int j = 0; j <= COLONNE-1; j=j+1){
  conta = conta + 1;
  miaMatrice[ 0 ][j] = conta;
}

for(int j = 0; j <= COLONNE-1; j=j+1){
  conta = conta + 1;
  miaMatrice[ 1 ][j] = conta;
}

for(int j = 0; j <= COLONNE-1; j=j+1) {
  conta = conta + 1;
  miaMatrice[ 2 ][j] = conta;
}
```

Se osserviamo come sono strutturati i tre cicli, l’unica differenza che si nota è il valore dell’indice di riga che vale 0 nel primo, 1 nel secondo e 2 nel terzo: si può quindi utilizzare un ciclo for anche per questo nuovo indice (che chiamiamo i), facendolo variare da 0 al RIGHE–1. Ad ogni iterazione di questo nuovo ciclo, verrà riempita la riga avente per coordinata proprio il valore dell’indice.

Applichiamo questa osservazione al programma precedente, ottenendo quindi il codice completo per riempire una matrice **per righe**:
```Java
...
public static void main(String[] args) {
  int RIGHE = 3;
  int COLONNE = 5;
  int [][] miaMatrice = new int[RIGHE][COLONNE];

  int conta = 0;
  for (int i=0; i <= RIGHE-1; i=i+1 ) {
    for (int j=0; j <= COLONNE-1; j=j+1) {
      conta = conta + 1;
      miaMatrice[i][j] = conta;
    }
  }
}
```

Il codice per riempire una matrice **per colonne** si ottiene semplicemente scambiando tra loro i due cicli for, come si può osservare dalla seguente codifica:
```Java
...
public static void main(String[] args) {
  int RIGHE = 3;
  int COLONNE = 5;
  int [][] miaMatrice = new int[RIGHE][COLONNE];

  int conta = 0;
  for (int j=0; j <= COLONNE-1; j=j+1 ) {
    for (int i=0; i <= RIGHE-1; i=i+1) {
      conta = conta + 1;
      miaMatrice[i][j] = conta;
    }
  }
}
```


Come per i vettori, anche per le matrici è conveniente definire e utilizzare le **funzioni**. L'unico aspetto a cui prestare attenzione è il tipo del parametro nella funzione, che ora diventa **int[][]** anzichè **int[]**.

Lo vediamo nel seguente esercizio.

## Esercizio
Nel file *Esercizio.java*, completa il contenuto della funzione *riempiPerRighe*, riempiendo le celle della matrice per righe, come spiegato nel paragrafo precedente. 

La funzione deve avere i seguenti parametri:
* Parametro di input/output: matrice M da riempire per righe.
* Parametri di input: RIGHE e COLONNE, che rappresentano di quante righe e colonne è composta la matrice.
* Parametri di output: nessuno.

<hr/>
<details>
  <summary>Solo dopo aver svolto l'esercizio, apri qui per vedere la soluzione</summary>

```Java
public static void riempiPerRighe( int[][] M, int RIGHE, int COLONNE ) {
  int conta = 0;
  for (int i=0; i <= RIGHE-1; i=i+1 ) {
    for (int j=0; j <= COLONNE-1; j=j+1) {
      conta = conta + 1;
      M[i][j] = conta;
    }
  }
}

```
</details>
<hr/>

Nel file *Esercizio.java*, completa il contenuto della funzione *riempiPerColonne*, riempiendo le celle della matrice per colonne, come spiegato nel paragrafo precedente. 

La funzione deve avere i seguenti parametri:
* Parametro di input/output: matrice M da riempire per righe.
* Parametri di input: RIGHE e COLONNE, che rappresentano di quante righe e colonne è composta la matrice.
* Parametri di output: nessuno.

<hr/>
<details>
  <summary>Solo dopo aver svolto l'esercizio, apri qui per vedere la soluzione</summary>

```Java
public static void riempiPerColonne( int[][] M, int RIGHE, int COLONNE ) {
  int conta = 0;
  for (int j=0; j <= COLONNE-1; j=j+1 ) {
    for (int i=0; i <= RIGHE-1; i=i+1) {
      conta = conta + 1;
      M[i][j] = conta;
    }
  }
}
```
</details>
<hr/>

Nel file *Esercizio.java*, completa il contenuto della funzione *main*, secondo le seguenti indicazioni:
* dichiarare e inizializzare le variabili RIGHE e COLONNE, che contengono rispettivamente il numero di righe e colonne che compongono una matrice;
* dichiarare due matrici della stessa dimensione, di nome matricePerRighe e matricePerColonne;
* chiamare la funzione riempiPerRighe, passando come parametro di input/output la matrice matricePerRighe;
* chiamare la funzione riempiPerColonne, passando come parametro di input/output la matrice matricePerColonne;
* visualizzare entrambe le matrici usando *UtilsMatrice.visualizza(matrice)*;

<hr/>
<details>
  <summary>Solo dopo aver svolto l'esercizio, apri qui per vedere la soluzione</summary>

```Java
public static void main(String[] args) {
  int RIGHE = 3;
  int COLONNE = 5;
  int[][] matricePerRighe = new int[RIGHE][COLONNE];
  int[][] matricePerColonne = new int[RIGHE][COLONNE];
  
  riempiPerRighe(matricePerRighe, RIGHE, COLONNE);
  riempiPerColonne(matricePerColonne, RIGHE, COLONNE);
  
  System.out.println("Per righe:");
  UtilsMatrice.visualizza(matricePerRighe);
 
  System.out.println("Per colonne:");
  UtilsMatrice.visualizza(matricePerColonne);
}
```
</details>
<hr/>

Eseguire il programma per controllare che l'output sia analogo al seguente:
```
Per righe:
[ 1  2  3  4  5]
[ 6  7  8  9 10]
[11 12 13 14 15]

Per colonne:
[1 4 7 10 13]
[2 5 8 11 14]
[3 6 9 12 15]
```
