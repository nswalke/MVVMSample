package com.viral.nirmal.mvvmsample.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.viral.nirmal.mvvmsample.BR;
import com.viral.nirmal.mvvmsample.model.Man;

public class GameViewModel extends BaseObservable {

//    private String action;

    private ObservableField<Man> manObservableField;

    public GameViewModel() {
//        action = "birth";
        manObservableField = new ObservableField<>(new Man());
    }

    @Bindable
    public String getAge() {
        return String.valueOf(manObservableField.get().age);
    }

    public void setAge(String age) {
        notifyPropertyChanged(BR.age);
    }

    public void birthday() {
        manObservableField.get().celebrateBirthday();
//        setChanged();
//        notifyObservers(man.get());
//        notifyPropertyChanged(BR.gameViewModel);
        setAge(getAge());
    }

    //
//    public void fatalAccident() {
//        man.get().accident(true);
////        setChanged();
////        notifyObservers(man.age);
//    }
//
    public void accident() {
        manObservableField.get().accident(false);
//        setChanged();
//        notifyObservers(man.get());
//        notifyPropertyChanged(BR.gameViewModel);
        setAge(getAge());
    }
}
