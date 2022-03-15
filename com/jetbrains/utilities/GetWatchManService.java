package com.jetbrains.utilities;

public class GetWatchManService implements watchmanService{
    @Override
    public boolean getWatchmanService() {
        System.out.println("watchman service enabled");
        return false;
    }
}
