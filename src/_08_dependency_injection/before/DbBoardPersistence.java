package _08_dependency_injection.before;

import _08_dependency_injection.after.IBoardPersistence;

//DB에 게시판 목록을 저장하는 클래스
public class DbBoardPersistence implements IBoardPersistence {
    public void save(){
        System.out.println("DB에 게시글 저장 중..");
    }

    public void delete(){
        System.out.println("DB에 저장된 게시글 삭제 중..");
    }
}
