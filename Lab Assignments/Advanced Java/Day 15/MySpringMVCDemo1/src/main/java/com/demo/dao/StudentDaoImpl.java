package com.demo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.demo.beans.MyStudent;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<MyStudent> findAllStudents() {
        return jdbcTemplate.query("select * from mystudent", (rs, rowNum) -> {
            MyStudent s = new MyStudent();
            s.setSid(rs.getInt(1));
            s.setSname(rs.getString(2));
            s.setEmail(rs.getString(3));
            s.setAddress(rs.getString(4));
            if (rs.getDate(5) == null) {
                s.setDob(null);
            } else {
                s.setDob(rs.getDate(5).toLocalDate());
            }
            return s;
        });
    }

    @Override
    public boolean save(MyStudent s) {
        int n = jdbcTemplate.update(
            "insert into mystudent (sid, sname, email, address, dob) values (?,?,?,?,?)",
            s.getSid(), s.getSname(), s.getEmail(), s.getAddress(), s.getDob()
        );
        return n > 0;
    }

    @Override
    public MyStudent findById(int sid) {
        try {
            return jdbcTemplate.queryForObject(
                "select * from mystudent where sid=?",
                BeanPropertyRowMapper.newInstance(MyStudent.class),
                sid
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public boolean modifyStudent(MyStudent s) {
        int n = jdbcTemplate.update(
            "update mystudent set sname=?, email=?, address=?, dob=? where sid=?",
            s.getSname(), s.getEmail(), s.getAddress(), s.getDob(), s.getSid()
        );
        return n > 0;
    }

    @Override
    public boolean removeById(int sid) {
        int n = jdbcTemplate.update("delete from mystudent where sid=?", sid);
        return n > 0;
    }
}
