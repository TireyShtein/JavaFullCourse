public class TwoDArraysClass {

    public static void main(String[] args) {

        // 2D array = An array which contains arrays
        //            Useful for storing matrix of data

        String[] names = {"Susan", "Michael", "George"};
        String[] surnames = {"Smith", "Black", "Fury"};
        String[] nicknames = {"SS", "MB", "GF"};

        String[][] people = {names, surnames, nicknames};

        String[][] people2 = {
                {"Susan", "Michael", "George"},
                {"Smith", "Black", "Fury"},
                {"SS", "MB", "GF"}
        };

        for (String[] pupil : people){
            for (String pip : pupil) System.out.print(pip + " ");
            System.out.println();
        }

    }
}
