package nl.quintor.presentation.slides.week3

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all.{p, _}

object W3C3Git extends Section {
  override def content =
    section("GIT")(
      subsection()(
        p("What is git?"),
        blockquote("Git is a version control system for tracking changes in computer files and coordinating work on those files among multiple people.")
      ),
      subsection()(
        p("To get started install GIT: https://git-scm.com/")
      ),
      subsection()(
        p("Most useful commands"),
        ul(
          li("clone"),
          li("branch"),
          li("commit"),
          li("push"),
          li("pull"),
          li("merge")
        )
      ),
      subsection()(
        p("Clone the repos: git@github.com:dstibbe/java101-fizzbuzz.git"),
        p("Could be that ssl needs to be disabled: "),
        prettyCode(java,
          """
            |git config --global http.sslVerify false
            |
        """.
            stripMargin
        )
      )
    )


}
