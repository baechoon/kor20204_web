package day55task.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TodoListDao {

    private Connection conn; // 연동 인터페이스

    private static TodoListDao instance = new TodoListDao();

    private TodoListDao() {
        try {  // =========== DB 연동 ============ //
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbsubject0106", "root", "1234");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static TodoListDao getInstance() {
        return instance;
    }


    //==============================================//

    public boolean write(TodoListDto todoListDto) {
        try {

            String sql = "insert into todoList(code,content,state) values (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, todoListDto.getCode());
            ps.setString(2, todoListDto.getContent());
            ps.setBoolean(3, todoListDto.isState());
            int count = ps.executeUpdate();
            if (count == 1) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public ArrayList<TodoListDto> print() {
        ArrayList<TodoListDto> list = new ArrayList<>();
        try {
            String sql = "select * from todoList";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TodoListDto todoListDto = new TodoListDto(
                        rs.getInt("code"),
                        rs.getString("content"),
                        rs.getBoolean("state"));
                list.add(todoListDto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return list;

    }

    public boolean update(TodoListDto todoListDto) {
        try {

            String sql = "update todoList set content=?,state=? where code=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, todoListDto.getContent());
            ps.setBoolean(2, todoListDto.isState());
            ps.setInt(3, todoListDto.getCode());
            int count = ps.executeUpdate();
            if(count==1){return true;}
        } catch (Exception e) {System.out.println(e);}
        return false;
    }

    public boolean delete(int code) {
       try {
         String sql = "delete from todoList where code=?";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setInt(1, code);
         int count = ps.executeUpdate();
         if (count == 1) {return true;}
     }   catch (Exception e){System.out.println(e);}
           return false;
    }



}
