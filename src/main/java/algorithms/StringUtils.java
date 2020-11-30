package algorithms;

public class StringUtils {

    public static boolean areAnagramString(String s1, String s2) {

        // s1 = "mare"
        // s2 = "rame"
        // TODO: implement using iterations using for
        //compararee lungime
        //comparare strings using using 2 fors

        if (s1 != null && s2 != null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

//TODO: implement using 1 frequency array
//TODO: implement using 2 frequency arrays
//cu cod ascii pt reque. array
//'a' - 0 = 127
// return false;


//    public static boolean areCircularPermutedStrings(String s1, String s2) {
//        // s1 = "mare"
//        // s2 = "rame"
//        // cu string methods (contains, substring)
//        //cu for or frequency array
//        return false;
//    }

