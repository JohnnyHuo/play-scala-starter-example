import play.api._
import play.api.ApplicationLoader.Context
import play.api.routing.Router
import play.filters.HttpFiltersComponents
//import play.api.routing.SimpleRouter
import play.api.routing.sird._
import play.api.mvc.Results

//import api._


class MyApplicationLoader extends ApplicationLoader {
  def load(context: Context) = {
    new MyComponents(context).application
  }
}

class MyComponents(context: Context)
  extends BuiltInComponentsFromContext(context)
    with HttpFiltersComponents {
//  lazy val router = Router.empty
//    lazy val router = Router.SimpleRouter
    lazy val router = Router.from {
      case GET(p"/hello/$to") => Action {
        Results.Ok(s"Hello $to")
      }
      case GET(p"/hello") => Action {
        Results.Ok("Hello World!")
      }
    }

//    lazy val router =  new  api.ApiRouter()
}

//
//class UtilRouter @Inject()
//(mail: MailController)
//  extends SimpleRouter {
//  override def routes: Routes = {
//    case GET(p"/mail/$org") =>
//      mail.getMail(org)
//    case POST(p"/mail/create") =>
//      mail.createOrUpdate
//  }
//}