package mp.zadania20;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
// ctr + shift + t -> stworz klase testowa

public class Euler1Test {

    @Test
    public void shouldReturn23for10(){
        // given
        Euler1 euler1 = new Euler1();
        // when
        int result = euler1.calc(10);
        // then
        Assert.assertThat(result, CoreMatchers.is(23));
    }

    @Test
    public void shouldReturn0for0(){
        // given
        Euler1 euler1 = new Euler1();
        // when
        int result = euler1.calc(0);
        // then
        Assert.assertThat(result, CoreMatchers.is(0));
    }

}