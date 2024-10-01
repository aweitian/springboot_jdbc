package me.taw.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Work {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void start()
    {
        //没有测试
        //Student student = jdbcTemplate.queryForObject("SELECT * FROM STUDENT WHERE ID = ?", new BeanPropertyRowMapper<Student>(Student.class), 1L);
        //System.out.println("id:" + student.getId() + ",name:" + student.getName());

        String sql = "select * from ecm_address WHERE print_addr = '' ";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
//        System.out.println(maps);
        for (Map<String, Object> map : maps) {
            String address = map.get("address").toString();
            String[] split = address.split("\\|");
            address = split[0];
            String[] split1 = address.split("-");
            address = split1[split1.length-1];
            System.out.println(address);
        }
    }
}
