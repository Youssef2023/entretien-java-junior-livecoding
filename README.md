# Exercice technique — API Spring Boot

Bienvenue, et merci du temps que vous consacrez à cet exercice.

Ce dépôt contient une petite API Spring Boot. **Elle compile, mais elle ne fait pas ce
qu'elle devrait.** Les erreurs qu'elle contient sont volontaires.

Votre mission : la faire fonctionner, puis la faire évoluer.

---

## Ce dont vous avez besoin

- **Java 17 ou plus récent** — c'est le seul vrai prérequis
- Maven : inutile de l'installer, le wrapper est fourni
- Votre IDE habituel

**Attention** : Maven utilise la variable `JAVA_HOME`, pas forcément le `java` de votre
PATH. Si vous avez plusieurs JDK installés, vérifiez celui-là :

```bash
# Linux / macOS
echo $JAVA_HOME && $JAVA_HOME/bin/java -version
```

```powershell
# Windows PowerShell
$env:JAVA_HOME ; & "$env:JAVA_HOME\bin\java.exe" -version
```

## Démarrer l'application

```bash
# Linux / macOS
./mvnw spring-boot:run
```

```powershell
# Windows PowerShell — le .\ est obligatoire
.\mvnw.cmd spring-boot:run
```

```bash
:: Windows cmd.exe
mvnw.cmd spring-boot:run
```

L'application écoute sur `http://localhost:8080`.

Vous pouvez appeler les endpoints avec votre navigateur, `curl`, Postman — comme vous
préférez.

---

## Étape 1 — faire fonctionner l'existant

Vous êtes sur la branche `main`. Elle expose deux endpoints, et **aucun des deux ne
fonctionne** :

| Endpoint | Ce qu'il devrait faire |
|---|---|
| `GET /hello` | Renvoyer le message fourni par le service |
| `GET /` | Renvoyer les nombres **pairs** de la liste définie dans `MyService` |

Faites-les fonctionner.

> Les étapes suivantes vous seront données de vive voix pendant la séance. Inutile de
> prendre de l'avance : concentrez-vous sur celle-ci.

---

## Comment se déroule la séance

- **Durée** : environ 25 minutes. **Ne pas tout terminer n'est pas un échec** — le sujet
  est calibré pour être un peu plus long que le temps disponible.
- **La recherche en ligne est autorisée**, documentation comprise. Ne faites pas semblant
  de savoir : cherchez comme vous le feriez un jour normal.
- **Parlez à voix haute.** Ce qui nous intéresse, c'est votre raisonnement — pas seulement
  le résultat. Dire « je ne comprends pas cette ligne » est une bonne réponse.
- Si vous êtes bloqué, dites-le : on vous donnera un indice. Cela ne vous pénalise pas.
- Vous pouvez modifier n'importe quel fichier.

## Ce que nous regardons

- Votre façon de **lire du code que vous n'avez pas écrit**
- Comment vous **diagnostiquez** une erreur : lisez-vous la stack trace ? relancez-vous
  pour vérifier ?
- La **qualité** de ce que vous écrivez : noms, découpage, lisibilité
- Votre **réaction quand la demande change** en cours de route
- Votre manière de **communiquer** pendant que vous travaillez

Ce que nous ne regardons pas : votre vitesse de frappe, votre capacité à écrire du Java
sans erreur de syntaxe du premier coup, ou le fait de connaître par cœur une signature de
méthode.

---

## En cas de problème

### « class file has wrong version 61.0, should be 52.0 »

C'est l'erreur la plus fréquente : **Maven tourne avec un JDK trop ancien**. Le `61.0` est
la version attendue (Java 17), le `52.0` celle de votre JDK actuel (Java 8).

Corrigez le temps de la session, sans rien installer :

```powershell
# Windows PowerShell — adaptez le chemin a votre JDK 17
$env:JAVA_HOME = "C:\chemin\vers\jdk-17"
.\mvnw.cmd spring-boot:run
```

```bash
# Linux / macOS
export JAVA_HOME=/chemin/vers/jdk-17
./mvnw spring-boot:run
```

**Dans IntelliJ**, deux réglages sont nécessaires, pas un :

1. *File → Project Structure → Project* → **SDK** : votre JDK 17
2. *Settings → Build Tools → Maven → Runner* → **JRE** : votre JDK 17

Le second est celui qu'on oublie : l'IDE peut indexer en 17 tout en lançant Maven en 8.

### « mvnw.cmd n'est pas reconnu » sous PowerShell

PowerShell n'exécute pas un fichier du dossier courant sans préfixe. Écrivez
`.\mvnw.cmd` et non `mvnw.cmd`.

### Autre chose

Si l'application ne démarre pas pour une raison d'environnement (proxy qui bloque le
téléchargement Maven, port 8080 déjà occupé), signalez-le immédiatement : c'est notre
problème, pas le vôtre, et on vous débloque.
