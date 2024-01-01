package za.co.transcend.dial247.ui.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import za.co.transcend.dial247.R;

public class PersonHolder extends RecyclerView.ViewHolder {
    public TextView nameView;
    public TextView emailView;
    public TextView phoneView;
    public TextView countryView;
    public TextView idView;
    public ImageView profileView;
    public PersonHolder(@NonNull View itemView) {
        super(itemView);

        nameView = itemView.findViewById(R.id.person_name);
        idView = itemView.findViewById(R.id.person_id);
        emailView = itemView.findViewById(R.id.person_email);
        phoneView = itemView.findViewById(R.id.person_phone);
        countryView = itemView.findViewById(R.id.person_country);
        profileView = itemView.findViewById(R.id.person_profile);
    }
}
