package kr.hs.emirim.mirim_0726;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editAngle;
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngle = findViewById(R.id.edit);
        imgv = findViewById(R.id.imgv1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.item_rotate:  //그림회전
                imgv.setRotation(Float.parseFloat(editAngle.getText().toString()));
                return  true;
            case R.id.item1:  //그림선택
                imgv.setImageResource(R.drawable.op);
                item.setChecked(true);
                return  true;
            case R.id.item2:  //그림건택
                imgv.setImageResource(R.drawable.sigh);
                item.setChecked(true);
                return  true;
        }
        return false;

        }
//    }
}