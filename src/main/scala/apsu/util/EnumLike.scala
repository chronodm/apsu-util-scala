package apsu.util

/**
 * An approximation of Java-style rich enums based on the (pre-Java 5) pattern
 * presented in Effective Java 1st edition. Allows pattern matching. Usage:
 * <pre>
 *   object MyEnum {
 *       val firstInstance = MyEnum("firstInstance")
 *       val secondInstance = MyEnum("secondInstance")
 *
 *       def all = MyEnumRegistry.all
 *       def forName(name: String) = MyEnumRegistry.forName(name)
 *   }
 *
 *   case class MyEnum private(name: String) extends EnumLike[MyEnum] {
 *       MyEnumRegistry.register(this)
 *   }
 *
 *   private object MyEnumRegistry extends EnumRegistry[MyEnum]
 * </pre>
 *
 * @author david
 */
trait EnumLike[E] {
  def name: String
}
