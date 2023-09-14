package ch11exception.book.B485;

public class LoginExample {
    public static void main(String[] args) {
        try{
            login("white","12345");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            login("blue","1234");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void login(String id, String password) throws Exception{
        if(!id.equals("blue")){
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }
        if(!password.equals("12345")){
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
