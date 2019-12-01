package com.example.carros.data;

import android.app.Activity;

import androidx.core.content.ContextCompat;

import com.example.carros.R;
import com.example.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    // Lista de carros
    private List<Car> mListCars;

    /**
     * Construtor - Inicia Mock
     */
    public CarMock(Activity activity) {
        this.mListCars = getCarMockList(activity);
    }

    /**
     * Retorna lista de carros
     * @return
     */

    public  List<Car> getList() {
        return this.mListCars;
    }

    /**
     * Retorna carro de acordo com o Id
     * @param id
     * @return
     */

    public Car get(int id) {
        return this.mListCars.get(id);
    }

    public List<Car> getCarMockList(Activity activity) {
        List<Car> mMockList = new ArrayList<>();
        int id = 0;
        Car audir8 = new Car(id, "Audi R8", "Audi", 610, Double.valueOf(1165338.00), ContextCompat.getDrawable(activity, R.drawable.audir8));
        mMockList.add(audir8);
        Car bugattiChiron = new Car(++id, "Bugatti Chiron", "Bugatti", 1520, Double.valueOf(10000000.00), ContextCompat.getDrawable(activity, R.drawable.bugattichiron));
        mMockList.add(bugattiChiron);
        Car civicTypeR = new Car(++id, "Civic Type R", "Honda", 310, Double.valueOf(136000.00), ContextCompat.getDrawable(activity, R.drawable.civictyper));
        mMockList.add(civicTypeR);
        Car corolla = new Car(++id, "Corolla", "Toyota", 144, Double.valueOf(101000.00), ContextCompat.getDrawable(activity, R.drawable.corolla));
        mMockList.add(corolla);
        Car ferrari458Italia = new Car(++id, "Ferrari 458 Itália", "Ferrari", 670, Double.valueOf(1500000.00), ContextCompat.getDrawable(activity, R.drawable.ferrari458));
        mMockList.add(ferrari458Italia);
        Car ferrariF60America = new Car(++id, "Ferrari F60 América", "Ferrari", 670, Double.valueOf(2500000.00), ContextCompat.getDrawable(activity, R.drawable.ferrarif60america));
        mMockList.add(ferrariF60America);
        return mMockList;
    }
}
