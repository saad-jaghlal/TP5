class Module(val intitule: String, val siRegional: Boolean, val termine: Boolean, val nbHeures: Int){

}

fun main() {
    var modules = mutableListOf<Module>()
    var m1=Module("Basec du dev Mobile",true,false,120)
    var m2=Module("Programmer en kotlin",true,false,90)
    var m3=Module("Composant Android ",false,false,90)
    var m4=Module("Dev interfaces utilisateurs",false,false,90)
    modules.addAll(listOf(m1,m2,m3,m4))
    println("Utilisation de println(\"Module : \$it\") :")
    modules.forEach(){
        println("Modules : $it")
    }
    println("Utilisation de println(\"Module : \${it.intitule}\") :")
    modules.forEach(){
        println("Modules : ${it.intitule}")
    }
    println("Utilisation de fonction map :")
    var menu = modules.map { x->x.intitule }
    menu.forEach { println(it) }
    println("Utilisation de fonction filter pour afficher les modules regionaux :")
    var moduleRrgionaux = modules.filter { it.siRegional }
    println(moduleRrgionaux)
    moduleRrgionaux.forEach { println(it.intitule) }
    println("Utilisation de fonction groupBy pour afficher les modules regionaux :")
    val m = modules.groupBy { it.siRegional }
//    m.forEach { println(it) }
    println("les modules regionaux :")
    m[true]!!.forEach { println(it.intitule)}
    println("les modules local :")
    m[false]?.forEach { println(it.intitule)}
    val nbHeuresTotales = modules.fold(0) {nbTotal, module -> nbTotal + module.nbHeures}
    println("Nombre total d'heures des modules : $nbHeuresTotales")
    println("Utilisation de fonction sortedBy nombre des heures  :")
    var listeTriee1 = modules.sortedBy { it.nbHeures }
    listeTriee1.forEach { println(it.intitule)}
    println("sortedBy  les modules par leurs intitulés. :")
    var listeTriee2 = modules.sortedBy { it.intitule }
    listeTriee2.forEach { println(it.intitule)}
}