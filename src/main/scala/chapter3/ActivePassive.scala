package chapter3

class ActivePassive[A] private(elements: Set[A], activeSet: Set[A]) {

  def this(elements: Set[A]) = this(elements, Set.empty)

  def isActive(element: A): Boolean = activeSet.contains(element)

  def isPassive(element: A): Boolean = !isActive(element)

  def allActive(): Set[A] = activeSet

  def allPassive(): Set[A] = elements diff activeSet

  def isAllActive(): Boolean = elements.size == activeSet.size

  def isAllPassive(): Boolean = activeSet.isEmpty

  def activate(element: A): ActivePassive[A] = ActivePassive(elements, activeSet + element)

  def deactivate(element: A): ActivePassive[A] = ActivePassive(elements, activeSet - element)

  def activateAll(): ActivePassive[A] = ActivePassive(elements, elements)

  def deactivateAll(): ActivePassive[A] = ActivePassive(elements, Set.empty)
}
