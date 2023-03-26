val verbosity = (arg: String) =>
  arg match
    case "-v" => 1
    case "-vv" => 2
    case _ => 0


verbosity("-vv")

val set = Set("A", "B")

set + "C"

import scala.collection.mutable

val set2 = mutable.Set(1, 2, 3)
set2 += 4

trait Load:
  def reduce(): Load

def reduceAll(loads: List[Load]): List[Load] = for load <- loads yield load.reduce()

reduceAll(List())

import chapter3.ActivePassive

var initial = ActivePassive(set + "C" + "D")

initial.isActive("A")

initial = initial.activate("A")

initial.allActive()

initial.isPassive("B")

initial.isPassive("A")

initial.allPassive()