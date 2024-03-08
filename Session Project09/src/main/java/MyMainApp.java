public class MyMainApp {
    public static void main(String[] args) {
        String[][] successSentence = {
                {"**********************", "###########################"},
                {"(((((((((((((((((((((((((((((((((((((((()))))))))","%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"},
                {"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4"},
        };
        successSentence [0][1] = "i am fuckin rich i`m programming";
        for (int i=0;i<successSentence.length;i++){
            for (int o= 0;o<successSentence[i].length;o++){
                System.out.println(successSentence[i][o]);
            }
        }
        for (String[]sentec : successSentence){
            for (String fds : sentec){
                System.out.println(fds);
            }
        }
    }
}
