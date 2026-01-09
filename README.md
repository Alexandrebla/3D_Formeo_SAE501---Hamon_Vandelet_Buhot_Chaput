# SAE501 – Salle de classe en 3D

Projet réalisé dans le cadre de la **SAE501**, consistant en la modélisation complète et l’intégration web d’une salle de classe en **3D interactive**.

**Auteurs :**

* Alexandre Hamon
* Théo Chaput
* Yanis Buhot
* Marin Vandelet

**Groupe :** TD1

---

## 📌 Présentation du projet

Ce dépôt GitHub contient :

* Le **modèle 3D complet** de la salle de classe
* Le **cahier de recettes** du projet
* Les informations techniques liées à la **modélisation**, l’**optimisation** et l’**intégration web**

Une version web interactive permet de naviguer directement dans la salle en 3D via un navigateur.

---

## 🔗 Liens

* **Salle de classe 3D (version web)** : *(lien à ajouter)*
* **Site Forméo** : *(lien à ajouter)*

---

## 🏫 Objets modélisés

La scène comprend l’ensemble des éléments suivants :

* Salle (structure générale)
* Portes
* Fenêtres
* Rideaux
* Radiateur
* Lumières de la salle (néons + lumières du bureau)
* Chaises
* Chaise du bureau
* Tables
* Bureau
* Tableau + effaceur
* Horloge
* Écran (PC) + câblage
* Clavier
* Souris
* Prises + interrupteurs
* Barre blanche de prises
* Enceintes
* Affiches / posters
* Vidéoprojecteur + câblage
* Poubelle
* Détails de la salle :

  * Panneaux à trous
  * Barre en métal
  * Rebord proche de la fenêtre
  * Poutre
  * Aération

---

## 🧩 Modélisation 3D

* Logiciel utilisé : **Blender**
* Modélisation réalisée à **100 % sur Blender**

### Add-ons utilisés

* **LoopTools**
* **BoltFactory**

---

## 🎨 Textures et matériaux

Les textures utilisées proviennent majoritairement du site **AmbientCG**.

### Textures PBR (4K à l’origine)

* Base Color
* Roughness
* Normal
* Metallic

### Matériaux utilisés

* **Béton** : murs
* **Revêtement de sol** : sol
* **Bois** : chaises
* **Tissu** : rideaux
* **Horloge (photo)** : texture image
* **Verre (procédural)** : fenêtres et surfaces vitrées

### Verre

* Moteur de rendu : **EEVEE**
* Raytracing activé
* Samples augmentés à **500**

Tous les autres éléments utilisent des matériaux classiques avec **dépliage UV**.

---

## 💡 Lumières

Les lumières sont utilisées uniquement pour les **rendus photoréalistes**, et non pour la version web.

* **Area Lights** : éclairage intérieur
* **Sun** : simulation de la lumière solaire globale

---

## 🌐 Optimisation et ajustements pour le web

### Hébergement

* Modèle hébergé sur **Cloudflare R2**
* Limite : **300 Mo par fichier**

### Optimisation du fichier GLB

| Étape                                     | Taille du fichier |
| ----------------------------------------- | ----------------- |
| Fichier initial                           | +700 Mo           |
| Textures redimensionnées (4K → 1024×1024) | 488 Mo            |
| Decimate (rideaux, panneaux – ratio 0.3)  | 167 Mo            |
| Duplication avec Shift + D                | 421 Mo            |
| Duplication avec Alt + D                  | 171 Mo            |
| Compression **Draco**                     | **12 Mo (final)** |

---

## ⚠️ Problèmes rencontrés

* **WebGL** :

  * Une fonctionnalité de *highlight* des objets via Three.js causait des bugs WebGL importants → fonctionnalité supprimée

* **Géométrie trop lourde** :

  * Certains panneaux (mur du fond et plafond) dépassaient **1 million de faces**
  * Le modificateur *Decimate* dégradait trop la géométrie
  * Solution : suppression des parties problématiques et reconstruction avec des faces simples (F)

* **Flickering** :

  * Réduction de la taille globale de la salle
  * Repositionnement des éléments

---

## 🕹️ Intégration web (Three.js)

Le modèle 3D est intégré dans une **page web interactive** grâce à **Three.js**.

### Fonctionnalités disponibles

* Navigation libre dans la scène :

  * Souris
  * Clavier (event listeners)

* Activation / désactivation du **backface culling**

* Changement de la **couleur de fond** de la scène

* Masquage d’éléments de la scène

* Zoom ou focus sur un élément spécifique

---

## 📄 Licence

Projet réalisé dans un cadre pédagogique (SAE501). Toute réutilisation doit mentionner les auteurs.

---

## ✅ Conclusion

Ce projet met en œuvre l’ensemble du pipeline 3D :

* Modélisation
* Texturing
* Optimisation
* Intégration web

L’objectif était de proposer une **salle de classe réaliste, optimisée et interactive**, compatible avec une diffusion web fluide.
