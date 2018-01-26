import play.api.mvc._
import play.api.routing._
import play.api.routing.sird._


val router = Router.from {
  case GET(p"/hello/$to") => Action {
    Results.Ok(s"Hello $to")
  }
}