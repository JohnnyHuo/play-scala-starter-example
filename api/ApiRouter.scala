//package api
//
//import play.api.mvc._
//import play.api.routing._
//import play.api.routing.sird._
//import play.api.routing.Router.Routes
//import play.api.routing.SimpleRouter
//import app.controllers.HomeController
//
//import javax.inject.Inject
//
//class ApiRouter @Inject()(controller: HomeController)
//  extends SimpleRouter {
//  override def routers: Routes = {
//    case GET(p"/") => controller.index
//    case GET(p"/hello/$to") => Action {
//      Results.Ok(s"Hello $to")
//    }
//  }
//}
//
//
//object ApiRouter{
//  def apply(routes: Router.Routes): Router = new ApiRouter()
//}