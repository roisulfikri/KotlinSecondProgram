fun main(args: Array<String>) {
    val simpsonsA = arrayOf("Homer", "Merge", "Bart", "Lisa", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')

    val simponsB: Array<String> = arrayOf("Homer", "Merge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simponsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')

    val simpsonC: Array<String> = arrayOf("Homer", "Merge", "Bart", "Lisa", "Meggie")
    simpsonC.sort()
    simpsonC.reverse()
    for (simpson in simpsonC) {
        print(simpson + ' ')
    }
    print('\n')

    val simpsonsD = arrayOf("Homer", "Merge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpsons!")
    }

    val simpsonsE = arrayOf("Homer", "Merge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)
    if (!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = " + simpsonsE.min())
    println("Max = " + simpsonsE.max())
    println("First = " + simpsonsE.first())
    println("Last = " + simpsonsE.last())
    println(simpsonsE.contains("Merge"))
}