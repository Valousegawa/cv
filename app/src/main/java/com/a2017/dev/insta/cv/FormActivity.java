package com.a2017.dev.insta.cv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.alorma.timeline.TimelineView;
import java.util.ArrayList;

/**
 * Created by Telest on 14/04/2017.
 */

public class FormActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_layout);

        ListView list = (ListView) findViewById(R.id.list);

        ArrayList<Events> items = new ArrayList<>();
        items.add(new Events("2016-Présent\nAnalyste logiciel\nINSTA", TimelineView.TYPE_START));

        items.add(new Events("2014-2016\nESIPE Informatique et Réseaux\nESIPE",TimelineView.TYPE_MIDDLE));
        items.add(new Events("2014\nDUT Génie Electrique et Informatique Industrielle\nUniversité de Cergy Pontoise",TimelineView.TYPE_MIDDLE));

        items.add(new Events("2012\nBaccalauréat Scientifique Option Sciences de l'Ingénieur\nMention Assez Bien", TimelineView.TYPE_END));
        list.setAdapter(new EventsAdapter(this, items));
    }
}
