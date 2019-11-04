package ch.samt.bosco.modulo335j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //set listeners
        Button firstPage = findViewById(R.id.firstPage);
        firstPage.setOnClickListener(this);

        Button secondPage = findViewById(R.id.secondPage);
        secondPage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.firstPage){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain, new FirstPageFragment());
            ft.commit();
        } else if(id == R.id.secondPage){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain, new SecondPageFragment());
            ft.commit();
        }
    }
}
