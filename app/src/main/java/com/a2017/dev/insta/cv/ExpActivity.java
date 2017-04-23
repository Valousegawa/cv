package com.a2017.dev.insta.cv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Telest on 13/04/2017.
 */

public class ExpActivity extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp_layout);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        prepareListData();
        listAdapter = new ExpandableListAdapters(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        // Adding child data
        listDataHeader.add("Present - 2016");
        listDataHeader.add("2016 - 2014");
        listDataHeader.add("2014");

        // Adding child data
        List<String> pre = new ArrayList<String>();
        pre.add("Développeur/Formateur\nCMS Informatic (91)");
        pre.add("   * Formations professionnelles (Office, programmation)");
        pre.add("   * Management de projets");
        pre.add("   * Développement d'infrastructure SharePoint");
        pre.add("   * Certifications TOSA");
        pre.add("         - Excel 2013      : 835/1000 (Avancé)");
        pre.add("         - Word 2013       : 740/1000 (Avancé)");
        pre.add("         - PowerPoint 2013 : 734/1000 (Avancé)");
        pre.add("         - Outlook 2013    : 999/1000 (Expert)");
        pre.add("   * Développement d'applications (Android, Web)");

        List<String> t2016 = new ArrayList<String>();
        t2016.add("Développeur Web\nLaNetCie (95)");
        t2016.add("   * Développement web (intranet, site internet)");
        t2016.add("         - GestCo : Outil de gestion commerciale et logistique interne de l'entreprise.\n" +
                "Solution développé en PHP, JavaScript et HTML.\n" +
                "Utilisation de Git et SQL.");
        t2016.add("         - MyDCA : Hub de rencontre entre investisseurs, orrganisateurs et entreprises.\n" +
                "Solution développé en PHP avec Symfony\n" +
                "Utilisation de Git.");
        t2016.add("         - Strate : Base de données de projets étudiants et base de rendu.\n" +
                "Solution développé en PHP avec Symfony.\n" +
                "Réunions clients et rédaction du cahier des charges.");

        List<String> t2014 = new ArrayList<String>();
        t2014.add("Développeur Web et logiciel et support technique\nLYV2 Performance (75)\nStage de fin d'études");
        t2014.add("   * Développement avec les logiciels PCSoft");
        t2014.add("         - WinDev : TheTime3D, gestionnaire d'imprimantes 3D");
        t2014.add("         - WebDev : Pinapple, site web personnel");
        t2014.add("         - WinDev Mobile : Toshokanime, gestionnaire de bibliothèque littéraire");
        t2014.add("   * Assistance technique sur site et à distance");
        t2014.add("         - Dépannage à distance avec TeamViewer");
        t2014.add("         - Assistance sur site (installation de poste, maintenance");

        listDataChild.put(listDataHeader.get(0), pre);
        listDataChild.put(listDataHeader.get(1), t2016);
        listDataChild.put(listDataHeader.get(2), t2014);
    }

}
