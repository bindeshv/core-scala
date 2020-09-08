package example

object PatternMatch2 extends App {

  //guarding pattern match
  case class Email(from: String, body: String)
  val importantPeople = Set("wife@home.com", "manager@office.com")

  val impEmail = Email("manager@office.com", "I need a favor")
  val wifeEmail = Email("wife@home.com", "Don't forget to bring some wine!")
  val marketingEmail = Email("marketing@google.com", "Try out our new discount coupon")

  def alertOrNoAlert(email: Email) = email match{
    case Email(from, _) if importantPeople.contains(from) => println("This email needs your attention")
    case _ => println("Do not disturb")
  }


  alertOrNoAlert(impEmail)
  alertOrNoAlert(marketingEmail)
  alertOrNoAlert(wifeEmail)




}
