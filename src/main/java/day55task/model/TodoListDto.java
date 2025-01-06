package day55task.model;

public class TodoListDto {

    private int code;
    private String content;
    private boolean state;



    public TodoListDto(int code, String content, boolean state) {
        this.code = code;
        this.content = content;
        this.state = state;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "todoListDto{" +
                "code=" + code +
                ", content='" + content + '\'' +
                ", state=" + state +
                '}';
    }
}
