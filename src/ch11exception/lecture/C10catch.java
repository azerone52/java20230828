package ch11exception.lecture;

import ch16lamda.book.B710.Person;

public class C10catch {
    public static void main(String[] args) {
        try {
            //exception 발생 가능 코드
        }catch (ArrayIndexOutOfBoundsException e){
            //exception 처리코드
        }catch (NumberFormatException e){
            //exception 처리코드
        }

        try{

        }catch (NullPointerException | ClassCastException e){
            //exception 처리코드
        }
    }
}
