import java.util.*

fun main (args: Array<String>){
    val scanner = Scanner(System.`in`)
    var opcMenPrincipal : Int = 0
    var opcMenSecundario : Int = 0
    var nombre : String?
    var descripcion : String?

    var listCourse : MutableList<ProgramingCourse> = mutableListOf()

    val programingCourse = GestionProgramingCourse()

    do {
        println("Bienvenido al sistema de cursos")
        println("1) Registro de curso de cocina \n 2) Registro de curso de programación \n 3) Obtener todos los cursos \n 4) Salir \n Elige...")
        opcMenPrincipal = scanner.nextInt()

        when(opcMenPrincipal){
            1 -> {
                do {
                    println("Menú para el curso de Cocina \n 1) Registrar curso de cocina \n 2) Actualizar curso de cocina \n 3) " +
                            "Eliminar curso de cocina \n 4) Obtener todos los cursos de cocina \n 5) Regresar al menú principal \n Elige...")
                    opcMenSecundario = scanner.nextInt()

                    when(opcMenSecundario){
                        1 -> {
                            println("Ingresa el nombre del curso")
                            nombre = scanner.next()
                            println("")
                            break;
                        }
                        2 -> {
                            break;
                        }
                        3 -> {
                            break;
                        }
                        4 -> {
                            break;
                        }
                        5 -> {
                            println("Regresando al menú principal")
                            break;
                        }
                        else -> println("Opcción invalida")
                    }
                }while (opcMenSecundario != 5)


            }
            2 -> {
                println("1) Registrar curso de programación \n 2) Actualizar curso de programación \n 3) " +
                        "Eliminar curso de programación \n 4) Obtener todos los cursos de programación \n 5) Regresar al menú principal \n Elige...")
                opcMenSecundario = scanner.nextInt()
                when(opcMenSecundario){
                    1 -> {
                        println("Ingresa el nombre del curso")
                        nombre = scanner.next()
                        println("Ingresa la descripción")
                        descripcion = scanner.next()
                        listCourse = programingCourse.addProgramingCourse(nombre, descripcion)
                        break;
                    }
                    2 -> {

                        break;
                    }
                    3 -> {
                        break;
                    }
                    4 -> {
                        break;
                    }
                    5 -> {
                        println("Regresando al menú principal")
                        break;
                    }
                    else -> println("Opcción invalida")
                }
            }
            3 -> {
                // aqui va la consulta general
            }
            4 -> {
                println("Saliendo...")
            }
            else -> println("Opcción invalida")
        }
    }while (opcMenPrincipal != 4)
}