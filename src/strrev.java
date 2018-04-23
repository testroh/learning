/**
 * Created by Rohith on 12/26/2017.
 */
public class strrev {

    public static void main(String[] args) {
        String s = "nitinaa";
        String result = "";
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            result = c + result;
        }
        System.out.println(result);

        StringBuilder sb = new StringBuilder(result);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
