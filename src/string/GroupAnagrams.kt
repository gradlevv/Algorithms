package string

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if (strs.isEmpty()) return listOf()
    val anagramsGroup = hashMapOf<String, MutableList<String>>()
    for (word in strs) {
        val sorted = word.toCharArray().sorted().joinToString("")
        anagramsGroup.getOrPut(sorted) {
            mutableListOf()
        }.add(word)
    }
    return anagramsGroup.values.toList()
}