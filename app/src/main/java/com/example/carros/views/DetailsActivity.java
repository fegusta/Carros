package com.example.carros.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.carros.R;
import com.example.carros.contants.CarrosContants;
import com.example.carros.data.CarMock;
import com.example.carros.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        this.mCarMock = new CarMock(this);


        this.mViewHolder.imgCarPicture = (ImageView) this.findViewById(R.id.img_car_pic);
        this.mViewHolder.textModel = (TextView) this.findViewById(R.id.text_car_model);
        this.mViewHolder.textManufacture = (TextView) this.findViewById(R.id.text_manufacture);
        this.mViewHolder.textHorsePower = (TextView) this.findViewById(R.id.text_horse_power);
        this.mViewHolder.textPrice = (TextView) this.findViewById(R.id.text_price);

        this.getDataFromActivity();

        this.setData();

    }

    private void setData() {
        this.mViewHolder.imgCarPicture.setImageDrawable(this.mCar.picture);
        this.mViewHolder.textModel.setText(this.mCar.model);
        this.mViewHolder.textHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mViewHolder.textPrice.setText("R$ " + String.valueOf(this.mCar.price));
    }

    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mCar = this.mCarMock.get(extras.getInt(CarrosContants.CARRO_ID));
        }
    }

    private static class ViewHolder {
        ImageView imgCarPicture;
        TextView textModel;
        TextView textManufacture;
        TextView textHorsePower;
        TextView textPrice;
    }
}
