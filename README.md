# VV_MutationTesting

[![Coverage Status](https://coveralls.io/repos/github/ismaelrami/VV_MutationTesting/badge.svg?branch=develop)](https://coveralls.io/github/ismaelrami/VV_MutationTesting?branch=develop)

## Usage

Lancement du projet :

  > Compilation des programmes (cible)
  
    Dans le dossier input : mvn package    
  
  > Utilisation de notre outil mutateur 
   - Spécifier votre maven.home dans le fichier application.propreties se trouvant dans mutator/src/main/resources/
   
   - Configuration : dans un fichier.properties en prenant comme exemple application.propreties se trouvant dans mutator/src/main/resources/
  
    Fournir les propriétés suivants: 
           -  Les mutateurs souhaitée (séparé par une virgule)
           Exemple:  mutators = ARITHMETIC_MUTATOR, VOID_MUTATOR, COMPARISON_MUTATOR, BOOLEAN_MUTATOR
             
           -  Le target du projet cible
           Exemple: target.project = /home/waberi/Documents/VV/Mutation_Testing/VV_MutationTesting/input
    
           -  Le maven home 
           Exemple: maven.home = /usr/share/maven 
           
           - Le report dir (dossier pour le rapport en format html)
           Exemple: report.dir = "/dossier"
           
           - Le report timestamped (à spécifier si on veut garder une trace des raports)
           Exemple : report.timestamped = true (par defaut est à false)
           
           - Le timeout (pour spécifier le temps maximum en seconde que peut durer l'écution d'un test)
           Exemple : test.timeout = 30 ( par défaut il est à 20 sécondes)
      
    > Compilation des programmes 
  
      Dans le dossier mutator : mvn package 
    
    > Exécution :
      Dans le dossier mutator/target: java -jar mutator-1.0-SNAPSHOT-jar-with-dependencies.jar file.properties
    
## Projets cibles testés
  > commons-cli
  > commons-codec
  > commons-collections
  > commons-lang-LANG_3_3_2
  > commons-math
  
## Fonctionnalités implémentées 

 ### Programme :
 
 Dans le projet /VV_MutationTesting/input
 
    > Création de nos classes arithmétiques 
                   
    > Test unitaire de chaque classe arithmétique

 
  Dans le projet /VV_MutationTesting/mutator
  
    > Dans le package mutant les mutants implémentées sont:
     Operateurs arithmétique
    * Opération + est remplacé par -
    * Opération - est remplacé par +
    * Opération * est remplacé par /
    * Opération / est remplacé par *
     
    * Suppression du corps des méthodes de type void
     
    * Renvoyer true pour les méthodes de types boolean
  
     Opérateur de comparaison
      
    * Opération < est remplacé par <=
    * Opération > est remplacé par >=
    * Opération <= est remplacé par <
    * Opération >= est remplacé par >
     
## Couverture d'analyse de mutation

 Notre outil génère des informations concernant les opérations de mutations sur le projet spécifié, un rapport est affiché à la fin de l'exuction des mutations. Un rapport au format html est aussi généré, ce dernier ce trouve dans le dossier target si la propriété "report.dir" n'est pas spécifier.
  

  
     
