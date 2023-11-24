package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog) {
			Dog dog = (Dog) animal; // ClassCastException 발생 가능
			// 10 라인에서 Cat 객체를 매개값으로 주어서 Dog 타입으로 변환할 수 없기 때문이다.
			// 이럴 때 instanceof 로 타입 체크를 먼저 하는것이 좋다.
//		}
	}

}


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}