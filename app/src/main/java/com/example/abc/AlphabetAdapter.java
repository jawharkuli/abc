package com.example.abc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.ArrayList;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.ViewHolder> {

    private Context context;
    private List<AlphabetItem> alphabetList;

    public AlphabetAdapter(Context context, List<AlphabetItem> alphabetList) {
        this.context = context;
        this.alphabetList = alphabetList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.alphabet_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AlphabetItem item = alphabetList.get(position);

        holder.letterText.setText(item.getLetter());
        holder.exampleText.setText(item.getExample());
        holder.imageView.setImageResource(item.getImageResourceId());

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(context,
                    item.getLetter() + " for " + item.getExample(),
                    Toast.LENGTH_SHORT).show();

            // Create arrays from the list
            String[] letters = new String[alphabetList.size()];
            String[] examples = new String[alphabetList.size()];
            int[] images = new int[alphabetList.size()];

            for (int i = 0; i < alphabetList.size(); i++) {
                AlphabetItem currentItem = alphabetList.get(i);
                letters[i] = currentItem.getLetter();
                examples[i] = currentItem.getExample();
                images[i] = currentItem.getImageResourceId();
            }

            // Create and start intent with all data
            Intent intent = new Intent(context, FullView.class);
            intent.putExtra("position", position);  // Current position
            intent.putExtra("letters", letters);    // All letters
            intent.putExtra("examples", examples);  // All examples
            intent.putExtra("images", images);      // All images

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return alphabetList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView letterText;
        TextView exampleText;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            letterText = itemView.findViewById(R.id.letterText);
            exampleText = itemView.findViewById(R.id.exampleText);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}