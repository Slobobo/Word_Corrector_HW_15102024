package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (String str : strs){
            if (str.contains("brange")) {
                str = str.replace("brange", "orange");
            }
            if (str.contains("onibn")){
                str = str.replace("onibn", "onion");
            }
            stringBuilder.append(count).append(") ").append(str).append("\n");
            count++;
        }
        return stringBuilder.toString();
    }
}
