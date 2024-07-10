import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test

class KotlinStringTest {
    @Test
    fun test1() {
        val input = "1,2"

        val result = input.split(",")
        assertThat(result).containsExactly("1", "2")
    }

    @Test
    fun test2() {
        val input = "(1,2)"
        val firstLetter = input.first()
        val lastLetter = input.last()

        if (firstLetter == '(' && lastLetter == ')') {
            val result = listOf(input.substring(1, input.length - 1))
            assertThat(result).containsExactlyInAnyOrder(*result.toTypedArray())
        }
    }

    @Test
    @DisplayName("When index is out of bounds, throws exception")
    fun test3() {
        assertThatThrownBy {
            val str = "abc"
            val result = str[4]
        }.isInstanceOf(IndexOutOfBoundsException::class.java)
            .hasMessageContaining("index 4 is out of bounds for length 3.")
    }
}