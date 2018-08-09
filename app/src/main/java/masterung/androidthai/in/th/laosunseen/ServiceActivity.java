package masterung.androidthai.in.th.laosunseen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import masterung.androidthai.in.th.laosunseen.fragment.serviceFragment;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentServiceFragment, new serviceFragment())
                    .commit();
        }
    }//Method Main

}
