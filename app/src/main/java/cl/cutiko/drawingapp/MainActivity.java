package cl.cutiko.drawingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private CanvasView canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.resetBtn);
        canvas = findViewById(R.id.canvasV);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        canvas.drawAline();
    }

    @Override
    public boolean onLongClick(View v) {
        canvas.reset();
        return true;
    }
}
