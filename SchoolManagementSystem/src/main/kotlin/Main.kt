import java.util.*

fun main(args: Array<String>) {

    var login = Login()
    var p1= StudentData.p1()
    var p2= StudentData.p2()
    var p3= StudentData.p3()
    var p4= StudentData.p4()
    var p5= StudentData.p5()
    var p6= StudentData.p6()
    var p7= StudentData.p7()
    var p8= StudentData.p8()
    var p9= StudentData.p9()
    var p10= StudentData.p10()
    var p11= StudentData.p11()
    var p12= StudentData.p12()
    var p13= StudentData.p13()
    var p14= StudentData.p14()
    var p15= StudentData.p15()
    var p16= StudentData.p16()
    var p17= StudentData.p17()
    var p18= StudentData.p18()
    var p19= StudentData.p19()
    var p20= StudentData.p20()
    var p21= StudentData.p21()
    var p22= StudentData.p22()
    var p23= StudentData.p23()
    var p24= StudentData.p24()
    var p25= StudentData.p25()
    var p26= StudentData.p26()
    var p27= StudentData.p27()
    var p28= StudentData.p28()
    var p29= StudentData.p29()
    var p30= StudentData.p30()
    var p31= StudentData.p31()
    var p32= StudentData.p32()
    var p33= StudentData.p33()
    var p34= StudentData.p34()
    var p35= StudentData.p35()
    var p36= StudentData.p36()
    var p37= StudentData.p37()
    var p38= StudentData.p38()
    var p39= StudentData.p39()
    var p40= StudentData.p40()
    var p41= StudentData.p41()
    var p42= StudentData.p42()
    var p43= StudentData.p43()
    var p44= StudentData.p44()
    var p45= StudentData.p45()
    var p46= StudentData.p46()
    var p47= StudentData.p47()
    var p48= StudentData.p48()
    var p49= StudentData.p49()
    var p50= StudentData.p50()

    var q1 = TeacherData.q1()
    var q2 = TeacherData.q2()
    var q3 = TeacherData.q3()
    var q4 = TeacherData.q4()
    var q5 = TeacherData.q5()
    var q6 = TeacherData.q6()
    var q7 = TeacherData.q7()
    var q8 = TeacherData.q8()
    var q9 = TeacherData.q9()
    var q10 = TeacherData.q10()
    var q11 = TeacherData.q11()
    var q12 = TeacherData.q12()
    var q13 = TeacherData.q13()
    var q14 = TeacherData.q14()
    var q15 = TeacherData.q15()
    var q16 = TeacherData.q16()
    var q17 = TeacherData.q17()
    var q18 = TeacherData.q18()
    var q19 = TeacherData.q19()
    var q20 = TeacherData.q20()







    println()
    println(" ****************************Welcome To SCHOOL MANAGEMENT SYSTEM*****************************  ")
    println()
    println(
        "Are you an Admin or a Viewer\n" +
                "Choose 1 for Admin\n" +
                "Choose 2 for Viewer\n" +
                "Choose Your Opiton: "
    )
    while (true) {
        var read = Scanner(System.`in`)
        var i: String = read.nextLine()
        if (i == "exit" || i == "0") break
        if (i == "2") {

            println("User Id: ")
            var read = Scanner(System.`in`)
            while (true) {
                var id: String = read.nextLine()
                if (id == "exit" || id == "0") break

                if (id == login.userId) {
                    println("Input Password: ")
                    while (true) {
                        var pass: Int = read.nextInt()
                        if (id == "exit" || id == "0") break
                        if (pass == login.password) {
                            println("*********************Welcome to Dashboard*********************")
                            println()
                            println("You can terminate the program from anywhere using exit or 0")
                            println(
                                "1.Searh Teacher Info\n" +
                                        "2.Search Student Infor\n" +
                                        "3.exit"
                            )
                            println("Choose Your Option: ")


                            var read = Scanner(System.`in`)
                            while (true) {
                                var check: String = read.nextLine()

                                if (check == "exit" || check == "0") break
                                if (check == "2") {
                                    println()
                                    println("#You can Search A student information by their Id(range:101-150),Name,Age,Gender,Grade(A, B, C, D, F)#")
                                    println("Choose Your Option: ")
                                    var count = 0
                                    while (true) {
                                        var st: String = read.nextLine()

                                        if (st == "exit" || st == "0") break

                                        if (st == p1.Id || st == p1.Name || st == p1.Age || st == p1.Gender || st == p1.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p1.Id}")
                                            println("Name: ${p1.Name}")
                                            println("Age: ${p1.Age}")
                                            println("Gender: ${p1.Gender}")
                                            println("Grade: ${p1.Grade}")
                                            println()


                                        }
                                        if (st == p2.Id || st == p2.Name || st == p2.Age || st == p2.Gender || st == p2.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p2.Id}")
                                            println("Name: ${p2.Name}")
                                            println("Age: ${p2.Age}")
                                            println("Gender: ${p2.Gender}")
                                            println("Grade: ${p2.Grade}")
                                            println()
                                        }
                                        if (st == p3.Id || st == p3.Name || st == p3.Age || st == p3.Gender || st == p3.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p3.Id}")
                                            println("Name: ${p3.Name}")
                                            println("Age: ${p3.Age}")
                                            println("Gender: ${p3.Gender}")
                                            println("Grade: ${p3.Grade}")
                                            println()
                                        }
                                        if (st == p4.Id || st == p4.Name || st == p4.Age || st == p4.Gender || st == p4.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p4.Id}")
                                            println("Name: ${p4.Name}")
                                            println("Age: ${p4.Age}")
                                            println("Gender: ${p4.Gender}")
                                            println("Grade: ${p4.Grade}")
                                            println()
                                        }
                                        if (st == p5.Id || st == p5.Name || st == p5.Age || st == p5.Gender || st == p5.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p5.Id}")
                                            println("Name: ${p5.Name}")
                                            println("Age: ${p5.Age}")
                                            println("Gender: ${p5.Gender}")
                                            println("Grade: ${p5.Grade}")
                                            println()
                                        }

                                        if (st == p6.Id || st == p6.Name || st == p6.Age || st == p6.Gender || st == p6.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p6.Id}")
                                            println("Name: ${p6.Name}")
                                            println("Age: ${p6.Age}")
                                            println("Gender: ${p6.Gender}")
                                            println("Grade: ${p6.Grade}")
                                            println()
                                        }

                                        if (st == p7.Id || st == p7.Name || st == p7.Age || st == p7.Gender || st == p7.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p7.Id}")
                                            println("Name: ${p7.Name}")
                                            println("Age: ${p7.Age}")
                                            println("Gender: ${p7.Gender}")
                                            println("Grade: ${p7.Grade}")
                                            println()
                                        }
                                        if (st == p8.Id || st == p8.Name || st == p8.Age || st == p8.Gender || st == p8.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p8.Id}")
                                            println("Name: ${p8.Name}")
                                            println("Age: ${p8.Age}")
                                            println("Gender: ${p8.Gender}")
                                            println("Grade: ${p8.Grade}")
                                            println()
                                        }
                                        if (st == p9.Id || st == p9.Name || st == p9.Age || st == p9.Gender || st == p9.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p9.Id}")
                                            println("Name: ${p9.Name}")
                                            println("Age: ${p9.Age}")
                                            println("Gender: ${p9.Gender}")
                                            println("Grade: ${p9.Grade}")
                                            println()
                                        }
                                        if (st == p10.Id || st == p10.Name || st == p10.Age || st == p10.Gender || st == p10.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p10.Id}")
                                            println("Name: ${p10.Name}")
                                            println("Age: ${p10.Age}")
                                            println("Gender: ${p10.Gender}")
                                            println("Grade: ${p10.Grade}")
                                            println()
                                        }
                                        if (st == p11.Id || st == p11.Name || st == p11.Age || st == p11.Gender || st == p11.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p11.Id}")
                                            println("Name: ${p11.Name}")
                                            println("Age: ${p11.Age}")
                                            println("Gender: ${p11.Gender}")
                                            println("Grade: ${p11.Grade}")
                                            println()
                                        }
                                        if (st == p12.Id || st == p12.Name || st == p12.Age || st == p12.Gender || st == p12.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p12.Id}")
                                            println("Name: ${p12.Name}")
                                            println("Age: ${p12.Age}")
                                            println("Gender: ${p12.Gender}")
                                            println("Grade: ${p12.Grade}")
                                            println()
                                        }
                                        if (st == p13.Id || st == p13.Name || st == p13.Age || st == p13.Gender || st == p13.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p13.Id}")
                                            println("Name: ${p13.Name}")
                                            println("Age: ${p13.Age}")
                                            println("Gender: ${p13.Gender}")
                                            println("Grade: ${p13.Grade}")
                                            println()
                                        }
                                        if (st == p14.Id || st == p14.Name || st == p14.Age || st == p14.Gender || st == p14.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p14.Id}")
                                            println("Name: ${p14.Name}")
                                            println("Age: ${p14.Age}")
                                            println("Gender: ${p14.Gender}")
                                            println("Grade: ${p14.Grade}")
                                            println()
                                        }
                                        if (st == p15.Id || st == p15.Name || st == p15.Age || st == p15.Gender || st == p15.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p15.Id}")
                                            println("Name: ${p15.Name}")
                                            println("Age: ${p15.Age}")
                                            println("Gender: ${p15.Gender}")
                                            println("Grade: ${p15.Grade}")
                                            println()
                                        }
                                        if (st == p16.Id || st == p16.Name || st == p16.Age || st == p16.Gender || st == p16.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p16.Id}")
                                            println("Name: ${p16.Name}")
                                            println("Age: ${p16.Age}")
                                            println("Gender: ${p16.Gender}")
                                            println("Grade: ${p16.Grade}")
                                            println()
                                        }
                                        if (st == p17.Id || st == p17.Name || st == p17.Age || st == p17.Gender || st == p17.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p17.Id}")
                                            println("Name: ${p17.Name}")
                                            println("Age: ${p17.Age}")
                                            println("Gender: ${p17.Gender}")
                                            println("Grade: ${p17.Grade}")
                                            println()
                                        }
                                        if (st == p18.Id || st == p18.Name || st == p18.Age || st == p18.Gender || st == p18.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p18.Id}")
                                            println("Name: ${p18.Name}")
                                            println("Age: ${p18.Age}")
                                            println("Gender: ${p18.Gender}")
                                            println("Grade: ${p18.Grade}")
                                            println()
                                        }
                                        if (st == p19.Id || st == p19.Name || st == p19.Age || st == p19.Gender || st == p19.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p19.Id}")
                                            println("Name: ${p19.Name}")
                                            println("Age: ${p19.Age}")
                                            println("Gender: ${p19.Gender}")
                                            println("Grade: ${p19.Grade}")
                                            println()
                                        }
                                        if (st == p20.Id || st == p20.Name || st == p20.Age || st == p20.Gender || st == p20.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p20.Id}")
                                            println("Name: ${p20.Name}")
                                            println("Age: ${p20.Age}")
                                            println("Gender: ${p20.Gender}")
                                            println("Grade: ${p20.Grade}")
                                            println()
                                        }
                                        if (st == p21.Id || st == p21.Name || st == p21.Age || st == p21.Gender || st == p21.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p21.Id}")
                                            println("Name: ${p21.Name}")
                                            println("Age: ${p21.Age}")
                                            println("Gender: ${p21.Gender}")
                                            println("Grade: ${p21.Grade}")
                                            println()
                                        }
                                        if (st == p22.Id || st == p22.Name || st == p22.Age || st == p22.Gender || st == p22.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p22.Id}")
                                            println("Name: ${p22.Name}")
                                            println("Age: ${p22.Age}")
                                            println("Gender: ${p22.Gender}")
                                            println("Grade: ${p22.Grade}")
                                            println()
                                        }
                                        if (st == p23.Id || st == p23.Name || st == p23.Age || st == p23.Gender || st == p23.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p23.Id}")
                                            println("Name: ${p23.Name}")
                                            println("Age: ${p23.Age}")
                                            println("Gender: ${p23.Gender}")
                                            println("Grade: ${p23.Grade}")
                                            println()
                                        }
                                        if (st == p24.Id || st == p24.Name || st == p24.Age || st == p24.Gender || st == p24.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p24.Id}")
                                            println("Name: ${p24.Name}")
                                            println("Age: ${p24.Age}")
                                            println("Gender: ${p24.Gender}")
                                            println("Grade: ${p24.Grade}")
                                            println()
                                        }
                                        if (st == p25.Id || st == p25.Name || st == p25.Age || st == p25.Gender || st == p25.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p25.Id}")
                                            println("Name: ${p25.Name}")
                                            println("Age: ${p25.Age}")
                                            println("Gender: ${p25.Gender}")
                                            println("Grade: ${p25.Grade}")
                                            println()
                                        }
                                        if (st == p26.Id || st == p26.Name || st == p26.Age || st == p26.Gender || st == p26.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p26.Id}")
                                            println("Name: ${p26.Name}")
                                            println("Age: ${p26.Age}")
                                            println("Gender: ${p26.Gender}")
                                            println("Grade: ${p26.Grade}")
                                            println()
                                        }
                                        if (st == p27.Id || st == p27.Name || st == p27.Age || st == p27.Gender || st == p27.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p27.Id}")
                                            println("Name: ${p27.Name}")
                                            println("Age: ${p27.Age}")
                                            println("Gender: ${p27.Gender}")
                                            println("Grade: ${p27.Grade}")
                                            println()
                                        }
                                        if (st == p28.Id || st == p28.Name || st == p28.Age || st == p28.Gender || st == p28.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p28.Id}")
                                            println("Name: ${p28.Name}")
                                            println("Age: ${p28.Age}")
                                            println("Gender: ${p28.Gender}")
                                            println("Grade: ${p28.Grade}")
                                            println()
                                        }
                                        if (st == p29.Id || st == p29.Name || st == p29.Age || st == p29.Gender || st == p29.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p29.Id}")
                                            println("Name: ${p29.Name}")
                                            println("Age: ${p29.Age}")
                                            println("Gender: ${p29.Gender}")
                                            println("Grade: ${p29.Grade}")
                                            println()
                                        }

                                        if (st == p30.Id || st == p30.Name || st == p2.Age || st == p30.Gender || st == p30.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p30.Id}")
                                            println("Name: ${p30.Name}")
                                            println("Age: ${p30.Age}")
                                            println("Gender: ${p30.Gender}")
                                            println("Grade: ${p30.Grade}")
                                            println()
                                        }
                                        if (st == p31.Id || st == p31.Name || st == p31.Age || st == p31.Gender || st == p31.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p31.Id}")
                                            println("Name: ${p31.Name}")
                                            println("Age: ${p31.Age}")
                                            println("Gender: ${p31.Gender}")
                                            println("Grade: ${p31.Grade}")
                                            println()
                                        }
                                        if (st == p32.Id || st == p32.Name || st == p32.Age || st == p32.Gender || st == p32.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p32.Id}")
                                            println("Name: ${p32.Name}")
                                            println("Age: ${p32.Age}")
                                            println("Gender: ${p32.Gender}")
                                            println("Grade: ${p32.Grade}")
                                            println()
                                        }
                                        if (st == p33.Id || st == p33.Name || st == p33.Age || st == p33.Gender || st == p33.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p33.Id}")
                                            println("Name: ${p33.Name}")
                                            println("Age: ${p33.Age}")
                                            println("Gender: ${p33.Gender}")
                                            println("Grade: ${p33.Grade}")
                                            println()
                                        }
                                        if (st == p34.Id || st == p34.Name || st == p34.Age || st == p34.Gender || st == p34.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p34.Id}")
                                            println("Name: ${p34.Name}")
                                            println("Age: ${p34.Age}")
                                            println("Gender: ${p34.Gender}")
                                            println("Grade: ${p34.Grade}")
                                            println()
                                        }
                                        if (st == p35.Id || st == p35.Name || st == p35.Age || st == p35.Gender || st == p35.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p35.Id}")
                                            println("Name: ${p35.Name}")
                                            println("Age: ${p35.Age}")
                                            println("Gender: ${p35.Gender}")
                                            println("Grade: ${p35.Grade}")
                                            println()
                                        }
                                        if (st == p36.Id || st == p36.Name || st == p36.Age || st == p36.Gender || st == p36.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p36.Id}")
                                            println("Name: ${p36.Name}")
                                            println("Age: ${p36.Age}")
                                            println("Gender: ${p36.Gender}")
                                            println("Grade: ${p36.Grade}")
                                            println()
                                        }
                                        if (st == p37.Id || st == p37.Name || st == p37.Age || st == p37.Gender || st == p37.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p37.Id}")
                                            println("Name: ${p37.Name}")
                                            println("Age: ${p37.Age}")
                                            println("Gender: ${p37.Gender}")
                                            println("Grade: ${p37.Grade}")
                                            println()
                                        }
                                        if (st == p38.Id || st == p38.Name || st == p38.Age || st == p38.Gender || st == p38.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p38.Id}")
                                            println("Name: ${p38.Name}")
                                            println("Age: ${p38.Age}")
                                            println("Gender: ${p38.Gender}")
                                            println("Grade: ${p38.Grade}")
                                            println()
                                        }
                                        if (st == p39.Id || st == p39.Name || st == p40.Age || st == p40.Gender || st == p39.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p40.Id}")
                                            println("Name: ${p39.Name}")
                                            println("Age: ${p39.Age}")
                                            println("Gender: ${p39.Gender}")
                                            println("Grade: ${p39.Grade}")
                                            println()
                                        }
                                        if (st == p40.Id || st == p40.Name || st == p40.Age || st == p40.Gender || st == p40.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p40.Id}")
                                            println("Name: ${p40.Name}")
                                            println("Age: ${p40.Age}")
                                            println("Gender: ${p40.Gender}")
                                            println("Grade: ${p40.Grade}")
                                            println()
                                        }
                                        if (st == p41.Id || st == p41.Name || st == p41.Age || st == p41.Gender || st == p41.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p41.Id}")
                                            println("Name: ${p41.Name}")
                                            println("Age: ${p41.Age}")
                                            println("Gender: ${p41.Gender}")
                                            println("Grade: ${p41.Grade}")
                                            println()
                                        }
                                        if (st == p42.Id || st == p42.Name || st == p42.Age || st == p42.Gender || st == p42.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p42.Id}")
                                            println("Name: ${p42.Name}")
                                            println("Age: ${p42.Age}")
                                            println("Gender: ${p42.Gender}")
                                            println("Grade: ${p42.Grade}")
                                            println()
                                        }
                                        if (st == p43.Id || st == p43.Name || st == p43.Age || st == p43.Gender || st == p43.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p43.Id}")
                                            println("Name: ${p43.Name}")
                                            println("Age: ${p43.Age}")
                                            println("Gender: ${p43.Gender}")
                                            println("Grade: ${p43.Grade}")
                                            println()
                                        }
                                        if (st == p44.Id || st == p44.Name || st == p44.Age || st == p44.Gender || st == p44.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p44.Id}")
                                            println("Name: ${p44.Name}")
                                            println("Age: ${p44.Age}")
                                            println("Gender: ${p44.Gender}")
                                            println("Grade: ${p44.Grade}")
                                            println()
                                        }
                                        if (st == p45.Id || st == p45.Name || st == p45.Age || st == p45.Gender || st == p45.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p45.Id}")
                                            println("Name: ${p45.Name}")
                                            println("Age: ${p45.Age}")
                                            println("Gender: ${p45.Gender}")
                                            println("Grade: ${p45.Grade}")
                                            println()
                                        }
                                        if (st == p46.Id || st == p46.Name || st == p46.Age || st == p46.Gender || st == p46.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p46.Id}")
                                            println("Name: ${p46.Name}")
                                            println("Age: ${p46.Age}")
                                            println("Gender: ${p46.Gender}")
                                            println("Grade: ${p46.Grade}")
                                            println()
                                        }
                                        if (st == p47.Id || st == p47.Name || st == p47.Age || st == p47.Gender || st == p47.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p47.Id}")
                                            println("Name: ${p47.Name}")
                                            println("Age: ${p47.Age}")
                                            println("Gender: ${p47.Gender}")
                                            println("Grade: ${p47.Grade}")
                                            println()
                                        }
                                        if (st == p48.Id || st == p48.Name || st == p48.Age || st == p48.Gender || st == p48.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p48.Id}")
                                            println("Name: ${p48.Name}")
                                            println("Age: ${p48.Age}")
                                            println("Gender: ${p48.Gender}")
                                            println("Grade: ${p48.Grade}")
                                            println()
                                        }
                                        if (st == p49.Id || st == p49.Name || st == p49.Age || st == p49.Gender || st == p49.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p49.Id}")
                                            println("Name: ${p49.Name}")
                                            println("Age: ${p49.Age}")
                                            println("Gender: ${p49.Gender}")
                                            println("Grade: ${p49.Grade}")
                                            println()
                                        }
                                        if (st == p50.Id || st == p50.Name || st == p50.Age || st == p50.Gender || st == p50.Grade) {      // Bm Salauddin
                                            count++
                                            println()
                                            println("Id: ${p50.Id}")
                                            println("Name: ${p50.Name}")
                                            println("Age: ${p50.Age}")
                                            println("Gender: ${p50.Gender}")
                                            println("Grade: ${p50.Grade}")
                                            println()
                                        }
                                        println("${count} people matched")
                                        println()
                                        println("Search Again: ")
                                        //count=0
                                    }

                                }
                                if (check == "1") {
                                    println()
                                    println("#You can Search A Teacher information by their Id(range:201-220),Name,Age,Gender,Subject#")
                                    println("Choose Your Option: ")
                                    var count = 0
                                    while (true) {

                                        var te = read.nextLine()
                                        if (te == "exit" || te == "0") break

                                        if (te == q1.Id || te == q1.Name || te == q1.Age || te == q1.Gender || te == q1.Subject) {
                                            count++
                                            println("Id: ${q1.Id}")
                                            println("Name: ${q1.Name}")
                                            println("Age: ${q1.Age}")
                                            println("Gender: ${q1.Gender}")
                                            println("Subject: ${q1.Subject}")
                                            println()
                                        }
                                        if (te == q2.Id || te == q2.Name || te == q2.Age || te == q2.Gender || te == q2.Subject) {
                                            count++
                                            println("Id: ${q2.Id}")
                                            println("Name: ${q2.Name}")
                                            println("Age: ${q2.Age}")
                                            println("Gender: ${q2.Gender}")
                                            println("Subject: ${q2.Subject}")
                                            println()
                                        }
                                        if (te == q3.Id || te == q3.Name || te == q3.Age || te == q3.Gender || te == q3.Subject) {
                                            count++
                                            println("Id: ${q3.Id}")
                                            println("Name: ${q3.Name}")
                                            println("Age: ${q3.Age}")
                                            println("Gender: ${q3.Gender}")
                                            println("Subject: ${q3.Subject}")
                                            println()
                                        }
                                        if (te == q4.Id || te == q4.Name || te == q4.Age || te == q4.Gender || te == q4.Subject) {
                                            count++
                                            println("Id: ${q4.Id}")
                                            println("Name: ${q4.Name}")
                                            println("Age: ${q4.Age}")
                                            println("Gender: ${q4.Gender}")
                                            println("Subject: ${q4.Subject}")
                                            println()
                                        }
                                        if (te == q5.Id || te == q5.Name || te == q5.Age || te == q5.Gender || te == q5.Subject) {
                                            count++
                                            println("Id: ${q5.Id}")
                                            println("Name: ${q5.Name}")
                                            println("Age: ${q5.Age}")
                                            println("Gender: ${q5.Gender}")
                                            println("Subject: ${q5.Subject}")
                                            println()
                                        }
                                        if (te == q6.Id || te == q6.Name || te == q6.Age || te == q6.Gender || te == q6.Subject) {
                                            count++
                                            println("Id: ${q6.Id}")
                                            println("Name: ${q6.Name}")
                                            println("Age: ${q6.Age}")
                                            println("Gender: ${q6.Gender}")
                                            println("Subject: ${q6.Subject}")
                                            println()
                                        }
                                        if (te == q7.Id || te == q7.Name || te == q7.Age || te == q7.Gender || te == q7.Subject) {
                                            count++
                                            println("Id: ${q7.Id}")
                                            println("Name: ${q7.Name}")
                                            println("Age: ${q7.Age}")
                                            println("Gender: ${q7.Gender}")
                                            println("Subject: ${q7.Subject}")
                                            println()
                                        }
                                        if (te == q8.Id || te == q8.Name || te == q8.Age || te == q8.Gender || te == q8.Subject) {
                                            count++
                                            println("Id: ${q8.Id}")
                                            println("Name: ${q8.Name}")
                                            println("Age: ${q8.Age}")
                                            println("Gender: ${q8.Gender}")
                                            println("Subject: ${q8.Subject}")
                                            println()
                                        }
                                        if (te == q9.Id || te == q9.Name || te == q9.Age || te == q9.Gender || te == q9.Subject) {
                                            count++
                                            println("Id: ${q9.Id}")
                                            println("Name: ${q9.Name}")
                                            println("Age: ${q9.Age}")
                                            println("Gender: ${q9.Gender}")
                                            println("Subject: ${q9.Subject}")
                                            println()
                                        }
                                        if (te == q10.Id || te == q10.Name || te == q10.Age || te == q10.Gender || te == q10.Subject) {
                                            count++
                                            println("Id: ${q10.Id}")
                                            println("Name: ${q10.Name}")
                                            println("Age: ${q10.Age}")
                                            println("Gender: ${q10.Gender}")
                                            println("Subject: ${q10.Subject}")
                                            println()
                                        }
                                        if (te == q11.Id || te == q11.Name || te == q11.Age || te == q11.Gender || te == q11.Subject) {
                                            count++
                                            println("Id: ${q11.Id}")
                                            println("Name: ${q11.Name}")
                                            println("Age: ${q11.Age}")
                                            println("Gender: ${q11.Gender}")
                                            println("Subject: ${q11.Subject}")
                                            println()
                                        }
                                        if (te == q12.Id || te == q12.Name || te == q12.Age || te == q12.Gender || te == q12.Subject) {
                                            count++
                                            println("Id: ${q12.Id}")
                                            println("Name: ${q12.Name}")
                                            println("Age: ${q12.Age}")
                                            println("Gender: ${q12.Gender}")
                                            println("Subject: ${q12.Subject}")
                                            println()
                                        }
                                        if (te == q13.Id || te == q13.Name || te == q13.Age || te == q13.Gender || te == q13.Subject) {
                                            count++
                                            println("Id: ${q13.Id}")
                                            println("Name: ${q13.Name}")
                                            println("Age: ${q13.Age}")
                                            println("Gender: ${q13.Gender}")
                                            println("Subject: ${q13.Subject}")
                                            println()
                                        }
                                        if (te == q14.Id || te == q14.Name || te == q14.Age || te == q14.Gender || te == q14.Subject) {
                                            count++
                                            println("Id: ${q14.Id}")
                                            println("Name: ${q14.Name}")
                                            println("Age: ${q14.Age}")
                                            println("Gender: ${q14.Gender}")
                                            println("Subject: ${q14.Subject}")
                                            println()
                                        }
                                        if (te == q15.Id || te == q15.Name || te == q15.Age || te == q15.Gender || te == q15.Subject) {
                                            count++
                                            println("Id: ${q15.Id}")
                                            println("Name: ${q15.Name}")
                                            println("Age: ${q15.Age}")
                                            println("Gender: ${q15.Gender}")
                                            println("Subject: ${q15.Subject}")
                                            println()
                                        }
                                        if (te == q16.Id || te == q16.Name || te == q16.Age || te == q16.Gender || te == q16.Subject) {
                                            count++
                                            println("Id: ${q16.Id}")
                                            println("Name: ${q16.Name}")
                                            println("Age: ${q16.Age}")
                                            println("Gender: ${q16.Gender}")
                                            println("Subject: ${q16.Subject}")
                                            println()
                                        }
                                        if (te == q17.Id || te == q17.Name || te == q17.Age || te == q17.Gender || te == q17.Subject) {
                                            count++
                                            println("Id: ${q17.Id}")
                                            println("Name: ${q17.Name}")
                                            println("Age: ${q17.Age}")
                                            println("Gender: ${q17.Gender}")
                                            println("Subject: ${q17.Subject}")
                                            println()
                                        }
                                        if (te == q18.Id || te == q18.Name || te == q18.Age || te == q18.Gender || te == q18.Subject) {
                                            count++
                                            println("Id: ${q18.Id}")
                                            println("Name: ${q18.Name}")
                                            println("Age: ${q18.Age}")
                                            println("Gender: ${q18.Gender}")
                                            println("Subject: ${q8.Subject}")
                                            println()
                                        }
                                        if (te == q19.Id || te == q19.Name || te == q19.Age || te == q19.Gender || te == q19.Subject) {
                                            count++
                                            println("Id: ${q19.Id}")
                                            println("Name: ${q19.Name}")
                                            println("Age: ${q19.Age}")
                                            println("Gender: ${q19.Gender}")
                                            println("Subject: ${q19.Subject}")
                                            println()
                                        }
                                        if (te == q20.Id || te == q20.Name || te == q20.Age || te == q20.Gender || te == q20.Subject) {
                                            count++
                                            println("Id: ${q20.Id}")
                                            println("Name: ${q20.Name}")
                                            println("Age: ${q20.Age}")
                                            println("Gender: ${q20.Gender}")
                                            println("Subject: ${q20.Subject}")
                                            println()
                                        }

                                        println("${count} people matched")
                                        println()
                                        println("Search Again: ")
                                        count = 0

                                    }
                                }
                            }


                        } else {
                            println("Invalid Password")
                        }
                    }
                } else {
                    println("Wrong User or Pass")
                    println()
                    println("Create an Account: ?")
                    println("Press 1")
                    var N: String = read.nextLine()
                    while (true) {
                        if (N == "exit" || N == "0") break
                        if (N == "1") {
                            println("Name: ")
                            var name: String = read.nextLine()
                            println("Id: ")
                            var id: String = read.nextLine()
                            println("Gender: ")
                            var add: String = read.nextLine()
                            println("Phone Number: ")
                            var phone: Int = read.nextInt()
                            println("Age: ")
                            var age: String = read.nextLine()


                        }
                    }
                }
            }

            }else if (i == "1") {
            println("Under Development")

            while (true) {
                val M: String = read.nextLine()
                if (M == "exit" || M == "0") break


            }



            }



        }



        }


