package munit

import munit.internal.junitinterface.CustomFingerprint
import munit.internal.junitinterface.CustomRunners
import munit.internal.junitinterface.JUnitFramework

class Framework extends JUnitFramework {
  override def name() = "munit"
  val munitFingerprint = new CustomFingerprint("munit.Suite", isModule0 = false)
  val customRunners = new CustomRunners(
    List(
      munitFingerprint,
      new CustomFingerprint("munit.Suite", isModule0 = true)
    )
  )
}
