import java.util.*
import kotlin.random.Random
var namelist : Array<String> = arrayOf("Dima", "Vova", "Sachka", "Valera", "Igor")
var secondnamelist : Array<String> = arrayOf("Ivanov", "Petrov", "Sidorov")
var shortnamelist : Array<String> = arrayOf("Dimovich", "Vovovich", "Sachkovich", "Valerovich", "Igorivech")
var calllist : Array<String> = arrayOf("random name 1", "random name 2" , "random name 3" , "random name 4")


class kvantorium (){
    fun display(a:Kvant):String{
        return a.name + a.places+ a.describe
    }
    var calls : Array<String> = arrayOf("IT1", "BIO2", "HITECH")
    var places : Array<Int> = arrayOf(15, 12, 14)
    var describe : Array<String> = arrayOf("самый лучший", "просто лучший", "лучший")
    fun makeKvant(type:String): Kvant{
        var kva : Kvant = Kvant()
        when (type){
           "it"-> {
               kva.name = calls[0]
               kva.places = places[0]
               kva.describe = describe[0]
           }
            "bio"-> {
                kva.name = calls[1]
                kva.places = places[1]
                kva.describe = describe[1]
            }
            "hitech"-> {
                kva.name = calls[2]
                kva.places = places[2]
                kva.describe = describe[2]
            }
        }
        return kva
    }

}
class Kvant(){
    var describe : String  = ""
    var places : Int = 0
    var name : String = ""
    var gr : Group = Group()

    fun makeGroup(n:String, size:,teach:Teacher):Group{
     gr.name = n
     gr.students = Array(places, {Student()})
     gr.teacher = teach
    }

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
  var students : Array<Student> ?= null
    var teacher : Teacher ?= null
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