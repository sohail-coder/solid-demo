package com.jetbrains.utilities;

public class GetPlumberService implements plumberService{

    @Override
    public boolean getPlumberService() {
        System.out.println("plumber service enabled");
        return false;
    }
}
