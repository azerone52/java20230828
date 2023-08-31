package ch07extends.book;

public class B325SmartPhone extends B325Phone{
    B325SmartPhone(String owner){
        super(owner);
    }
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
