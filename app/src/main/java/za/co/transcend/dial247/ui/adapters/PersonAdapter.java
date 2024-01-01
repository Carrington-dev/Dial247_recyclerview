package za.co.transcend.dial247.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import za.co.transcend.dial247.R;
import za.co.transcend.dial247.ui.holders.PersonHolder;
import za.co.transcend.dial247.ui.models.Person;

public class PersonAdapter extends RecyclerView.Adapter<PersonHolder> {
    Context mContext;
    ArrayList<Person> personArrayList;

    public PersonAdapter(Context mContext, ArrayList<Person> personArrayList) {
        this.mContext = mContext;
        this.personArrayList = personArrayList;
    }

    @NonNull
    @Override
    public PersonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonHolder(LayoutInflater.from(mContext).inflate(R.layout.person_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonHolder holder, int position) {
        holder.nameView.setText(personArrayList.get(position).getName());
        holder.emailView.setText(personArrayList.get(position).getEmail());
        holder.phoneView.setText(personArrayList.get(position).getPhone());
        holder.idView.setText(""+personArrayList.get(position).getId());
        holder.countryView.setText(personArrayList.get(position).getCountry());
        holder.profileView.setImageResource(personArrayList.get(position).getPicture());
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }
}
