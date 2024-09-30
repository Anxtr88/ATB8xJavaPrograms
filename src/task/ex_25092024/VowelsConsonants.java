package task.ex_25092024;
public class VowelsConsonants {
    public static void main(String[] args) {
        int vowCount = 0;
        int conCount = 0;
        String s = "pramod";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                System.out.println("Vowels");
                vowCount++;
            } else {
//                    System.out.println("Not");
                conCount++;
            }
        }
        System.out.println("Vowels= " + vowCount + " and Consonsants= " + conCount);
    }
}

