# Exercice technique — API Spring Boot

Bienvenue, et merci du temps que vous consacrez à cet exercice.

Ce dépôt contient une petite API Spring Boot. **Elle compile, mais elle ne fait pas ce
qu'elle devrait.** Les erreurs qu'elle contient sont volontaires.

Votre mission : la faire fonctionner, puis la faire évoluer.

---

## Ce dont vous avez besoin

- **Java 17** (`java -version` pour vérifier)
- Maven : inutile de l'installer, le wrapper est fourni
- Votre IDE habituel

## Démarrer l'application

```bash
./mvnw spring-boot:run
```

Sous Windows, en `cmd` ou PowerShell :

```bash
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

Si l'application ne démarre pas du tout pour une raison d'environnement (version de Java,
proxy, téléchargement Maven), signalez-le immédiatement : c'est notre problème, pas le
vôtre, et on vous débloque.
