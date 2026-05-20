package string;

public class Q2_check_sentence_Pangram_1832 {
    static void main() {
        String sentence = "thequickbrownfoxjumpsov";
        System.out.println(checkPangram(sentence));
    }
    static boolean checkPangram(String sentence){
//        Method:- 1
        for(int i=97; i < 123; i++){
            String alp = String.valueOf((char)(i));
            if(sentence.contains(alp)){
                continue;
            }
            else{
                return false;
            }
        }
//        Method:- 2
//        for(char i='a'; i < 'z'; i++){
//            System.out.println(sentence.indexOf(i));
//            System.out.println(sentence.indexOf(i)<0);
//            if(sentence.indexOf(i)<0){
//                return false;
//            }
//        }
        return true;
    }
}
