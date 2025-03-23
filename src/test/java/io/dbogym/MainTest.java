package io.dbogym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("그냥 테스트")
    void test1() throws Exception {

//        System.out.println("");
        throw new RuntimeException("그냥 실패함");
    }
}