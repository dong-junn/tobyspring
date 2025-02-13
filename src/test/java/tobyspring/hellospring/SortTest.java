package tobyspring.hellospring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SortTest {
    Sort sort;

    @BeforeEach
    void beforeEach() {
        sort = new Sort();
        System.out.println(this);
    }

    @Test
    void sort() {
        //when
        List<String> list = sort.sortByLength(Arrays.asList("aa", "b"));

        //then
        Assertions.assertThat(list).isEqualTo(List.of("b", "aa"));
    }

    @Test
    void sort3Items() {

        //when
        List<String> list = sort.sortByLength(Arrays.asList("aa", "ccc",  "b"));

        //then
        Assertions.assertThat(list).isEqualTo(List.of("b", "aa", "ccc"));
    }

    @Test
    void sortAlreadySorted() {
        //when
        List<String> list = sort.sortByLength(Arrays.asList("b", "aa",  "ccc"));

        //then
        Assertions.assertThat(list).isEqualTo(List.of("b", "aa", "ccc"));
    }
}
