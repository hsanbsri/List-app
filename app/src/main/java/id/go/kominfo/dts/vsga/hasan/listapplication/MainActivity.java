package id.go.kominfo.dts.vsga.hasan.listapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private final List<String> countries = new ArrayList<>();
    {
        countries.add("Aceh");
        countries.add("Bali");
        countries.add("Bangka Belitung");
        countries.add("Daerah Khusus Ibukota Jakarta");
        countries.add("Daerah Khusus Istimewa Yogyakarta");
        countries.add("Banten");
        countries.add("Bengkulu");
        countries.add("Jawa Tengah");
        countries.add("Jawa Timur");
        countries.add("Jawa Barat");
        countries.add("Kalimantan Tengah");
        countries.add("Kalimanatan Timur");
        countries.add("Kalimantan selatan");
        countries.add("Kalimantan utara");
        countries.add("Kalimantan Barat");
        countries.add("Sulawesi Tenggara");
        countries.add("Sulawesi Selatan");
        countries.add("Sulawesi Barat");
        countries.add("Sulawesi Utara");
        countries.add("Sumatera Utara");
        countries.add("Sumatera Barat");
        countries.add("Riau");
        countries.add("Kepulauan Riau");
        countries.add("Maluku");
        countries.add("Papua");
        countries.add("Papua Barat");
        countries.add("Jambi");
        countries.add("Gorontalo");
        countries.add("Nusat Tenggara Timur");
        countries.add("Nusat Tenggara Barat");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)
            setTitle("Aplikasi List Provinsi Indonesia");

        ListView listView = findViewById(R.id.list_view);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.item_rows_provinsi, R.id.tv_item_provinsi, countries);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(this, "Anda Memilih " +
                countries.get(position), Toast.LENGTH_SHORT).show());
    }
}
