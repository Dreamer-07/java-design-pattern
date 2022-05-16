package pers.prover07.dp.behavior.responsibility;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 11:07
 */
public class Client {

    public static void main(String[] args) {
        // 创建职责链
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        groupLeader.setNext(manager);
        manager.setNext(new GeneralManager());
        // 提交请求
        LeaveRequest leaveRequest = new LeaveRequest("jack", 2, "身体不舒服");
        groupLeader.submit(leaveRequest);
    }

}
