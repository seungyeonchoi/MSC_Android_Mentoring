
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {
    private String []  countries = {"Algeria", "Albania", "Barbados", "Belgium", "china", "afghanistan", "bahrain", "chile","colombia"};
    private ArrayAdapter<String> adapter;
    private AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,countries);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);
    }

}
