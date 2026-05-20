package string;

public class Q8_find_index_of_string_28 {
    static void main() {
        String sty = "mississippi";
        String st = "issip";
        System.out.println(strStr(sty, st));
    }

    static int strStr(String haystack, String needle) {

        // check the {String needle} is present in {String haystack}.
        if(haystack.contains(needle)){   // true

            // finding the index.
            return haystack.indexOf(needle);
        }else{
            return -1;
        }
    }
}
