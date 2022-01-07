/*
 * Adapted from https://github.com/scala-js/scala-js, see NOTICE.md.
 */

package munit.internal.junitinterface

import sbt.testing._

final class JUnitEvent(
    taskDef: TaskDef,
    fullyQualifiedName0: String,
    status0: Status,
    selector0: Selector,
    throwable0: OptionalThrowable = new OptionalThrowable,
    duration0: Long = -1L
) extends Event {
  override def fingerprint(): Fingerprint = taskDef.fingerprint()
  override def fullyQualifiedName(): String = fullyQualifiedName0
  override def status(): Status = status0
  override def selector(): Selector = selector0
  override def throwable(): OptionalThrowable = throwable0
  override def duration(): Long = duration0
}
