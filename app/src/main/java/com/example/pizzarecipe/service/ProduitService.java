package com.example.pizzarecipe.service;

import com.example.pizzarecipe.R;
import com.example.pizzarecipe.classes.Produit;
import com.example.pizzarecipe.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed(); // préremplissage
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProduitService();
        }
        return INSTANCE;
    }

    private void seed() {

        // 1) Pizza classique (tomate + fromage + basilic)
        data.add(new Produit(
                "MARGHERITA CLASSIC",
                45.0,
                R.mipmap.pizza1,
                "30 min",
                "- Pâte à pizza\n- Sauce tomate\n- Mozzarella\n- Basilic\n- Huile d'olive, sel",
                "La classique Margherita : simple, savoureuse et parfumée au basilic.",
                "STEP 1: Étaler la pâte et ajouter la sauce tomate.\n" +
                        "STEP 2: Ajouter la mozzarella.\n" +
                        "STEP 3: Cuire 10-12 min à 220°C, finir avec basilic + huile d'olive."
        ));

        // 2) Pizza cheese pull (fromage filant)
        data.add(new Produit(
                "EXTRA CHEESE PIZZA",
                50.0,
                R.mipmap.pizza2,
                "25 min",
                "- Pâte\n- Sauce tomate\n- Mozzarella (très généreuse)\n- Origan",
                "Pizza ultra-fromagée avec un fromage bien filant.",
                "STEP 1: Sauce tomate sur la pâte.\n" +
                        "STEP 2: Ajouter beaucoup de mozzarella.\n" +
                        "STEP 3: Cuire 10-12 min à 220°C. (Option: ajouter un peu d'origan)"
        ));

        // 3) Pizza olives / légumes (style méditerranéen)
        data.add(new Produit(
                "MEDITERRANEAN OLIVES",
                52.0,
                R.mipmap.pizza3,
                "30 min",
                "- Pâte\n- Sauce tomate\n- Fromage\n- Olives noires\n- Oignon\n- Poivron (option)",
                "Pizza méditerranéenne aux olives, très parfumée.",
                "STEP 1: Étaler la pâte, ajouter sauce + fromage.\n" +
                        "STEP 2: Ajouter olives + oignon + (poivron option).\n" +
                        "STEP 3: Cuire 12-15 min à 220°C."
        ));

        // 4) Pizza roquette / tomates cerises (fraîche)
        data.add(new Produit(
                "ROCKET & CHERRY TOMATO",
                55.0,
                R.mipmap.pizza4,
                "28 min",
                "- Pâte\n- Sauce blanche ou tomate légère\n- Mozzarella\n- Roquette\n- Tomates cerises\n- Huile d'olive",
                "Pizza fraîche à la roquette et tomates cerises (ajoutées en fin).",
                "STEP 1: Cuire la base (sauce + mozzarella) 10-12 min.\n" +
                        "STEP 2: À la sortie du four, ajouter roquette + tomates cerises.\n" +
                        "STEP 3: Arroser d'huile d'olive et servir."
        ));

        // 5) Pizza viande hachée / champignons (gourmande)
        data.add(new Produit(
                "BEEF & MUSHROOMS",
                58.0,
                R.mipmap.pizza5,
                "35 min",
                "- Pâte\n- Sauce tomate\n- Viande hachée\n- Champignons\n- Fromage\n- Épices (poivre, paprika)",
                "Pizza gourmande à la viande hachée et champignons.",
                "STEP 1: Faire revenir la viande avec épices.\n" +
                        "STEP 2: Garnir pâte (sauce + fromage + viande + champignons).\n" +
                        "STEP 3: Cuire 12-15 min à 220°C."
        ));

        // 6) Pizza napolitaine (tomate + mozzarella + basilic)
        data.add(new Produit(
                "NAPOLITANA",
                60.0,
                R.mipmap.pizza6,
                "30 min",
                "- Pâte (idéal pâte fine)\n- Sauce tomate\n- Mozzarella\n- Basilic\n- Huile d'olive",
                "Style napolitain : bords gonflés, tomate + mozzarella + basilic.",
                "STEP 1: Sauce tomate + mozzarella sur la pâte.\n" +
                        "STEP 2: Cuire fort (240°C si possible) 8-10 min.\n" +
                        "STEP 3: Ajouter basilic frais + huile d'olive."
        ));

        // 7) Pizza pesto + burrata (centre blanc)
        data.add(new Produit(
                "PESTO BURRATA",
                65.0,
                R.mipmap.pizza7,
                "30 min",
                "- Pâte\n- Sauce pesto (ou base crème)\n- Mozzarella\n- Burrata\n- Basilic",
                "Pizza au pesto avec burrata au centre, très crémeuse.",
                "STEP 1: Étaler pesto (ou crème) + mozzarella.\n" +
                        "STEP 2: Cuire 10-12 min.\n" +
                        "STEP 3: Ajouter la burrata au centre + basilic juste avant de servir."
        ));

        // 8) Pizza fromage simple (type cheese)
        data.add(new Produit(
                "CHEESE LOVER",
                42.0,
                R.mipmap.pizza8,
                "20 min",
                "- Pâte\n- Sauce tomate\n- Mozzarella\n- Fromage râpé (option)\n- Origan",
                "Pizza fromage simple, parfaite pour tous.",
                "STEP 1: Sauce tomate sur pâte.\n" +
                        "STEP 2: Ajouter mozzarella + (fromage râpé option).\n" +
                        "STEP 3: Cuire 10-12 min à 220°C."
        ));

        // 9) Pizza jambon (type prosciutto)
        data.add(new Produit(
                "HAM & ARUGULA",
                62.0,
                R.mipmap.pizza9,
                "28 min",
                "- Pâte\n- Sauce tomate\n- Mozzarella\n- Jambon (type prosciutto)\n- Roquette",
                "Pizza au jambon, souvent servie avec roquette après cuisson.",
                "STEP 1: Cuire la base (sauce + mozzarella) 10-12 min.\n" +
                        "STEP 2: Ajouter jambon après cuisson (ou 2 min avant la fin).\n" +
                        "STEP 3: Ajouter roquette et servir."
        ));

        // 10) Pizza œuf + bacon + olives (breakfast style)
        data.add(new Produit(
                "EGG & BACON",
                68.0,
                R.mipmap.pizza10,
                "35 min",
                "- Pâte\n- Sauce tomate\n- Fromage\n- Bacon\n- Olives\n- Champignons\n- 1 œuf",
                "Pizza façon brunch : bacon, olives, champignons et œuf au centre.",
                "STEP 1: Garnir (sauce + fromage + bacon + olives + champignons).\n" +
                        "STEP 2: Cuire 8-10 min.\n" +
                        "STEP 3: Casser l'œuf au centre et recuire 3-5 min (jaune coulant)."
        ));
    }

    // ===== CRUD selon ton interface IDao =====
    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}