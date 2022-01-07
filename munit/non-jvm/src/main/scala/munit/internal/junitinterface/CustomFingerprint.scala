package munit.internal.junitinterface

import sbt.testing.SubclassFingerprint

class CustomFingerprint(
    val suite: String,
    isModule0: Boolean
) extends SubclassFingerprint {
  override def isModule(): Boolean = isModule0
  override def superclassName(): String = suite
  override def requireNoArgConstructor(): Boolean = true
}
