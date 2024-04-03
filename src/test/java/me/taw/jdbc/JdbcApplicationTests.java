package me.taw.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JdbcApplicationTests {
    @Autowired
    private Work work;
    @Test
    void contextLoads() {
    }


    @Test
    public void testMyService() {
        work.start();
    }

}
