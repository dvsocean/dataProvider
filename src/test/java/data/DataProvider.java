package data;

import org.testng.annotations.Test;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "dp1")
    public Object[][] dataOne(){
        return new Object[][]{
                {"Jason", "Naynay", 32, "Victorovich"},
                {"Helen", "Honway", 65, "Beverly Hills"},
                {"Edik", "Drovorub", 5, "Krasnodar"}
        };
    }

    @Test(dataProvider = "dp1")
    public void first(String name, String surname, int age, String city){
        System.out.println("Output-->" + name + ", next-->" + surname + ", next-->" + age + ", next-->" + city);
    }

}
