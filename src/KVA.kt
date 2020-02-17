import java.util.*
import kotlin.random.Random
var namelist : Array<String> = arrayOf("Dima", "Vova", "Sachka", "Valera", "Igor")
var secondnamelist : Array<String> = arrayOf("Ivanov", "Petrov", "Sidorov")
var shortnamelist : Array<String> = arrayOf("Dimovich", "Vovovich", "Sachkovich", "Valerovich", "Igorivech")
var calllist : Array<String> = arrayOf("random name 1", "random name 2" , "random name 3" , "random name 4")

class kvantorium (){
    var kvantor : Array<Kvant> = arrayOf(Kvant("Robo"), Kvant("IT"))

}
class Kvant(a:String){
var kvan:Array<Group> = arrayOf(Group(), Group())
var name : String = a
}
class Student(){                                                        //это готово
    var name = ""
    var secname = ""
    var shortname = ""
    var date : Date = Date()
    var awards : String = ""
    init{
        name = namelist[Random.nextInt(namelist.size)]
        secname = secondnamelist[Random.nextInt(namelist.size)]
        shortname = shortnamelist[Random.nextInt(namelist.size)]
    }


}
class Group(places:Int){                                                               //это почти готово
  var students : Array<Student> = Array(places, {Student()})
    var teacher : Array<Teacher> = arrayOf(Teacher())
    var name = ""

    init{
        name = calllist[Random.nextInt(namelist.size)]
    }
}
class Teacher(){                                                             //это готово
    var name = ""
    var secname = ""
    var shortname = ""
    var date : Date = Date()
    init{
        name = namelist[Random.nextInt(namelist.size)]
        secname = secondnamelist[Random.nextInt(namelist.size)]
        shortname = shortnamelist[Random.nextInt(namelist.size)]
    }
}

fun main(){


}