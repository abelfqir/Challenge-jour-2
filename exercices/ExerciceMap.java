import java.util.HashMap;
import java.util.Map;

/**
 * ============================================
 *  TP — Map (HashMap)
 * ============================================
 *
 * Énoncé :
 * --------
 * Compléter les méthodes ci-dessous pour pratiquer
 * les HashMap en Java.
 *
 * Rappel PHP → Java :
 * -------------------
 * PHP :  $tab = [];                     → Java : Map<K,V> map = new HashMap<>();
 * PHP :  $tab["clé"] = "valeur";        → Java : map.put("clé", "valeur");
 * PHP :  $tab["clé"]                    → Java : map.get("clé")
 * PHP :  isset($tab["clé"])             → Java : map.containsKey("clé")
 * PHP :  unset($tab["clé"])             → Java : map.remove("clé")
 * PHP :  count($tab)                    → Java : map.size()
 * PHP :  foreach ($tab as $k => $v)     → Java : for (Map.Entry<K,V> e : map.entrySet())
 * PHP :  array_keys($tab)              → Java : map.keySet()
 * PHP :  array_values($tab)            → Java : map.values()
 */
public class ExerciceMap {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("  EXERCICE MAP (HashMap)");
        System.out.println("==========================================");

        // =============================================
        //  PARTIE 1 : Opérations de base
        // =============================================

        System.out.println("\n--- PARTIE 1 : Opérations de base ---");

        // TODO 1 : Créer un HashMap<String, Integer> appelé "ages"
        //          Ajouter les entrées : "Ahmed" → 25, "Fatima" → 22, "Youssef" → 28
        // Indice : new HashMap<>() et put()

        // TODO 2 : Afficher l'âge de "Fatima"
        // Indice : utiliser get()

        // TODO 3 : Vérifier si la clé "Sara" existe dans la map
        // Indice : utiliser containsKey()

        // TODO 4 : Vérifier si la valeur 28 existe dans la map
        // Indice : utiliser containsValue()

        // TODO 5 : Ajouter "Sara" → 24, puis afficher la taille de la map
        // Indice : utiliser put() et size()

        // TODO 6 : Modifier l'âge de "Ahmed" à 26 (mettre à jour)
        // Indice : utiliser put() avec la même clé

        // TODO 7 : Supprimer "Youssef" de la map
        // Indice : utiliser remove()

        // =============================================
        //  PARTIE 2 : Parcours d'une Map
        // =============================================

        System.out.println("\n--- PARTIE 2 : Parcours ---");

        // TODO 8 : Parcourir et afficher toutes les CLÉS de la map
        // Indice : utiliser keySet() avec for-each

        // TODO 9 : Parcourir et afficher toutes les VALEURS de la map
        // Indice : utiliser values() avec for-each

        // TODO 10 : Parcourir et afficher toutes les paires clé-valeur
        //           Format : "Nom : Ahmed, Age : 26"
        // Indice : utiliser entrySet() avec for-each
        //          entry.getKey() et entry.getValue()

        // =============================================
        //  PARTIE 3 : Annuaire téléphonique
        // =============================================

        System.out.println("\n--- PARTIE 3 : Annuaire téléphonique ---");

        // TODO 11 : Créer un HashMap<String, String> appelé "annuaire"
        //           Ajouter 4 contacts : nom → numéro de téléphone

        // TODO 12 : Rechercher un contact par nom et afficher son numéro
        //           Si le contact n'existe pas, afficher "Contact introuvable"
        // Indice : utiliser containsKey() avant get()

        // TODO 13 : Supprimer un contact et confirmer la suppression

        // TODO 14 : Afficher tous les contacts de l'annuaire
        //           Format : "📞 Nom : numéro"

        // =============================================
        //  PARTIE 4 : Compter la fréquence des mots
        // =============================================

        System.out.println("\n--- PARTIE 4 : Fréquence des mots ---");

        String texte = "java est super java est puissant et java est rapide";

        // TODO 15 : Compter combien de fois chaque mot apparaît dans le texte
        //           et afficher le résultat
        //           Exemple de sortie :
        //           java → 3
        //           est → 3
        //           super → 1
        //           puissant → 1
        //           et → 1
        //           rapide → 1
        // Indice : split(" "), puis pour chaque mot :
        //          getOrDefault(mot, 0) + 1

        // =============================================
        //  PARTIE 5 : getOrDefault et putIfAbsent
        // =============================================

        System.out.println("\n--- PARTIE 5 : Méthodes utiles ---");

        // TODO 16 : Utiliser getOrDefault() pour chercher un élément qui n'existe pas
        //           Chercher l'âge de "Omar" avec une valeur par défaut de 0
        // Indice : map.getOrDefault("Omar", 0)

        // TODO 17 : Utiliser putIfAbsent() pour ajouter un élément seulement s'il n'existe pas
        //           Essayer d'ajouter "Ahmed" → 30 (ne doit PAS écraser l'existant)
        //           Puis ajouter "Omar" → 27 (doit fonctionner car Omar n'existe pas)
        // Indice : map.putIfAbsent(clé, valeur)

        // =============================================
        //  PARTIE 6 : Stream sur Map
        // =============================================

        System.out.println("\n--- PARTIE 6 : Stream sur Map ---");

        // Rappel PHP → Java :
        // PHP :  array_filter($tab, fn($v) => $v >= 23)
        // Java : map.entrySet().stream().filter(e -> e.getValue() >= 23)
        //
        // PHP :  array_map(fn($v) => $v + 1, $tab)
        // Java : map.entrySet().stream().collect(Collectors.toMap(...))

        // TODO 18 : Filtrer la map "ages" pour garder seulement les personnes
        //           de 23 ans ou plus, et afficher le résultat
        // Indice : ages.entrySet().stream()
        //              .filter(entry -> entry.getValue() >= 23)
        //              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
        // ⚠️ Ajouter : import java.util.stream.Collectors; en haut du fichier

        // TODO 19 : Trier la map par VALEUR (âge croissant) et afficher
        // Indice : ages.entrySet().stream()
        //              .sorted(Map.Entry.comparingByValue())
        //              .forEach(e -> System.out.println(...))

        // TODO 20 : Trier la map par CLÉ (nom alphabétique) et afficher
        // Indice : utiliser Map.Entry.comparingByKey()

        // TODO 21 : Calculer la somme de tous les âges avec reduce()
        // Indice : ages.values().stream().reduce(0, Integer::sum)

        // TODO 22 : Trouver la personne la plus âgée avec max()
        // Indice : ages.entrySet().stream()
        //              .max(Map.Entry.comparingByValue())

        // TODO 23 : Transformer les valeurs — ajouter 1 an à chaque personne
        //           Stocker le résultat dans une nouvelle Map et afficher
        // Indice : .collect(Collectors.toMap(
        //              Map.Entry::getKey,
        //              entry -> entry.getValue() + 1))

        // TODO 24 : Collecter uniquement les NOMS (clés) des personnes
        //           ayant plus de 24 ans dans une List<String> et afficher
        // Indice : ages.entrySet().stream()
        //              .filter(...)
        //              .map(Map.Entry::getKey)
        //              .collect(Collectors.toList())

    }
}
