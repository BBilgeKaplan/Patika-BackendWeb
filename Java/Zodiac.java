import java.util.Scanner;

public class Zodiac {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int month,day;
        String zodiac;
        boolean isError= false;

        System.out.print("Month of birth: ");
        month = input.nextInt();

        System.out.print("Day of birth: ");
        day = input.nextInt();

         if ((month>= 1 && month<= 12) && (day >= 1 && day <= 31)) {
            
            if (month== 3) {
                if (day>= 21)
                    System.out.println("Aries");
                else if (day<= 20) {
                    System.out.println("Pisces");
                } else {
                    isError=true;

                }
            }
            if (month== 4) {
                if (day>= 21) {
                    System.out.println("Taurus");
                } else if (day<= 20) {
                    System.out.println("Aries");
                } else {
                    isError=true;
                }
            }
            if (month== 5) {
                if (day>= 22) {
                    System.out.println("Gemini");
                } else if (day<= 21) {
                    System.out.println("Taurus");
                } else {
                    isError=true;
                }
            }
            if (month== 6) {
                if (day>= 23) {
                    System.out.println("Cancer");
                } else if (day<= 22) {
                    System.out.println("Gemini");
                } else {
                    isError=true;
                }
            }
            if (month== 7) {
                if (day>= 23) {
                    System.out.println("Leo");
                } else if (day<= 22) {
                    System.out.println("Cancer");
                } else {
                    isError=true;
                }
            }
            if (month== 8) {
                if (day>= 23) {
                    System.out.println("Virgo");
                } else if (day<= 22) {
                    System.out.println("Leo");
                } else {
                    isError=true;
                }
            }
            if (month== 9) {
                if (day>= 23) {
                    System.out.println("Libra");
                } else if (day<= 22) {
                    System.out.println("Virgo");
                } else {
                    isError=true;
                }
            }
            if (month== 10) {
                if (day>= 23) {
                    System.out.println("Scorpio");
                } else if (day<= 22) {
                    System.out.println("Libra");
                } else {
                    isError=true;
                }
            }
            if (month== 11) {
                if (day>= 22) {
                    System.out.println("Sagittarius");
                } else if (day<= 22) {
                    System.out.println("Scorpio");
                } else {
                    isError=true;
                }
            }
            if (month== 12) {
                if (day>= 22) {
                    System.out.println("Capricorn");
                } else if (day<= 21) {
                    System.out.println("Sagittarius");
                } else {
                    isError=true;
                }
            }
            if (month== 1) {
                if (day>= 22) {
                    System.out.println("Aquarius");
                } else if (day<= 21) {
                    System.out.println("Capricorn");
                } else {
                    isError=true;
                }
            }
            if (month== 2) {
                if (day>= 20) {
                    System.out.println("Pisces");
                } else if (day<= 19) {
                    System.out.println("Aquarius");
                } else {
                    isError=true;
                }
            }
    }else {
        System.out.println("You entered an invalid day or month.");
    }
    if(isError) { System.out.println("You entered incorrectly."); }

    }
}