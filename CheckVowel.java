package Method;

public class CheckVowel {

    public static boolean checkVowel(String in) {
        String vowels = "aeiouAEIOU";
        String line = in;

        for (int i = 0; i < line.length(); i++) {


            if (vowels.indexOf(line.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }



   public static void main(String[] args) {
        String lin="EvOOO";



       System.out.println(checkVowel("eOco"));
    }
}
