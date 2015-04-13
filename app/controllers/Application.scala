package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.mainview())
  }

  def saveOrder(id: String) = Action(parse.json) { request =>
    Ok(request.body)
  }

  def getOrder(id: String) = Action {
    Ok(s"Order ${id}")
  }

  def newOrder = Action {
    Ok("ok")
  }

}