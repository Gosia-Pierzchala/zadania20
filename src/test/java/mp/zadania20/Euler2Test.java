package mp.zadania20;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Euler2Test {

    @Test
    public void shouldReturn10for10(){
        // given
        Euler2 euler2 = new Euler2();
        // when
        int result = euler2.calculateSum(10);
        // then
        Assert.assertThat(result, CoreMatchers.is(10));
    }

    @Test
    public void shouldReturn44for50(){
        // given
        Euler2 euler2 = new Euler2();
        // when
        int result = euler2.calculateSum(50);
        // then
        Assert.assertThat(result, CoreMatchers.is(44));
    }

}