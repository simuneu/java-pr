package _08_dependency_injection.after;

import _08_dependency_injection.before.DbBoardPersistence;
import _08_dependency_injection.before.FileBoardPersistence;

public class Main {
    public static void main(String[] args) {
        IBoardPersistence persistence = new FileBoardPersistence();
        //파일에서 데이터베이스 저장방식이 변경되었는데(즉 persistence 타입이 바뀜)
        //서비스 코드를 변경하지 않아도 됨.

        BoardService service = new BoardService(persistence);

//        BoardService service  = new BoardService();
//        service.setIBoardPersistence(persistence);

        service.save();
        service.delete();
    }
}
