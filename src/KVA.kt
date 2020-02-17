import java.util.*
import kotlin.random.Random

class kvantorium (){
    var kvantor : Array<Kvant> = arrayOf(Kvant("Robo"), Kvant("IT"))

}
class Kvant(a:String){
var kvan:Array<Group> = arrayOf(Group(), Group())
var name : String = a
}
class Group(){
  var students : Array<Student> = arrayOf()
    var teacher : Array<Teacher> = arrayOf(Teacher("Michail", "Zubenko", "Petrovich"))
}
class Teacher(n:String, sec:String, short:String){
    var name = n
    var secname = sec
    var shortname = short
    var date : Date = Date()
}
class Student(n:String, sec:String, short:String, aw:Array<String>){
    var name = n
    var secname = sec
    var shortname = short
    var date : Date = Date()
    var awards : Array<String> = aw
}
fun main(){
    var name : Array<String> = arrayOf("Dima", "Vova", "Sachka", "Valera", "Igor")
    var secondname : Array<String> = arrayOf("Ivanov", "Petrov", "Sidorov")
    var shortname : Array<String> = arrayOf("Dimovich", "Vovovich", "Sachkovich", "Valerovich", "Igorivech")
    fun randomname (){
        var rname = name[Random.nextInt(name.size)]
    }
}