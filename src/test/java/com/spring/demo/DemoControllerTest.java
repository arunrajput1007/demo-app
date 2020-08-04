package com.spring.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoControllerTest {

    DemoController demoController = new DemoController();

    @Test
    public void whenMul5By2ShouldBe10(){
        Assertions.assertThat(demoController.multiply5By(2)).isEqualTo(10);
    }

    /*@Test
    public void whenDiv8By2ShouldBe4(){
        Assertions.assertThat(demoController.divide8By(2)).isEqualTo(4);
    }

    @Test
    public void whenDiv8By0ShouldBe0(){
        Assertions.assertThat(demoController.divide8By(0)).isZero();
    }*/
}
