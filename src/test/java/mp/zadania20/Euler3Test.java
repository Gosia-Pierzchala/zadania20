package mp.zadania20;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Euler3Test {

        @Test
        public void shouldReturn2520for10(){
            // given
            Euler3 euler3 = new Euler3();
            // when
            int result = euler3.findNumber(10);
            // then
            Assert.assertThat(result, CoreMatchers.is(2520));
        }

        @Test
        public void shouldReturn12for4(){
            // given
            Euler3 euler3 = new Euler3();
            // when
            int result = euler3.findNumber(4);
            // then
            Assert.assertThat(result, CoreMatchers.is(12));
        }

}