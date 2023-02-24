public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"funk","chunk","furry", "bacpmatpr"};

        //startsWith
        for(String w:words){
            if(w.startsWith("fu")){
                System.out.println(w+ " starts with fu");
            }
        }

        //ends with
        for(String w:words){
            if(w.endsWith("unk")){
                System.out.println(w+" ends with unk");
            }
        }

        String s="buckyrobertbuckyroberts";
        //find characters in string
        System.out.println(s.indexOf('k',5));//search for the first instance of k,but ignore the first five- k is 3

        System.out.println(s.indexOf("rob"));

        String a = "Bacon ";
        String b = "monster";

        System.out.println(a.concat(b));

        //replace
        System.out.println(a.replace('B','F'));
    }
}
