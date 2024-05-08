# Java exercice 1
Achat de bonbons

Voici l'algorithme suivant :

   réel money ← 12.4; 
   réel price ← 1.2
   entier candies ← 0
   Si money > 0 ET price > 0
       Tant que (money - price) >= 0
           candies ← candies + 1
           money ← money - price
       Fin Tant que
   Fin Si
   afficher candies

    Crée un nouveau dossier dans JavaProjects, que tu nommeras Candies.
    Dans le dossier Candies, crée la classe CandyCount.java.
    Déclare ta classe CandyCount et ajoute une méthode main(), telle qu'elle est montrée dans la Java - Introduction.
    Dans ta méthode main(), écris en Java le code de l'algorithme du challenge.
    Compile et exécute le code afin de tester qu'il fonctionne correctement.
    Copie ton code dans un Gist et partage le fichier CandyCount.java en solution.

# Java exercice 2 

Challenge
Déclarer et afficher des variables

Ecris un petit programme (une seule classe avec une méthode public static void main(String...args) qui va déclarer quatre variables de quatre types différents (à toi de choisir le bon type selon les cas).
Pour réaliser ce programme, utilise les valeurs que tu trouveras sur le site IMDB, sur la fiche de la dernière croisade

    La première variable doit contenir le nom de ce film d'Indiana Jones, en VO
    La seconde variable te permettra d'indiquer si tu as vu ou non le film en question
    La troisième sera l'année de sortie en salle.
    La quatrième la note du film sur le site IMDB.

Affiche ces valeurs les unes sous les autres (tu peux utiliser System.out.println() pour afficher une variable).

Critères de validation

        le code est sur un GIST
    4 types différents de variables sont représentés et utilisés à bon escient (int, string, boolean et float)
    les variables sont bien nommées (respect des bonnes pratiques et noms cohérents avec la valeur associée)
    ça fonctionne : le contenu des variables est affiché quand on lance le code.

