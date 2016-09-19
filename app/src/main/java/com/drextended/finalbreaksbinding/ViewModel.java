package com.drextended.finalbreaksbinding;

import android.databinding.ObservableField;

/**
 * Created by roman.donchenko on 19.09.2016.
 */

public class ViewModel {
    // As it's saing in doc: Fields of this type should be declared final
    // because bindings only detect changes in the field's value, not of the field itself
    // https://developer.android.com/reference/android/databinding/ObservableBoolean.html
    public static final ObservableField<String> finalVar = new ObservableField<>(); // break binding

    public static ObservableField<String> nonFinalVar = new ObservableField<>(); // works

    public void setFinalVar(boolean checked) {
        finalVar.set(String.valueOf(checked));
    }

    public void setNonFinalVar(boolean checked) {
        nonFinalVar.set(String.valueOf(checked));
    }
}
