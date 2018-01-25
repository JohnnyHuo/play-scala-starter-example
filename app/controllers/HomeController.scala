package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
//    The import views.html.index cannot be resolved
//    https://github.com/scala-ide/scala-ide-play2/issues/215
//    Ok(views.html.index("Your new application is ready."))
//      print("Hello world")
      Ok("hello world")
  }

}
