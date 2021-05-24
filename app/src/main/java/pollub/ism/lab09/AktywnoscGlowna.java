package pollub.ism.lab09;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AktywnoscGlowna extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NaszAdapter.DostawcaDanych dostawcaDanych=new DostawcaDanych(getResources());
        RecyclerView recyclerView=findViewById(R.id.recyclerViewer);
        NaszAdapter adapter=new NaszAdapter(this,dostawcaDanych);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}