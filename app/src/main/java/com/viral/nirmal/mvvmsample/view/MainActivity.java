package com.viral.nirmal.mvvmsample.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.viral.nirmal.mvvmsample.R;
import com.viral.nirmal.mvvmsample.databinding.ActivityMainBinding;
import com.viral.nirmal.mvvmsample.viewmodel.GameViewModel;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        initDataBinding();
    }

    private void initDataBinding() {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        GameViewModel gameViewModel = new GameViewModel();
        binding.setGameViewModel(gameViewModel);
    }

    @Override
    public void update(Observable o, Object arg) {
        Toast.makeText(this, "Updated", Toast.LENGTH_SHORT).show();
    }
}
