package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        //regular expression: 정규표현식(정규식, 정규식표현)
        //문자열의 패턴을 나타내는 기호들

        //문자
        System.out.println("x".matches("x"));//true
        System.out.println("a".matches("a"));//true
        System.out.println("a".matches("x"));//false

        //문자들
        System.out.println("xyz".matches("xyz"));//true
        System.out.println("xxx".matches("xxx"));//true
        System.out.println("xxx".matches("x"));//false

        //수량자(quantifiers)
        System.out.println("xxx".matches("x{3}"));//true
        System.out.println("aaa".matches("a{3}"));//true
        System.out.println("aa".matches("a{3}"));//false
        System.out.println("a".matches("a{1,3}"));//true
        System.out.println("aa".matches("a{1,3}"));//true
        System.out.println("aaa".matches("a{1,3}"));//true

        System.out.println("dog".matches("do{1,3}g"));//true
        System.out.println("doog".matches("do{1,3}g"));//true
        System.out.println("dooog".matches("do{1,3}g"));//true

        System.out.println("dodog".matches("do{1,3}g"));//false

        //그룹: ()
        System.out.println("dodog".matches("(do){1,3}g"));//true

        //수량:
        //n개 이상: {n,}
        System.out.println("dog".matches("do{1,}g"));//true
        System.out.println("doooooooooog".matches("do{1,}g"));//true


        //?: 없거나 한번
        System.out.println("dg".matches("do?g"));//true
        System.out.println("dog".matches("do?g"));//true
        System.out.println("doog".matches("do?g"));//false

        //*: 0번 이상
        System.out.println("dg".matches("do*g"));//true
        System.out.println("dog".matches("do*g"));//true
        System.out.println("doog".matches("do*g"));//true

        //+: 1번 이상
        System.out.println("dg".matches("do+g"));//false
        System.out.println("dog".matches("do+g"));//true
        System.out.println("doog".matches("do+g"));//true

        //문자 분류 (Character classes)
        System.out.println("dog".matches("d[oi]g"));//true
        System.out.println("dig".matches("d[oi]g"));//true
        System.out.println("dag".matches("d[oi]g"));//false

        System.out.println("dog".matches("d[^oi]g"));//false
        System.out.println("dig".matches("d[^oi]g"));//false
        System.out.println("dag".matches("d[^oi]g"));//true

        System.out.println("dog".matches("d[a-z]g"));//true
        System.out.println("dzg".matches("d[a-z]g"));//true

        System.out.println("dag".matches("d[a-cx-z]g"));//true
        System.out.println("dog".matches("d[a-cx-z]g"));//false
        System.out.println("dxg".matches("d[a-cx-z]g"));//true

        //문자 분류 기호
        System.out.println("0".matches("[0-9]"));//true
        System.out.println("7".matches("[0-9]"));//true
        System.out.println("0".matches("\\d"));//true(자바에서 ""안에 \쓰려면 두번 써야함)
        System.out.println("7".matches("\\d"));//true

        System.out.println("a".matches("[a-zA-Z_0-9]"));//true
        System.out.println("_".matches("\\w"));//true
        System.out.println("8".matches("\\w"));//true

        //예제: 숫자로 시작하면 안되고, 영문대소문자, _, $
        System.out.println("abc".matches("[a-zA-Z_$][a-zA-Z_$0-9]*"));//true
        System.out.println("1abc".matches("[a-zA-Z_$][a-zA-Z_$0-9]*"));//false
        System.out.println("Abc".matches("[a-zA-Z_$][a-zA-Z_$0-9]*"));//ture
        System.out.println("$Abc".matches("[a-zA-Z_$][a-zA-Z_$0-9]*"));//true
//        System.out.println("$Abc".matches("[a-zA-Z_$^0-9]"));//false
        System.out.println("abc".matches("[^0-9]\\w*"));//true

        //전회번호 패턴: 중간에 - 들어가도 되고 처음 숫자 네자리 세자리
        String phonePattern = "(010|02)-*\\d{3,4}-*\\d{4}";
        System.out.println("010-999-9999".matches(phonePattern));//true
        //String pP2 = "[(010)(02)]-*[0-9]{3,4}-*[0-9]{4}";//틀린 방식
        String pP2 = "(010|02)-*[0-9]{3,4}-*[0-9]{4}";
        System.out.println("010-999-9999".matches(pP2));//true
        //강사님 방식 ?이 없거나 한번이므로 더 적절
        String pattern2 = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("010-999-9999".matches(pattern2));//true


        //모든 문자: .
        System.out.println(" ".matches("."));//true
        System.out.println("a".matches("."));//true
        System.out.println("3".matches("."));//true
        System.out.println("+".matches("."));//true
        System.out.println(".".matches("."));//true

        //.: \.
        System.out.println(".".matches("\\."));//true
        System.out.println("a".matches("\\."));//false

        //이메일 패턴
        //영문소문자,숫자가 여러개 @ 영문소문자,숫자 여러개 . 양문소문자, 숫자 여러개
        //john23@google3.com
        String ePattern = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+";

        System.out.println("john23@google3.com".matches(ePattern));//true

        //or: |(pipe/or/vertical bar)
        System.out.println("auedhdogdjaskd".matches(".*(dog|cat).*"));
        System.out.println("sdasdacatcasd".matches(".*(dog|cat).*"));
    }
}
