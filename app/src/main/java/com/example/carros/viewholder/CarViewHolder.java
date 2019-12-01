package com.example.carros.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.carros.R;
import com.example.carros.entities.Car;
import com.example.carros.listener.OnListClickInteractionListener;

public class CarViewHolder extends RecyclerView.ViewHolder {

    // Elementos da interface
    private ImageView mImageCarPicture;
    private TextView mTextCarModel;
    private TextView mTextViewDetails;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mImageCarPicture = (ImageView) itemView.findViewById(R.id.img_car_pic);
        this.mTextCarModel = (TextView) itemView.findViewById(R.id.text_car_model);
        this.mTextViewDetails = (TextView) itemView.findViewById(R.id.text_view_details);
    }

    public void bindData(final Car car, final OnListClickInteractionListener listener) {

        this.mImageCarPicture.setImageDrawable(car.picture);
        this.mTextCarModel.setText(car.model);
        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(car.id);
            }
        });

    }
}
