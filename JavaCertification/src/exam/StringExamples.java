package exam;

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

        StringExamples test = new StringExamples();

        test.sBuilderExample();
        test.sBuilderExample2();
        test.MethodChanging();
        test.indexFinding();
    }

}
