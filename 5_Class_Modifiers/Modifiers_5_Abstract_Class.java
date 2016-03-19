/**
 * 
 * We can have abstract classes and abstract methods.
 * 
 * abstract methods only have declaration.
 * 
 * For abstract classes, instantiation is not possible.
 * child classes have to override the abstract methods.   
 *
 */
abstract class Modifiers_5_Abstract_Class {

	abstract int numberOfWheels();
}

/**
 * If a class contains at least one abstract method then class
 * also should be abstract. Otherwise we will get compile time error
 * 
 * Even though class does not contain any abstract method still 
 * we can declare it as abstract.
*/