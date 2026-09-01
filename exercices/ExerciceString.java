/**
 * ============================================
 *  TP — String et StringBuilder
 * ============================================
 *
 * Énoncé :
 * --------
 * Compléter les méthodes ci-dessous pour pratiquer
 * les manipulations de String et StringBuilder en Java.
 *
 * Rappel PHP → Java :
 * -------------------
 * PHP :  strlen($str)            → Java : str.length()
 * PHP :  strtoupper($str)        → Java : str.toUpperCase()
 * PHP :  strtolower($str)        → Java : str.toLowerCase()
 * PHP :  trim($str)              → Java : str.trim()
 * PHP :  substr($str, 0, 5)      → Java : str.substring(0, 5)
 * PHP :  strpos($str, "abc")     → Java : str.indexOf("abc")
 * PHP :  str_replace("a","b",$s) → Java : s.replace("a", "b")
 * PHP :  explode(" ", $str)      → Java : str.split(" ")
 * PHP :  $str1 === $str2         → Java : str1.equals(str2)
 * PHP :  $str1 . $str2           → Java : str1 + str2  OU  StringBuilder
 */
public class ExerciceString {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("  EXERCICE STRING & STRINGBUILDER");
        System.out.println("==========================================");

        // =============================================
        //  PARTIE 1 : Méthodes de base sur String
        // =============================================

        String phrase = "  Bonjour les développeurs Java !  ";

        System.out.println("\n--- PARTIE 1 : Méthodes de base ---");

        // TODO 1 : Afficher la longueur de la phrase (avec les espaces)
        // Indice : utiliser length()

        // TODO 2 : Afficher la phrase sans les espaces au début et à la fin
        // Indice : utiliser trim()

        // TODO 3 : Afficher la phrase en MAJUSCULES
        // Indice : utiliser toUpperCase()

        // TODO 4 : Afficher la phrase en minuscules
        // Indice : utiliser toLowerCase()

        // TODO 5 : Extraire et afficher le mot "Bonjour" (après trim)
        // Indice : utiliser substring(debut, fin)

        // TODO 6 : Vérifier si la phrase contient le mot "Java"
        // Indice : utiliser contains()

        // TODO 7 : Trouver la position du mot "développeurs" dans la phrase (après trim)
        // Indice : utiliser indexOf()

        // TODO 8 : Remplacer "Java" par "Python" et afficher le résultat
        // Indice : utiliser replace()

        // TODO 9 : Vérifier si la phrase (après trim) commence par "Bonjour"
        // Indice : utiliser startsWith()

        // TODO 10 : Vérifier si la phrase (après trim) se termine par "!"
        // Indice : utiliser endsWith()

        // =============================================
        //  PARTIE 2 : equals() vs ==
        // =============================================

        System.out.println("\n--- PARTIE 2 : equals() vs == ---");

        String s1 = new String("Java");
        String s2 = new String("Java");

        // TODO 11 : Comparer s1 et s2 avec == et afficher le résultat
        // TODO 12 : Comparer s1 et s2 avec equals() et afficher le résultat
        // TODO 13 : Expliquer dans un commentaire pourquoi les résultats sont différents

        // =============================================
        //  PARTIE 3 : split() — Découper une chaîne
        // =============================================

        System.out.println("\n--- PARTIE 3 : split() ---");

        String csv = "Ahmed;Fatima;Youssef;Sara;Omar";

        // TODO 14 : Découper la chaîne csv par ";" et afficher chaque prénom
        // Indice : utiliser split(";") et une boucle for-each

        // =============================================
        //  PARTIE 4 : StringBuilder
        // =============================================

        System.out.println("\n--- PARTIE 4 : StringBuilder ---");

        // TODO 15 : Créer un StringBuilder et construire la phrase
        //           "Java est puissant et rapide"
        //           en utilisant append() pour chaque mot
        // Indice : new StringBuilder(), append()

        // TODO 16 : Insérer le mot "très " avant "puissant" dans le StringBuilder
        // Indice : utiliser insert(position, texte)

        // TODO 17 : Supprimer le mot "et rapide" du StringBuilder
        // Indice : utiliser delete(debut, fin)

        // TODO 18 : Inverser le contenu du StringBuilder et afficher
        // Indice : utiliser reverse()

        // TODO 19 : Convertir le StringBuilder en String et afficher
        // Indice : utiliser toString()

        // =============================================
        //  PARTIE 5 : Exercices pratiques
        // =============================================

        System.out.println("\n--- PARTIE 5 : Exercices pratiques ---");

        // TODO 20 : Écrire un code qui vérifie si un mot est un palindrome
        //           (se lit pareil à l'endroit et à l'envers)
        //           Tester avec : "radar", "java", "kayak"
        // Indice : utiliser StringBuilder + reverse() + equals()

        // TODO 21 : Écrire un code qui compte le nombre de voyelles
        //           dans une phrase donnée
        //           Tester avec : "Bonjour les développeurs Java"
        // Indice : parcourir caractère par caractère avec charAt()

        // TODO 22 : Écrire un code qui inverse l'ordre des mots d'une phrase
        //           Exemple : "Bonjour le monde" → "monde le Bonjour"
        // Indice : utiliser split(), puis StringBuilder avec une boucle inversée

    }
}
