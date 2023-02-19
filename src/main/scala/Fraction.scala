package baovitt.fractran

sealed trait FractionError
case object NegativeFraction extends FractionError

final case class Fraction private (numerator: Int, denominator: Int):
    private def copy: Unit = ()

    def matches(input: Int): Boolean =
        if (numerator * input) % denominator == 0 then true
        else false

    def newNumber(input: Int) = (numerator * input) / denominator
end Fraction

object Fraction:
    private def apply(numerator: Int, denominator: Int): Either[FractionError, Fraction] =
        Either.cond(
            (numerator | denominator) > 0,
            new Fraction(numerator, denominator),
            NegativeFraction
        )

    def fromInts(numerator: Int, denominator: Int): Either[FractionError, Fraction] = apply(numerator, denominator)
end Fraction