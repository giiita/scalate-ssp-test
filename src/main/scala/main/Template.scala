package main

import org.fusesource.scalate.{TemplateEngine, TemplateSource}

object Template {
  def main(args: Array[String]): Unit = {
    val source: TemplateSource = TemplateSource.fromText("test.ssp",
      """
        |<div>
        |  <span>${scala.util.Random.shuffle(List(1, 2, 3)).head}</span>
        |</div>
        |""".stripMargin)
    val engine = new TemplateEngine()
    println(engine.layout(source))
  }
}
