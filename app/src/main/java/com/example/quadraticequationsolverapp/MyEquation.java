package com.example.quadraticequationsolverapp;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticequationsolverapp.databinding.ActivityMainBinding;

import java.util.Observable;

public class MyEquation extends BaseObservable {

    private String A;
    private String B;
    private String C;

    ActivityMainBinding binding;

    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public MyEquation() {
    }

    @Bindable
    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    @Bindable
    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    @Bindable
    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public void solveEquation(View view){

        int a = Integer.parseInt(getA());
        int b = Integer.parseInt(getB());
        int c = Integer.parseInt(getC());

        Double discriminant = b*b - 4.0*a*c;

        double x1, x2;

        if(discriminant > 0){
            x1 = (-b + Math.sqrt(discriminant))/(2*a);
            x2 = (b + Math.sqrt(discriminant))/(2*a);

            binding.textViewResult.setText("X1="+x1+" X2="+x2);
        }else if(discriminant<0){
            binding.textViewResult.setText("No Real roots");
        }else{
            x1 = -b/(2 * a);
            binding.textViewResult.setText("x = " + x1);
        }


    }
}
