package _08_dependency_injection.before;

import _08_dependency_injection.after.IBoardPersistence;

public class FileBoardPersistence implements IBoardPersistence {
    public void save(){
        System.out.println("파일에 게시글 저장 중..");
    }

    public void delete(){
        System.out.println("파일에 저장된 게시글 삭제 중..");
    }
    
}
