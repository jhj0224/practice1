fun main() {
    val person1 = Person(1, "철수", "남자", 23, "철원")
    println(person1.introduceMsg())

    val person2 = Person(2, "영희", "여자", 22, "남원")
    println(person2.introduceMsg())

    val person3 = Person(3, "영수", "남자", 25, "진천")
    println(person3.introduceMsg())
}

class Person(
    var id: Int,
    var name: String,
    var gender: String,
    var age: Int,
    var hometown: String
) {
    fun introduceMsg(): String = "안녕하세요. 저는 ${age}살, $name 입니다. 저는 $hometown 출신입니다.";

    override fun toString(): String = "id: $id, name: $name, gender: $gender, age: $age, hometown: $hometown"
}