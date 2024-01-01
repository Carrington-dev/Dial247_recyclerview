package za.co.transcend.dial247.ui.activities;

import static za.co.transcend.dial247.R.*;
import static za.co.transcend.dial247.R.id.people_container;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

import za.co.transcend.dial247.R;
import za.co.transcend.dial247.ui.adapters.PersonAdapter;
import za.co.transcend.dial247.ui.models.Person;

public class PeopleActivity extends AppCompatActivity {
    RecyclerView personsRecyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_people);

        personsRecyclerView = findViewById(id.people_container);

        ArrayList<Person> personArrayList = new ArrayList<>();
        for (int i = 0; i < 78; i++){
            personArrayList.add(new Person("Carrington","crn96m@gmail.com","067 735 2242","ZA",i, drawable.ic_launcher_background));
        }

        PersonAdapter personAdapter = new PersonAdapter(this, personArrayList);

        personsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        personsRecyclerView.setAdapter(personAdapter);
    }
}