package pers.prover07.dp.behavior.responsibility;

/**
 * 职责链模式 - 抽象处理角色
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 10:59
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_TWO = 3;
    protected final static int NUM_THREE = 7;

    private Handler next;
    private int numEnd;

    public Handler(int numEnd) {
        this.numEnd = numEnd;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    abstract void handlerReq(LeaveRequest leaveRequest);

    public final void submit(LeaveRequest leaveRequest) {
        if (leaveRequest.getNum() > this.numEnd) {
            // 超过当前角色的权限
            this.next.submit(leaveRequest);
        } else {
            this.handlerReq(leaveRequest);
        }
    }
}
