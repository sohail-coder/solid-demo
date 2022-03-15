package com.jetbrains.utilities;

public class GetDiaryService implements diaryService{

    @Override
    public boolean getDiaryService() {
        System.out.println("diary service enabled");
        return false;
    }
}
