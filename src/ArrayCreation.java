public class ArrayCreation {

    public static double getAverage(double[] numbers) {
        if (numbers.length >= 3) {
            double unrounded = (numbers[0] + ((numbers.length-1)/2) + numbers.length-1) / 3;
            double rounded= (int)(unrounded+0.5);
            return rounded;
        }
        else {
            return 0.0;
        }
    }


    public static String stringArray(String[] friends) {

        if (friends.length == 5) {
            int lOne = friends[0].length() ;
            int lTwo = friends[1].length() ;
            int lThree = friends[2].length() ;
            int lFour = friends[3].length() ;
            int lFive = friends[4].length() ;
            return "" + lOne + " " + lTwo + " " + lThree + " " + lFour + " " + lFive;
        }
        else {
            return "";
        }
    }


    public static String countryData() {
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana",
                "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
                "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
                "Swahili", "Spanish", "English", "French", "English"};
        int data= (int)(Math.random()*13);
        return "The capital of "+countries[data]+" is "+capitals[data]+" and the primary language is "+languages[data];
    }
}