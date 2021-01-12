
class RomanNumeralConvertor {
    private val mainValues = mapOf<String, Int>("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)
    fun parse(input: String): Long {
        val values: MutableList<String> = input.toUpperCase().split("").toMutableList()
        values.removeAll(listOf(""))
        var total = 0L
        for((index, value) in values.iterator().withIndex()) {
            var intValue = getIntValue(value)
            intValue = when {
                value == "I" && isNextIndexInBound(values, index) && isNextIndexDifferent(values, index, "I") -> -1
                value == "X" && isNextIndexInBound(values, index) && isNextIndexDifferent(values, index, "X") && values[index + 1] != "I" && values[index + 1] != "V" -> -10
                value == "C" && isNextIndexInBound(values, index) && values[index + 1] != "C" && values[index + 1] != "X" && values[index + 1] != "I" && values[index + 1] != "V" -> -100
                else -> intValue
            }
            total+=intValue
        }
        return total
    }
    private fun isNextIndexInBound(values: List<String>, index: Int) = index < values.size - 1
    private fun isNextIndexDifferent(values: MutableList<String>, index: Int, searchedValue: String) = values[index + 1] != searchedValue
    private fun getIntValue(value: String) = mainValues[value] ?:0
}
