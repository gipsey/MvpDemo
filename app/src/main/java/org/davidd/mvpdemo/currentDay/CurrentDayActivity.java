package org.davidd.mvpdemo.currentDay;

import org.davidd.mvpdemo.R;
import org.davidd.mvpdemo.mvp.Dependecies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CurrentDayActivity extends AppCompatActivity implements CurrentDayView, View.OnClickListener {

    CurrentDayPresenter presenter;
    Button showCurrentDay;
    TextView currentDayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_day);

        showCurrentDay = findViewById(R.id.current_day_button);
        currentDayTextView = findViewById(R.id.current_day_text_view);

        presenter = Dependecies.provideCurrentDayPresenter();
    }

    @Override
    protected void onStart() {
        super.onStart();

        presenter.attach(this);

        showCurrentDay.setOnClickListener(this);
    }

    @Override
    protected void onStop() {
        presenter.detach();
        super.onStop();
    }

    @Override
    public void showCurrentDay(String currentDay) {
        currentDayTextView.setText(currentDay);
    }

    @Override
    public void onClick(View v) {
        presenter.onCurrentDayButtonTap();
    }
}
