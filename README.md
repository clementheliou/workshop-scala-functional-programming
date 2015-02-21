#Workshop Programmation fonctionnelle

##Objectif
Nous allons ensemble découvrir la programmation fonctionnelle à travers une série d'exercices.
Nous allons voir les patterns de base et les contraintes associées.

##Contraintes

* Toute variable doit être `final` (l'utilisation de `var` est interdite). De ce fait, faire une boucle est interdit car elle nécessite un compteur muable.
* L'héritage de classe est interdit, seule l'implémentation est autorisée.
* L'utilisation d'une autre classe que `Int`, `Double`, `Boolean`, `String` et `Char` est interdite.
* L'utilisation des exceptions est interdite.


##Partie 1: List

Une des structures élémentaires de la programmation fonctionnelle est la liste simplement chaînée.
Votre liste doit être polymorphique (avec un type générique). On attend donc une signature de ce type:

	trait List[A] ...
	
La liste est formée d'éléments qui sont liés à leurs successeurs. Un élément d'une liste est soit:

* l'élément vide (type nommé `Nil`);
* un élément non vide (head de type `A`) + la liste des éléments restants (tail).


Donc, l'interface `List[A]` doit être implémentée par deux classes:

	class Cons[A](...) extends List[A]

et 

	class Nil .. extends List...

###Exercice 1
À vos claviers! Coder donc cette structure. Nous devons pouvoir créer des listes à la fin de cette étape.

###Exercice 2
Implémenter la méthode `tail` sur la liste. Vous remarquerez que l'accès se fait en temps constant!

###Exercice 3
Généraliser la méthode `tail` dans une méthode `drop (n:Int)` qui retourne une liste avec `n` head en moins.

###Exercice 4
Implémenter la méthode `init` qui retourne une nouvelle liste sans son dernier élément.

###Exercice 5
Implémenter la fonction `sum` qui a la signature suivante:
	
	def sum(ints: List[Int]): Int

###Exercice 6
Implémenter la fonction `product` qui a la signature suivante:

	def product(ints: List[Int]): Int

Il est évident que ces deux méthodes se ressemblent fortement. 
Comme vous avez suivi le pattern Red => Green => Refactor, il est temps de refactorer ce code.

###Exercice 7
Généraliser `sum` et `product` par une méthode `foldRight` qui a la signature suivante:

	def foldRight[B](z: B)(f: (A, B) => B): B
	
Vous remarquerez que `foldRight` n'est pas `tail recursive`. 
Cela veut dire que dans sa récursivité, la dernière ligne n'est pas un appel récursif.
Sinon, le compilateur peut optimiser et transformer la récursion en `while`.
Cela évite d'exploser la pile d'appel pour des listes de grande taille.

###Exercice 8
En utilisant `foldRight`, implémenter la méthode `length` sur `List`.


###Exercice 9
Écrire `foldLeft` qui est `tail-recursive`:

	def foldLeft[B](z: B)(f: (B, A) => B): B	

Réfactorer `sum`, `product` et `length` avec `foldLeft`.

###Exercice 10
Implémenter une fonction qui prend en entrée une liste d'entiers et retourne une nouvelle liste avec chaque entrée incrémentée de 1.

	def addOne(list: List[Int]): List[Int]

###Exercice 11
Implémenter une fonction qui prend en entrée une liste et retourne une nouvelle liste avec sa représentation en `String`.

	def toString(list: List[_]): List[String]

###Exercice 12
Généraliser `addOne` et `toString` avec une méthode `map`.

	def map[B](f: (A => B)):List[B]

###Exercice 13
Écrire une méthode `filter` qui permet de filter le contenu d'une liste.

	def filter(p: (A => Boolean)):List[A]

###Exercice 14
Écrire une fonction qui prend deux listes et les concatène.

	def append[A](left:List[A], right:List[A]):List[A]

###Exercice 15
Écrire une méthode `flatMap` qui fonctionne comme `map` mais concatène les résultats.

	def flatMap[B](f: (A => List[B])): List[B]

##Partie 2 : Option
Une option est un type qui contient 0 ou 1 valeur.

* l'élément vide (type nommé `None`)
* un élément non vide (type nommé `Some`)

###Exercice 1
Créer le type `Option`.
###Exercice 2
Créer une méthode `getOrElse` dont la signature est:

	def getOrElse[B >: A](default: B): B
	
Elle retourne l'élément sous-jacent à l'option s'il est présent, la valeur par défaut fournie sinon.
###Exercice 3
Créer une méthode `orElse`dont la signature est:

	def orElse[B >: A](ob: Option[B]): Option[B]

Elle retourne l'élément sous-jacent à l'option s'il est présent, l'alternative fournie sinon.
###Exercice 4
Créer une méthode `filter` dont la signature est:

	def filter(f: A => Boolean): Option[A]
	
Son comportement est sensiblement identique à la méthode homonyme implémentée sur le type `List`à la différence qu'elle ne s'applique qu'à un seul élément.
###Exercice 5
Créer une méthode `map`dont la signature est:

	def map[B](f: A => B): Option[B]
	
Son comportement est sensiblement identique à la méthode homonyme implémentée sur le type `List`à la différence qu'elle ne s'applique qu'à un seul élément.
###Exercice 6
Créer une méthode `flatMap`dont la signature est:

	def flatMap[B](f: A => Option[B]): Option[B]

Son comportement est sensiblement identique à la méthode homonyme implémentée sur le type `List`à la différence qu'elle ne s'applique qu'à un seul élément.
