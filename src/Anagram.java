import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
            String s="amama";
            String ss="Amaam";
            s=s.toLowerCase();
            ss=ss.toLowerCase();
            char [] s1=s.toCharArray();
            char [] s2=ss.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            System.out.print(Arrays.equals(s1,s2));
    }
}
