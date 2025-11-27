package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class RegistrationDaoImpl implements RegistrationDao {
    static Connection conn = null;
    static PreparedStatement insuser;

    static {
        try {
            conn = DBUtil.getMyConnection();
            insuser = conn.prepareStatement("insert into myuser1(uname, email, gender, hobbies, city) values(?, ?, ?, ?, ?)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MyUser saveUser(MyUser user) {
        try {
            insuser.setString(1, user.getUname());
            insuser.setString(2, user.getEmail());
            insuser.setString(3, user.getGender());
            insuser.setString(4, String.join(",", user.getHobbies()));
            insuser.setString(5, user.getCity());

            int n = insuser.executeUpdate();
            if (n > 0) {
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
         
        }
        return null;
    }
}
