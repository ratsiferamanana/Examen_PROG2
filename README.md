# Examen_PROG2
A.THEORIE
1-L'annotation @Override en Java est utilisée pour indiquer qu'une méthode est destinée à redéfinir une méthode dans une classe parente. Cela signifie que la méthode annotée va remplacer une méthode avec la même signature 
 
2- Pourquoi est-ce qu’on a souvent besoin de redéfinir equals et hashCode ?

En Java, la redéfinition des méthodes equals et hashCode est essentielle pour garantir que les objets sont comparés correctement en fonction de leur contenu plutôt que de leur référence mémoire. Ces méthodes sont cruciales pour le bon fonctionnement des collections basées sur le hachage telles que HashSet, HashMap, et Hashtable.

    equals : Cette méthode détermine si deux objets sont "logiquement égaux". Par défaut, elle compare les références mémoire, mais on la redéfinit souvent pour comparer les valeurs des attributs des objets.

    hashCode : Cette méthode retourne un entier qui représente l'objet. Elle est utilisée en interne par les structures de données basées sur le hachage pour organiser les objets. Pour garantir un fonctionnement correct, deux objets égaux selon equals doivent avoir le même code de hachage.

Voici un exemple de redéfinition de equals et hashCode :

java

class Person {
    private String name;
    private int age;

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

3. Qu’est-ce que le polymorphisme statique ? Donnez un exemple

Le polymorphisme statique, également connu sous le nom de surcharge de méthodes, se produit lorsque plusieurs méthodes dans une même classe ont le même nom mais des signatures différentes (différent type ou nombre de paramètres). C'est un type de polymorphisme qui est résolu au moment de la compilation (d'où le terme "statique").

Exemple de polymorphisme statique :

java

class MathUtils {
    // Addition de deux entiers
    int add(int a, int b) {
        return a + b;
    }


    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.add(1, 2));           
        System.out.println(math.add(1, 2, 3));       
        System.out.println(math.add(1.5, 2.5));       
    }
}




