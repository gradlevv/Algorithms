import array.removeElement

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val array = intArrayOf(2, 4, 3, 4, 6, 9)
    val target = 4
    val sum = removeElement(nums = array, k = target)
    println(sum)
}