package pers.prover07.dp.behavior.responsibility;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 11:05
 */
public class Manager extends Handler {
    public Manager() {
        super(NUM_TWO);
    }

    @Override
    void handlerReq(LeaveRequest leaveRequest) {
        System.out.printf("请假人:%s;请假天数:%s;请假理由:%s%n", leaveRequest.getName(), leaveRequest.getNum(), leaveRequest.getContent());
        System.out.println("审批人:部门经理");
    }
}
