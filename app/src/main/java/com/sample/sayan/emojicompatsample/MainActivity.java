package com.sample.sayan.emojicompatsample;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import github.ankushsachdeva.emojicon.EmojiconEditText;
import github.ankushsachdeva.emojicon.EmojiconTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSubmit(View view) {
        EmojiconEditText emojiEditText = findViewById(R.id.emojiEditText);
        EmojiconTextView emojiTextView = findViewById(R.id.emojiTextView);
        emojiTextView.setText(emojiEditText.getText());
        emojiEditText.setText("");
    }
}
