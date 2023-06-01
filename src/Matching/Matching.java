package Matching;
import Output.Output;
import Input.Input;
import GetInfo.*;
public class Matching {
public static int again = 0; //-> while 문 돌릴때 아토믹 불린으로 써라~
    public static void main(String[] args) {
        Output.greeting();
        while(again != 1) {
            int who = Input.isStudent();
            InfoPeople.info(who);
        }
        Output.goodBye();
    }

}