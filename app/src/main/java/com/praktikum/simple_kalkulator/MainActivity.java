package com.praktikum.simple_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, MainView.Response{

    CheckBox cbOne, cbTwo, cbThree;
    EditText editOne, editTwo, editThree;
    Button buttonPlus, buttonMin, buttonX, buttonBagi;
    TextView tvHasil, valueHasil;

    boolean checkOne, checkTwo, checkThree;

    static int TAMBAH = 1;
    static int KURANG = 2;
    static int KALI = 3;
    static int BAGI = 4;

    double textOne;
    double textTwo;
    double textThree;
    double hasil;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        cbOne = findViewById(R.id.cb_one);
        cbTwo = findViewById(R.id.cb_two);
        cbThree = findViewById(R.id.cb_three);

        editOne = findViewById(R.id.edit_one);
        editTwo = findViewById(R.id.edit_two);
        editThree = findViewById(R.id.edit_three);

        tvHasil = findViewById(R.id.hasil);
        valueHasil = findViewById(R.id.valueHasil);

        buttonPlus = findViewById(R.id.btnPlus);
        buttonMin = findViewById(R.id.btnMin);
        buttonX = findViewById(R.id.btnX);
        buttonBagi = findViewById(R.id.btnBagi);

        cbOne.setOnCheckedChangeListener(this);
        cbTwo.setOnCheckedChangeListener(this);
        cbThree.setOnCheckedChangeListener(this);

        buttonPlus.setOnClickListener(this);
        buttonBagi.setOnClickListener(this);
        buttonX.setOnClickListener(this);
        buttonMin.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPlus:
                validation(TAMBAH);
                break;
            case R.id.btnMin:
                validation(KURANG);
                break;
            case R.id.btnX:
                validation(KALI);
                break;
            case R.id.btnBagi:
                validation(BAGI);
                break;
        }
    }

    private void validation(int type) {
        textOne = ParseDouble(editOne.getText().toString());
        textTwo = ParseDouble(editTwo.getText().toString());
        textThree = ParseDouble(editThree.getText().toString());
        hasil = 0.0;
        presenter.init(textOne, textTwo, textThree, hasil, type, checkOne, checkTwo, checkThree);
    }

    double ParseDouble(String strNumber){
        if (strNumber !=null && strNumber.length() > 0){
            try {
                return Double.parseDouble(strNumber);
            }catch (Exception e){
                return -1;
            }
        }
        else return 0;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        switch (compoundButton.getId()){
            case R.id.cb_one:
                checkOne = isChecked;
                break;
            case R.id.cb_two:
                checkTwo = isChecked;
                break;
            case R.id.cb_three:
                checkThree = isChecked;
                break;
        }
    }

    @Override
    public void showSuccess(double value) {
        valueHasil.setText(Double.toString(value));
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}