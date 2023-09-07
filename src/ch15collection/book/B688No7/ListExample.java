package ch15collection.book.B688No7;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for(Board board:list){
            System.out.println(board.getTitle()+"-"+board.getContent());
        }
        System.out.println(list.get(0));
        System.out.println(list.get(0).hashCode());
        System.out.println(list.get(3).hashCode());
        System.out.println(new Board("제목1", "내용1").hashCode());

        boolean contains = list.contains(new Board("제목1","내용1"));
        System.out.println("contains = " + contains);

    }
}
class BoardDao{
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
        list.add(new Board("제목1", "내용1"));

        return list;
    }
}
