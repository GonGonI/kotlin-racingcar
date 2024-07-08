import kotlin.test.Test
import org.assertj.core.api.Assertions.*
import java.util.*

class KotlinTest {
    @Test
    fun test1and2() {
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
            println(result)
        }
    }

    @Test
    fun test3() {
        val text = "abc"
        val input = 2
        if (input in 0 until text.length) {
            val character = text[input]
            println(character)
        } else {
            throw IndexOutOfBoundsException("index $input is out of bounds for length ${text.length}.")
        }
    }
}