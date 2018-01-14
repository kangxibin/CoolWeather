package org.qianbian.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion
{
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carWash;

    public Sport sport;

    public class Comfort
    {
        @SerializedName("txt")
        public String info;
    }

    public class Carwash
    {
        @SerializedName("txt")
        public String info;
    }

    public class Sport
    {
        @SerializedName("txt")
        public String info;
    }
}
