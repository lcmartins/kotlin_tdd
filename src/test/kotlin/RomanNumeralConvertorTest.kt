import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RomanNumeralConvertorTest {
    @Test
    internal fun convertIXto10() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("iX")
        assertEquals(9, result)
    }

    @Test
    fun convertXXIto21() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("xxi")
        assertEquals(21, result)
    }

    @Test
    fun convertIXXto19() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("ixx")
        assertEquals(19, result)
    }

    @Test
    fun convertIVto4() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("iv")
        assertEquals(4, result)
    }

    @Test
    fun convertLto50() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("l")
        assertEquals(50, result)
    }

    @Test
    fun convertXLIXto49() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("XLIX")
        assertEquals(49, result)
    }

    @Test
    fun convertXCto90() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("XC")
        assertEquals(90, result)
    }

    @Test
    fun convertXLVIto46() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("XLVI")
        assertEquals(46, result)
    }

    @Test
    fun convertLXXIto71() {
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("LXXI")
        assertEquals(71, result)
    }

    @Test
    fun convertCMtO900(){
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("CM")
        assertEquals(900, result)
    }

    @Test
    fun convertMCMtO1900(){
        val conversor = RomanNumeralConvertor()
        val result = conversor.parse("MCM")
        assertEquals(1900, result)
    }

    @Test
    fun converterFromAnyTest(){
        val values = mapOf("I" to 1L, "II" to 2L, "III" to 3L, "IV" to 4L, "V" to 5L, "VI" to 6L, "VII" to 7L,
            "VIII" to 8L, "IX" to 9L, "X" to 10L,"XI" to 11L, "XII" to 12L, "XIII" to 13L, "XIV" to 14L, "XV" to 15L,
            "XVI" to 16L, "XVII" to 17L, "XVIII" to 18L, "XIX" to 19L, "XX" to 20L, "XXI" to 21L, "XXIX" to 29,
            "xxxix" to 39, "XL" to 40, "L" to 50, "LIX" to 59, "c" to 100, "xc" to 90, "xci" to 91, "LXXXIX" to 89,
            "M" to 1000, "cm" to 900, "mmdc" to 2600, "mmmmm" to 5000, "mmmmcm" to 4900)
        val convertor = RomanNumeralConvertor()
        for ((k, v) in values) {
            val result = convertor.parse(k)
            assertEquals(v, result)
        }
    }
}