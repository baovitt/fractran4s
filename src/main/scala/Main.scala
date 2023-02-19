package baovitt.fractran

@main def main(args: String*): Unit =
  val program: Program = Program(
    Fraction.fromInts(455, 33).right.get,
    Fraction.fromInts(11, 13).right.get,
    Fraction.fromInts(1, 11).right.get,
    Fraction.fromInts(3, 7).right.get,
    Fraction.fromInts(11, 2).right.get,
    Fraction.fromInts(1, 3).right.get
  )

  println(program.execute(14, 2))