package string;

public class Q3_IP_Address_1108 {
    static void main() {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
     static String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }
}
