package com.example.zhehui.newsapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<Story> {

    /**
     * Log tag.
     */
    private static final String LOG_TAG = NewsAdapter.class.getName();

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param stories is the list of stories, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<Story> stories) {
        super(context, 0, stories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate list item view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.story_item, parent, false);
        }

        // Alternative background colors.
        if (position % 2 == 1) {
            listItemView.setBackgroundColor(Color.CYAN);
        } else {
            listItemView.setBackgroundColor(Color.WHITE);
        }

        // Populate data.
        Story currentStory = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.story_title);
        String title = currentStory.getTitle();
        titleView.setText(title);

        TextView authorView = (TextView) listItemView.findViewById(R.id.story_section);
        String section = currentStory.getSection();
        authorView.setText(section);

        TextView descriptionView = (TextView) listItemView.findViewById(R.id.story_url);
        String url = currentStory.getWebURL();
        descriptionView.setText(url);

        // Return the list item view that is now showing the appropriate data.
        return listItemView;
    }

}
