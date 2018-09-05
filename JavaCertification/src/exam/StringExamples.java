package exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExamples {


    public void MethodChanging(){
        String test = "AniMals  ";

        String trimmed = test.trim();
        String lowerCase = trimmed.toLowerCase();
        String result = lowerCase.replace('a','A');
        System.out.println(result);
        System.out.println(test);


    }


    public void sBuilderExample(){

        StringBuilder sb = new StringBuilder("Start");
        sb.append("+middle");
        StringBuilder same  = sb.append("+end");

        System.out.println(same);
        System.out.println(sb);



    }


    public void sBuilderExample2(){


        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        b = b.insert(4,"-");
        System.out.println("b = "+b);
        System.out.println("a = "+a);




    }


    public void indexFinding(){

        String s = "animals";
        System.out.println(s.indexOf("al",3));

    }


    public static void main(String [] args) {

        LocalDateTime date = LocalDateTime.of(2017,11,22,11,22,33);
        Period p = Period.ofWeeks(4);
        date = date.plus(p);

        System.out.println(date);


}


    public static void animaltoy(LocalDate startDate, LocalDate endDate,Period period){


    LocalDate upto = startDate;

    while (upto.isBefore(endDate)){
        System.out.println("new toy upto " + upto);
        upto = upto.plus(period);
    }





    }
}
