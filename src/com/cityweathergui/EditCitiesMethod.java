package com.cityweathergui;

import com.sun.tools.javac.Main;

public class EditCitiesMethod {

    public static void DeleteCity(int SelectedCity) {

        int lastCity = 0;

        for (int i = SelectedCity; i < MainMenu.cityDatabase.length - 1; i++) {

            if (MainMenu.cityDatabase[i].getWindSpeed() > 0) {

                MainMenu.cityDatabase[i] = MainMenu.cityDatabase[i + 1];
                lastCity = i;

            }

        }

        MainMenu.cityDatabase[lastCity] = new City();

    }

}
