import array.twoSum

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val array = intArrayOf(2, 5, 3, 4, 6, 9)
    val target = 9
    val sum = twoSum(nums = array, target = target)
    println(sum.toList())
}