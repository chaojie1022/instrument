package com.kongwu.insweb.json;

/**
 * json返回bean
 * @author xinjiang
 * @date 2015/11/27 0027 14:31
 */
public class JSONResult {
    private String msg;
    private Object obj;
    private State state;
    public static JSONResult success(Object object,String msg){
        JSONResult j = new JSONResult();
        j.setMsg(msg);
        j.setState(State.SUCCESS);
        j.setObj(object);
        return j;
    }
    public static JSONResult success(String msg){
        return success(null,msg);
    }
    public static JSONResult fail(Object object,String msg){
        JSONResult j = new JSONResult();
        j.setMsg(msg);
        j.setState(State.FAILED);
        j.setObj(object);
        return j;
    }
    public static JSONResult fail(String msg){
        return fail(null,msg);
    }
    public static JSONResult error(Object object,String msg){
        JSONResult j = new JSONResult();
        j.setMsg(msg);
        j.setState(State.ERROR);
        j.setObj(object);
        return j;
    }

    public static JSONResult error(String msg) {
        return error(null,msg);
    }
    public JSONResult() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 返回状态
     */
    enum State{
        SUCCESS,FAILED,ERROR
    }
}

