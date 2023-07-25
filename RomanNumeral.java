import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    public int romanToInt(String s) {

        int romanIntervalSum;

        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int result = 0;


        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                result -= m.get(s.charAt(i));
            } else {
                result += m.get(s.charAt(i));
            }
        }


        return result;


        //    for(i = 0; i <= s.length(); i++){
        //        if(s[i] === M){
        //            romanIntervalSum += 1000
        //        }
        //          if(s[i] === D){
        //            romanIntervalSum += 500
        //        }
        //          if(s[i] === C){
        //            romanIntervalSum += 100
        //        }
        //          if(s[i] === L){
        //            romanIntervalSum += 50
        //        }
        //          if(s[i] === X){
        //            romanIntervalSum += 10
        //        }
        //          if(s[i] === V){
        //            romanIntervalSum +=  5
        //        }
        //          if(s[i] === I){
        //            romanIntervalSum += 1
        //        }
        //    }

    }
}
