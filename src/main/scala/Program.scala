package baovitt.fractran

final case class Program(fractions: Fraction*):

    def compute(input: Int): Option[Int] =
        fractions.find(_.matches(input)).map(_.newNumber(input))

    def execute(input: Int, iterations: Int): Option[Int] = 
        if iterations == 0 then 
            Some(input)
        else
            compute(input) flatMap (n => execute(n, iterations - 1))
end Program