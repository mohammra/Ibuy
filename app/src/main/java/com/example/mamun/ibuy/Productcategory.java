package com.example.mamun.ibuy;

public class Productcategory extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatail_of_each);

        Bundle bundle= getIntent().getExtras();
        int index=bundle.getInt("index");

        President president=PresidentList.getPresidentList().getPresiden(index);

        TextView t1=(TextView) findViewById(R.id.name);
        t1.setText(president.getName());
        TextView t2=(TextView) findViewById(R.id.start);
        t2.setText(String.valueOf(president.getStartingYear()));
        TextView t3=(TextView) findViewById(R.id.end);
        t3.setText(String.valueOf(president.getFinishingYear()));

        TextView t4=(TextView) findViewById(R.id.place);
        t4.setText(president.getCountry());

        }