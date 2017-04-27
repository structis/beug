# BEUG : Venez avec votre application, on code des TUs en live

## Première partie : TU

Dans cette partie nous allons code en premier le test unitaire ensuite nous allons coder le service.

Les requirements ci-dessous seront implémentés :

 - Créer une simple calculatrice avec une méthode somme(),
 
 - La méthode doit prendre 3 nombres au maximum.
 
 - Si un nombre est négatif => Lancer une exception du type NegativeNumberException
 
 - Si la chaine contient un caractère qui n'est pas un chiffre => Lancer une exception du type IllegalCharacterException.
 
 - La méthode prend plusieurs nombres entiers séparés par des virgules,
 
 - Si la chaine est vide, retourner 0,
 
 - Un nombre vide est un zéro,
 
 - Les nombres supérieurs à 1000 seront igonorés.

Outil d'affichage du Coverage : EclEmma 2.3.3 (http://www.eclemma.org/)

## Deuxième partie : Mocking

Présentation du framework Mockito, test des différents cas d'utilisation.
