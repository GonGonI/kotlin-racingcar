import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.Test


class SetTest {
    private val numbers: MutableSet<Int> = mutableSetOf()

    @BeforeEach
    fun setUp() {
        numbers.add(1)
        numbers.add(1)
        numbers.add(2)
        numbers.add(3)
    }

    @Test
    fun checkSetSize() {
        val expectedSize = numbers.size
        assertThat(expectedSize).isEqualTo(expectedSize)
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 3])
    fun contains(number: Int) {
        assertTrue(numbers.contains(number))
    }

    @ParameterizedTest
    @CsvSource(value = ["1:true", "2:true", "3:true", "4:false", "5:false"], delimiter = ':')
    fun contains(number: Int, expected: Boolean) {
        assertThat(numbers.contains(number)).isEqualTo(expected)
    }
}
