package JavaPract;

public class forEnhanced {
    public static void main(String[] args) {
        String[] str = {"raj", "rishu","sam","yuwa"};

//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
        for (String s: str){
            System.out.println(s);
        }

    }
}
