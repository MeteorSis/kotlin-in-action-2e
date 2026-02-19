import ch02.KtPerson;

import static java.lang.IO.println;

void main() {
    var person = new KtPerson("Alice", true, true);
    println(person.getName());
    println(person.isStudent());
    println(person.getHasCar());

    person.setStudent(false);
    person.setHasCar(false);

    println(person.getName());
    println(person.isStudent());
    println(person.getHasCar());
}
